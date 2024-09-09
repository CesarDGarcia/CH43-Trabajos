package org.generations.funciones;

import java.util.ArrayList;
import java.util.List;

public class Funciones {
    
    public class Juguetibici {
        
        static class Producto {
        String nombre;
        double precio;
        
        Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }
    }
        
    static class CarritoCompra {
        List<Producto> productos = new ArrayList<>();
        
        void agregarProductos (Producto barbie) {
            productos.add(barbie);
            
            
            }        
        
        double calcularTotal() {
            double total = 0;
            for (Producto barbie : productos) {
            total += barbie.precio;
        }
        
        return total;
        
        }
       
        double calcularDescuento(double porcentajeDescuento) {
            double total = calcularTotal();
            return total = (porcentajeDescuento / 100);
            
            }
        
        double calcularImpuestos(double porcentajeImpuestos) {
            double total = calcularTotal();
            return total = (porcentajeImpuestos / 100);
            
            }
        
        
        
        
        double calcularTotalGeneral (double totalGeneral, double impuestos, double descuentos) { 
            double impuestos1 = totalGeneral * calcularImpuestos(impuestos);
            double descuentos1 = totalGeneral * calcularDescuento( descuentos);
            totalGeneral = totalGeneral - descuentos1 + impuestos1;
            return totalGeneral;
            }
        
    }    
    }
}
