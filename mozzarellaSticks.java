public class mozzarellaSticks extends Food {

  private int quantity;
  private boolean extraMarinaraSauce;

  // Non-Paramterized Constructor
  public mozzarellaSticks() {
    this(7, false);
  }
  
  // Paramaterized mozzarellaSticks constructor
  public mozzarellaSticks(int quantity, boolean extraMarinaraSauce) {
    super((1.99*quantity), (101*quantity));
    this.quantity = quantity;
    this.extraMarinaraSauce = extraMarinaraSauce;
  }


  // Prints the attributes of the mozzarellaSticks object
  public String toString() {
    if (this.extraMarinaraSauce) {
      return "\n" + this.quantity + " Mozzarella Sticks\nExtra Marinara Sauce" + super.toString();
    } 
  
    else {
      return "\n" + this.quantity + " Mozzarella Sticks" + super.toString();
    }
  }

}
