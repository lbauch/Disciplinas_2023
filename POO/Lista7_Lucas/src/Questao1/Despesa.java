package Questao1;

public class Despesa {
    
    private double valor;
    private TipoDespesa tipoDespesa;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor <= 0){
            throw new IllegalArgumentException("Valor deve ser positivo");
        }
        this.valor = valor;
    }

    public TipoDespesa getTipoDespesa() {
        return tipoDespesa;
    }

    public void setTipoDespesa(TipoDespesa tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }
    
    
    
}
