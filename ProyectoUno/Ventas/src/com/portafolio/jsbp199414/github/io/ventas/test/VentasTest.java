package com.portafolio.jsbp199414.github.io.ventas.test;

import com.portafolio.jsbp199414.github.io.ventas.*;


public class VentasTest {
    public static void main(String[] args) {
        Producto productoUno = new Producto("Camisa", 50.00);
        Producto productoDos = new Producto("Pantalon", 100.00);
        
        Orden ordenUno = new Orden();
        ordenUno.agregarProducto(productoUno);
        ordenUno.agregarProducto(productoDos);
        ordenUno.mostrarOrden();
        
    }
    
}
