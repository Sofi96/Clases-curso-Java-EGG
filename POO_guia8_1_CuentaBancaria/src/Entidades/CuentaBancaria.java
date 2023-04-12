/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Sofi
 */
public class CuentaBancaria {
    
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;

    
    //CONSTRUCTORES
    public CuentaBancaria() {
    }
    public CuentaBancaria(int numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }
    
    //GETTERS Y SETTERS

    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public long getDniCliente() {
        return dniCliente;
    }
    public double getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }
    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    //METODOS PROPIOS

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", dniCliente=" + dniCliente + ", saldoActual=" + saldoActual + '}';
    }
    
    
}
