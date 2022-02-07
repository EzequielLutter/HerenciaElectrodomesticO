package Entidades;

import java.util.Scanner;

public class Electrodomestico {

    protected Integer precio;
    protected String color;
    protected String consEnergetico;
    protected Integer peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Integer precio, String color, String consEnergetico, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consEnergetico = consEnergetico;
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsEnergetico() {
        return consEnergetico;
    }

    public void setConsEnergetico(String consEnergetico) {
        this.consEnergetico = consEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consEnergetico=" + consEnergetico + ", peso=" + peso + '}';
    }

    public void compConsumoEnergetico(String letra) {
        switch (letra.toUpperCase()) {
            case "a":
                break;
            case "b":
                break;
            case "c":
                break;
            case "d":
                break;
            case "e":
                break;
            default:
                this.consEnergetico = ("f");
        }

    }

    public void comprobarColor(String color) {
        switch (color.toUpperCase()) {
            case "blanco":
                break;
            case "negro":
                break;
            case "rojo":
                break;
            case "azul":
                break;
            case "gris":
                break;
            default:
                this.color = ("blanco");
        }

    }

    public void crearElectrodomestico() {
        Scanner sc = new Scanner(System.in);

        setPrecio(1000);
        System.out.println("Hola, de que color desea su  nuevo electrodomestico?");
        this.setColor(sc.next());

        System.out.println("Que eficiencia energeica prefiere? letras A a F ");
        this.setConsEnergetico(sc.next());

        System.out.println("Indique el peso de referencia");
        this.setPeso(sc.nextInt());

        this.comprobarColor(color);
        this.compConsumoEnergetico(consEnergetico);
    }

    public Integer precioFinal() {
        //Integer aux=0;
        switch (consEnergetico) {
            case "A":
                this.precio += 1000;
            case "B":
                this.precio += 800;
            case "C":
                this.precio += 600;
            case "D":
                this.precio += 500;
            case "E":
                this.precio += 300;
            case "F":
                this.precio += 100;
                break;
        }

        if (peso >= 1 && peso <= 19) {
            this.precio += 100;
        } else if (peso >= 20 && peso <= 49) {
            this.precio += 500;
        } else if (peso >= 50 && peso <= 79) {
            this.precio += 800;
        } else if (peso >= 80) {
            this.precio += 1000;
        }
return  precio;
}
    }
