public abstract class ListaAbstract<T> {
    private T[] info;
    private int tamanho;

    protected T[] getInfo() {
        return info;
    }

    protected void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    // Constructor
    public ListaAbstract(){
        info = (T[]) new Object[10];
        tamanho = 0;
    }

    //Methods
    protected void redimensionar(){
        T[] novo = (T[]) new Object[tamanho+10];
        for(int i=0; i<tamanho; i++){
            novo[i] = info[i];
        }

        info = novo;
    }
    public abstract void inserir(T valor);

    public void exibir(){
        for(int i=0;i<tamanho;i++){
            System.out.println(info[i]);
        }
    }

    public abstract int buscar(T valor);

    public void retirar(T valor){
        int index = buscar(valor);
        if(index != -1){
            for(int i=index; i<tamanho-index;i++){
                info[i] = info[i+1];
            }

            tamanho--;
            info[tamanho] = null;
        }
    }

    public void liberar(){
        tamanho = 0;
        info = (T[]) new Object[10];
    }

    public T obterElemento(int posicao){
        if(posicao >= 0 && (posicao<tamanho)){
            return (T) info[posicao];
        }
        throw new IndexOutOfBoundsException();
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public int getTamanho(){
        return tamanho;
    }
    @Override
    public String toString(){
        String string = "";
        for(int i=0;i<tamanho;i++){
            if(i==0){
                string = string + info[i];
            } else {
                string = string + "," + info[i];
            }
        }
        return string;
    }

    public void inverter(){
        for(int i=0; i<(tamanho/2);i++){
            T x = info[i];
            info[i] = info[tamanho-i-1];
            info[tamanho-i-1] = x;
        }
    }
}

