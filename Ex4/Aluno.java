public class Aluno implements IAluno{

    private String nome;
    private double nota;


    public double nota(double x){
        this.nota = x;
        return this.nota;
    }

    public String nome(String x){
        this.nome = x;
        return this.nome;
    }

    public double getNota(){
        return this.nota;
    }   

    public Aluno(String nome, double nota){
    this.nome = nome;
    this.nota = nota;
    }

}
