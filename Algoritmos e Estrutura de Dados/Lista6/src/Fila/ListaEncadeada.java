package Fila;

public class ListaEncadeada<T> {

    private NoLista primeiro;
    private NoLista ultimo;

    public ListaEncadeada() {
        primeiro = null;
    }

    public NoLista getPrimeiro() {
        return primeiro;
    }

    public boolean estaVazia() {
        if (primeiro == null) {
            return true;
        }
        return false;
    }

    public NoLista buscar(T info) {
        NoLista p = primeiro;
        while (p != null) {
            if (p.getInfo().equals(info)) {
                return p;
            }
            p = p.getProximo();
        }
        return null;
    }

    public void retirar(T info) {
        NoLista anterior = null;
        NoLista p = primeiro;
        while (p != null && !p.getInfo().equals(info)) {
            anterior = p;
            p = p.getProximo();
        }
        if (p != null) {
            if (p.equals(primeiro)) {
                primeiro = p.getProximo();
            } else {
                anterior.setProximo(p.getProximo());
            }
        }

    }

    public int obterComprimento() {
        NoLista p = primeiro;
        int comprimento = 0;
        while (p != null) {
            comprimento++;
            p = p.getProximo();
        }
        return comprimento;
    }

    public NoLista obterNo(int idx) {
        NoLista p = primeiro;
        int comprimento = 0;
        if (idx < 0) {
            throw new IllegalArgumentException();
        }
        while (p != null) {
            if (comprimento == idx) {
                return p;
            }
            comprimento++;
            p = p.getProximo();
        }
        if (idx > comprimento) {
            throw new IllegalArgumentException();
        }
        return null;
    }

    @Override
    public String toString() {
        String texto = "";
        NoLista p = primeiro;
        while (p != null) {
            texto += p.getInfo().toString();
            if (p.getProximo() != null) {
                texto += ",";
            }
            p = p.getProximo();
        }
        return texto;
    }

    public void inserirNoFinal(T valor) {
        NoLista<T> novo = new NoLista<>();
        novo.info = valor;
        novo.setProximo(null);
        if (estaVazia()) {
            primeiro = novo;
        } else {
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }

}
