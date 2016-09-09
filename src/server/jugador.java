/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author ESTUDIANTE
 */
public class jugador {
   private String user;
   private int contador;
    
    /**
     *
     * @param user
     * @param contador
     */
    public jugador(String name) {
        this.user = name;
        this.contador = 0;
    }

      
    public int getContador() {
        return contador;
    }

    public void AcumularContador() {
        contador++;
    }
    
    public String getUser() {
        return user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }
}
