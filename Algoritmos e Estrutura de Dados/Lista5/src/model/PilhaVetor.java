package model;

public class PilhaVetor<T> implements Pilha<T> {

    private Object[] info;
    private int limite;
    private int tamanho;

    public PilhaVetor(int limite) {
        this.limite = limite;
        info = new Object[limite];
        this.tamanho = 0;
    }

    @Override
    public void push(T info) {
        if (limite == tamanho) {
            throw new PilhaCheiaException();
        }
        this.info[tamanho] = info;
        tamanho ++;
    }

    @Override
    public T pop() {
        T valor = peek();
        info[tamanho - 1] = null;
        tamanho --;
        return valor;
    }

    @Override
    public T peek() {
        if (estaVazia()) {
            throw new PilhaVaziaException();
        }
        //T novo = (T)info[tamanho-1];
        return (T)info[tamanho-1];
    }

    @Override
    public boolean estaVazia() {
        return (tamanho == 0);
    }

    @Override
    public void liberar() {
        //para java, funciona o método a seguir.
        info = new Object[limite];
        tamanho = 0;
        //outra forma:
        /*
        while(!estaVazia()){
            pop();
        }
        */
        
        //outra forma:
        /*
        try{
            while (true) {                
                pop();
            }
        }catch(PilhaVaziaException e){
            
        }
        */
    }
    
    @Override
    public String toString(){
        String texto = info[tamanho-1].toString();
        for(int i = tamanho - 2; i >= 0; i--){
            texto +=  "," + info[i].toString();
        }
        return texto;
    }

    public void concatenar(PilhaVetor<T> p){
        if(p.tamanho + this.tamanho > this.limite){
            throw new PilhaCheiaException();
        }
        for(int i=0; i < p.tamanho; i++){
            this.push((T)p.info[i]);
        }
    }

}
