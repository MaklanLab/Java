/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AGENDA;

/**
 *
 * @author Usuario
 */
public class Agenda {
        int dia;
        int mes;
        String anotacao;
        
          void anota (int d,int m,String nota){
           d = dia;
           mes = m;
           anotacao = nota;
           
           validaData();
          }
         void validaData(){
           if((dia<1)||(dia>31)|| (mes <1)|| (mes>12)){
              dia = 0;
              mes = 0;
              anotacao= "dia ou mes invalido";
           }
         }
         
 	void mostraAnotacao(){
		          System.out.println(dia+"/"+mes+" : "+anotacao);
	}
         }
  