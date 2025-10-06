/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

public class Calculadora {
     public int sumar(int a, int b) {
        return a + b;
    }

    // Suma tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Suma dos decimales
    public double sumar(double a, double b) {
        return a + b;
    }

    // Suma una lista de enteros
    public int sumar(int[] numeros) {
        int total = 0;
        for (int n : numeros) {
            total += n;
        }
        return total;
    }
}
