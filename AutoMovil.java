
package automovil;

public class AutoMovil {

    private String marca;
    private String modelo; 
    private int año; 
    private String color; 
    
    public AutoMovil(String marca, String modelo, int año, String color){
    
        this.marca = marca; 
        this.modelo = modelo;
        this.año = año;
        this.color = color;         
    }
    //getters and setters 
        public String getMarca(){
        return marca;
    }
    
        public void setMarca(String marca){
        this.marca  =  marca;
    }
        public String getModelo(){
        return modelo; 
    }
        
           public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    // Métodos de la clase
            public void arrancar() {
                System.out.println("El automóvil está arrancando.");
            }

            public void detener() {
                System.out.println("El automóvil se ha detenido.");
            }

            public void acelerar() {
                System.out.println("El automóvil está acelerando.");
            }

            public void frenar() {
                System.out.println("El automóvil está frenando.");
            }
    
}
