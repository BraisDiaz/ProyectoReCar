
package Comerciales;
import java.awt.Toolkit;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 * Contiene las variables y métodos para la creación y visualización de la primera
 * ventana del programa, así como la llamada a la siguiente ventana.
 * Hereda de la clase JFrame, implementando la librería swing para interfaces gráficas.
 * @author Brais Núñez & Mario Blanco
 */


public class VentanaPrincipal extends javax.swing.JFrame {
     
private Timer tiempo;
int contador;
final static int segundos =5;
    public Image cogerImagen(){
        Image retValue  = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("InterfazGrafica//iconoEmpresa.png"));
        return retValue;
    }
    
public class TimerListener implements ActionListener{
     
        @Override
        public void actionPerformed(ActionEvent ae) {
        contador++;
        barra1.setValue(contador);
        
        if(contador==500){
            tiempo.stop();
            esconder();
            
            VentanaLogin segundaPantalla = new VentanaLogin();
     segundaPantalla.setVisible(true);
        }
    }
    }
  public void esconder(){this.setVisible(false);}
  public void iniciar(){this.tiempo.start();}
  
    public VentanaPrincipal() {
        initComponents();
       this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        barra1 = new javax.swing.JProgressBar();
        botonCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton1.setBackground(new java.awt.Color(204, 204, 204));
        boton1.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        boton1.setForeground(new java.awt.Color(51, 51, 51));
        boton1.setText("ACCESO COMERCIAL");
        boton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        boton1.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        boton1.setOpaque(false);
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        getContentPane().add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 280, 60));

        boton2.setBackground(new java.awt.Color(204, 204, 204));
        boton2.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        boton2.setText("Salir");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        getContentPane().add(boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 320, 70));

        barra1.setMaximum(500);
        getContentPane().add(barra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 460, 40));

        botonCliente.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        botonCliente.setText("ACCESO CLIENTES (Proximamente)");
        botonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClienteActionPerformed(evt);
            }
        });
        getContentPane().add(botonCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 330, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/esta.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
    contador=0;
        barra1.setValue(0);
        barra1.setStringPainted(true);
        tiempo = new Timer(segundos,new TimerListener());
        iniciar();
                
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_boton2ActionPerformed

    private void botonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClienteActionPerformed
        
    }//GEN-LAST:event_botonClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barra1;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton botonCliente;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
