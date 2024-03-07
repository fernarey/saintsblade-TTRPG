package javaclasses;
import java.util.Map;

public class Condition {
  private String name;
  private String desc;
  private Map<String, Integer> affectedSenses;

  // METHOD: basic constructor
  // initializes data structures
  public Condition() {
    // TODO
  }

  // METHOD: more in-depth constructor
  public Condition(String name, String desc, Map<String, Integer> affectedSenses) {
    // TODO
  }

  /////////////// Java Object Methods /////////////////////////

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

  /////////////// Getters and Setters /////////////////////////
  public String getName() { return name; }
  public void setName(String name) { this.name = name; }

  // Getter and Setter for desc
  public String getDesc() { return desc; }
  public void setDesc(String desc) { this.desc = desc; }

  // Getter and Setter for affectedSenses
  public Map<String, Integer> getAffectedSenses() { return affectedSenses; }
  public void setAffectedSenses(Map<String, Integer> affectedSenses) { this.affectedSenses = affectedSenses; }

}
