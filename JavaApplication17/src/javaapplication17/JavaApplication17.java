/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author HUGO
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] listValues = new int[6];
        listValues[0] = 15;
        listValues[1] = 10;
        listValues[2] = 20;
        listValues[3] = 5;
        listValues[4] = 35;
        listValues[5] = 14;
        int i = 0, pos = 0, Max = listValues[0];

        while (i < listValues.length) {
            if (Max <= listValues[i]) {
                Max = listValues[i];
                pos = i;
            }
            i++;
        }
        System.out.println("La valeur maximale est: " + Max + " et occupe la position: " + pos);
        System.out.println();
    }

}
