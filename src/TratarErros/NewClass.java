/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TratarErros;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class NewClass {

    public static void bobeira (int a) throws Exception{
        System.out.print("Cliente, "+a+ ", ");
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Seja bem vindo! ");
        try {
            bobeira(s.nextInt()); //recebe “a”
            System.out.print(" tem preferência!");
        }
        catch (Exception re ) { System.out.print("Talvez "); }
        finally { System.out.print("Na próxima! "); }
        System.out.print("Mais tarde! ");
    }

}