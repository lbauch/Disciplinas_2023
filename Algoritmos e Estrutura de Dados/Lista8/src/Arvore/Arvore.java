package Arvore;

public class Arvore<T> {

    NoArvore<T> raiz;

    public Arvore() {
        raiz = null;
    }

    public NoArvore<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvore<T> raiz) {
        this.raiz = raiz;
    }

    private String obterRepresentaçãoTextual(NoArvore<T> no) {
        String s = "<" + no.getInfo().toString();
        NoArvore<T> p = no.getPrimeiro();
        while (p != null) {
            s += obterRepresentaçãoTextual(p);
            p = p.getProximo();
        }
        s += ">";
        System.out.println(no.getInfo().toString());
        return s;
    }

    public boolean pertence(T info) {
        if (raiz == null) {
            return false;
        } else {
            return pertence(info, raiz);
        }
    }

    private boolean pertence(T info, NoArvore<T> no) {
        if (no.getInfo() == info) {
            return true;
        } else {
            NoArvore<T> p = new NoArvore<>(info);
            p.setPrimeiro(no);
            while (p != null) {
                if (pertence(info, p)) {
                    return true;
                }
                p = p.getProximo();
            }
            return false;
        }
    }

    public int contarNos() {
        if(raiz == null){
            return 0;
        }
        return (contarNos(raiz));
    }

    private int contarNos(NoArvore<T> no) {
        int s = 1;
        NoArvore<T> p = no.getPrimeiro();
        while (p != null) {
            s += contarNos(p);
            p = p.getProximo();
        }
        return s;
    }

    @Override
    public String toString() {
        if (raiz == null) {
            return "";
        } else {
            return obterRepresentaçãoTextual(raiz);
        }
    }

}
