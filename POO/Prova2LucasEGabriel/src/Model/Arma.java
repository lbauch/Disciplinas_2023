package Model;

public class Arma extends Item{
    
    private double danoBase;
    private TipoArma tipo;

    public Arma(double danoBase, TipoArma tipo, double peso){
        super(peso);
        
    }
    
    public double getDanoBase() {
        return danoBase;
    }

    public void setDanoBase(double danoBase) {
        if(danoBase <= 0){
            throw new IllegalArgumentException("dano deve ser positivo");
        }
        this.danoBase = danoBase;
    }
    
    public TipoArma getTipo(){
        return tipo;
    }

    private void setTipo(TipoArma tipo) {
        if(tipo == null){
            throw new IllegalArgumentException("Tipo deve ser informado");
        }
        this.tipo = tipo;
    }
    
}
