/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parabolicosimplificado;
import java.util.Scanner;

public class ParabolicoSimplificado {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double velocidadInicial = 0.0;
        double anguloLanzamiento = 0.0;
        double anguloRadianes = 0.0;
        double recorridoPaquete = 0.0;
        
        System.out.println("Bienvenido(a) al Tiro Parabolico Simplificado");
        
        System.out.println("");
        System.out.print("Cual es la velocidad inicial en m/s: ");//1. Solicitar al usuario la velocidad inicial (𝑣0) en m/s
        velocidadInicial = scan.nextDouble();
        
        System.out.println("");
        System.out.print("Cual es el angulo de lanzamiento en grados: ");//2. Solicitar el ángulo de lanzamiento (𝜃) en grado
        anguloLanzamiento = scan.nextDouble();
        
        anguloRadianes = Math.toRadians(anguloLanzamiento);//3. Para usar la fórmula, el ángulo debe estar en radianes. Buscar cómo usar Math.toRadians() o hacer la conversión manual
        
        recorridoPaquete = (Math.pow(velocidadInicial, 2) * Math.sin(2 * anguloRadianes)) / 9.81;//4. Aplicar la fórmula simplificada de alcance máximo y logra obtener el cálculo
        
        System.out.println("\n---------------------------------------");
        System.out.printf("Metros que Recorrera el Paquete %.2f",recorridoPaquete);//5. Mostrar el resultado final indicando cuántos metros recorrerá el paquete
        System.out.println("\n---------------------------------------");
        
    }//Public Class
    
}//Static Void Main
