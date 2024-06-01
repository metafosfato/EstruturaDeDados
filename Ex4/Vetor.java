public class Vetor implements IVetor{
    private double[] notas = new double[4];
    private int totalNotas = 0;

    private void garanteEspaco(){
        if(this.cheio()){
            double[] novasNotas = new double[this.notas.length * 2];
            for(int i = 0; i < this.notas.length; i++){
                novasNotas[i] = this.notas[i];
            }
            this.notas = novasNotas;
        }
    } 

    public void add(double x){
        this.garanteEspaco();
        this.notas[this.totalNotas] = x;
        this.totalNotas++;
    }

    public int tamanho(){
        return this.totalNotas;
    }

    public boolean contem(double x){
        for(int i = 0; i < this.totalNotas; i++){
            if(this.notas[i] == x){
                return true;
            }
        }
        return false;
    }

    public boolean cheio(){
        return this.totalNotas == this.notas.length;
    }

    public boolean remove(double x){
        int posicao = this.busca(x);
        if(posicao > -1){
            this.totalNotas--;
            for(int i = posicao; i < this.totalNotas; i++){
                this.notas[i] = this.notas[i + 1];
            }
            return true;
        }
        return false;
    }

    private int busca(double x){
        for(int i = 0; i < this.totalNotas; i++){
            if(this.notas[i] == x){
                return i;
            }
        }
        return -1;
    }

    public boolean contem(){
        return this.totalNotas > 0;
    }

    public void imprime(){
        for(int i = 0; i < this.totalNotas; i++){
            System.out.println(this.notas[i]);
        }
    }

}
