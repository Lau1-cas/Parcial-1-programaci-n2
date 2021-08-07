/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1pro2;

import com.ventas.ClsVentas;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ClsDatos {
private String [][] CacularPF; 
private static final int dato1 =0; 
private static final int dato2 =1; 
private static final int dato3 =2; 
private static final int dato4 =3; 
private static final int dato5 =4;
private static final int dato6 =5; 
private static final int dato7 =6;
private int filaActual =0;

private final int MAX_FILAS =4;
private final int MAX_COLUMNAS =7;
private int totalFilas =0;
    
Scanner t = new Scanner(System.in);

public ClsDatos (int filas){
    
    if (filas > MAX_FILAS)
    {
    throw (new IllegalArgumentException());
    }else{
     totalFilas = filas;
     CacularPF = new String[totalFilas][MAX_COLUMNAS];
    }
}

public String AgregarDato (ClsVentas vende){
 if (filaActual >= MAX_FILAS){
     return "Ya llegaste al final";
 }   else{
        CacularPF[filaActual][dato1]=vende.getUnidad()+"";
        CacularPF[filaActual][dato2]=vende.getNombre();
        CacularPF[filaActual][dato3]=vende.getEnero()+"";
        CacularPF[filaActual][dato4]=vende.getFebrero()+"";
        CacularPF[filaActual][dato5]=vende.getMarzo()+"";
        filaActual = filaActual +1;
 }
 return "OK";
}

public void imprimedecorado (){
    for (int x = 0; x < CacularPF.length; x++) {
            System.out.print("|");
            for (int y = 0; y < CacularPF[x].length; y++) {
                System.out.print(CacularPF[x][y]);
                if (y != CacularPF[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
}
   
public double sumaColumnas (int columna){
    double total = 0;
    for(int y = 0; y<filaActual; y++){
        String col = CacularPF[y][columna];
        total = total + Double.valueOf(col);
    }return total;  
}

public double sumaFila (int fila){
    double total = 0.0;
    for(int y = 2; y<5; y++){
        String fil = CacularPF[fila][y];
        
        total =total + Double.valueOf(fil);
    double k = Double.parseDouble(CacularPF[fila][dato1]);
    
    
    CacularPF[fila][dato6]=total+"";
    
    double n1 = Double.parseDouble(CacularPF[fila][dato6]);
    
    CacularPF[fila][dato7]=(k * n1)+"";
    }
    
    return total;
}
}   
       

