/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TratarErros;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class DivisaoPor0 {
    public static int divisao (int n1,int n2)throws ArithmeticException{
    return n1/n2;
            }
    public static void main(String[] args) {
        try {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite os numeros aos quais voce deseja dividir");
            int n1 = leitor.nextInt();
            int n2 = leitor.nextInt();
            double resultado = divisao (n1,n2);
            System.out.println("O resultado é :"+resultado);
        }
        catch(ArithmeticException erro){
            System.err.println("Erro"+ erro);
            System.out.println("Zero nao é um denominador valido");
        }
    }
}
