/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebafiguras2;

/**
 *
 * @author USER
 */
public class TrianguloRectangulo {
    int base; 
    int altura; 
    public TrianguloRectangulo(int base, int altura){
    this.base = base;
    this.altura = altura;
    }
    double calcularArea() {
        return ((base * altura) / 2);
    }
     double calcularHipotenusa() {
        return Math.sqrt((base*base) + (altura*altura));
    }
    double calcularPerimetro() {
        return (base + altura + calcularHipotenusa()); 
    }   
    String determinarTipoTriangulo() {
    if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())){
        return ("Es un triangulo equilatero");
    }
    else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa())){
        return ("Es un triangulo escaleno"); 
    }
    else{
        return ("Es un triangulo isosceles"); 
    }
    }
}    