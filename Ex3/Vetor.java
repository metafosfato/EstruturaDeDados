package Ex3;

public class Vetor {
    private Aluno[] vetor;
    private int tamanho;
    private int capacidade;

    public Vetor(int capacidade) {
        this.vetor = new Aluno[capacidade];
        this.tamanho = 0;
        this.capacidade = capacidade;
    }

    public void AdicionarAluno(Aluno aluno) {
        if (this.tamanho == this.capacidade) {
            System.out.println("Vetor cheio");
            return;
        }
        this.vetor[this.tamanho] = aluno;
        this.tamanho++;
    } 

    public int getTamanho() {
        return this.tamanho;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Aluno[] getVetor() {
        return this.vetor;
    }

    public void setVetor(Aluno[] vetor) {
        this.vetor = vetor;
    }

    public void exibirVetor(){
        for (int i = 0; i < this.tamanho; i++) {
            System.out.println("Nome: " + this.vetor[i].getNome());
            System.out.println("Idade: " + this.vetor[i].getIdade());
            System.out.println("Nota: " + this.vetor[i].getNota());
            System.out.println();
        }
    }

    public void removerAluno(Aluno aluno) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.vetor[i].getNome().equals(aluno.getNome())) {
                for (int j = i; j < this.tamanho - 1; j++) {
                    this.vetor[j] = this.vetor[j + 1];
                }
                this.tamanho--;
                return;
            }
        }
        System.out.println("Aluno não encontrado");
    }
    
}
