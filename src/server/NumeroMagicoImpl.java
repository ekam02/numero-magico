/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package server;

import interfaces.InterfaceNumeroMagico;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author ESTUDIANTE
 */
public class NumeroMagicoImpl extends UnicastRemoteObject implements InterfaceNumeroMagico{
    
    private int numero;
    ArrayList<jugador> jugadores = null;
   
    public NumeroMagicoImpl() throws RemoteException {
          super();
          jugadores = new ArrayList();
    }
    
    public void nuevo() {
        //cont = 0;
        numero = (int)(Math.random()*1000);
        System.out.println(numero);
    }

    public int probar(int x, String Nick) {
        //cont++; //jugadores=new jugador();
        for (int i = 0; i<jugadores.size(); i++) {
            if(jugadores.get(i).getUser().equals(Nick)){
                jugadores.get(i).AcumularContador();
            }
        }
        if(x < numero){ return 1; }            
        else if(x > numero){ return -1; }
        else{ return 0;}
    }

    public int contador(String Nick) {
        int cont = 0;
        for (int i = 0; i<jugadores.size(); i++) {
            if(jugadores.get(i).getUser().equals(Nick)) {
                cont = jugadores.get(i).getContador();
            }
        }
        return cont;
        //return jugadores.getContador();
    }

    public void salir() {
    }
    
    public boolean iniciarSesion(String text) {
        //String utkj=this.text;
        //jugadores=new jugador();
        for(int i=0; i< jugadores.size(); i++) {
            if(jugadores.get(i).equals(text)) {
                return false;
            }
        }
        jugadores.add(new jugador(text));
        return true;
    }
}

