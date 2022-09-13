package Xadrez.Peças;

import TabuleiroXadrez.Tabuleiro;
import Xadrez.Cor;
import Xadrez.PeçaDeXadrez;

public class Torre extends PeçaDeXadrez {

    public Torre(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    @Override
    public String toString(){
        return "T";
    }
}
