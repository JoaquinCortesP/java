/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Joaqu
 */
public class Ropa extends Producto{
    private String talla, color;

    public Ropa(String talla, String color) {
        this.talla = talla;
        this.color = color;
    }

    public Ropa(String talla, String color, String IdProducto, String nombre, Double precio) {
        super(IdProducto, nombre, precio);
        this.talla = talla;
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "--Ropa--" + " [Talla: " + talla + "] "
                + " [Color=" + color + ']';
    }
    
    public void ajustarTalla(String nuevaTalla){
         this.talla = nuevaTalla;
    }
    
}
