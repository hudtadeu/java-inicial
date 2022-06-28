/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package numeros;

import java.util.Scanner;

/**
 *
 * @author hudso
 */
public class Numeros {

    public static void main(String[] args) {
        int n, s=0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite um numero");
            n =teclado.nextInt();
            s = s + n;
    } while (resp.equals("S"));
}
