package arvorebinaria;

public class NoArvoreBinaria <T> {
	
	private T info;
	private NoArvoreBinaria<T> esquerda;
	private NoArvoreBinaria<T> direita;
	
	/**
	 * Cria um nó sem sub-arvores à esquerda e direita
	 * @param info Valor a ser armazenado na árvore
	 */
	public NoArvoreBinaria(T info) {
		this.info = info;
		esquerda = null;
		direita = null;
	}
	
	
	/**
	 * Cria um novo com sub-árvores pré-estabelecidas
	 * @param info Valor armazenado pelo nó
	 * @param esq Sub-arvore à esquerda
	 * @param dir Sub-árvore à direita
	 */
	public NoArvoreBinaria(T info, NoArvoreBinaria<T> esq,
						           NoArvoreBinaria<T> dir) {
		this.info = info;
		this.esquerda = esq;
		this.direita = dir;
	}
	
	/**
	 * Define o valor a ser armazenado pelo nó
	 * @param info Valor a ser armazenado
	 */
	public void setInfo (T info) {
		this.info = info;
	}
	
	
	/**
	 * Retorna o valor armazenado pelo nó
	 * @return Valor armazenado pelo nó
	 */
	public T getInfo() {
		return info;
	}
	
	
	/**
	 * Retorna a sub-árvore à esquerda
	 * @return Sub-árvore da esquerda
	 */
	public NoArvoreBinaria<T> getEsquerda () {
		return esquerda;
	}
	
	
	/**
	 * Retorna a sub-árvore à direita
	 * @return Sub-árvore da direita
	 */
	public NoArvoreBinaria<T> getDireita () {
		return direita;
	}


	/**
	 * Define a raiz da sub-arvore à esquerda do nó corrente 
	 * @param esquerda Raiz da sub-árvore
	 */
	public void setEsquerda(NoArvoreBinaria<T> esquerda) {
		this.esquerda = esquerda;
	}
	

	/**
	 * Define a raiz da sub-arvore à direita do nó corrente 
	 * @param direita Raiz da sub-árvore
	 */
	public void setDireita(NoArvoreBinaria<T> direita) {
		this.direita = direita;
	}
	
	
}
