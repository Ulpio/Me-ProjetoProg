public class Professor extends Pessoa {
     private String matricula;
    private String curso;
    public Professor(String nome, String cpf,String matricula,String curso) {
        super(nome, cpf);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula(){
        return this.matricula;
    }
    public void setNome(String matricula){
        this.matricula = matricula;
    }
    @Override
    public String toString() {
        return matricula;
    }

    
}
