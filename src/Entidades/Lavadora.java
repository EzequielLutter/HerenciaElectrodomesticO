
package Entidades;

import java.util.Scanner;


public class Lavadora extends Electrodomestico {
    private Integer carga;
    Scanner sc = new Scanner(System.in);

    public Lavadora() {
    }

    public Lavadora(Integer carga, Integer precio, String color, String consEnergetico, Integer peso) {
        super(precio, color, consEnergetico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + " "+ super.toString() + '}';
    }

  
    
    public void crearLavadora (){
        super.crearElectrodomestico();
        System.out.println("Que  carga desea que soporte la lavadora???");
        this.carga = sc.nextInt();
        
    }
    
    @Override
    public Integer precioFinal(){
        
        super.precioFinal();
        if (carga>=30) {
            this.precio += 500;
        }
        System.out.println("El  precio final de la lavadora es: "+ precio);
        return precio;
    }
    
    
}
