/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;

/**
 *
 * @author reroes
 */
public class Triangulo extends Figura{
    private double base;
    private double altura;

    public Triangulo(double b, double a){
        base = b;
        altura = a;
    }

    public void establecerBase(double b){
        base = b;
    }
    public void establecerAltura(double a){
        altura = a;
    }

    @Override
    public void calcularArea(){
        area = base * altura;
    }

    public double obtenerBase(){
        return base;
    }
    public double obtenerAltura(){
        return altura;
    }
}