package Estrutura;

public class ListaEncadeada<T> {

	private NoLista<T> primeiro;

	public ListaEncadeada() {
		this.primeiro = null;
	}

	public NoLista<T> getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(NoLista<T> primeiro) {
		this.primeiro = primeiro;
	}

	public boolean estaVazia() {
		return primeiro == null;
	}

	public void inserir(T info) {
		NoLista<T> proximo = new NoLista<>();
		proximo.setInfo(info);

		if (!estaVazia()) {
			proximo.setProximo(primeiro);
			this.primeiro = proximo;
		} else {
			this.primeiro = proximo;
		}
	}

	public NoLista<T> buscar(T info) {
		NoLista<T> noAtual = primeiro;
		while (noAtual != null) {
			if(info.equals(noAtual.getInfo())) {
				return noAtual;
			}
			noAtual = noAtual.getProximo();
		}

		return null;
	}

	public void retirar(T info) {
		NoLista<T> noAnterior = null;
		NoLista<T> no = this.primeiro;

		while (no != null && !no.getInfo().equals(info)) {
			noAnterior = no;
			no = no.getProximo();
		}

		if (no != null) {
			if (noAnterior == null) {
				this.primeiro = no.getProximo();
			} else {
				noAnterior.setProximo(no.getProximo());
			}
		}
	}

	public int obterComprimento() {

		NoLista<T> no = this.primeiro;
		int quantidadeNos = 0;

		while (no != null) {
			no = no.getProximo();
			quantidadeNos++;
		}

		return quantidadeNos;
	}

	public NoLista<T> obterNo(int indice) {
		if (indice < 0) {
			throw new IndexOutOfBoundsException();
		}

		NoLista<T> noAtual = this.primeiro;
		int indiceNoAtual = indice;

		while (noAtual != null && indiceNoAtual > 0) {
			indiceNoAtual--;
			noAtual = noAtual.getProximo();
		}
		
		if(noAtual == null) {
			throw new IndexOutOfBoundsException();
		}
		
		return noAtual;
	}

	@Override
	public String toString() {
		int comprimento = obterComprimento();
		StringBuilder sb = new StringBuilder();
		T info = null;
		for (int i = 0; i < comprimento; i++) {
			info = obterNo(i).getInfo();
			sb.append(", " + info);
		}

		return sb.toString().replaceFirst(", ", "");
	}

}
