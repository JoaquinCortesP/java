/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Joaqu
 */
public class Producto {
    private String IdProducto,nombre;
    Double precio;

    public Producto() {
    }

    public Producto(String IdProducto, String nombre, Double precio) {
        this.IdProducto = IdProducto;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(String IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return " --Producto-- " +
                " [Id:" + IdProducto +" ] "+ 
                " [Nombre: " + nombre +" ]"+
                " [Precio: " + precio +" ]" ;
    }
    
    
    public void calcularDescuento(Producto descuento){
       if(precio >= 20000.0){
            precio = precio * 0.7;
       }
    }
    public void ajustarTalla(String nuevaTalla){
         System.out.println("Talla actualizada");
    }
    
    public void extenderGarantia1(int mesesExtra){
        System.out.println("Garantia Extendida con éxito");
      
    }
   
}
