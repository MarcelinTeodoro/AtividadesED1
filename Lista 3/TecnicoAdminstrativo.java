public class TecnicoAdminstrativo extends Pessoa {
    String numeroSiape;

    public TecnicoAdminstrativo(String nome, String numeroSiape) {
        super(nome);
        this.numeroSiape = numeroSiape;
    }

    public String getNumeroSiape() {
        return numeroSiape;
    }

    public void setNumeroSiape(String numeroSiape) {
        this.numeroSiape = numeroSiape;
    }
    
    
}