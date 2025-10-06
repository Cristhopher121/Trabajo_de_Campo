/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

public class Validacion {
    public void validarCodigo(String input) {
        try {
            if (input == null || input.isEmpty()) {
                throw new IllegalArgumentException("El codigo no puede estar vacio");
            }

            int codigo = Integer.parseInt(input);
            System.out.println("Codigo valido: " + codigo);

        } catch (NumberFormatException e) {
            System.out.println("Error: El codigo debe ser numerico");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
     
}
