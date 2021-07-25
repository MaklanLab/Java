/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Automovel;
/**
 *
 * @author Usuario
 */
public class Automovel {
    private Direcao direcao;
    private Motor motor;
    private Roda roda;
    
    public Motor setMotor(){
        return motor;
    }
    public Direcao setDirecao(){
        return direcao;
    }
    public Roda setRoda(){
        return roda;
    }
    
    void getMotor(Motor motor){
        this.motor = motor;
    }
    void getDirecao (Direcao direcao){
        this.direcao = direcao;
    }
    void getRoda (Roda roda){
        this.roda=roda;
    }
    
}
