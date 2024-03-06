import java.util.List;
import java.util.Map;

public class Feature {
  private String name;
  private String desc;
  private List<Boolean> slots;
  private String reset; // either "long rest" or "short rest"

  // METHOD: basic constructor
  // initializes data structures
  public Feature() {
    // TODO
  }

  // METHOD: more in-depth constructor
  public Feature(String name, String desc, List<Boolean> slots, String reset) {
    // TODO
  }

  /////////////// Java Object Methods /////////////////////////

  // METHOD: returns a copy of the object
  @Override
  public Feature clone(){
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

  // Getter and Setter for name
  public String getName() { return name; }
  public void setName(String name) { this.name = name; }

  // Getter and Setter for desc
  public String getDesc() { return desc; }
  public void setDesc(String desc) { this.desc = desc; }

  // Getter and Setter for slots
  public List<Boolean> getSlots() { return slots; }
  public void setSlots(List<Boolean> slots) { this.slots = slots; }

  // Getter and Setter for reset
  public String getReset() { return reset; }
  public void setReset(String reset) { this.reset = reset; }
}
