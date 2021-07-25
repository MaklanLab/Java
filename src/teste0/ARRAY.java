/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

package teste0;
impor
/**
 *
 * @author meu
 */
import java.util.Scanner;
public class ARRAY {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        int notas[]= new int [3];
         for (int i = 0; i <3; i++){
             notas[i] = leitor.nextInt();
         
         }
         System.out.println(notas[2]);
     
    }
    
}
