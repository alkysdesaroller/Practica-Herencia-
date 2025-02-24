/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automovil;

/**
 *
 * @author alna7
 */
public class HondaCivic extends AutoMovil {
    
    public HondaCivic(String marca, String modelo, int año, String color) {
        super(marca, modelo, año, color);
    }
 
// Sobreescribir dos métodos
    @Override
    public void acelerar() {
        System.out.println("El HondaCivic está acelerando rápidamente.");
    }

    @Override
    public void frenar() {
        System.out.println("El HondaCivic está frenando suavemente.");
    }    
}
