public class Pizza extends Food {
  private String pizzaSize;
  private double diameter;
  private String pepperoni;
  private String onions;
  private String hamburg;

  // Sets Pizza diameter according to pizzaSize
  private void setDiameter(String orderedPizzaSize) {
    if (orderedPizzaSize.equals("small")) {
      this.diameter = 8;
    }
    if (orderedPizzaSize.equals("medium")) {
      this.diameter = 12;
    }
    if (orderedPizzaSize.equals("large")) {
      this.diameter = 16;
    }
  }

  // Prints out toppings if ordered
  private void setToppings(boolean hasPepperoni, boolean hasOnions, boolean hasHamburg) {
    if (hasPepperoni) {
      this.pepperoni = "\nPepperoni";
    }
    else {
      this.pepperoni = "";
    }

    if (hasOnions) {
      this.onions = "\nOnions";
    }
    else {
      this.onions = "";
    }

    if (hasHamburg) {
      this.hamburg = "\nHamburg";
    }
    else {
      this.hamburg = "";
    }
  }

  // Paramaterized Pizza Constructor
  public Pizza(String orderedPizzaSize, boolean hasPepperoni, boolean hasOnions, boolean hasHamburg) {
    super(12.99, 2000);
    this.pizzaSize = orderedPizzaSize;
    setDiameter(orderedPizzaSize);
    setToppings(hasPepperoni, hasOnions, hasHamburg);
  }

  // Non-paramaterized Pizza Constructor
  public Pizza() {
    this("small", false, false, false);
  }

  // Prints Pizza attributes to string
  public String toString() {
   return "\nPizza (" + this.pizzaSize + ")\nDiameter: " + this.diameter + " inches" + this.pepperoni + this.onions + this.hamburg + super.toString();
   }
  
 }
