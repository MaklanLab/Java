/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste0;
import java.util.Scanner;
/**
 *
 * @author meu
 */
public class NotasAlunos {
    public static void main(String[] args){
        Scanner leitor = new Scanner (System.in);
        int aluno[][] = new int [leitor.nextInt()][leitor.nextInt()];
        System.out.println("Digite a nota dos alunos");
        for (int linha = 1; linha <aluno.length; linha++){
            for (int coluna = 1; coluna < aluno[linha - 1].length;coluna ++){
                System.out.println("aluno"+linha+"com nota de"+coluna);
                aluno[linha -1][coluna-1] = leitor.nextInt();
                
            }
        }
        System.out.println("Lista dos proprietários dos apartamentos:");
		for (int linha = 0; linha < aluno.length; linha++) {
			for (int coluna = 0; coluna < aluno[linha].length; coluna++) {
				System.out.println("Apto. " + (linha + 1) + "0" +
				(coluna + 1) + ": " + aluno[coluna][linha]);
			}
                
                
    }
    }  
}
