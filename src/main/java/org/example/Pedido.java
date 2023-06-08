package org.example;

import java.util.ArrayList;

public class Pedido {

	private ArrayList<Plato> platos;
	private int mesa;

	public ArrayList<Plato> getPlatos() {
		return platos;
	}

	public Pedido(ArrayList<Plato> platos, int mesa) {
		this.platos = platos;
		this.mesa = mesa;
	}

	public int getMesa() {
		return mesa;
	}
}