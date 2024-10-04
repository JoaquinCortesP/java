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
public class Cliente {
    private String IdCliente, nombre;
    private List<Pedido> pedidosRealizados = new ArrayList<>();
  
    public Cliente() {
    }

    public Cliente(String IdCliente, String nombre) {
        this.IdCliente = IdCliente;
        this.nombre = nombre;
    }

    public String getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(String IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pedido> getPedidosRealizados() {
        return pedidosRealizados;
    }

    public void setPedidosRealizados(List<Pedido> pedidosRealizados) {
        this.pedidosRealizados = pedidosRealizados;
    }

    @Override
    public String toString() {
        return "---Cliente----" + "[Id:" + IdCliente+"]"
                + " [Nombre: " + nombre +"]"+
                " [Pedidos Realizados: " + pedidosRealizados + ']';
    }
    
    
}

