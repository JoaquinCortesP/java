/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joaqu
 */
public class Pedido {
    private List<Producto> carrito = new ArrayList<>();
    private Double total;

    public Pedido() {
    }

    public Pedido(Double total) {
        this.total = total;
    }

    public List<Producto> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<Producto> carrito) {
        this.carrito = carrito;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "--Pedido-- " + " Carrito: " + carrito+" ]" +
                " [Total: " + total + ']';
    }
    public void calcularTotal(double precio){
        total = 0.0; 
        for (Producto IdProducto : carrito){
        total += IdProducto.getPrecio();  
        System.out.println("$"+total);
        }
        
     }
    
    }
    
    
    

