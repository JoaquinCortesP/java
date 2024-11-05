/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.controllers;

import cl.duoc.models.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;



/**
 *
 * @author Cetecom
 */
public class ProductoController {
    private static List<Producto> productos = new ArrayList<>();
    private static int idProducto = 1;
    
    
    public void agregarProducto(String nombre, double precio, int cantidad){
        Producto nuevoProducto = new Producto(idProducto++,cantidad, nombre, precio);
        
        productos.add(nuevoProducto);
        
        JOptionPane.showMessageDialog(null, "Producto Agregado Correctamente", "CONGRATULATIONS",JOptionPane.INFORMATION_MESSAGE);
        
    
    }//final
    
    
    public void actualizarProducto(){
    
    }
    
    
    public List<Producto> obtenerProductos(){
        return new ArrayList<>(productos);
    
    }
    
    public void eliminar(){
    
    }
    
    
    
    
}
