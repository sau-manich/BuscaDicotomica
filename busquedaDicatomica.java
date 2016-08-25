/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IIsemestre2014;
import java.io.*;

/**
 *
 * @author Juanito
 */
public class busquedaDicatomica {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader dato = new BufferedReader (new InputStreamReader(System.in));
        // TODO code application logic here
         int v[]=new int[10];
 int i,x,izq=1,der=5,cen;
 i=0;
    while(i<5){
        i++;
          System.out.print("introduzca un valor para v["+i+"]:");
    v[i]= Integer.parseInt(dato.readLine());
    }
    i=0;
    while(i<5){
        i++;
          System.out.print(" "+v[i]);
    }
        System.out.println("");
    System.out.println("introduzca un valor para x: ");
    x= Integer.parseInt(dato.readLine());
    cen=(izq+der)/2;
        while((v[cen]!=x)&&(izq<der)){
        if(v[cen]>x){
          der=cen-1;
        }
        else{
            izq=cen+1;
        }
        cen=(izq+der)/2;
        }
        if (v[cen]==x){
        System.out.println("el elemento se encuentra en la posicion: "+cen);   
        }
        else {
        System.out.println("El elemento no existe");
        }
    
    }
}
