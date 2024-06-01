public class Organizador {

    private Vetor[] vetor;

    public Organizador(Vetor[] vetor) {
        this.vetor = vetor;
    }

    // Método recursivo
    public Vetor MaximoRecursivo(int inicio, int fim) {
        if (inicio == fim) {
            return vetor[inicio];
        } else {
            int meio = (inicio + fim) / 2;
            Vetor max1 = MaximoRecursivo(inicio, meio);
            Vetor max2 = MaximoRecursivo(meio + 1, fim);
            if (max1.getN() > max2.getN()) {
                return max1;
            } else {
                return max2;
            }
        }
    }

    public Vetor MaximoRecursivo() {
        return MaximoRecursivo(0, vetor.length - 1);
    }

    // Método iterativo
    public Vetor MaximoIterativo() {
        Vetor max = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i].getN() > max.getN()) {
                max = vetor[i];
            }
        }
        return max;
    }
}