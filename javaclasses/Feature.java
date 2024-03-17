package javaclasses;
import java.util.List;

public class Feature {
  private String name;
  private String desc;
  private List<Boolean> slots;
  private String reset; // either "long rest" or "short rest"

  // METHOD: basic constructor
  // BEHAVIOR: creates a new Feature object with all the fields instantiates without 
  // any relevant values
  // RETURN: an "empty" Feature object
  // PARAMETERS: none!
  public Feature() {
    // TODO: make name, desc, and reset empty
    // TODO: make slots an empty list
  }

  // METHOD: more in-depth constructor

  public Feature(String name, String desc, List<Boolean> slots, String reset) {
    this.name = name;
    // TODO: etc.
  }

  // TODO: add more methods

  /////////////// Java Object Methods /////////////////////////

  // METHOD: returns a copy of the object
  @Override
  public Feature clone(){
    return this;
    // TODO
  }

  // METHOD: determines if two conditions are the same
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

  // METHOD: creates a String representation of the Feature object
  // with all the relevant information
  @Override
  public String toString() {
    // TODO
    return "";
  }

  //////////////// GETTERS AND SETTERS ///////////////////

  // Getter and Setter for 'name' field
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // Getter and Setter for 'desc' field
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  // Getter and Setter for 'slots' field
  public List<Boolean> getSlots() {
    return slots;
  }

  public void setSlots(List<Boolean> slots) {
    this.slots = slots;
  }

  // Getter and Setter for 'reset' field
  public String getReset() {
    return reset;
  }

  public void setReset(String reset) {
    this.reset = reset;
  }
}
