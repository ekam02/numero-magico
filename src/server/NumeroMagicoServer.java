/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author Johan
 */
public class NumeroMagicoServer {

    public static void main(String args[]) {
	try {
		LocateRegistry.createRegistry(1099);//rmiregistry
		NumeroMagicoImpl numeroMagico = new NumeroMagicoImpl();
        	Naming.rebind("nmagic", numeroMagico);
          	System.out.println("Servidor del NumeroMagico Listo!");

	}
        catch (Exception e) {
            System.out.println("Error");
        }
    }

}
