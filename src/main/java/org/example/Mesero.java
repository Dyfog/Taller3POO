package org.example;

import java.util.ArrayList;

public class Mesero {

	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	private String nombre = "";

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}

	public void añadirPedido(Pedido pedido) {
		this.pedidos.add(pedido);
	}

	public void eliminarPedido(Pedido pedido) {
		this.pedidos.remove(pedido);
	}

	public void limpiarPedido() {
		this.pedidos.clear();
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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