public class garlicBread extends Food {
  
  private boolean hasCheese;
  
  // Paramaterized Constructor
  public garlicBread(boolean hasCheese) {
    super(9.99, 532);
    this.hasCheese = hasCheese;
  }

  // Non-paramaterized constructor
  public garlicBread() {
    this(false);
  }

  // Prints attributes of the garlicBread object
  public String toString() {
    if (this.hasCheese) {
      return "\nGarlic Bread with Cheese" + super.toString();
    }
    else {
      return "\nGarlic Bread" + super.toString();
    }
  }
  
}
