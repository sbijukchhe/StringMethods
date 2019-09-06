/*
Create a program that will allow users to enter a word, and a character number index. Your program will print out the
size of the word, as well as the substring (starting from 0) to the index the user specified. If the user entered index
is larger than the size of the word, the program will print "Index is larger than length".
 */

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.io.IOException;
import java.util.Scanner;

public class StringMethod {

    public static void main(String[] args) {

        String text;
        int index;
        Scanner input = new Scanner(System.in);

        System.out.println("\n*************************************");
        System.out.println("Please enter a word");
        System.out.println("\n*************************************");

        text = input.next();

        while (!text.equalsIgnoreCase("n")) {

            System.out.println("*************************************");
            System.out.println("\nPlease enter a number as an index");
            System.out.println("\n*************************************");

            index = input.nextInt();

            System.out.println("       The amount of characters in " + text + " is : " + text.length());

            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("       The section of word " + text + " from index 0 to " + index + " is : " + text.substring(0, index));

            System.out.println("----------------------------------------------------------------------");
            System.out.println("       The character at index " + index + " is : " + text.charAt(index));

            System.out.println("-----------------------------------------------");
            System.out.println("\nDo you want to check other words? (Y/N)");
            System.out.println("If YES. Please enter a word");
            text = input.next();
            System.out.println("------------------------------------------");
        }
    }
}
