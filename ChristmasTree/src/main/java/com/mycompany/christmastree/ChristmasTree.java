/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.christmastree;

/**
 *
 * @author EYC
 */
public class ChristmasTree {

    public static void main(String[] args) {
        int height = 20; // height of the tree
        int spaces = height - 1;

        // Loop for each row
        for (int i = 0; i < height; i++) {

            // print spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int k = 0; k < (i * 2) + 1; k++) {
                System.out.print("*");
            }

            // move to the next line
            System.out.println();

            // decrease spaces for the next row
            spaces--;
        }

        // print trunk
        int trunkSpaces = height - 17; // Adjust trunk length here
        for (int i = 0; i < trunkSpaces; i++) {
            for (int j = 0; j < height - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}