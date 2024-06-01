import java.util.Random;

public class Principal {
    public static void main(String[] args) {
    int tamanho = 1000;
    Vetor[] vetor = new Vetor[tamanho];
    Random rand = new Random();

    for (int i = 0; i < tamanho; i++) {
        vetor[i] = new Vetor(rand.nextInt(10000));
    }

    Organizador organizador = new Organizador(vetor);

    long startTime = System.nanoTime();
    Vetor maxRecursivo = organizador.MaximoRecursivo();
    long endTime = System.nanoTime();
    long duracaoRecursivo = endTime - startTime;

    startTime = System.nanoTime();
    Vetor maxIterativo = organizador.MaximoIterativo();
    endTime = System.nanoTime();
    long duracaoIterativo = endTime - startTime;

    System.out.println("Máximo (Recursivo): " + maxRecursivo.getN() + " Tempo:" + duracaoRecursivo);
    System.out.println("Máximo (Iterativo): " + maxIterativo.getN() + " Tempo:" + duracaoIterativo);
    }
}
