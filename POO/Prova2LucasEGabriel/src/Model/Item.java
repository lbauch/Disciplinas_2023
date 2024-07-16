package Model;

public class Item {
    
    private String nome;
    private double peso;

    
    public Item(double peso){
      if(peso < 0){
        throw new IllegalArgumentException("Peso deve ser positivo");
      }
        setPeso(peso); 
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}
