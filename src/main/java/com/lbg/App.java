package com.lbg;

import java.io.InputStream;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        ProductList allItems = new ProductList();
        ProductList basketItems = new ProductList();

        allItems.generate();

        ICustomPrompt thePrompt = new CustomPrompt();
        IntReader ir = new IntReader( thePrompt );
        StringReader sr = new StringReader(thePrompt);

        System.out.println("Please enter your option");
        System.out.println("1 : View all items");
        System.out.println("9: Quit");
        Scanner sc = new Scanner(System.in);

        for(int option = 0; option!=9; option=Integer.parseInt( ir.readFromKeyboard(sc, "Option: "))){
            switch (option){
                case 1:
                    System.out.println("\nView Items:");
                    allItems.display();
                    break;
                case 2:
                    System.out.println("Option 2");
                    System.out.println("Enter code: ");
                    String opted_item = sc.nextLine();
                    //TODO: Get the product with that code from allItems
                    //TODO: Ask user for quantity
                    //TODO: Cast that product to an item, with warranty being 0
                    //TODO: Add this item to the basketItems
                    //TODO: Lower the quantity remaining of product
                    //TODO: add in user input validation for making sure that product exists and has enough in stock
                    break;
                default:
                    break;
            }
            System.out.println("Please enter your option");
            System.out.println("1 : View all items");
            System.out.println("9: Quit");
        }
    }
}
