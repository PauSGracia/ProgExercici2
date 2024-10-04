import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declare scanner
        Scanner input = new Scanner(System.in);
        //Ask if the user is a VIP
        System.out.println("Welcome to the Bike House");
        System.out.println("Are you a VIP?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int numVip = -1;
        double purchase = -1.0f;

        do {
            //Check if the input is a number or not
            if (input.hasNextInt())
            {
                numVip= input.nextInt();
                //If it's a number, check if it's between 1 and 2
                if (numVip != 1 && numVip != 2) {
                    //If it's not, ask again
                    System.out.println("That's not a valid number");
                }
            } else{
                //If it's not a number, ask again
                System.out.println("That's not a number");
            }
            //Clear input
            input.nextLine();
        } while(numVip != 1 && numVip != 2);

        System.out.println("How much is your purchase?");

        do {
            //Check if the input is a number or not
            if (input.hasNextInt())
            {
                purchase= input.nextInt();
                //If it's a number, check if it's between 1 and 10
                if (purchase < 0.0f) {
                    //If it's not, ask again
                    System.out.println("That's not a valid number");
                }
            } else{
                //If it's not a number, ask again
                System.out.println("That's not a number");
            }
            //Clear input
            input.nextLine();
        } while(purchase < 0.0f);

        //If the user is VIP or their purchase surpasses 200
        //then apply a 20% discount. If not we apply no discount
        if(numVip == 1 || purchase >= 200.0f)
        {
            System.out.println("You get 20% discount!");
            System.out.println("Your final price is: " + (purchase * 0.8f));
        } else {
            System.out.println("You get no discount");
            System.out.println("Your final price is: " + purchase );
        }


    }
}