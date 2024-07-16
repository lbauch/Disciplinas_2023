package Model;

public class Guerreiro extends Personagem {
    
    private Guerreiro (int forca, int inteligencia, int agilidade, Arma arma){
        super(forca, inteligencia, agilidade, arma);
    }
    
    @Override
    public double calcularDano(){
        double danoTotal=0;
        
        danoTotal = getForca() + obterDanoArmaEquipada();
        return 0;
    }
    
    @Override
    public void equiparArma(Arma arma){
        if(arma.getTipo() == TipoArma.ESPADA){
            setArma(arma);
        }
        else{
            throw new IllegalArgumentException("Arma deve ser espada");
        }
    }
    
}
