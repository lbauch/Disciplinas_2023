package Model;

import java.util.ArrayList;

public class Termo {
    
    private String nome, descricao;
    private ArrayList<Obra> obras = new ArrayList<>();
    
    public Termo(String nome){
        setNome(nome);
    }
    
    public Termo(String nome, String descricao){
        setNome(nome);
        setDescricao(descricao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.isBlank() || nome == null){
            throw new IllegalArgumentException("Nome não pode ser nulo");
        }
        else{
            this.nome = nome;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(descricao.isBlank() || descricao == null ){
            throw new IllegalArgumentException("Descrição não pode ser nula");
        }
        else{
            this.descricao = descricao;
        }        
    }
    
    public void incluirObra(Obra obra) {
        obras.add(obra);
    }
    
    public void removerObra(Obra obra) {
        obras.remove(obra);
    }
    
    public ArrayList<Obra> getObras() {
        return obras;
    }

}
