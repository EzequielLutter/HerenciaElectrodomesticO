package herenciaelectrodomestico;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

public class HerenciaElectrodomestico {

    public static void main(String[] args) {
      //  Electrodomestico electrodomestico = new Electrodomestico();
//        Lavadora lavadora = new Lavadora();
//        Televisor televisor = new Televisor();
//        lavadora.crearLavadora();
//        lavadora.precioFinal();
//        System.out.println(lavadora.toString());
//        System.out.println("");
//        televisor.crearTelevisor();
//        televisor.precioFinal();
//        System.out.println(televisor.toString());
//        System.out.println("");
                
        
    
    /*
    Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de  
    Electrodomésticos para guardar 4 electrodomésticos , ya sean lavadoras o televisores,
    con valores ya asignados.Luego , recorrer este array y ejecutar el método precioFinal()
    en cada  electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto, 
    es decir, el precio de todos los televisores y el de las lavadoras.
    Una vez hecho  eso, también deberemos mostrar, la suma del precio de todos los  Electrodomésticos. 
    Por ejemplo, si tenemos una lavadora con un precio de 2000  y un televisor de 5000,
    el resultado final será de 7000 (2000+5000) para electrodomésticos, 2000 para lavadora y 5000 para televisor
    

         
        
        ArrayList<Electrodomestico2> listadodeElectrodomesticos = new ArrayList<>();
        
        //Crear los electrodomesticos
        
        Lavadora2 lavadora = new Lavadora2(35,100,"blanco","f",18);
        Lavadora2 lavadora2 = new Lavadora2(20,300,"negro","A",50);
        Televisor2 televisor = new Televisor2(39,true,300,"azul","B",90);
        Televisor2 televisor2 = new Televisor2(43,false,100,"gris","c",100);
        
        //Se agregan a la lista de electrodomesticos
        
        listadodeElectrodomesticos.add(lavadora);
        listadodeElectrodomesticos.add(lavadora2);
        listadodeElectrodomesticos.add(televisor);
        listadodeElectrodomesticos.add(televisor2);
    
    //Mostramos la lista de los electrodomesticos 
    
        Integer precioLavadoras = 0, precioTelevisores = 0 ,precioTotal=0 ;
        Integer aux,  aux2 ;
        
        
         //Mostramos solo lavadoras
         
        System.out.println("--------------Listado de LAVADORAS -----------");
        for (Electrodomestico2 electrodomestico : listadodeElectrodomesticos) {
            
            if (electrodomestico instanceof Lavadora2) {
                
               aux = (((Lavadora2) electrodomestico).precioFinal2());
               System.out.println(aux);
               
               //Precio general  lavadora 
               precioLavadoras = precioLavadoras + aux;
               
            }
        }
        
        System.out.println("Precio final LAVADORAS:"+ precioLavadoras);

    
    /Mostramos solo Televisores 
         
        System.out.println("--------------Listado de TELEVISORES -----------");
        for (Electrodomestico2 electrodomestico : listadodeElectrodomesticos) {
            if (electrodomestico 
//Sumar precio lavadoras y precio televisores para precio final 
        System.out.println("                                      ");
        System.out.println("--------------Listado de ELECTRODOMESTICOS -----------");
        System.out.println("                                      ");
        precioTotal = precioLavadoras + precioTelevisores;
        System.out.println("El precio TOTAL de electrodomesticos: "+ precioTotal);
        

//Sumar precio lavadoras y precio televisores para precio final 
        System.out.println("                                      ");
        System.out.println("--------------Listado de ELECTRODOMESTICOS -----------");
        System.out.println("                                      ");
        precioTotal = precioLavadoras + precioTelevisores;
        System.out.println("El precio TOTAL de electrodomesticos: "+ precioTotal);
     
     */
    ArrayList<Electrodomestico> listaElectro = new ArrayList();
   // private final ArrayList listaElectro;

   

        Electrodomestico lavadora4 = new Lavadora(24, 1000, "blanco","f", 20 );
        Electrodomestico lavadora5 = new Lavadora(18, 1000, "gris", "a", 23);
        Electrodomestico tv4 = new Televisor(30,false,1000,"negro", "d", 19);
        Electrodomestico tv5 = new Televisor(20,true,200, "verde", "b", 22);
        
        //Agregamos manualmente los electrodomesticos a la lista//
        
        listaElectro.add(lavadora4);
        listaElectro.add(lavadora5);
        listaElectro.add(tv4);
        listaElectro.add(tv5);
        
       
       // for (Electrodomestico electrodomestico : listaElectro) {
         //   System.out.println(electrodomestico);
        //}
        
        //MOSTRAMOS SOLO ELECTRODOMESTICOS POR TIPO
         Integer precioLavadora=0, precioTv=0, precioTotal=0, aux=0, aux2=0;
         
         System.out.println("******PRECIO LAVADORAS*******");
         for (Electrodomestico electrodomestico : listaElectro) {
             if (electrodomestico instanceof Lavadora) {
                
                  aux = aux + ((Lavadora)electrodomestico).precioFinal();
                      // System.out.println(aux);
               
               //Precio general  lavadora 
              // precioLavadora =+ aux;
               
        }if (electrodomestico instanceof Televisor) {
            
                 aux2 = aux2 + ((Televisor)electrodomestico).precioFinal();
             }
        
      }System.out.println("El precio final de las lavadoras es: "+ aux);
      System.out.println("El precio final de los televisores es: "+ aux2);
        System.out.println("El precio final de todos los electrodomsticos es: " + (aux+aux2));
        
        
        
        
        
    }   

    }


