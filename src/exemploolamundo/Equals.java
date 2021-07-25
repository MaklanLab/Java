/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploolamundo;
import java.util.Scanner;
        
/**
 *
 * @author meu
 */
public class Equals {
    public static void main (String[] args){
        Scanner leitor = new Scanner (System.in);
        System.out.println(" digite seu nome: ");
        String nome1 = leitor.nextLine();
        System.out.println("Digite o segundo nome: ");
        String nome2 = leitor.nextLine();
        nome1= nome1.toUpperCase();
        nome2=nome2.toUpperCase();
        if (nome1.equals(nome2)){
            System.out.println("Nomes iguais");
        }
        else{
                System.out.println("Nomes diferentes");
        }
                if (nome1.equalsIgnoreCase(nome2)){ //ignora se é maiuscula ou minuscula
                }       
}
}

