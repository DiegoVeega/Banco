/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego
 */
public class Main extends Thread {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Cliente 1", new int[]{2, 2, 1, 5, 2, 3});
        Cliente cliente2 = new Cliente("Cliente 2", new int[]{1, 3, 5, 1, 1});
        long initialTime = System.currentTimeMillis();
        Transaccion transaccion1 = new Transaccion(cliente1.getNombre(), initialTime);
        Transaccion transaccion2 = new Transaccion(cliente2.getNombre(), initialTime);
               // Tiempo inicial de referencia
        CajeroThread cajero1 = new CajeroThread("Cajera 1", cliente1, transaccion1);
        CajeroThread cajero2 = new CajeroThread("Cajera 2", cliente2, transaccion2);

        cajero1.start();
        cajero2.start();
    }
}
