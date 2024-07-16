public class ArvoreBinariaBusca<T extends Comparable<T>> extends ArvoreBinariaAbstract{

    public void inserir(T info){
        NoArvoreBinaria<T> novo = new NoArvoreBinaria<>(info);

        if (estaVazia())
            setRaiz(novo);
        else {
            NoArvoreBinaria<T> p = getRaiz();
            NoArvoreBinaria<T> pai;
            while(true){
                pai = p;
                if(info.compareTo(p.getInfo()) < 0){
                    p = pai.getEsquerda();
                    if(p == null){
                        pai.setEsquerda(novo);
                        return;
                    }

                } else {
                    if(info.compareTo(p.getInfo()) > 0){
                        p = pai.getDireita();
                        if(p == null){
                            pai.setDireita(novo);
                            return;
                        }
                    }
                }
            }
        }
    }

    public NoArvoreBinaria<T> buscar(T info){
        NoArvoreBinaria<T> p;
        p = getRaiz();
        while(p!= null && !p.getInfo().equals(info)) {
            if(info.compareTo(p.getInfo()) < 0){

            }
        }
    }

    public void retirar(T info) {
        NoArvoreBinaria<T> p = getRaiz();

    }
}
