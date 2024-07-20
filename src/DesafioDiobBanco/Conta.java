/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DesafioDiobBanco;

/**
 *
 * @author Alexsandro
 */
public abstract class Conta implements IConta {
    private int agencia;
    private int numero;
    private double saldo;

    @Override
    public void sacar(double valor){
}
    @Override
    public void depositar (double valor){
}
    @Override
    public void tranferir (double valor, Conta contaDestino){
}
    
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}    
    

