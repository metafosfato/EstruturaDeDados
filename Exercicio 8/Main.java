import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Vetor vetor = new Vetor(1000);
        for (int i = 0; i < vetor.capacidade(); i++) {
            vetor.inserir(random.nextInt(1000));
        }
        vetor.exibir();
        Ordenacao.bubbleSort(vetor).exibir();
        Vetor vetor2 = new Vetor(1000);
        for (int i = 0; i < vetor2.capacidade(); i++) {
            vetor2.inserir(random.nextInt(1000));
        }
        vetor2.exibir();
        Ordenacao.selectionSort(vetor2).exibir();
        Vetor vetor3 = new Vetor(1000);
        for (int i = 0; i < vetor3.capacidade(); i++) {
            vetor3.inserir(random.nextInt(1000));
        }
        vetor3.exibir();
        Ordenacao.insertionSort(vetor3).exibir();

    }
}
