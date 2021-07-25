/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploolamundo;

/**
 *
 * @author Usuario
 */
public class ATVDPROVA02 {
      private static final char PAREDE_VERTICAL = '|';

    private static final char PAREDE_HORIZONTAL = '-';

    private static final char VAZIO = ' ';

    private static final char TAMANHO = 22;

    private static char[][] tabuleiro;

    static int s=0;

    public static void inicializarMatriz() {

        int i, j;

        for (i = 0; i < TAMANHO; i++) {

            tabuleiro[i][0] = PAREDE_VERTICAL;

            tabuleiro[i][TAMANHO - 1] = PAREDE_VERTICAL;

            tabuleiro[0][i] = PAREDE_HORIZONTAL;

            tabuleiro[TAMANHO - 1][i] = PAREDE_HORIZONTAL;

    }

        for (i = 1; i < TAMANHO - 1; i++) {

            for (j = 1; j < TAMANHO - 1; j++) {

                tabuleiro[i][j] = VAZIO;

            }

        }

    }

 

    public static void imprimir() {

        for (int i = 0; i < TAMANHO; i++) {

            for (int j = 0; j < TAMANHO; j++) {

                s++;

            }

        }

        System.out.println(s);

    }

    

public static void main(String Arg[]) {

    tabuleiro = new char[44][44];

    inicializarMatriz();

    imprimir();

    }

}

