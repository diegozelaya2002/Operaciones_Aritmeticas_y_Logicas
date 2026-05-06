/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consumoelectrico;
import java.util.Scanner;

public class ConsumoElectrico {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String nombreUsuario = "Vacio";
        String marcaElectro = "Vacio";
        double consumoWatts = 0.0;
        double horasDia = 0.0;
        double wattsHora = 0.0;
        double consumoMes = 0.0;
        double costoMes = 0.0;
        
        System.out.println("Bienvenido(a) al Analizador de Consumo Electrico");
        System.out.println("-------------------------------------------------");
        
        System.out.println("");
        System.out.print("Nombre de Usuario: ");//1. Captura: Solicitar el nombre del usuario
        nombreUsuario = scan.nextLine();
        
        System.out.println("");
        System.out.print("Cual es la Marca del Electrodomestico: ");//2. Captura: Solicitar la marca del electrodoméstico
        marcaElectro = scan.nextLine();
        
        System.out.println("");
        System.out.print("Cuantos Watts consume el aparato: ");//3. Captura: Pedir el consumo en Watts del aparato
        consumoWatts = scan.nextDouble();
        
        System.out.println("");
        System.out.print("Cuantas horas al dia utiliza el aparato: ");//4. Captura: Pedir la cantidad de horas que se usa al día
        horasDia = scan.nextDouble();
        
        wattsHora = (consumoWatts * horasDia) / 1000;//5. Procesamiento: Calcular el consumo diario en KiloWatts-hora (kWh = (Watts * horas) / 1000).
        consumoMes = wattsHora * 30;//6. Procesamiento: Calcular el consumo mensual (considerando 30 días)
        costoMes = consumoMes * 0.15;//7. Procesamiento: Calcular el costo mensual (multiplicando el consumo mensual por un precio fijo de $0.15 por kWh)
        
        System.out.println("");
        System.out.printf("Resumen de %s",nombreUsuario);
        System.out.println("\n----------------------------------------");
        System.out.printf("%-30s %8s %n","Marca de Electronico: ",marcaElectro);
        System.out.printf("%-30s %8.2f %n","Consumo de Watts: ",consumoWatts);
        System.out.printf("%-30s %8.2f %n","Cantidad de Horas al Dia: ",horasDia);
        System.out.printf("%-30s %8.2f %n","Consumo Diario: ",wattsHora);
        System.out.printf("%-30s %8.2f %n","Consumo Mensual: ",consumoMes);
        System.out.println("----------------------------------------");
        System.out.printf("%-30s %8.2f %n","Total a Pagar: ",costoMes);//8. Impresión: Mostrar un resumen usando printf para que el costo aparezca con dos decimales
        System.out.println("");
        
    }//Static Void Main
    
}//Public Class
