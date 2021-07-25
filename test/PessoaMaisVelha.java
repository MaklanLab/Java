/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author meu
 */
public class PessoaMaisVelha {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        System.out.print("A primeira pessoa pode digitar seu nome: ");
        String nome1 = leitor.nextLine();
        System.out.print("Ola,"+ nome1 +" pode digitar sua idade?");
        int idade1 = leitor.nextInt();
        System.out.println("A segunda pessoa pode digitar seu nome: ");
          char nome = leitor.nextLine().charAt(0);
        System.out.println("Ola, "+nome+" pode digitar sua idade?");
        int idade2 = leitor.nextInt();
          if (idade1>idade2){
              System.out.println(nome1+" É mais velho(a)");
          }
          else {
              System.out.println(nome+" É mais velho(a)");
          }
    }
}
