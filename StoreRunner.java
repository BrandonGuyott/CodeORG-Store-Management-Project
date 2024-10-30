import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object
    Scanner input = new Scanner(System.in);

    // Establishes a menu
    Menu menu = new Menu();

    // Initializes totalPrice and start intro 
    double totalPrice = 0;
    System.out.println("Welcome to Brandon's Italian Restaurant");
    menu.printMenu();

    // Begins the loop of logging orders
    String orderItem = input.nextLine();
    while (!orderItem.equals("stop")) {

      // If the user selects Pizza
      if (orderItem.equals("1")) {
        System.out.println("Would you like to customize your Pizza order? (y/n)");
        String customizeOrder = input.nextLine();
        
        if (customizeOrder.equals("y")) {
        // Initializes booleans
          boolean hasPepperoni = false;
          boolean hasOnions = false;
          boolean hasHamburg = false;

          // Input for determining pizza size and sets variable         
          System.out.println("Pizza size? (small, medium, large)");
          String pizzaSize = input.nextLine();

          // Input for pepperoni and sets boolean
          System.out.println("Has Pepperoni? (y/n)");
          String pepperoni = input.nextLine();
          if (pepperoni.equals("y")) {
            hasPepperoni = true;
          }

          // Input for onions and sets boolean
          System.out.println("Has Onions? (y/n)");
          String onions = input.nextLine();
          if (onions.equals("y")) {
            hasOnions = true;
          }

         // Input for onions and sets boolean
          System.out.println("Has Hamburg? (y/n)");
          String hamburg = input.nextLine();
          if (hamburg.equals("y")) {
            hasHamburg = true;
          }

          // Creates a Pizza object with desired toppings
          Pizza pizzaOrder = new Pizza(pizzaSize, hasPepperoni, hasOnions, hasHamburg);
          System.out.println(pizzaOrder.toString());
          totalPrice += pizzaOrder.getPrice();
          
        }
        // Default Pizza Order
        if (customizeOrder.equals("n")) {
          Pizza pizzaOrder = new Pizza();
          System.out.println(pizzaOrder.toString());
          totalPrice += pizzaOrder.getPrice();          
          
        }
      } // END OF PIZZA

      // If the user selects Pasta
      if (orderItem.equals("2")) {
        System.out.println("Would you like to customize your Pasta order? (y/n)");
        String customizeOrder = input.nextLine();

        if (customizeOrder.equals("y")) {
          boolean hasParmesan = false;

          // Input for pasta type and sets variable
          System.out.println("Type of Pasta? (Linguine or Ziti)");
          String pastaType = input.nextLine();

          // Input for parmesan and sets boolean
          System.out.println("Has parmesan cheese? (y/n)");
          String parmesan = input.nextLine();
          if (parmesan.equals("y")) {
            hasParmesan = true;
          }

          // Creates Pasta object with desired attributes
          Pasta pastaOrder = new Pasta(pastaType, hasParmesan);
          System.out.println(pastaOrder.toString());
          totalPrice += pastaOrder.getPrice();   
          
        }
        // Default Pasta Order
        if (customizeOrder.equals("n")) {
          Pasta pastaOrder = new Pasta();
          System.out.println(pastaOrder.toString());
          totalPrice += pastaOrder.getPrice();   
        }
      } // END OF PASTA
      
      // If the user selects Mozzarella Sticks
      if (orderItem.equals("3")) {
        System.out.println("Would you like to customize your Mozzarella Sticks order? (y/n)");
        String customizeOrder = input.nextLine();

        if (customizeOrder.equals("y")) {
          boolean hasMarinaraSauce = false;

          // Input for quantity of mozzarella sticks and sets variable
          System.out.println("How many mozzarella sticks? ");
          int quantity = input.nextInt();
          input.nextLine(); // This is necessary as nextInt does not go to a new line after reading
          
          // Input for extra marinara sauce and sets boolean
          System.out.println("Extra marinara sauce? (y/n)");
          String sauce = input.nextLine();
          if (sauce.equals("y")) {
            hasMarinaraSauce = true;
          }

          // Creates mozzarellaSticks object with desired attributes
          mozzarellaSticks mozzOrder = new mozzarellaSticks(quantity, hasMarinaraSauce);
          System.out.println(mozzOrder.toString());
          totalPrice += mozzOrder.getPrice();   

        }
        // Default Mozzarella Sticks order
        if (customizeOrder.equals("n")) {
          mozzarellaSticks mozzOrder = new mozzarellaSticks();
          System.out.println(mozzOrder.toString());
          totalPrice += mozzOrder.getPrice();   
        }
      } // END OF MOZZARELLA STICKS

      if (orderItem.equals("4")) {
        System.out.println("Would you like to customize your Garlic Bread order? (y/n)");
        String customizeOrder = input.nextLine();

        if (customizeOrder.equals("y")) {
          boolean hasCheese = false;

          // Input for cheese and sets boolean
          System.out.println("Cheese? (y/n)");
          String cheese = input.nextLine();
          if (cheese.equals("y")) {
            hasCheese = true;
          }  

          // Creates garlicBread object with or without cheese based on user input
          garlicBread garlicBreadOrder = new garlicBread(hasCheese);
          System.out.println(garlicBreadOrder.toString());
          totalPrice += garlicBreadOrder.getPrice();  
        }
        // Default Garlic Bread Order
        if (customizeOrder.equals("n")) {
          garlicBread garlicBreadOrder = new garlicBread();
          System.out.println(garlicBreadOrder.toString());
          totalPrice += garlicBreadOrder.getPrice();  
        }
        
     } // END OF GARLIC BREAD
      menu.printMenu();
      orderItem = input.nextLine();
    }


    // Closes the Scanner object
    input.close();

    // Prints total price and closes program
    System.out.println("\nYour total is: $" + String.format("%.2f", totalPrice));
    System.out.println("Thank you ordering from Brandon's Italian Restaurant!");
    
  }
}
