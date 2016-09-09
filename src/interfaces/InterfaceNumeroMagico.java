/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author ESTUDIANTE
 */
public interface InterfaceNumeroMagico extends Remote {
    
    public void nuevo() throws RemoteException;
    public int probar(int i, String Nick) throws RemoteException;
    public int contador(String Nick) throws RemoteException;
    public void salir() throws RemoteException;
    public boolean iniciarSesion(String text) throws RemoteException;

    
}
