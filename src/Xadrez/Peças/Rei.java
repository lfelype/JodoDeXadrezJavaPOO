package Xadrez.Peças;

import TabuleiroXadrez.Tabuleiro;
import Xadrez.Cor;
import Xadrez.PeçaDeXadrez;

public class Rei extends PeçaDeXadrez {
    public Rei(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    @Override
    public  String toString(){
        return "R";
    }
}
