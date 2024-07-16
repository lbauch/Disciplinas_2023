package Classes;

public class PilhaVetor<T> implements Pilha<T> {

    private Object[] info;
    private int limite;
    private int tamanho = 0;

    public PilhaVetor(int limite) {
        info = new Object[limite];
        this.limite = limite;
        this.tamanho = 0;
    }

    @Override
    public void push(T valor) {
        if (limite == tamanho) {
            throw new PilhaCheiaException();
        }
        info[tamanho] = valor;
        tamanho++;
    }

    @Override
    public T pop() {
        T valor = null;
        valor = peek();
        this.info[tamanho - 1] = null;
        tamanho--;
        return valor;
    }

    @Override
    public T peek() {
        if (estaVazia()) {
            throw new PilhaVaziaException();
        }
        return (T) info[tamanho - 1];
    }

    @Override
    public boolean estaVazia() {
        if (tamanho == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void liberar() {
        info = new Object[limite];
        tamanho = 0;
    }

    @Override
    public String toString() {
        String lista = "";
        for (int i = tamanho - 1; i >= 0; i--) {
            lista += info[i].toString();
            if (i > 0) {
                lista = lista + ",";
            }
        }
        return lista;
    }

    public void concatenar(PilhaVetor<T> p) {
        if (limite < p.tamanho + this.tamanho) {
            throw new RuntimeException("Não há espaço para empilhar todos os dados");
        }
        for (int i = 0; i < p.tamanho; i++) {
            this.push((T) p.info[i]);
        }
    }

}
