public class Food {
  
  private double price; 
  private int calories;

  // Parameterized Food constructor 
  public Food (double price, int calories) {
    this.price = price;
    this.calories = calories;
  }

  // Accessor method to get price of each Food object
  public double getPrice() {
    return this.price;
  }

  // Prints attributes of Food object
  public String toString() {
    String displayPrice = String.format("%.2f", this.price);        // This turns the price double into a number within a String formatted to 2 dec places
    return "\nPrice: $" + displayPrice + "\nCalories: " + this.calories + "\n";
  }
  
} 
