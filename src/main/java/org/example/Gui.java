package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Gui {
    public static void bucleOpciones(Mesero mesero){
        Scanner in = new Scanner(System.in);
        opcionesMenu();
        int eleccion = Util.ingresarSoloNumeroInt();
        while (!Util.validarRangoNumero(eleccion,1,6)){
            System.out.println("numero no valido, ingrese nuevamente...");
            eleccion = Util.ingresarSoloNumeroInt();
        }
        switch (eleccion){
            case 1:
                mesero.toString();
                break;
            case 2:
                String nombre = in.next();
                mesero.setNombre(nombre);
                System.out.println("el nombre puesto al mesero es: "+ mesero.getNombre());
                break;
            case 3:
                System.out.println("para esto necesitaremos que ingrese 3 cosas, el nombre y valor de un plato y el numero de mesa donde se hizo el pedido sera aleatorio");
                System.out.println("ingrese el nombre del plato");
                String nombrePlato = in.next();
                System.out.println("ingrese el valor del plato");
                int valor = Util.ingresarSoloNumeroInt();
                while (!Util.validarMayorA0(valor)){
                    System.out.println("no puede ingresar un valor de 0 o negativo, ingrese nuevamente");
                    valor = Util.ingresarSoloNumeroInt();
                }
                int mesa = (int)(Math.random()*10);
                Plato plato = new Plato(nombrePlato,valor);
                ArrayList<Plato> platos = new ArrayList<Plato>();
                platos.add(plato);
                Pedido pedido = new Pedido(platos,mesa);
                mesero.añadirPedido(pedido);
                System.out.println("los nuevos pedidos del mesero son: "+mesero.getPedidos());
                break;
            case 4:
                System.out.println("para esto necesitaremos que ingrese 3 cosas, para buscar su pedido, el nombre y valor de un plato y el numero de mesa donde se hizo el pedido sera aleatorio");
                System.out.println("ingrese el nombre del plato");
                String nombrePlatoBusqueda = in.next();
                System.out.println("ingrese el valor del plato");
                int valorBusqueda = Util.ingresarSoloNumeroInt();
                while (!Util.validarMayorA0(valorBusqueda)){
                    System.out.println("no puede ingresar un valor de 0 o negativo, ingrese nuevamente");
                    valor = Util.ingresarSoloNumeroInt();
                }
                int mesaBusqueda = (int)(Math.random()*10);
                Plato plato2 = new Plato(nombrePlatoBusqueda,valorBusqueda);
                ArrayList<Plato> platos2 = new ArrayList<Plato>();
                platos2.add(plato2);
                Pedido pedido2 = new Pedido(platos2,mesaBusqueda);
                mesero.añadirPedido(pedido2);
                System.out.println("los nuevos pedidos del mesero son: "+mesero.getPedidos());
                break;

        }
    }
    public static void opcionesMenu(){
        System.out.println("bienvenido, vamos a modelar un mesero, que desea hacer");
        System.out.println("1.-Ver el mesero que tiene actualmente");
        System.out.println("2.-Modificar el nombre del mesero (solo para efectos de capacidad de accion)");
        System.out.println("3.-Añadir un pedido a sus pedidos");
        System.out.println("4.-Eliminar un pedido de sus pedidos");
        System.out.println("5.-Eliminar la lista de pedidos completa");
        System.out.println("6.- Salir");
    }
    public static void lanzarGui(){
        Mesero mesero = new Mesero();
        bucleOpciones(mesero);
    }
}
