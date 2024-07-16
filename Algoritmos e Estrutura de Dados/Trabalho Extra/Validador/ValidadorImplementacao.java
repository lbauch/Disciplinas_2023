package Validador;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import Estrutura.ListaEstatica;
import Estrutura.Pilha;
import Estrutura.PilhaLista;
import Modelo.Tag;

public class ValidadorImplementacao {

	private static final String NOVA_LINHA = "\n";
	private static final String HTML_TAG_INICIO = "<([^\\s>/]+)";
	private static final String HTML_TAG_FIM = "<\\/([^\\s>/]+)";
	private static final String HTML_TAGS = HTML_TAG_INICIO + "|" + HTML_TAG_FIM;

	private static final Pattern pattern = Pattern.compile(HTML_TAGS);

	private ListaEstatica<Tag> tagsPalavras = new ListaEstatica<>();
	private ListaEstatica<String> errosNoArquivo = new ListaEstatica<>();
	private ListaEstatica<Tag> tagsIniciais = new ListaEstatica<>();
	private ListaEstatica<Tag> tagsFinais = new ListaEstatica<>();

	public boolean validar(File f) {

		StringBuilder sb = new StringBuilder();
		boolean isValido = false;

		try (Stream<String> linhas = Files.lines(Paths.get(f.getAbsolutePath()), StandardCharsets.UTF_8)) {
			linhas.forEach(s -> sb.append(s).append(NOVA_LINHA));
		} catch (IOException e) {
			e.printStackTrace();
		}

		String conteudo = sb.toString();
		Pilha<Tag> pilhaTags = encontrarTags(conteudo);
		validarTags(pilhaTags);
		if (getErrosNoArquivo().estaVazia()) {
			isValido = true;
		}

		return isValido;
	}

	private void validarTags(Pilha<Tag> pilhaDeTags) {
		if (!pilhaDeTags.estaVazia()) {

			Integer tagsIniciais = getTagsIniciais().getTamanho();
			Integer tagsFinais = getTagsFinais().getTamanho();
			if (tagsFinais != tagsIniciais) {
				ListaEstatica<Tag> listaTagsIniciais = getTagsIniciais();

				for (int i = 0; i < getTagsFinais().getTamanho(); i++) {
					listaTagsIniciais.retirar(getTagsFinais().obterElemento(i));
				}

				ListaEstatica<Tag> listaItensDistintos = getTagsFinais();

				for (int i = 0; i < getTagsFinais().getTamanho(); i++) {
					listaItensDistintos.retirar(getTagsIniciais().obterElemento(i));
				}

				for (int i = 0; i < listaTagsIniciais.getTamanho(); i++) {
					listaItensDistintos.inserir(listaTagsIniciais.obterElemento(i));
				}

				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < listaItensDistintos.getTamanho(); i++) {
					sb.append("\t" + listaItensDistintos.obterElemento(i).getNome() + "\n");
				}

				String mensagemErro = "Faltou fechar a(s) seguinte(s) tag(s):\n" + sb.toString();

				getErrosNoArquivo().inserir(mensagemErro);

			}

		}

	}

	private Pilha<Tag> encontrarTags(String conteudo) {
		Pilha<Tag> pilha = new PilhaLista<>();
		Matcher matcher = pattern.matcher(conteudo);
		while (matcher.find()) {
			String nome = matcher.group(1);
			boolean isTagInicial = nome != null;
			if (isTagInicial) {
				adicionarTagInicial(pilha, nome);
			} else {
				String nomeTagFinal = matcher.group(0);
				tratarTagFinal(pilha, nomeTagFinal);
			}
		}

		return pilha;
	}

	private void adicionarTagInicial(Pilha<Tag> pilha, String nome) {
		Tag tag = TagImplementacao.getTags(nome);
		if (tag.isSingleton()) {
			adicionarTag(tag);
		} else {
			getTagsIniciais().inserir(tag);
			pilha.push(tag);
		}
	}

	private void tratarTagFinal(Pilha<Tag> pilha, String nomeTagFinal) {
		nomeTagFinal = nomeTagFinal.replaceAll("</", "");
		Tag tagFinal = TagImplementacao.getTags(nomeTagFinal);
		getTagsFinais().inserir(tagFinal);

		Tag tagInicial = pilha.pop();
		String nomeTagInicial = tagInicial.getNome();
		if (nomeTagFinal.equalsIgnoreCase(nomeTagInicial)) {
			adicionarTag(tagInicial);
		} else {
			getErrosNoArquivo()
					.inserir(String.format("Tag invalida! Era esperada a tag \"%s\" mas foi encontrada a tag \"%s\"",
							nomeTagInicial, nomeTagFinal));
		}

	}

	private void adicionarTag(Tag tag) {
		int qtd = 1;
		int pos = setQuantidade().buscar(tag);
		if (pos > -1) {
			qtd = setQuantidade().obterElemento(setQuantidade().buscar(tag)).getQuantidade();
			setQuantidade().obterElemento(setQuantidade().buscar(tag)).setQuantidade(qtd + 1);
		} else {
			tag.setQuantidade(1);
			setQuantidade().inserir(tag);
		}
	}

	public String getResults() {
		if (getErrosNoArquivo().getTamanho() == 0) {
			return "O arquivo esta bem formatado";
		} else {
			String retorno = "";
			for (int i = 0; i < getErrosNoArquivo().getTamanho(); i++) {
				retorno += retorno != "" ? "\n\n" : "";
				retorno += getErrosNoArquivo().obterElemento(i);
			}
			return retorno;
		}
	}

	public static Pattern getPattern() {
		return pattern;
	}

	public ListaEstatica<Tag> setQuantidade() {
		return tagsPalavras;
	}

	public ListaEstatica<Tag> getTagsPalavras() {
		return tagsPalavras;
	}

	public void setTagsPalavras(ListaEstatica<Tag> tagsPalavras) {
		this.tagsPalavras = tagsPalavras;
	}

	public ListaEstatica<String> getErrosNoArquivo() {
		return errosNoArquivo;
	}

	public void setErrosNoArquivo(ListaEstatica<String> errosNoArquivo) {
		this.errosNoArquivo = errosNoArquivo;
	}

	public ListaEstatica<Tag> getTagsIniciais() {
		return tagsIniciais;
	}

	public void setTagsIniciais(ListaEstatica<Tag> tagsIniciais) {
		this.tagsIniciais = tagsIniciais;
	}

	public ListaEstatica<Tag> getTagsFinais() {
		return tagsFinais;
	}

	public void setTagsFinais(ListaEstatica<Tag> tagsFinais) {
		this.tagsFinais = tagsFinais;
	}

}
