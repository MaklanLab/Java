
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meu
 */
public class atvd {
            public static void main (String[] args){
        Scanner leitor = new Scanner (System.in);
        double nota1 = leitor.nextDouble();
        double nota2 = leitor.nextDouble();
        double media = (nota1+nota2)/2;
        if (media >= 7){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");}
           
        
    }
    
}
    
}
