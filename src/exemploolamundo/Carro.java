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
public class Carro {
        String modelo;
        String cor;
        String placa;
        int numeroDePortas;
        Pessoa dono;
        
        public Carro (String cor, String modelo, String placa, int numeroDePortas){  // construtor
            this.cor = cor;
            this.modelo = modelo;
            this.placa = placa;
            this.numeroDePortas = numeroDePortas;
        }
        public Carro(){
            System.out.println("Voce criou um novo carro!");
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
    
}
