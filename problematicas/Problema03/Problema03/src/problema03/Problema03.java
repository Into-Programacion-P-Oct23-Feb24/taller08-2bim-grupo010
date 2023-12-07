/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author LAB.ELECT
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double celsius;
        for (int farenheit = 20; farenheit <= 96; farenheit += 4) {
            celsius = (double) (farenheit - 32) * 5 / 9;
            System.out.printf("%d grados Farenheit son: %.2f grados Celsius\n",
                    farenheit, celsius);
        }
        // TODO code application logic here
    }

}
