/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Joaqu
 */
public class Electronico extends Producto{
    private String marca;
    private int garantiaMeses;


    public Electronico(String marca, int garantiaMeses) {
        this.marca = marca;
        this.garantiaMeses = garantiaMeses;
    }

    public Electronico(String marca, int garantiaMeses, String IdProducto, String nombre, Double precio) {
        super(IdProducto, nombre, precio);
        this.marca = marca;
        this.garantiaMeses = garantiaMeses;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public String toString() {
        return "--Electronico--" + " [Marca: " + marca +"]"+ 
                " [Meses de garantia: " + garantiaMeses + ']'+ 
                " [Precio: " + precio+ "]" ;
    }
    
    
    
   @Override
   public void extenderGarantia1(int mesesExtra){
        this.garantiaMeses = mesesExtra;
    
}
    
    
   @Override
   public void calcularDescuento(Producto descuento){
       if(precio >= 20000.0){
            precio = precio * 0.7;
       }
    }
   
    
}
