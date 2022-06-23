/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package programaidade;

import java.util.Scanner;

/**
 *
 * @author hudso
 */
public class ProgramaIdade {

    public static void main(String[] args) {
                Scanner t = new Scanner(System.in);
                System.out.println("Em que ano nasceu ?");
                int nasc = t.nextInt();
                int i = 2022-nasc;
                System.out.println("Sua idade é" + i);
                if(i>=18){
                    System.out.println("Maior de Idade");
                } else {
                    System.out.println("Menor de Idade");
                }
            
    }
}
