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
public class StringeArray {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        System.out.println("Digite uma frase a ser invertida");
        String frase1 = leitor.nextLine();
        char[] chararray = frase1.toCharArray();
        System.out.println("INVERSO");
        for (int i = chararray.length -1; i>0; i--){
            System.out.println(chararray[i]);
        }
    }
           
    
}
