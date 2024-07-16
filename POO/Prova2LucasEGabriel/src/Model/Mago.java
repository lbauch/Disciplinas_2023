package Model;

public class Mago extends Personagem {
    
    private Mago (int forca, int inteligencia, int agilidade, Arma arma){
        super(forca, inteligencia, agilidade, arma);
    }
    
    @Override
    public double calcularDano(){
        double danoTotal=0;
        
        danoTotal = getInteligencia() + obterDanoArmaEquipada();
        return 0;
    }
    
    @Override
    public void equiparArma(Arma arma){
        if(arma.getTipo() == TipoArma.CAJADO){
            setArma(arma);
        }
        else{
            throw new IllegalArgumentException("Arma deve ser cajado");
        }
    }
    
}
