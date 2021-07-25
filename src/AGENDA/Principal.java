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
public class Principal {
    public static void main(String[] args) {
        Agenda agenda1 = new Agenda();
        Agenda agenda2 = new Agenda();
        
        agenda1.anota(12,10,"dia das crianças");
        agenda2.anota(7, 5, "Dia da independencia");
        
        
        
        agenda2.dia=7;
        agenda2.mes=5;
        agenda2.anotacao= "dia da idependencia";
        
        agenda1.dia=12;
        agenda1.mes=10;
        agenda1.anotacao="dia das criancas";
        
        agenda1.mostraAnotacao();
        agenda2.mostraAnotacao();
    }
}
