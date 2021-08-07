/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class ClsVentas {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public double getEnero() {
        return enero;
    }

  
    public void setUnidad(double unidad) {
        this.enero = unidad;
    }
    
    
    public double getUnidad() {
        return unidad;
    }

    
    public void setEnero(double enero) {
        this.enero = enero;
    }

    
    public double getFebrero() {
        return febrero;
    }

    
    public void setFebrero(double febrero) {
        this.febrero = febrero;
    }

    
    public double getMarzo() {
        return marzo;
    }

    
    public void setMarzo(double marzo) {
        this.marzo = marzo;
    }
    
    private String nombre;
    private double enero;
    private double unidad;
    private double febrero;
    private double marzo;
    
    
    public void llenainformacion(){
        Scanner t = new Scanner (System.in);
        System.out.println("Ingres unidad");
        setUnidad((double) Double.valueOf(t.nextLine()));
        System.out.println("Ingrese nombre");
        setNombre(t.nextLine());
        System.out.println("Ingres enero");
        setEnero((double) Double.valueOf(t.nextLine()));
        System.out.println("Ingrese febrero");
        setFebrero(t.nextDouble());
        System.out.println("Ingrese marzo");
        setMarzo(t.nextDouble());
        
            
    }

    void llenaInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
    
    


    

