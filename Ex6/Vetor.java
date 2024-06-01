public class Vetor {
    
    private int[] vetor;
    private int n;
    
    public int getN() {
        return n;
    }

    public int getVetor(int i) {
        return vetor[i];
    }

    public Vetor(int n) {
        this.n = n;
        vetor = new int[n];
    }
}
