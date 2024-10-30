public class Pasta extends Food {
  
  private String pastaType;
  private boolean hasParmesanCheese;

  // Paramaterized Pasta Constructor
  public Pasta(String pastaType, boolean hasParmesanCheese) {
    super(13.99, 221);
    this.pastaType = pastaType;
    this.hasParmesanCheese = hasParmesanCheese;
  }

  // Non-paramaterized Pasta Constructor
  public Pasta() {
    this("Linguine", false);
  }

  // Returns Pasta object attributes
  public String toString() {
    if (hasParmesanCheese) {
      return "\nPasta: " + this.pastaType + " with parmesan cheese" + super.toString();
    }
    else {
      return "\nPasta: " + this.pastaType + super.toString(); 
    }
  }
}
