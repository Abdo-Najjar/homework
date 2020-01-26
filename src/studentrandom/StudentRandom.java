/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentrandom;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author abdo
 */
public class StudentRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Student[] stdArray = null;
        boolean enteredLoop = false;

        while (true) {

            System.out.println("Enter the number of Students!");

            try {
                

                stdArray = new Student[scanner.nextInt()];
                

            } catch (NegativeArraySizeException | InputMismatchException e) {
                
                System.out.println("Invalid Number of Students!");
                continue;
                
            }

            for (int i = 0; i < stdArray.length; i++) {
                if (enteredLoop == false) {
                    
                    scanner.nextLine();

                    enteredLoop = true;
                }
                
                System.out.println("Enter the name of Sudent that id is" + (i + 1));
                stdArray[i] = new Student().setName(scanner.nextLine()).setId((i + 1)).setGpa(Math.random() * 100 + 0);
                
            }

            for (Student std : stdArray) {
                System.out.println(std);
            }

        }

    }

}
