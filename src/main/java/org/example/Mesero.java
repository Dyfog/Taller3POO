package org.example;

import java.util.ArrayList;

public class Mesero {

	private ArrayList<Pedido> pedidos;
	private int nombre;


	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}
	
	@Override
	public String toString() {
		return "Mesero{" +
				"pedidos=" + pedidos +
				", nombre=" + nombre +
				'}';
	}

	public void llevarPedido() {
		// TODO - implement Mesero.llevarPedido
		throw new UnsupportedOperationException();
	}

}