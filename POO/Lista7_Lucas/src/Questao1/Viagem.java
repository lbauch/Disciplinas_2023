package Questao1;

import java.util.ArrayList;

public class Viagem {
    
    private double adiantamento;
    private ArrayList<Despesa> despesas = new ArrayList<>();
    
    public void inserirDespesa(Despesa despesa){
        despesas.add(despesa);
    }
    
    public void removerDespesa(Despesa despesa){
        despesas.remove(despesa);
    }

    public double getAdiantamento() {
        return adiantamento;
    }

    public void setAdiantamento(double adiantamento) {
        if(adiantamento <= 0){
            throw new IllegalArgumentException("Adiantamento deve ser positivo");
        }
        this.adiantamento = adiantamento;
    }
    
    public double calcularValorViagem(){
        double valorTotal = 0;
        for(Despesa d: despesas){
            valorTotal += d.getValor();
        }
        return valorTotal;
    }
    
    public double calcularValorDevolverFuncionario(){
        double valorTotal = 0, valorDevolver;
        for(Despesa d: despesas){
            if(d.getTipoDespesa().toString().equals( "REFEICAO") && d.getValor() > 30){
                valorTotal += 30;
            }
            else{
            valorTotal += d.getValor();
            }
        }
        valorDevolver = adiantamento - valorTotal;
        return valorDevolver;
    }    
    
    public ArrayList<Despesa> getDespesas(){
        return despesas;
    }
}
