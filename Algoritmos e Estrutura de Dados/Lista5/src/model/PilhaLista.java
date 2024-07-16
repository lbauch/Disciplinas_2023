package model;

public class PilhaLista<T> implements Pilha<T> {

    ListaEncadeada<T> lista = new ListaEncadeada<>();

    @Override
    public void push(T info) {
        lista.inserir(info);
    }

    @Override
    public T pop() {
        T novo = peek();
        lista.retirar(novo);
        return novo;
    }

    @Override
    public T peek() {
        if(estaVazia()){
            throw new PilhaVaziaException();
        }
        return (T)lista.getPrimeiro().getInfo();
    }

    @Override
    public boolean estaVazia() {
        return (lista.estaVazia());
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
