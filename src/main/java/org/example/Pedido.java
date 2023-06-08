package org.example;

import java.util.ArrayList;

public class Pedido {

	private ArrayList<Plato> platos;
	private int mesa= 0;


	public Pedido(ArrayList<Plato> platos, int mesa) {
		this.platos = platos;
		this.mesa = mesa;
	}

}