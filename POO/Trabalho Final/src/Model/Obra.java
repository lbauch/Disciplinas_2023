package Model;

import java.util.Calendar;

public class Obra {

    private String titulo;
    private int anoLancamento;
    private Categoria categoria;

    public Obra(String titulo, int anoLancamento, Categoria categoria) {
        setTitulo(titulo);
        setAnoLancamento(anoLancamento);
        setCategoria(categoria);

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("História deve ser preenchida.");
        }
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        if (anoLancamento == 0) {
            throw new IllegalArgumentException("Ano deve ser preenchido");
        } 
        
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        if (anoLancamento > anoAtual) {
        throw new IllegalArgumentException("Ano deve ser maior que o ano atual");
        }
        this.anoLancamento = anoLancamento;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        if (categoria == null) {
            throw new IllegalArgumentException("Categoria deve ser preenchida.");
        }
        this.categoria = categoria;
    }

}
