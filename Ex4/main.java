public class main {
    public static void main(String[] args) {
        Aluno a = new Aluno("Ricardo", 10);
        Vetor alunV = new Vetor();        
        alunV.add(a.getNota());
        alunV.imprime();
    }
}
