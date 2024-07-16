package Fila;

public class FilaLista<T> implements Fila<T>{

    private ListaEncadeada<T> lista = new ListaEncadeada<>();
    
    @Override
    public void inserir(T valor) {
        lista.inserirNoFinal(valor);
    }

    @Override
    public boolean estaVazia() {
        return lista.estaVazia();
    }

    @Override
    public T peek() {
        if(lista.estaVazia()){
            throw new FilaVaziaException();
        }
        return (T)lista.getPrimeiro().getInfo();
    }

    @Override
    public T retirar() {
        T bkp = peek();
        lista.retirar((T)lista.getPrimeiro().getInfo());
        return bkp;
    }

    @Override
    public void liberar() {
        lista = new ListaEncadeada<>();
    }
    
    @Override
    public String toString(){
        return lista.toString();
    }
    
}
