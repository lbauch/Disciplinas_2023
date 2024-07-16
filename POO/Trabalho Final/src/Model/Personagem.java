package Model;

import java.util.ArrayList;

public class Personagem  extends Termo{
    
    private String caracteristicas, feitos;
    ArrayList<String> atores = new ArrayList<>();

    public Personagem (String nome, String descricao, String caracteristicas, String feitos){
        super(nome, descricao);
        setCaracteristicas(caracteristicas);
        setFeitos(feitos);
        
    }
    
    public Personagem (String nome){
        super(nome);
    }
    
    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        if(caracteristicas == null || caracteristicas.isBlank()){
            throw new IllegalArgumentException("História deve ser preenchida.");
        }
        this.caracteristicas = caracteristicas;
    }

    public String getFeitos() {     
        return feitos;
    }

    public void setFeitos(String feitos) {
        if(feitos == null || feitos.isBlank()){
            throw new IllegalArgumentException("História deve ser preenchida.");
        }
        this.feitos = feitos;
    }

    public void incluirAtores(String ator){
        atores.add(ator);
    }
    
    public void removerAtores(String ator){
        atores.remove(ator);
    }
    
    public ArrayList<String> getAtores() {
        return atores;
    }   
    
    
}
