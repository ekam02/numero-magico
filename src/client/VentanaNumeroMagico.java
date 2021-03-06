/*
 * VentanaNumeroMagico.java
 *
 * Created on 12 de marzo de 2009, 03:37 PM
 */

package client;



import interfaces.InterfaceNumeroMagico;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author  ESTUDIANTE
 */
public class VentanaNumeroMagico extends javax.swing.JFrame {

    private InterfaceNumeroMagico numeroMagico;
    /** Creates new form VentanaNumeroMagico */
    private int vr=0;
    
    public VentanaNumeroMagico() throws NotBoundException, MalformedURLException, RemoteException {
        this(null);
    }

    public VentanaNumeroMagico(String host) throws NotBoundException, MalformedURLException, RemoteException {
        initComponents();
        for (int i = 0; i < 1000 ;i++) {
            numero.addItem(i+"");
            
        }
        
        if(host==null){
            numeroMagico=(InterfaceNumeroMagico) Naming.lookup("rmi://localhost/nmagic");;
        }else try {
            numeroMagico=(InterfaceNumeroMagico) Naming.lookup("rmi://"+host+"/nmagic");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        numeroMagico.nuevo();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        numero = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        labelContador = new javax.swing.JLabel();
        labelRespuesta = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        txtNick = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Numero magico");

        jLabel1.setText("Ingrese un numero entre 0 y 999");

        jButton1.setText("Probar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        numero.setEditable(true);

        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cerrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        labelContador.setText("Intentos 0");

        labelRespuesta.setText(".");

        btnIniciar.setText("Iniciar Sesion");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        jLabel3.setText("Nick:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelContador)
                        .addGap(44, 44, 44)
                        .addComponent(labelRespuesta)))
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNick, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIniciar)
                .addGap(148, 148, 148))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar)
                    .addComponent(txtNick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelContador)
                    .addComponent(labelRespuesta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton3)))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try {
        Integer.parseInt(""+numero.getSelectedItem());   
            try {
                if ((vr = numeroMagico.probar(Integer.parseInt(numero.getSelectedItem() + ""),txtNick.getText() )) == 1) {
                    labelRespuesta.setText("El numero es Mayor");
                } else if (vr == -1) {
                    labelRespuesta.setText("El numero es Menor");
                } else {
                    labelRespuesta.setText("el numero fue encontrado");
                }
                 labelContador.setText("Intentos " + numeroMagico.contador(txtNick.getText()));
            } catch (RemoteException ex) {
                 JOptionPane.showMessageDialog(this, "RemoteException","error",JOptionPane.ERROR_MESSAGE);
            }
           
    } catch (NumberFormatException e) {
           JOptionPane.showMessageDialog(this, "Debe digitar un valor numerico","error",JOptionPane.ERROR_MESSAGE);         
           
    }
    
   
 

}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            numeroMagico.nuevo();
            labelContador.setText("intentos "+numeroMagico.contador(txtNick.getText()));
        } catch (RemoteException ex) {
            JOptionPane.showMessageDialog(this, "RemoteException","error",JOptionPane.ERROR_MESSAGE);
        }

}//GEN-LAST:event_jButton2ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            numeroMagico.salir();
        } catch (RemoteException ex) {
            JOptionPane.showMessageDialog(this, "RemoteException","error",JOptionPane.ERROR_MESSAGE);
        }
  
}//GEN-LAST:event_jButton3ActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        try {
            numeroMagico.iniciarSesion(txtNick.getText());
        } catch (RemoteException ex) {
            Logger.getLogger(VentanaNumeroMagico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VentanaNumeroMagico("localhost").setVisible(true);
                
                } catch (Exception ex) {
                    Logger.getLogger(VentanaNumeroMagico.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelContador;
    private javax.swing.JLabel labelRespuesta;
    private javax.swing.JComboBox numero;
    private javax.swing.JTextField txtNick;
    // End of variables declaration//GEN-END:variables

}
