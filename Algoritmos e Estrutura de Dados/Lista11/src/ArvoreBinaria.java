public class ArvoreBinaria<T> extends ArvoreBinariaAbstract<T> {
    private NoArvoreBinaria<T> raiz;

    public void setRaiz(NoArvoreBinaria<T> raiz) {
        super.setRaiz(raiz);
    }

    public NoArvoreBinaria<T> buscar(T info){
        return new NoArvoreBinaria<T>(null)
    }

    private NoArvoreBinaria<T> buscar(NoArvoreBinaria<T> no, T info){
        if(no == null)
            return null;
        else {
            if (no.getInfo().equals(info))
                return no;
            else {
                NoArvoreBinaria<T> noLocalizado;
                noLocalizado = buscar(no.getEsquerda(), info);
                if(noLocalizado == null) {

                }
            }
        }
    }
}
