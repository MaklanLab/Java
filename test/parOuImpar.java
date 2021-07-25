/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
 
public class parOuImpar {
    public static void main (String[] args){
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();
        if (numero % 2 == 0){
            System.out.println("Par");
        }
        else {
            System.out.println("Impar");
        }
    }
    
}
