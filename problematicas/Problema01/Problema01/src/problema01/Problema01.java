/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        // Declaramos variables
        String nombre;
        String posicion;
        int edad;
        String lista = "Listado de Jugadores\n";
        String listaB = "Listado de Edades ";
        double estatura;
        int hasta;
        double promedio_edad = 0;
        double promedio_estatura = 0;
        int contador = 0;
        int suma_edad = 0;
        double suma_estatura = 0;

        // Ingresamos la cantidad en "valor" para los jugadores.
        System.out.println("Ingrese la cantidad de jugadores que va a ingresar");
        hasta = entrada.nextInt();

        for (int i = 1; i <= hasta; i++) {
            entrada.nextLine();
            System.out.println("Ingrese el nombre del jugador");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posición del jugador");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador");
            estatura = entrada.nextDouble();

            lista = String.format("%s%d. %s - %s-, edad %d, estatura %.2f\n", lista,
                    i, nombre, posicion, edad, estatura);

            listaB = String.format("%s\n%d", listaB, edad);
            
            // NO NECECITO EL NEXT DURANTE EL REGRESO DE DATOS
            // entrada.nextLine();
            suma_edad = suma_edad + edad;
            suma_estatura = suma_estatura + estatura;
            contador = contador + 1;

            promedio_edad = (double) suma_edad / contador;
            promedio_estatura = suma_estatura / contador;
            
        }

        System.out.printf("%s", lista);
        System.out.printf("%s\n", listaB);
        System.out.printf("Promedio de edades: %.1f\nPromedio de "
                + "estaturas: %.2f\n",
                promedio_edad,
                promedio_estatura);

    }

}
