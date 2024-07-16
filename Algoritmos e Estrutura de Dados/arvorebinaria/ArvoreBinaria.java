package arvorebinaria;

public class ArvoreBinaria <T> {

	private NoArvoreBinaria<T> raiz;
	
	/**
	 * Cria uma árvore vazia
	 */
	public ArvoreBinaria() {
		 raiz = null;
	}
	
	public NoArvoreBinaria<T> getRaiz() {
		return raiz;
	}
	
	/**
	 * Define a raiz da árvore
	 * @param raiz Raiz da árvore binária
	 */
	public void setRaiz(NoArvoreBinaria<T> raiz) {
		this.raiz = raiz;
	}
	

	/**
	 * Avalia se a árvore está vazia
	 * @return True se a árvore estiver vazia, senão false
	 */
	public boolean estaVazia () {
		return (raiz == null);
	}




	/**
	 * Avalia se um determinado dado está armazenado na árvore.
	 * Inicia a busca, partindo da raiz da árvore
	 * @param info valor a ser pesquisado
	 * @return True se o dado foi localizado
	 */
	public boolean pertence(T info) {
		 return pertence(raiz, info);
	}


	/**
	 * Avalia se um dado pertence a árvore cuja raiz é fornecida
	 * como argumento
	 * @param no Nó raiz a ser pesquisado
	 * @param info Dado a ser procurado na árvore
	 * @return True se o dado foi localizado na árvore
	 */
	private boolean pertence(NoArvoreBinaria<T> no, T info){
		if (no == null)
			return false;
		else
			return (no.getInfo().equals(info)) ||
					pertence(no.getEsquerda(), info) ||
					pertence(no.getDireita(), info);
		
//		if (no == null)
//			return false;
//		else {
//			if (no.getInfo().equals(info))
//				return true;
//			else {
//				if (pertence(no.getEsquerda(), info))
//					return true;
//				else
//					return (pertence(no.getDireita(), info));
//				}
//			}
//		}
//
	}

	/**
	 * Devolve a representação textual da árvore
	 */
	public String toString() {
		return arvorePre(raiz);
	}
		
	
	private String arvorePre(NoArvoreBinaria<T> no) {
		if (no == null)
			return "<>";
		else 
			return "<" + 
					no.getInfo() + 
					arvorePre(no.getEsquerda()) +
					arvorePre(no.getDireita()) +
					">";
	}
	

	/**
	 * Calcula a quantidade de nós existentes na árvore
	 * @return Número de nós da árvore
	 */
	public int contarNos() {
		return contarNos(raiz);
	}
	
	
	
	private int contarNos(NoArvoreBinaria<T> no) {
		if (no == null) {
			return 0;
		} else {
			return 1 +  contarNos(no.getEsquerda()) +
						contarNos(no.getDireita());
		}
	}

}


