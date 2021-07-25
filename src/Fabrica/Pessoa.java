/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica;

/**
 *
 * @author Usuario
 */
public class Pessoa {
    String nome;
    int idade;
    String sexo;
    Carro carro;
   public String getNome(){
        return nome;
    }
   public String getSexo(){
       return sexo;
   }
   public int getIdade(){
       return idade;
   }
   public Carro getCarro(){
       return carro;
   }
  
  public void setNome(String nome){
      this.nome = nome;
   }
   public void setIdade (int idade){
       this.idade=idade;
   }
   public void setSexo (String sexo){
       this.sexo=sexo;
   }
   public void setCarro (Carro carro){
       this.carro = carro;
   }
 
   
   void ligarCarro (){
       carro.ligar();
   }
   void desligarCarro(){
       carro.desligar();
   }
   void acelerarCarro(){
       carro.acelerar();
   }
   void frearCarro(){
       carro.frear();
   }
   void setCambioCarro(int marcha){
       carro.setCambio(marcha);
   }
}
