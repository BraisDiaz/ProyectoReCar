
package Comerciales;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * Contiene la creación de un ObjectOutputStream propio.
 * @author Brais Núñez & Mario Blanco
 */
public class MiObjectOutputStream extends ObjectOutputStream{

    public MiObjectOutputStream() throws IOException {
        
    }
    
    public MiObjectOutputStream(OutputStream os) throws IOException {
     super(os);   
    }
   
    /**
     * Se utiliza para sobreescribir la cabecera dentro de un fichero a la
     * hora de almacenar datos.
     * @throws IOException 
     */
      
    @Override
    public void writeUnshared(Object obj) throws IOException {
        super.writeUnshared(obj); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
