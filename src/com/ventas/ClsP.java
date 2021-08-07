/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas;
import java.util.Scanner;
import parcial1pro2.ClsDatos;
import parcial1pro2.Parcial1Pro2;
/**
 *
 * @author USUARIO
 */
public class ClsP {
     public static void temporal(){
        
        ClsVentas f = new ClsVentas();
        f.llenaInformacion();
        System.out.println("f.nombre1 = " + f.getNombre());
        System.out.println("f.enero = " + f.getEnero());
        f.setEnero(30);
        System.out.println("v.enero modificar"+ f.getEnero());
         ClsVentas e = new ClsVentas();
        e.llenaInformacion();
        System.out.println("e.nombre2 = " + e.getNombre());
        System.out.println("e.enero = " + e.getEnero());
        
        System.out.println("= "+(e.getEnero() + f.getEnero()));
    }
    
    public static void main(String[] args){
        Scanner w = new Scanner(System.in);
         Parcial1Pro2 co = new Parcial1Pro2(4);
         ClsVentas venta = new ClsVentas();
         ClsDatos b = new ClsDatos(4);
         
        System.out.println("Cuadro");
        
        venta.setNombre("BolsaCemento");
        venta.setEnero(50);
        venta.setFebrero(60);
        co.AgregarVendedorMatriz(venta);  
        System.out.println(" ");
        
        //2
        venta.setNombre("BolsasCal");
        venta.setEnero(150);
        venta.setFebrero(40);
        co.AgregarVendedorMatriz(venta);  
        System.out.println(" ");
        
        //3
        venta.setNombre("TubosPC...");
        venta.setEnero(200);
        venta.setFebrero(55);
        co.AgregarVendedorMatriz(venta);  
        
        
        //4
        venta.setNombre("quintalesH");
        venta.setEnero(50);
        venta.setFebrero(350);
        co.AgregarVendedorMatriz(venta);  
        System.out.println(" ");
        
        

        co.imprimirDecoradoAvanzado();
        co.sumaFila(0);
        co.sumaFila(1);
        co.sumaFila(2);
        co.sumaFila(3);
        
        
        co.imprimirDecoradoAvanzado();
        
        System.out.println(" ");
        System.out.println("\nMultiplicación de unidades");
        System.out.println("Sumatoria total Q. " + co.sumaColumna(3));
        co.partesP();
        System.out.println(" ");
          
          
       //n1
        venta.setUnidad(50);
        venta.setNombre("BolsaCemento");
        venta.setEnero(60);
        venta.setFebrero(13.92);
        venta.setMarzo(37.5);
        b.AgregarDato(venta);
        
        //n2
        venta.setUnidad(150);
        venta.setNombre("BolsasCal");
        venta.setEnero(40); 
        venta.setFebrero(9.28);
        venta.setMarzo(15);
        b.AgregarDato(venta);
        
        //n3
        venta.setUnidad(200);
        venta.setNombre("TubosPC...");
        venta.setEnero(55);
        venta.setFebrero(12.76);
        venta.setMarzo(7.5);
        b.AgregarDato(venta);  
       
        
        //n4
        venta.setUnidad(50);
        venta.setNombre("QuintalesHierro");
        venta.setEnero(350);
        venta.setFebrero(81.2);
        venta.setMarzo(37.5);
        b.AgregarDato(venta);
      
       b.sumaFila(0);
       b.sumaFila(1);
       b.sumaFila(2);
       b.sumaFila(3);
       
        b.AgregarDato(venta);  
        System.out.println(" ");    
        b.imprimedecorado();
        System.out.println(" ");
        
        System.out.println("suma de costo por unidad Q."+b.sumaColumnas(5));
        
    
   
    }    
        
    }
  

