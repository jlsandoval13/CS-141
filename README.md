# CS-141
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static Sale sale = new Sale("Chips", 1.59);

    public static void main(String[] args)throws IOException
    {
        Scanner keyboard = new Scanner(System.in);
        Sale sale = new Sale("C", 1.59);
        int a;
        String b;
        double c;

        System.out.print("How many sales were made today?\nTotal Sales: ");
        a = keyboard.nextInt();
        keyboard.nextLine();
        int [] Sales = new int [a];
        String [] Sales1 = new String[a];
        int x = 0;
        int y = 0;

        while( x < a )
        {
            while( y < a )
            {
                if( y < a )
                {
                    if (x < a)
                    {
                        System.out.print("Enter the name of the item sold.\nItem: ");
                        b = keyboard.nextLine();
                        Sales1 = sale.setItemName(b);
                    }
                    System.out.print("Enter the price of the item sold.\nPrice: ");
                    c = keyboard.nextInt();
                    sale.setPrice(c);
                    keyboard.nextLine();
                }
                y++;
            }
            x++;
        }
        Options(Sales);
    }

    public static void Options(int[] Sales)throws IOException
    {
        Scanner keyboard = new Scanner(System.in);
        int k;

        do {
            System.out.println("\nOptions Menu.\nPlease make a selection from available options.");
            System.out.print("1. Total Sales For the Day\n2. Sales Display\n3. Specific Sale Display\n4. Sale Update\n5. Quit");
            System.out.print("( Enter a number from 1 - 5 )\n----> ");
            k = keyboard.nextInt();
            keyboard.nextLine();

            if( k == 1 )
            {
                int A = Sales.length;
                Daily(A);
            }
            else if( k == 2 )
            {
                int B = Sales.length;
                Display(B);
            }
            else if( k == 3 )
            {
                int A = keyboard.nextInt();
                System.out.print("Enter the sale you would like to see: ");
                SingleSale(A);
            }
            else if( k == 4 )
            {
                int B = keyboard.nextInt();
                System.out.print("Enter the sale you would like to modify: ");
                Update(B);
            }
            else if( k == 5 )
                Quit();
            else if( k != keyboard.nextInt() )
                System.out.print("Invalid input. Please make sure that your response is a numerical value.");
            else
                System.out.print("Invalid input. Please try again.");
        }while( k != 5);
    }

    public static void Daily(int A)
    { System.out.printf("Today's total amount of sales was %d", A); }

    public static void Display(int B)
    {
        for( int x = 0; x < B; x++ )
        {
            System.out.printf("Sale #%d:",x+1);
            System.out.print("\nItem Sold: " + sale.getItemName() + " Item Price: " + sale.getPrice() + "\n");
        }
    }

    public static void SingleSale(int A)
    {
        System.out.printf("Sale #%d has been selected.\n",A);
        int b = A - 1;

        while( b < A )
        { b++; }
        System.out.print("Item Sold: " + sale.getItemName() + "\nItem Price" + sale.getPrice() );
    }

    public static void Update(int B)
    {}

    public static int Quit()
    {
        System.out.print("The program has been ended.");
        return 0;
    }
}
