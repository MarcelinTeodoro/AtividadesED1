
public class Professor extends Pessoa {
    String titulo;
    String numeroSiape;
    
    public Professor(String nome, String titulo, String numeroSiape) {
        super(nome);
        this.titulo = titulo;
        this.numeroSiape = numeroSiape;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNumeroSiape() {
        return numeroSiape;
    }

    public void setNumeroSiape(String numeroSiape) {
        this.numeroSiape = numeroSiape;
    }

    
    
    

    
}
