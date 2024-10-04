/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comercioelectronico;

import cl.duoc.models.Electronico;
import cl.duoc.models.Producto;
import cl.duoc.models.Ropa;

/**
 *
 * @author Joaqu
 */
public class ComercioElectronico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       Producto Tele = new Electronico("LG", 0, "e-01", "Tele lcd 40'", 60000.0);
       Producto Polera = new Ropa("xl", "Rojo", "r-01", "Polera mangas largas", 15000.0);
       
       
       Polera.ajustarTalla("xxl");
        System.out.println(Polera);
       Tele.extenderGarantia1(6);
       System.out.println(Tele);
       Tele.calcularDescuento(Tele);
       System.out.println(Tele);
      
    }
}

