/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego
 */
public class CajeroThread extends Thread {

	private String nombre;

	private Cliente cliente;

	private Transaccion transaccion;

	// Constructor, getter & setter

	@Override
	public void run() {

		System.out.println("La cajera " + this.nombre + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " 
					+ this.cliente.getNombre() + " EN EL TIEMPO: " 
					+ (System.currentTimeMillis() - this.transaccion.initialTime) / 1000 
					+ "seg");

		for (int i = 0; i < this.cliente.getTransacciones().length; i++) { 
			this.esperarXsegundos(cliente.getTransacciones()[i]); 
			System.out.println("Procesado el producto " + (i + 1) 
			+ " del cliente " + this.cliente.getNombre() + "->Tiempo: " 
			+ (System.currentTimeMillis() - this.transaccion.initialTime) / 1000 
			+ "seg");
		}

		System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR " 
						+ this.cliente.getNombre() + " EN EL TIEMPO: " 
						+ (System.currentTimeMillis() - this.transaccion.initialTime) / 1000 
						+ "seg");
	}

	private void esperarXsegundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

    public CajeroThread(String nombre, Cliente cliente, Transaccion transaccion) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.transaccion = transaccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Transaccion getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(Transaccion transaccion) {
        this.transaccion = transaccion;
    }
        

}
