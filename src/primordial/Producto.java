/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primordial;

/**
 *
 * @author ASUS
 */
public class Producto {
    public String nombre="Margarita";
    public int precio;
    public int cantidad;
    public int vendidos;
    public int agregados; 
    public int cantidadTotal;
    int valor;
    double precioTotal;
    
    Producto(){}
    Producto(String nombre, int precio, int cantidad){
        this();
        this.nombre=nombre;
        this.precio=precio;
        this.cantidad=cantidad;
    }
    
    protected double precioTotal(){
        
        precioTotal=precio*cantidad;
        return precioTotal;
    }
   
    protected String datos(){
        cantidad=cantidad+agregados;
        String respuesta="\nel Producto:  "+this.nombre;
        respuesta+="\nPrecio:"+this.precio;
        respuesta+="\nCantidad de productos:"+this.cantidad;
        respuesta+="\nVendidos:"+this.vendidos;
        respuesta+="\nAgregados:"+this.agregados;
        return respuesta;
    }

    
}
