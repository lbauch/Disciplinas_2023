package Q01;

public class MaquinaTicket {
    
    private double precoUnitario;
    private int quantidadeBilhetesVendidos;
    private double valorArrecadado;
    
    public MaquinaTicket(){
        
    }
    
    public MaquinaTicket(double precoUnitario){
        
    }
    
    public void setPrecoUnitario(double precoUnitario){
        if (precoUnitario<0){
            throw new IllegalArgumentException("o valor dos tickets não pode ser negativo");
        }
        this.precoUnitario = precoUnitario;
    }
    
    public double getPrecoUnitario(){
        return precoUnitario;
    }
    
    public int getQuantidadeBilhetesVendidos(){
        return quantidadeBilhetesVendidos;
    }
    
    public double getValorArrecadado(){
        return valorArrecadado;
    }
    
    public double vender(int quantidade, double valorPago){
        if (quantidade<0 ){
            throw new IllegalArgumentException("Não é possível concluir a operação."
                    + " O valor " + valorPago + "será retornado");
        }
        
        if (valorPago<(quantidade*precoUnitario)){
            throw new IllegalArgumentException("Não é possível concluir a operação."
                    + " O valor " + valorPago + "será retornado");
        }
        
        double troco, vlrTotal;
        vlrTotal = quantidade*precoUnitario;
        troco = valorPago - vlrTotal;
                
        quantidadeBilhetesVendidos += quantidade;      
        valorArrecadado += vlrTotal;

        return troco;
    }
}
