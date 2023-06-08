package org.example;

public class Gui {
    public static void bucleOpciones(){
        opcionesMenu();
        int eleccion = Util.ingresarSoloNumeroInt();
        while (!Util.validarRangoNumero(eleccion,1,6)){
            System.out.println("numero no valido, ingrese nuevamente...");
            eleccion = Util.ingresarSoloNumeroInt();
        }
        switch (eleccion){

            case 1:

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
    }
}
