package Entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico {

    private Integer resolucion;
    private boolean sintonizador;
    Scanner sc = new Scanner(System.in);

    public Televisor() {
    }

    public Televisor(Integer resolucion, boolean sintonizador, Integer precio, String color, String consEnergetico, Integer peso) {
        super(precio, color, consEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    @Override
    public String toString() {
       
        return "Televisor{" + "resolucion=" + resolucion + ", sintonizador=" + sintonizador + " " +super.toString()+'}';
    }

    public void crearTelevisor() {

        super.crearElectrodomestico();
        System.out.println("Que resolucion desea que tenga su nueva TV??? ");
        this.resolucion = sc.nextInt();
        System.out.println("Desea que tenga sintonizador TDT??? ");
        String respuesta = sc.next();
        if (respuesta.equalsIgnoreCase("si")) {
            sintonizador = true;
        } else {
            sintonizador = false;
        }

    }
    
    @Override
    public Integer precioFinal(){
        
        super.precioFinal();
        
        if (resolucion >=40) {
            this.precio =+ this.precio * 30 /100;
        }
        if (sintonizador) {
            this.precio += 500;
        }
        System.out.println("el precio final del televisor es: " + precio);
        return precio;
    }

}
