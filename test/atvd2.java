/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
    public class atvd2 {
     public static void main (String[] args){
         Scanner leitor = new Scanner (System.in);
         int n1 = leitor.nextInt();
         int n2 = leitor.nextInt();
         int n3 = leitor.nextInt();
         int n4 = leitor.nextInt();
         int n5 = leitor.nextInt();
         if (n1 % 2 ==0){
             System.out.println("O numero 1 é mutiplo de 2");    
         }
         if (n2 % 2 == 0 ) {
             System.out.println("O numero 2 é multiplo de 2");
         }
         if (n3 % 2 == 0){
             System.out.println("O nuero 3 é multiplo de 2");
         }
         if (n4 % 2 == 0){
             System.out.println("O numero 4 é multiplo de 2");
         }
         if (n5 % 2 == 0){
            System.out.println("O numero 5 é multiplo de 2");
         }
     }

              
            
    
}
