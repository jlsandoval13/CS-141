import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int a;
        String b = "";
        double c = 0.0;

        System.out.print("How many sales were made today?\nTotal Sales: ");
        a = keyboard.nextInt();
        keyboard.nextLine();
        int[] Sales = new int[a];
        int x = 0;
        int y = 0;

        Sale sale = new Sale(b, c);
        while (x < a) {
            while (y < a) {
                if (y < a) {
                    if (x < a) {
                        System.out.print("Enter the name of the item sold.\nItem: ");
                        b = keyboard.nextLine();
                        sale.setItemName(b);
                    }
                    System.out.print("Enter the price of the item sold.\nPrice: ");
                    c = keyboard.nextDouble();
                    sale.setPrice(c);
                    keyboard.nextLine();
                }
                y++;
            }
            x++;
        }
        Options(Sales, sale);
    }

    public static void Options(int[] Sales, Sale sale)throws IOException
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
                Display(B , sale);
            }
            else if( k == 3 )
            {
                int A;
                System.out.print("Enter the sale you would like to see: ");
                A = keyboard.nextInt();
                while( A != keyboard.nextInt() || A > Sales.length || A < Sales.length )
                {
                    if( Sales.length > A )
                        SingleSale(A, sale);
                    else
                        {
                            System.out.print("Enter the sale you would like to see: ");
                            A = keyboard.nextInt();
                        }
                }
                SingleSale(A, sale);
            }
            else if( k == 4 )
            {
                int B;
                System.out.print("Enter the sale you would like to update: ");
                B = keyboard.nextInt();
                while( B != keyboard.nextInt() || B > Sales.length || B < Sales.length )
                {
                    if( Sales.length > B )
                        Update(B, sale);
                    else
                    {
                        System.out.print("Enter the sale you would like to update: ");
                        B = keyboard.nextInt();
                    }
                }
                Update(B, sale);
            }
            else if( k == 5 )
                Quit();
            else if( k != keyboard.nextInt() )
                System.out.print("Invalid input. Please make sure that your response is a numerical value.");
            else
                System.out.print("Invalid input. Please try again.");
        }while( k != 5);
    }

    public static void Daily(int A)throws IOException
    { System.out.printf("Today's total amount of sales was %d", A); }

    public static void Display(int B, Sale sale)throws IOException
    {
        int x = 0;
        while( x < B )
        {
            System.out.printf("Sale #%d:",x+1);
            System.out.print("\nItem Sold: " + sale.getItemName() + " Item Price: " + sale.getPrice() + "\n");
            x++;
        }
    }

    public static void SingleSale(int A, Sale sale)throws IOException
    {
        System.out.printf("Sale #%d has been selected.\n",A);
        int b = 0;

        while( b < A )
        {
            sale.getItemName();
            sale.getPrice();
            b++;
        }
        System.out.print("Item Sold: " + sale.getItemName() + "\nItem Price" + sale.getPrice() );
    }

    public static void Update(int B, Sale sale)throws IOException
    {
        Scanner key = new Scanner(System.in);
        System.out.print("");
        int a = 0;
        double k;

        while( a < B )
        {
            sale.getItemName();
            sale.getPrice();
            a++;
        }
        System.out.print("What is the new price for " + sale.getItemName() + "?\nNew Price: ");
        k = key.nextDouble();
        sale.setPrice(k);
    }

    public static int Quit()
    {
        System.out.print("The program has been ended.");
        return 0;
    }
}
