package Xadrez;

import TabuleiroXadrez.Tabuleiro;

public class PartidaXadrez {

    private  Tabuleiro tabuleiro;

    public PartidaXadrez(){
        tabuleiro = new Tabuleiro(8,8);
    }

    public PeçaDeXadrez [][] pegarPeças(){
        PeçaDeXadrez [][] matriz = new PeçaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for (int i = 0; i < tabuleiro.getLinhas(); i++) {
            for (int j = 0; j < tabuleiro.getColunas(); j++) {
                matriz[i][j] = (PeçaDeXadrez) tabuleiro.peça(i,j);
            }
        }
        return matriz;
    }
}
