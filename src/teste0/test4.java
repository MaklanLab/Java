/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste0;

/**
 *
 * @author Usuario
 */
public class test4 {
    public enum Animals { RABBIT, PARROT, DOG };
    public static void main(String[] args) {
       Animals[] d2 = Animals.values();
       System.out.println(d2[2]);
    }
   
}

////Sabendo que a função Values retorna um vetor com todos os componentes do ENUM, na ordem em que são criados, qual é o resultado?

//Escolha uma opção:
    
