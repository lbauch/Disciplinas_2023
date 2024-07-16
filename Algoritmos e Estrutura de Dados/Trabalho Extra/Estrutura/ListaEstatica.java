package Estrutura;

public class ListaEstatica<T> {
	private T[] info;
	private int tamanho;

	public ListaEstatica() {
		info = (T[]) new Object[10];
		tamanho = 0;
	}

	public void redimensionar() {
		Object novoVetor[] = (T[]) new Object[info.length + 10];
		for (int i = 0; i < info.length; i++) {
			novoVetor[i] = info[i];
		}
		info = (T[]) novoVetor;
	}

	public void inserir(T valor) {
		if (tamanho == info.length) {
			redimensionar();
		}
		info[tamanho] = valor;
		tamanho++;
	}

	public void exibir() {
		for (int i = 0; i < info.length; i++) {
			System.out.println(info[i]);
		}
	}

	public int buscar(T t) {
		for (int i = 0; i < info.length; i++) {
			if (info[i] == t) {
				return i;
			}
		}
		return -1;
	}

	public void retirar(T t) {
		if (buscar(t) != -1) {
			for (int i = buscar(t); i < tamanho - 1; i++) {
				info[i] = info[i + 1];
			}
			tamanho--;
			info[tamanho] = null;
		}
	}

	public void liberar() {
		info = (T[]) new Object[10];
		tamanho = 0;
	}

	public T obterElemento(int posicao) {
		if (posicao >= 0 && posicao < tamanho) {
			return info[posicao];
		} else {
			throw new IndexOutOfBoundsException();
		}
	}

	public boolean estaVazia() {
		if (tamanho == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int getTamanho() {
		return tamanho;
	}

	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < tamanho; i++) {
			if (i < tamanho - 1) {
				str += info[i] + ",";
			} else {
				str += info[i];
			}
		}
		return str;
	}
}
