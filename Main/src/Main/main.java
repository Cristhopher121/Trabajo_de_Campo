/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author USER01
 */
public class main {
     public static void main(String[] args) {
         System.out.println("Sobrecarga de metodos:");
        Calculadora calc = new Calculadora();
        System.out.println("Suma 2 enteros: " + calc.sumar(5, 10));
        System.out.println("Suma 3 enteros: " + calc.sumar(1, 2, 3));
        System.out.println("Suma 2 decimales: " + calc.sumar(4.5, 3.2));
        System.out.println("Suma arreglo: " + calc.sumar(new int[]{1, 2, 3, 4}));
        
        System.out.println("\n Manejo de errores:");
        Validacion val = new Validacion();
        val.validarCodigo("123");   
        val.validarCodigo("abc");   
        val.validarCodigo("");      
        val.validarCodigo(null);    

        System.out.println("\n Colecciones:");
        ListaClientes lista = new ListaClientes();
        lista.agregarCliente("Ana");
        lista.agregarCliente("Luis");
        lista.agregarCliente("");      
        lista.agregarCliente(null);    
        lista.mostrarClientes();
    }
    
}
