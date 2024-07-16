package Model;

import java.util.ArrayList;

public class Personagem {
    
    private int forca, inteligencia, agilidade;
    private Arma arma;
    private ArrayList<Item> itens = new ArrayList<>();

    protected Personagem(int forca, int inteligencia, int agilidade, Arma arma){
        setAgilidade(agilidade);
        equiparArma(arma);
        setForca(forca);
        setInteligencia(inteligencia);
    }
    
    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }
    
    public double calcularDano(){
        return 0;
    }
    
    public void equiparArma(Arma arma){
    }
    
    public double obterDanoArmaEquipada(){
        if(arma == null){
            return 0;
        }
        else{
            return arma.getDanoBase();
        }
    }
    
    public Arma getArma(Arma arma){
        return arma;
    }
    
    protected void setArma(Arma arma){
        this.arma = arma;
    }
    
    public void incluirItem(Item item){
        if(itens.size() == 10 || item == null) {
            throw new IllegalArgumentException("Quantidade exedida ou item não informado");
        }
        itens.add(item);
    }
    
    public void removerItem(Item item){
        itens.remove(item);
    }
    
    public ArrayList<Item> getItens(){
        return itens;
    }
    
    public double calcularPesoCarregado(){
        double pesoTotal=0;
        for(Item item : itens){
            if(!(item instanceof Arma)){
                pesoTotal += item.getPeso();
            }
        }
        return pesoTotal;
    }
}
