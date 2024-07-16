package Model;

public class Ladino extends Personagem {
    
    private Ladino (int forca, int inteligencia, int agilidade, Arma arma){
        super(forca, inteligencia, agilidade, arma);
    }
    
    @Override
    public double calcularDano(){
        double danoTotal=0;
        
        danoTotal = getAgilidade()+ obterDanoArmaEquipada();
        return 0;
    }
    
    @Override
    public void equiparArma(Arma arma){
        if(arma.getTipo() == TipoArma.ADAGA){
            setArma(arma);
        }
        else{
            throw new IllegalArgumentException("Arma deve ser adaga");
        }
    }
    
}