
package concesionario;

import java.io.Serializable;

/**
 * Contiene todas las variables utilizadas para la construcción de objetos
 * de la clase Vehiculo, así como constructores y métodos de acceso a las mismas. 
 * @author Brais Núñez & Mario Blanco
 */
public class Vehiculo implements Serializable,Comparable<Vehiculo>{
    
   public String identificador, color, marca, tipo,fechaMatriculacion,modelo, precio, numeroPlazas, kilometros, numPuertas;

    public Vehiculo(String identificador, String color, String marca, String tipo, String fechaMatriculacion,String modelo, String precio, String numeroPlazas,String kilometros,String numPuertas) {
        this.identificador = identificador;
        this.color = color;
        this.marca = marca;
        this.tipo = tipo;
        this.fechaMatriculacion = fechaMatriculacion;
        this.modelo=modelo;
        this.precio = precio;
        this.numeroPlazas = numeroPlazas;
        this.kilometros= kilometros;
        this.numPuertas= numPuertas;
    }
public Vehiculo(){
    
}

    public Vehiculo(Object readObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @SuppressWarnings("SillyAssignment")
    public void setFechaMatriculacion(String fechaFabricacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    public void setNumeroPlazas(String numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }
    
     public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setKilometros(String kilometros) {
        this.kilometros = kilometros;
    }

    public void setNumPuertas(String numPuertas) {
        this.numPuertas = numPuertas;
    }
 
    public String getIdentificador() {
        return identificador;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public String getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public String getPrecio() {
        return precio;
    }

    public String getNumeroPlazas() {
        return numeroPlazas;
    }
    
     public String getModelo() {
        return modelo;
    }

    public String getKilometros() {
        return kilometros;
    }

    public String getNumPuertas() {
        return numPuertas;
    }


    @Override
    public String toString() {
        return "Vehiculo{" + "identificador=" + identificador + ", color=" + color + ", marca=" + marca + ", tipo=" + tipo + ", fechaMatriculacion=" + fechaMatriculacion + ", modelo=" + modelo + ", precio=" + precio + ", numeroPlazas=" + numeroPlazas + ", kilometros=" + kilometros + ", numPuertas=" + numPuertas + '}';
    }

    @Override
    public int compareTo(Vehiculo comparar){
     
      return  this.identificador.compareToIgnoreCase(comparar.getIdentificador());
    }
}
    
    
    
    
   
    
    

