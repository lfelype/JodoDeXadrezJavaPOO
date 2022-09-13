package TabuleiroXadrez;

public class Tabuleiro {

    private int linhas;
    private int colunas;
    private Peça [][] peças;

    public Tabuleiro(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        peças = new Peça[linhas][colunas];
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }

    public Peça peça(int linhas, int colunas){
        return peças [linhas][colunas];
    }

    public Peça peça(Posições posições){
        return peças [posições.getLinha()][posições.getColuna()];
    }


}
