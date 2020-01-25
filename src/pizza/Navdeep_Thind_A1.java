package pizza;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This code represents pizza code
 *
 * @author navde
 */
public class Navdeep_Thind_A1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //all the variables
        // this int is used to loop whole program
        int loop1 = 0;

        // opt int is used to place order or exit
        int opt = 0;

        // this String is used to store users name
        String name = "";

        //this String is used to store users contact number
        String phone = "";

        // this int is used to ask user for number of pizza's user want to order
        int number = -1;

        // this int is used to store size of pizza 
        int sizeOfPizza = 0;

        //this int is used to store number of topping user wants
        int numberOfTopping = 0;

        //loops whole code
        while (loop1 == 0) {

            System.out.println("\nWhat you want to do\n");
            System.out.println("1. Create a new Order");
            System.out.println("2. Exit Application");

            // asking user to create a new order or exit
            do {
                try {
                    opt = in.nextInt();
                    in.nextLine();
                    break;
                } catch (InputMismatchException ex) {
                    System.out.println("Please Enter valid input");
                }
                in.nextLine();
            } while (true);

            // creating instace of class User
            User user = new User();

            // condition what user want to do
            switch (opt) {
                case 1:
                    // gathering user informtion
                    // asking for user's name
                    System.out.println("\nPlease enter your name");
                    do {
                        try {
                            name = in.nextLine();
                            break;
                        } catch (InputMismatchException ex) {
                            System.out.println("Please enter your name");
                        }
                    } while (true);
                    //asking for user's contact number
                    System.out.println("\nPlease Enter Your Contact Number");
                    do {
                        try {
                            phone = in.nextLine();
                            //condition if user enters wrong phone number
                            if (String.valueOf(phone).length() != 10) {
                                System.out.println("Error in Contact number.10 digits only. No country code required -");
                                int val = 0;
                                while (val == 0) {
                                    if (String.valueOf(phone).length() == 10) {
                                        phone = in.nextLine();
                                        val = 1;
                                    }
                                }//problem not able to get out even if entered correct number.
                            }
                            break;
                        } catch (InputMismatchException ex) {
                            System.out.println("Please enter valid input");
                        }
                        in.nextLine();
                    } while (true);

                    //how many pizza's you want to order and later used this number to create an array
                    System.out.println("\nPlease enter number of pizza's You Want To order");
                    do {
                        try {
                            number = in.nextInt();

                            in.nextLine();
                            break;
                        } catch (InputMismatchException ex) {
                            System.out.println("Please enter number of pizza's You Want To order");
                        }
                        in.nextLine();
                    } while (true);

                    //creat array for number of pizza's
                    String[] pizza = new String[number];

                    //creating a loop to populate array and and store details of each pizza
                    for (int i = 0; i < pizza.length; i++) {

                        //asking user to select size of each pizza
                        System.out.printf("\nPizza %d of %d Enter size :\n", i + 1, number);
                        System.out.printf(" 1 - for Small.\n 2 - for medium.\n 3 - for Large\n");
                        do {
                            try {
                                sizeOfPizza = in.nextInt();
                                in.nextLine();
                                break;
                            } catch (InputMismatchException ex) {
                                System.out.println("Please enter size of pizza (1-3)");
                            }
                            in.nextLine();
                        } while (true);

                        // input for number of toppings 
                        System.out.println("\nPlease enter number of topping");
                        do {
                            try {

                                numberOfTopping = in.nextInt();

                                in.nextLine();
                                break;
                            } catch (InputMismatchException ex) {
                                System.out.println("Please enter number of topping");
                            }
                            in.nextLine();
                        } while (true);

                        //this String is used to store name of topping
                        String[] topping = new String[numberOfTopping];

                        //populating array
                        // for loop because each pizza will have multiple toppings 
                        for (int j = 0; j < topping.length; j++) {

                            System.out.printf("Please enter %d topping\n", j + 1);
                            do {
                                try {
                                    topping[i] = in.nextLine();
                                    break;
                                } catch (InputMismatchException ex) {
                                    System.out.println("Please enter toppings you want");
                                }
                            } while (true);

                        }

                        // create instance of PizzaDetails class for toppings and size of the pizza
                        Pizza details = new Pizza(topping, sizeOfPizza);

                        //populating pizza array with size of pizza(s)
                        pizza[i] = details.finalSize(sizeOfPizza);

                    }

                    int layout = 0;
                    while (layout == 0) {

                        System.out.printf("\n1-View your order \n2-Compelete your order\n");
                        //aksing user to view or compelete order 
                        int choice;

                        do {
                            try {

                                choice = in.nextInt();

                                in.nextLine();
                                break;
                            } catch (InputMismatchException ex) {
                                System.out.println("Please enter number of topping");
                            }
                            in.nextLine();
                        } while (true);

                        switch (choice) {
                            case 1:
                                System.out.println("\nHere is your order :");
                                System.out.println(user.Contact(name, phone));
                                for (int i = 0; i < pizza.length; i++) {
                                    System.out.printf("\n%s pizza with %d topping(s)\n", pizza[i], numberOfTopping);
                                }
                              /*  for (int i = 0; i < pizza.length; i++) {
                                    for (int j = 0; j < pizza[i].getTopping().length; j++) {
                                        System.out.println("- " + pizza[i].getTopping()[j]);
                                    }
                                }*/

                                break;

                            case 2:
                                layout = 1;
                                System.out.printf("\nHi %s, your order of %d pizza(s) will be ready in %d minutes\n", user.getName(), number, (int) (10 + Math.random() * 20));
                                break;
                            default:
                                break;
                        }

                    }
                    break;

                case 2:
                    loop1 = 1;
                case 3:
                    if (opt > 2) {
                        loop1 = 0;
                        System.out.println("Please Enter 1 or 2");
                    }
                case 4:
                    if (opt > 1) {
                        loop1 = 0;
                        System.out.println("Please Enter 1 or 2");
                    }
                default:
                    System.out.println("BUT WHY !!!");

            }
        }
    }
}
