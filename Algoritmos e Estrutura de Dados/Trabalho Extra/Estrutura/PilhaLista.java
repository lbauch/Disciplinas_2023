package Estrutura;

public class PilhaLista<T> implements Pilha<T> {

	private ListaEncadeada<T> lista;

	public PilhaLista() {
		lista = new ListaEncadeada<>();
	}

	@Override
	public void push(T info) {
		lista.inserir(info);
	}

	@Override
	public T pop() {
		if (lista.estaVazia()) {
			throw new PilhaVaziaException();
		}
		T retorno = lista.getPrimeiro().getInfo();
		lista.retirar(retorno);
		return retorno;
	}

	@Override
	public T peek() {
		if (lista.estaVazia()) {
			throw new PilhaVaziaException();
		}
		return lista.getPrimeiro().getInfo();
	}

	@Override
	public boolean estaVazia() {
		return lista.estaVazia();
	}

	@Override
	public void liberar() {
		try {
			while (true) {
				pop();
			}
		} catch (PilhaVaziaException e) {

		}
	}

	public String toString() {
		return lista.toString();
	}

}
