package HashMap;

/**
 * ListaEncadeada
 */
public class ListaEncadeada<T> {
    private NoLista<T> primeiro;

    public ListaEncadeada(){
        primeiro = null;
    }

    public NoLista<T> getPrimeiro(){
        return this.primeiro;
    }

    public void inserir(T info){
        NoLista<T> novo = new NoLista<>();
        novo.setInfo(info);
        novo.setProximo(primeiro);
        this.primeiro = novo;
    }

    public boolean estaVazia(){
        return primeiro == null;
    }

    public NoLista<T> buscar(T info){
        NoLista<T> p = primeiro;
        while(p != null){
            if(p.getInfo().equals(info)){
                return p;
            }
            p = p.getProximo();
        }
        return null;
    }

    public void retirar(T info){
        NoLista<T> p = primeiro;
        NoLista<T> anterior = null;
        while(p != null && (!p.getInfo().equals(info))){
            anterior = p;
            p = p.getProximo();
        }

        if(p != null){
            if(p == primeiro){
                this.primeiro = p.getProximo();
            } else {
                anterior.setProximo(p.getProximo());
            }
        }
    }

    public int obterComprimento(){
        NoLista<T> p = primeiro;
        int count=0;
        while(p != null){
            p = p.getProximo();
            count++;
        }
        return count;
    }

    public NoLista<T> obterNo(int index){
        if(index<0){
            throw new IndexOutOfBoundsException();
        }
        NoLista<T> p = primeiro;
        while((p != null)    && (index > 0)) {
            index--;
            p = p.getProximo();
        }
        if(p == null){
            throw new IndexOutOfBoundsException();
        }
        return p;
    }
    @Override
    public String toString(){
        String no = "";
        NoLista<T> p = primeiro;
        while(p != null){
            if(p == primeiro){
                no = no + p.getInfo();
            } else {
                no = no + "," + p.getInfo();
            }
            p = p.getProximo();
        }
        return no;
    }
}