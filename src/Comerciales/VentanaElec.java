
package Comerciales;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import concesionario.Vehiculo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;
import libproyecto.LibProyecto;

/**
 * Contiene las variables, colecciones y métodos para la creación y visualización de la ventana
 * para manejar datos mediante un jTable llamado tablaDatos.
 * @author Brais Núñez & Mario Blanco
 */
public class VentanaElec extends javax.swing.JFrame implements Serializable {
    String[] vehiculo = new String[10];
    Vehiculo coche = new Vehiculo();
    Vehiculo cochefichero = new Vehiculo();
    String fichero = "base.dat";
    
    /**
     * Se utiliza para que la ventana quede fijada en el centro de la pantalla.
     */
    
    public VentanaElec() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        volver = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtMatriculacion = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtKilometros = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtPlazas = new javax.swing.JTextField();
        puertas = new javax.swing.JLabel();
        plazas = new javax.swing.JLabel();
        txtPuertas = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        BotonActualizar = new javax.swing.JButton();
        BotonBuscar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Marca", "Modelo", "Tipo", "Color", "Kilometros", "Fecha Matriculacion", "Puertas", "Precio", "Plazas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaDatos.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tablaDatosComponentAdded(evt);
            }
        });
        tablaDatos.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tablaDatosInputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 260));

        volver.setText("VOLVER");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 730, 440, 90));

        botonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete_icon.png"))); // NOI18N
        botonBorrar.setText("BORRAR");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 590, 150, 120));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("MODELO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 70, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("KILOMETROS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, 80, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 70, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("PRECIO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 80, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MARCA");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 80, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("COLOR");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 80, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("FECHA MATRICULACION");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 140, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("TIPO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 80, 20));

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 280, 40));
        getContentPane().add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 280, 40));

        txtMatriculacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculacionActionPerformed(evt);
            }
        });
        getContentPane().add(txtMatriculacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 210, 40));
        getContentPane().add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 290, 40));
        getContentPane().add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 280, 40));

        txtKilometros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKilometrosActionPerformed(evt);
            }
        });
        getContentPane().add(txtKilometros, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 540, 280, 40));
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 280, 40));
        getContentPane().add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 290, 40));
        getContentPane().add(txtPlazas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 280, 40));

        puertas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        puertas.setForeground(new java.awt.Color(240, 240, 240));
        puertas.setText("PUERTAS");
        getContentPane().add(puertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 80, 20));

        plazas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        plazas.setForeground(new java.awt.Color(240, 240, 240));
        plazas.setText("PLAZAS");
        getContentPane().add(plazas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 80, 20));
        getContentPane().add(txtPuertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 280, 40));

        botonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_agregar.jpg"))); // NOI18N
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(botonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, 160, 130));

        BotonActualizar.setText("ACTUALIZAR");
        BotonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 720, 170, 100));

        BotonBuscar.setText("BUSCAR");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 720, 180, 100));

        botonGuardar.setBackground(new java.awt.Color(255, 255, 255));
        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/diskete2.png"))); // NOI18N
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 590, 120, 120));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/myb.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 870, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     int filaelegida;
    
     /**
      * Se utiliza para recoger el modelo de un jTable "tablaDatos", seleccionar la fila escogida,
      * escoger una de las opciones deseadas y si la opción es OK borrar esa fila de la tabla,
      * por último vuelve a asignar el nuevo modelo sin esa fila a la tablaDatos.
      * @param evt Acciona los métodos, instanciaciones, etc contenidos dentro del
      * botón borrar.
      */
     
    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
       
        DefaultTableModel modelo = (DefaultTableModel) tablaDatos.getModel();
        
        filaelegida = tablaDatos.getSelectedRow();
            
        if(filaelegida<0){
            
            JOptionPane.showMessageDialog(null,"Debe seleccionar un vehículo para poder eliminarlo");
        }else{
            int confirmar = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea eliminar este vehículo?");
            if(confirmar==JOptionPane.OK_OPTION){
                modelo.removeRow(filaelegida);
                JOptionPane.showMessageDialog(null, "Vehículo eliminado");  
            }
            else if(confirmar==JOptionPane.CANCEL_OPTION){
                JOptionPane.showMessageDialog(null, "Eliminación de vehículo cancelada");
            }
            else{
                JOptionPane.showMessageDialog(null, "Ha decidido no eliminar el vehículo");
            }
        }
        tablaDatos.setModel(modelo);
    }//GEN-LAST:event_botonBorrarActionPerformed
    
    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
      @SuppressWarnings("LocalVariableHidesMemberVariable")
      VentanaPrincipal volver = new VentanaPrincipal();
      volver.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void txtMatriculacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculacionActionPerformed

    private void txtKilometrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKilometrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKilometrosActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed
    
    
    /**
     * Se declara un objeto leer de tipo ObjectInputStream y dentro se le da el fichero a leer
     * mediante un new FileInputStream. Después se recoge la lectura (de un fichero serializado y
     * no sobreescrito) mediante el método readUnshared y se asigna su valor al objeto cochefichero.
     * Finalmente se cierra el fichero.
     * @throws ClassNotFoundException
     * @throws IOException 
     */
    public void lecturaFichero() throws ClassNotFoundException, IOException{
        ObjectInputStream leer = null;
      //  DefaultTableModel modelo = (DefaultTableModel) tablaDatos.getModel();
        //byte[] tamañoFichero = fichero.getBytes();
        //Vector tamañoContenidoTabla = modelo.getDataVector();
        //modificado, ahora mismo no funciona porque itera sin parar, pero ya recoge más de una
        //vez la lectura del fichero, necesario bucle for para recorrer posiciones distintas.
        //do{
        
        try {
            
            leer = new ObjectInputStream(new FileInputStream(fichero));
            
              cochefichero = (Vehiculo) (leer.readUnshared());
              System.out.println(cochefichero.toString());
            
               
        }     catch (IOException ex) {
               
            System.out.println("erro 2" +ex.getMessage());
        } finally{

            leer.close();   
    }

        //}while(tamañoFichero.length>tamañoContenidoTabla.size());
    }
        
    public void cargarTabla(){
        
        DefaultTableModel modelo = (DefaultTableModel) tablaDatos.getModel();
        //addRow añade una nueva fila formada por el Array vehiculo
        modelo.addRow(vehiculo);
        //setModel asigna el modelo (modificado) a la tablaDatos
        tablaDatos.setModel(modelo);   
    }
    
    /**
     * Recoge el modelo de la tabla en la variable modelo de tipo DefaultTableModel,
     * después llama al método lecturaFichero() que lee el fichero y guarda en el objeto
     * cochefichero lo leído. Desde ese objeto se llama a cada variable y se asigna a una
     * posición del Array de String vehiculofichero (ya que solo se pueden añadir Array a un 
     * jTable. Finalmente se añade y se hace un setModel con el modelo nuevo.
     * @throws ClassNotFoundException
     * @throws IOException 
     */
    
    public void cargarDesdeFichero() throws ClassNotFoundException, IOException{
        String[] vehiculofichero = new String[10];
        
        DefaultTableModel modelo = (DefaultTableModel) tablaDatos.getModel();
   
        lecturaFichero();
        
        vehiculofichero[0]= cochefichero.getIdentificador();
        vehiculofichero[2]= cochefichero.getMarca();
        vehiculofichero[5]= cochefichero.getModelo();
        vehiculofichero[3]= cochefichero.getTipo();
        vehiculofichero[1]= cochefichero.getColor();
        vehiculofichero[8]= cochefichero.getKilometros();
        vehiculofichero[4]= cochefichero.getFechaMatriculacion();
        vehiculofichero[9]= cochefichero.getNumPuertas();
        vehiculofichero[6]= cochefichero.getPrecio();
        vehiculofichero[7]= cochefichero.getNumeroPlazas();
       
        modelo.addRow(vehiculofichero);
        
        tablaDatos.setModel(modelo);    
    }
         
    /**
     * Recoge las variables de los campos de texto para introducir datos en la tabla cargando
     * en cada fila con el método cargarTabla() un Array de String llamado vehiculo. A su vez esos 
     * valores van al constructor del objeto coche de la clase Vehiculo.
     * @param evt 
     */
    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        
        vehiculo[0]= txtID.getText(); 
        vehiculo[1]= txtMarca.getText();
        vehiculo[2]= txtModelo.getText();
        vehiculo[3]= txtTipo.getText();
        vehiculo[4]= txtColor.getText();
        vehiculo[5]= txtKilometros.getText();
        vehiculo[6]= txtMatriculacion.getText();
        vehiculo[7]= txtPuertas.getText();
        vehiculo[8]= txtPrecio.getText();
        vehiculo[9]= txtPlazas.getText();

        coche = new Vehiculo(txtID.getText(),txtMarca.getText(),txtModelo.getText(),txtTipo.getText(),txtColor.getText(),txtKilometros.getText(),txtMatriculacion.getText(),txtPuertas.getText(),
        txtPrecio.getText(),txtPlazas.getText());
        
        cargarTabla();
    }//GEN-LAST:event_botonAgregarActionPerformed
 
 
    /**
     * Utiliza un MiObjectOutputStream "miob" para escribir el fichero. Se selecciona el vehiculo a guardar mediante
     * un getSelectedRow() y al confirmar con un OK_OPTION se escribe en el las variables de ese objeto
     * de forma serializada y sin sobreescribir con el método writeUnshared(Obj obj).
     * Finalmente se cierra el fichero.
     * @param evt 
     */
    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        MiObjectOutputStream miob = null;
      
  
        coche = new Vehiculo(txtID.getText(),txtMarca.getText(),txtModelo.getText(),txtTipo.getText(),txtColor.getText(),txtKilometros.getText(),txtMatriculacion.getText(),txtPuertas.getText(),
        txtPrecio.getText(),txtPlazas.getText());
        
        int filaelegida = tablaDatos.getSelectedRow();
        
        if(filaelegida<0){
            
            JOptionPane.showMessageDialog(null,"Debe seleccionar al menos un vehículo para poder guardarlo");
        }else{
            int confirmar = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea guardar este vehículo?");
            if(confirmar==JOptionPane.OK_OPTION){
                    try {
            miob = new MiObjectOutputStream(new FileOutputStream(fichero,true));            

            miob.writeUnshared(coche);
           
            } catch (FileNotFoundException ex) {
            Logger.getLogger(VentanaElec.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(VentanaElec.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
                
                    try {

                        miob.close();
                    } catch (IOException ex) {
                        Logger.getLogger(VentanaElec.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
                JOptionPane.showMessageDialog(null, "Vehículo/os almacenado/os");
            }
            else if(confirmar==JOptionPane.CANCEL_OPTION){
                JOptionPane.showMessageDialog(null, "Guardado de vehículo cancelado");
            }
            else{
                JOptionPane.showMessageDialog(null, "Ha decidido no guardar el vehículo");
            }
        }
        
    }//GEN-LAST:event_botonGuardarActionPerformed

    public void busqueda() throws ClassNotFoundException{

        String aux = txtID.getText();
        LibProyecto.leerFichero(fichero, coche);
        String id = coche.getIdentificador();
        boolean comparacion = aux.equals(id);
        if (comparacion==true){
            JOptionPane.showMessageDialog(null, "El vehículo se encuentra en la lista");
        }else{
            JOptionPane.showMessageDialog(null, "El vehiculo no está en la lista");
        }

    /**
     * Recoge el modelo del jTable "tablaDatos" y lo asigna a un objeto "modelo" de tipo
     * DefaultTableModel, después llama al método leerFichero()que recibe el fichero y el 
     * objeto que se lee del mismo, después llama al método cargarTabla() que añade a la 
     * tabla lo resultante de la lectura del fichero, por último asigna el nuevo modelo con esa
     * lectura a la tabla.
     * @param evt Acciona los métodos, instanciaciones, etc contenidos dentro del
      * botón actualizar.
     */
    }
    @SuppressWarnings("SillyAssignment")
    private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarActionPerformed
        
        try {
            cargarDesdeFichero();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaElec.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VentanaElec.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotonActualizarActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        
        try {
            busqueda();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaElec.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void tablaDatosInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tablaDatosInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaDatosInputMethodTextChanged

    private void tablaDatosComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tablaDatosComponentAdded

    }//GEN-LAST:event_tablaDatosComponentAdded

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("Convert2Lambda")
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
            java.util.logging.Logger.getLogger(VentanaElec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaElec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaElec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaElec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaElec().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel plazas;
    private javax.swing.JLabel puertas;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtKilometros;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMatriculacion;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlazas;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPuertas;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}


