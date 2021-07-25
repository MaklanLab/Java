/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploolamundo;

/**
 *
 * @author Usuario
 */
public class Carro2 {
    public static void main(String[] args) {
       Carro meuCarro= new Carro("Roxo","Trilha","AXD 1826",4);     
       Carro criouCarro = new Carro();
        System.out.println("A cor do caro é: "+ meuCarro.getCor()+"\nO tipo é: "+ meuCarro.getModelo()+"\nA placa é: "+meuCarro.getPlaca()+"\nNumero de portas é: "+meuCarro.numeroDePortas());
       
               
       
    }
}
