package Classes;

public class FilaVetor<T> implements Fila<T> {

    private Object[] info;
    private int limite;
    private int tamanho;
    private int inicio;

    public FilaVetor(int limite) {
        info = new Object[limite];
        this.limite = limite;
        this.tamanho = 0;
        this.inicio = 0;
    }

    @Override
    public void inserir(T valor) {
        if (tamanho == limite) {
            throw new FilaCheiaException();
        }
        int posicaoInserir;
        posicaoInserir = (inicio + tamanho) % limite;
        info[posicaoInserir] = valor;
        tamanho++;
    }

    @Override
    public boolean estaVazia() {
        if (tamanho == 0) {
            return true;
        }
        return false;
    }

    public int getLimite() {
        return limite;
    }

    @Override
    public T peek() {
        if (estaVazia()) {
            throw new FilaVaziaException();
        }
        return (T) info[inicio];
    }

    @Override
    public void liberar() {
        info = new Object[limite];
        tamanho = 0;
    }

    @Override
    public T retirar() {
        T backup = peek();
        info[inicio] = null;
        inicio = (inicio + 1) % limite;
        tamanho--;
        return backup;
    }

    public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2) {
        FilaVetor<T> f3 = new FilaVetor<>(this.limite + f2.limite);
        int posicao = this.inicio;
        for (int i = 0; i < this.tamanho; i++) {
            f3.inserir((T) this.info[posicao]);
            posicao = (posicao + 1) % this.limite;
        }
        posicao = f2.inicio;
        for (int i = 0; i < f2.tamanho; i++) {
            f3.inserir((T) f2.info[posicao]);
            posicao = (posicao + 1) % f2.limite;
        }
        return f3;
    }

    @Override
    public String toString() {
        String retorno = "";
        int indice = inicio;
        for (int i = 0; i < tamanho; i++) {
            if (i > 0) {
                retorno += ",";
            }
            retorno = retorno + info[indice];
            indice = (indice + 1) % limite;
        }
        return retorno;
    }

}
