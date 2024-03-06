import java.util.List;

public class Gear {
  private String name;
  private String desc;
  private int price;

  // METHOD: basic constructor
  // initializes data structures
  public Gear() {
    // TODO
  }

  // METHOD: more in-depth constructor
  public Gear(String name, String desc, int price) {
    // TODO
  }

  /////////////// Java Object Methods /////////////////////////

  // METHOD: returns a copy of the object
  @Override
  public Gear clone(){
    return this;
    // TODO
  }

  // METHOD: determines if two characters are the same
  @Override
  public boolean equals(Object other){
    return false;
    // TODO
  }

  // METHOD: allows for characters to be sorted in a list
  @Override
  public int hashCode() {
    // TODO
    return name.hashCode();
  }

  @Override
  public String toString() {
    // TODO
    return "";
  }

  // Getter and Setter methods for name field
  public String getName() { return name; }
  public void setName(String name) { this.name = name; }

  // Getter and Setter methods for desc field
  public String getDesc() { return desc; }
  public void setDesc(String desc) { this.desc = desc; }

  // Getter and Setter methods for price field
  public int getPrice() { return price; }
  public void setPrice(int price) { this.price = price; }

}
