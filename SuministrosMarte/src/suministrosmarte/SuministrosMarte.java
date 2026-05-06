/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suministrosmarte;
import java.util.Scanner;

public class SuministrosMarte {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int codigo = 0;
        double racionesComida = 0.0;
        double presionTanque = 0.0;
        double comidaColono = 0.0;
        
        System.out.println("---------------Mision---------------");
        System.out.println("");
        System.out.print("Codigo del Contenedor: ");//identifica el código del contenedor (número)
        codigo = scan.nextInt();
        
        System.out.println("");
        System.out.print("Unidades de Raciones de Comida: ");//registra cuántas unidades de raciones de comida trae
        racionesComida = scan.nextDouble();
        
        System.out.println("");
        System.out.print("Presion del Tanque de Agua dentro del Cohete: ");//mide la presión del tanque de agua que viene en el cohete
        presionTanque = scan.nextDouble();
        
        comidaColono = racionesComida / 12;//la base necesita saber cuánta comida habrá por colono
        
        System.out.println("");
        System.out.println("Reporte de Suministros");//Imprimir un "Reporte de Suministros" decorado con caracteres especiales para que parezca una pantalla de computadora espacial.
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        System.out.printf("%-5s %-30s %10s %5s %n","||","Codigo de Contenedor: ",codigo,"||");
        System.out.printf("%-5s %-30s %10.2f %5s %n","||","Raciones de Comida: ",racionesComida,"||");
        System.out.printf("%-5s %-30s %10.2f %5s %n","||","Presion del Tanque de Agua: ",presionTanque,"||");
        System.out.printf("%-5s %-30s %10.2f %5s %n","||","Comida por Colono: ",comidaColono,"||");
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        System.out.println("");
        
        
        
    }//Static Void Main
    
}//Public Class
