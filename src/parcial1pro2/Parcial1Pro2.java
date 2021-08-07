/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1pro2;
import java.util.Scanner;
import com.ventas.ClsVentas;
/**
 *
 * @author USUARIO
 */
public class Parcial1Pro2 {

    Scanner t = new Scanner (System.in);

private String [][] CacularPF; 
private static final int comi =0; 
private static final int Paso5 =1; 
private static final int Paso4 =2; 
private static final int comi1 =3; 
private static final int Calcular =4;
private int filaActual =0;

private final int MAX_FILAS =4;
private final int MAX_COLUMNAS =5;
private int totalFilas =0;

public Parcial1Pro2 (int filas){
    
    if (filas > MAX_FILAS)
    {
    throw (new IllegalArgumentException());
    }else{
     totalFilas = filas;
     CacularPF = new String[totalFilas][MAX_COLUMNAS];
    }
}

public String AgregarVendedorMatriz (ClsVentas vende){
 if (filaActual >= MAX_FILAS){
     return "Ya llegaste al final";
 }   else{
        CacularPF[filaActual][comi]=vende.getNombre();
        CacularPF[filaActual][Paso5]=vende.getEnero()+"";
        CacularPF[filaActual][Paso4]=vende.getFebrero()+"";
        filaActual = filaActual +1;
 }
 return "OK";
}

public void imprimirDecoradoAvanzado (){
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
    
public String MayorxMes(int columna){
    Double mayor = 0.0;
    String res = "";
    for(int y=0; y<filaActual; y++){
        String col =CacularPF[y][columna];
         
        if(Double.valueOf(col)>mayor){
         mayor =Double.valueOf(col);
         res = CacularPF[y][comi]+" tiene una venta de: "+mayor;
        }
    } return res;
}

public double sumaColumna (int columna){
    double total = 0;
    for(int y = 0; y<filaActual; y++){
        String col = CacularPF[y][columna];
        total = total + Double.valueOf(col);
    }return total;  
}

public double sumaFila (int fila){
    double total = 1;
    for(int y = 1; y<3; y++){
        String fil = CacularPF[fila][y];
        
        total =total * Double.valueOf(fil);
    }
    CacularPF[fila][comi1]=total+"";
    CacularPF[fila][Calcular]=(total/2)+"";
    return total;
}

public void partesP (){
    double Seguro = 3500;
    double Impuestos = 5000;
    double ComisionesBancarias = 200;
    double n = Seguro + Impuestos + ComisionesBancarias;
    System.out.println("Gasto al valor");
    System.out.println("Gastos que generan valor: Q. " +n);
    
    double a = (double)(n / sumaColumna(3));
    
    System.out.println("\nCoeficiente del gasto");
    System.out.println("Valor total de los materiales: "+a);

    System.out.println("\nGasto al valor por cada producto");
    double pro1 =Double.parseDouble(CacularPF[0][Paso4]);
    double pro2 =Double.parseDouble(CacularPF[1][Paso4]);
    double pro3 =Double.parseDouble(CacularPF[2][Paso4]);
    double pro4 =Double.parseDouble(CacularPF[3][Paso4]);
    double result1 =  pro1 * a;
    System.out.println("Gastos al valor que genera producto 1: " + result1);    
    double result2 =  pro2 * a;
    System.out.println("Gastos al valor que genera producto 2: " + result2);
    double result3 =  pro3 * a;
    System.out.println("Gastos al valor que genera  producto 3: " + result3);
    double result4 =  pro4 * a;
    System.out.println("Gastos al valor que  genera producto 4: " + result4);
    
    System.out.println("\nPeso total mercancia"); 
    double Pesounidad  = Double.parseDouble(CacularPF[0][Paso5]);
    double Pesounidad1 = Double.parseDouble(CacularPF[1][Paso5]);
    double Pesounidad2 = Double.parseDouble(CacularPF[2][Paso5]);
    double Pesounidad3 = Double.parseDouble(CacularPF[3][Paso5]);
    
    double peso  = 50 *Pesounidad;
    double peso1 = 20 *Pesounidad1;
    double peso2 = 10 *Pesounidad2;
    double peso3 = 50 *Pesounidad3;
    
    System.out.println("Peso total de bolsas cemento 50kgs: " + peso);
    System.out.println("Peso total de bolsas cal 20kgs: " + peso1);
    System.out.println("Peso total de tubos PC 10kgs: " + peso2);
    System.out.println("Peso total de quintales hierro 50kgs: " + peso3);
    
    double total = peso + peso1 + peso2 + peso3;
    System.out.println("Peso total en kilogramos: " + total);      
    
    System.out.println("\nGasto que genra el peso de la mercaderia");
    double fletes =2500;
    double acarreo =5000;
    
    double totalPeso = fletes + acarreo;
    System.out.println("total gastado por peso: Q."+ totalPeso);
    System.out.println("\nCoeficiente de gasto");
    double PesoT = totalPeso/total;
    System.out.println("Coeficiente de gasto por peso: " + PesoT);
    
    double Pesototal  = 50 * PesoT;
    double Pesototal1 = 20 * PesoT;
    double Pesototal2 = 10 * PesoT;
    double Pesototal3 = 50 * PesoT;
    System.out.println("\nGasto al peso que genera cada producto");
    System.out.println("Gasto generado de bolsa de cemento: Q. "+ Pesototal);
    System.out.println("Gasto generado de bolsa de cal: Q. "+ Pesototal1);
    System.out.println("Gasto generado de tubo PC: Q. "+ Pesototal2);
    System.out.println("Gasto generado de quintal de hierro: Q. "+ Pesototal3);
    
    
    System.out.println("\nGran total");
    double comproFinal = sumaColumna(3) + n + totalPeso;
    System.out.println("Q." + comproFinal);
}

}

