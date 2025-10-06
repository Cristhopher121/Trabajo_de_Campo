/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import java.util.ArrayList;
public class ListaClientes {
    private ArrayList<String> clientes = new ArrayList<>();

    public void agregarCliente(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            clientes.add(nombre);
            System.out.println("Cliente agregado: " + nombre);
        } else {
            System.out.println("Error: El nombre no puede estar vacio");
        }
    }

    public void mostrarClientes() {
        System.out.println("Lista de clientes:");
        for (String cliente : clientes) {
            System.out.println("- " + cliente);
        }
    }
}
