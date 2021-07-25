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
public class Carro {
        String modelo;
        String cor;
        String placa;
        int numeroDePortas;
        Pessoa dono;
        int cambio;
        boolean farol;
        
        public Carro (String cor, String modelo, String placa, int numeroDePortas){  // construtor
            this.cor = cor;
            this.modelo = modelo;
            this.placa = placa;
            this.numeroDePortas = numeroDePortas;
        }
        public Carro(){
            System.out.println("Voce criou um novo carro!");
        }
        
        public void ligar (){
             System.out.println("Carro ligado");
         }
         
         void desligar (){
             System.out.println(" Carro desligado");
         } 
         
         void acelerar (){
             System.out.println("Carro acelerando");
         }
         void frear (){
             System.out.println("Carro freando");
         }
                 
         void setCor (String cor){ // SET nao possui valor de retorno, por conta do void 
             this.cor = cor;     // this remete as variaveis da classe e nao dos parametos    
        }
         
         void setModelo (String modelo){
             this.modelo = modelo;
        }
         
        void setPlaca (String placa){
            this.placa = placa;
        }
        
        void setPortas (int numeroDePortas){
            this.numeroDePortas = numeroDePortas;
        }
        
        void setDono (Pessoa dono){
            this.dono = dono;
        }
        
        public void setCambio(int cambio){
            this.cambio=cambio;
        }
        
        public void setFarol(boolean farol){
            this.farol=farol;
        }
        
            
    public String getCor (){   /// GET nao possui parametos
          return cor;
    }
    
      public String getModelo(){
          return modelo;
    }
      
    public String getPlaca(){
        return placa;
    }
    
    public int numeroDePortas(){
        return numeroDePortas;
    }
    
    public Pessoa getDono(){
        return dono;
    }
    public int getCambio(){
        return cambio;
    }
    
    public boolean getFarol(){
         if (farol==true){
            System.out.println("Farol ligado");
        }
            return true;
    }
    
 
}
