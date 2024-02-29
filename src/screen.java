import java.util.Scanner;

public class screen {
    public static void main (String[] args) {
        Scanner scrn = new Scanner(System.in);

        double amount = 16.19;
        double amount_in_saving = 20000.00;

        System.out.println("Welcome to Well's Fargo please enter your Debit Card");
        String debit_card = scrn.nextLine();

        String password = "Enter";

        if (debit_card.equals(password)) {

            System.out.print("Enter Your pin: ");
            int pin = scrn.nextInt();

            System.out.println("With your $$$ will you be Depositing(1) or Transfer(2)");
            int atm = scrn.nextInt();

            switch (atm) {
                case(1):
                    System.out.print("How much will you be Depositing Today: ");


                    double amount_Adding = scrn.nextDouble();

                    double new_amount = amount_Adding + amount;

                    System.out.println("You added " + amount_Adding + " to " + new_amount);

                    break;


                case(2):
                    System.out.print("Will this go to Saving(1) or Parents(2):");
                    int moving_money = scrn.nextInt();

                    switch(moving_money) {
                        case (1):
                            System.out.print("How Much will be putting into your Savings:");

                            double saving = scrn.nextDouble();

                            double saving_amount = amount_in_saving + saving;

                            System.out.println("You now have $$$ " + saving_amount + " in your saving account");

                            break;


                        case (2):
                            System.out.println("From which account checking(1) or Saving(2)");

                            int account = 0;

                            switch (account) {
                                case(1):

                                    System.out.println("How much are you sending: $");

                                    double checking_to_parents = scrn.nextDouble();

                                    double to_parents = amount - checking_to_parents;

                                    if (to_parents <= 0.00) {
                                        System.out.println("You can't send money please take care of yourself");
                                    }
                                    else {
                                        System.out.println("You send this much $$$: " + to_parents + " to parents");
                                    }

                                case(2):

                                    System.out.println("How much will you be taking out of the saving account: $");

                                    double saving_to_parents = scrn.nextDouble();

                                    double to_parents_as_well = amount - saving_to_parents;

                                    if (amount_in_saving <= 0.00) {
                                        System.out.println("Another cash oh my god man stop");
                                    }
                                    else {
                                        System.out.println("You'll be sending: $" + to_parents_as_well + " to your parents");
                                    }


                            }

                            break;

                    }

                    break;

            }
        }
        System.out.println("It seems we can't detected your debit card");
    }
}