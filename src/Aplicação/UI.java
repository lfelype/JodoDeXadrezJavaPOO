package Aplicação;

import Xadrez.PeçaDeXadrez;

public class UI {

    public static void imprimirTabuleiro(PeçaDeXadrez[][] peças){

        for (int i = 0; i < peças.length; i++) {
            System.out.print((8-i) + " ");
            for (int j = 0; j < peças.length; j++) {
                imprimirPeças(peças[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    private static void imprimirPeças(PeçaDeXadrez peças){
        if(peças == null){
            System.out.print("-");
        }
        else {
            System.out.print(peças);
        }
        System.out.print(" ");
    }
}
