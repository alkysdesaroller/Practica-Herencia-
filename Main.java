
package automovil;

/**
 *
 * @author alna7
 */
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de HondaCivic
        HondaCivic miHonda = new HondaCivic("Honda", "Civic", 2023, "Rojo");

        // Usar métodos heredados y sobrescritos
        miHonda.arrancar();
        miHonda.acelerar();
        miHonda.frenar();
        miHonda.detener();

        // Acceder a atributos usando getters
        System.out.println("Marca: " + miHonda.getMarca());
        System.out.println("Modelo: " + miHonda.getModelo());
        System.out.println("Año: " + miHonda.getAño());
        System.out.println("Color: " + miHonda.getColor());
    }
}

