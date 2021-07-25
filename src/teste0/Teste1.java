/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teste0;
 
import java.util.Scanner;
 
public class Teste1 {
  public static void main(String[] args) {
   System.out.println("Digite seu nome");
    Scanner leitor = new Scanner(System.in);
     String nome = leitor.nextLine();
      System.out.println("Nos informe sua idade");
       int idade = leitor.nextInt();
        System.out.println("Por ultimo sua altura");
         double altura = leitor.nextDouble();
         System.out.println("-------------------------------------------------------------------------------------------------");
System.out.println("Ola "+nome+" Bem vindo, sua idade é" +idade+"? e sua altura é: "+altura+"? se sim aperte em continuar...");
         System.out.println("--------------------------------------------------------------------------------------------------");
    }
    
}
