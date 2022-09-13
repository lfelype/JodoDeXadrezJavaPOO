package TabuleiroXadrez;

public class Peça {

    protected Posições posições;
    private Tabuleiro tabuleiro;


    public Peça(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        posições=null;
    }

    protected Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

}
