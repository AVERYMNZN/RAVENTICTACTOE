/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.raventictactoe;

import java.util.Scanner;

/**
 *
 * @author avery
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("[1] - Rock");
        System.out.println("[2] - Paper");
        System.out.println("[3] - Scissors");
        System.out.print("Enter player 1: ");
        int x = input.nextInt();
        System.out.print("Enter player 2: ");
        int y = input.nextInt();

        if (x == 1 && y == 2) {
            System.out.println("Player 2 wins!");
        } else if (x == 1 && y == 3) {
            System.out.println("Player 1 wins!");
        } else if (x == 2 && y == 1) {
            System.out.println("Player 1 wins!");
        } else if (x == 2 && y == 3) {
            System.out.println("Player 2 wins!");
        } else if (x == 3 && y == 1) {
            System.out.println("Player 2 wins!");
        } else if (x == 3 && y == 2) {
            System.out.println("Player 1 wins!");
        } else if (x == y) {
            System.out.println("It's a draw!");
        } else {
            System.out.println("Invalid input. Please choose 1, 2, or 3.");
        }
    }
}
