package model;

public class ListaDupla<T> {

    private NoListaDupla<T> primeiro;

    public ListaDupla() {
        primeiro = null;
    }

    public NoListaDupla<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T valor) {
        NoListaDupla<T> novo = new NoListaDupla<T>();
        novo.setInfo(valor);
        novo.setProximo(primeiro);
        novo.setAnterior(null);
        if (primeiro != null) {
            primeiro.setAnterior(novo);
        }
        primeiro = novo;
    }

    public NoListaDupla<T> buscar(T valor) {
        NoListaDupla<T> p = primeiro;
        while (p != null) {
            if (p.getInfo().equals(valor)) {
                return p;
            }
            p = p.getProximo();
        }
        return null;
    }

    public void retirar(T valor) {
        NoListaDupla<T> p = buscar(valor);
        if (primeiro == p) {
            primeiro = p.getProximo();
        } else {
            p.getAnterior().setProximo(p.getProximo());
        }

        if (p.getProximo() != null) {
            p.getProximo().setAnterior(p.getAnterior());
        }
    }

    public void exibirOrdemInversa() {
        NoListaDupla<T> p = obterUltimo();
        while (p != null) {
            System.out.println(p.getInfo());
            p = p.getAnterior();
        }
    }

    private NoListaDupla<T> obterUltimo() {
        NoListaDupla<T> ultimo = primeiro;
        NoListaDupla<T> p = primeiro;
        while (p != null) {
            ultimo = p;
            p = p.getProximo();
        }
        return ultimo;
    }

    public void liberar() {
        NoListaDupla<T> p = primeiro;
        NoListaDupla<T> no2;
        while (p != null) {
            p.setAnterior(null);
            no2 = p.getProximo();
            p.setProximo(null);
            p = no2;
        }
    }

    @Override
    public String toString() {
        String texto = "";
        NoListaDupla<T> p = primeiro;
        while (p != null) {
            texto += p.getInfo().toString();
            if (p.getProximo() != null) {
                texto += ",";
            }
            p = p.getProximo();
        }
        return texto;
    }

    public ListaDupla<T> criarSubLista(int inicio, int fim){
        if((inicio <0) || (fim<0) || (inicio>fim)){
        throw new IndexOutOfBoundsException();
        }
        
        NoListaDupla<T> p = primeiro;
        for(int i=0; (p!=null) && (i<fim); i++){
        p = p.getProximo();
        }
        
        if(p == null){
        throw new IndexOutOfBoundsException();
        }
        
        ListaDupla<T> nova = new ListaDupla<T>();
                
        for(int i=fim; i>=inicio; i--){
        nova.inserir(p.getInfo());
        p = p.getAnterior();
        }
        
        return nova;
        }

}
