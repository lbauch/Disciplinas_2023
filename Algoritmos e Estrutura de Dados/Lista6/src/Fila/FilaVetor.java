package Fila;

public class FilaVetor<T> implements Fila<T>{

    private Object[] info;
    private int limite;
    private int tamanho;
    private int inicio;
    
    public FilaVetor(int limite){
        this.limite = limite;
        info = new Object[limite];
        tamanho = 0;
        inicio = 0;
    }
    
    public int getLimite(){
        return this.limite;
    }
    
    @Override
    public void inserir(T valor) {
        if(tamanho == limite){
            throw new FilaCheiaException();
        }
        int posicao = (inicio + tamanho) % limite;
        info[posicao] = valor;
        tamanho ++;
    }

    @Override
    public boolean estaVazia() {
        return (tamanho == 0);
    }

    @Override
    public T peek() {
        if(tamanho == 0){
            throw new FilaVaziaException();
        }
        return (T)info[inicio];
    }

    @Override
    public T retirar() {
        T bkp = peek();
        info[inicio] = null;
        inicio = (inicio + 1) % limite;
        tamanho --;
        return bkp;
    }

    @Override
    public void liberar() {
        info = new Object[limite];
        tamanho = 0;
    }
    
    public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2){
        FilaVetor<T> f3 = new FilaVetor<>(this.limite + f2.limite);
        
        int posicao = this.inicio;
        for(int i = 0; i < this.tamanho; i++){
            f3.inserir((T)this.info[posicao]);
            posicao = (posicao + 1) % this.limite;
        }
        posicao = f2.inicio;
        for(int i = 0; i < f2.tamanho; i++){
            f3.inserir((T)f2.info[posicao]);
            posicao = (posicao + 1) % f2.limite;
        }
        
        return f3;
        
    }
    
    @Override
    public String toString(){
        int posicao = this.inicio;
        String texto = "" + info[posicao].toString();
        posicao = (posicao + 1) % this.limite;
        for(int i = 0; i < tamanho-1; i++){
            texto += "," + info[posicao].toString();
            posicao = (posicao + 1) % this.limite;
        }
        return texto;
    }
    
}
