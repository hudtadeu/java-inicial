/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package testefuncao02;

/**
 *
 * @author hudso
 */
public class TesteFuncao02 {

    static int soma(int a, int b){
        int s = a + b;
        return s;
    }
    public static void main(String[] args) {
        System.out.println("Comecou o programa");
        int sm = soma(5,2);
        System.out.println("Soma vale " + sm);
    }
}
