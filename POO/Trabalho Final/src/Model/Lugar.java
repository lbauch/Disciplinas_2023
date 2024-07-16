package Model;

public class Lugar extends Termo {
    
    private String historia;

    public Lugar(String nome, String descricao, String historia){
        super(nome, descricao);
        setHistoria(historia);
    }
    
    public Lugar (String nome){
        super(nome);
    }
    
    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        if(historia == null || historia.isBlank()){
            throw new IllegalArgumentException("História deve ser preenchida.");
        }
        this.historia = historia;
    }
        
}
