public class Aluno extends Pessoa{
    private String matricula;
    private String curso;
    
    public Aluno(String nome, String matricula, String curso) {
        super(nome);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    
    
    
}
