package com.lbg;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Keyboard Handler
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ProductList allItems = new ProductList();
        ProductList boughtItems = new ProductList();

        allItems.generate();

        System.out.println("Please enter your option");
        System.out.println("1 : View all items");
        System.out.println("9: Quit");
        Scanner sc = new Scanner(System.in);

        for(int option = 0; option!=9; option=sc.nextInt()){
            switch (option){
                case 1:
                    System.out.println("Option 1");
            }
            System.out.println("Please enter your option");
            System.out.println("1 : View all items");
            System.out.println("9: Quit");
        }

    }
}
