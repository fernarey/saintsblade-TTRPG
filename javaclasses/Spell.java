package javaclasses;
import java.util.List;

public class Spell {
  private String name;
  // TODO: add any other fields that you find necessary
  private String desc;
  private List<RPGClass> availableTo;
  private int level;
  private int range;
  private int castingTime;
  private int duration;
  private String save;
  private int[] damageRange;

  // METHOD: basic constructor
  // initializes data structures
  public Spell() {
    // TODO
  }

  // METHOD: more in-depth constructor
  public Spell(String name, String desc, List<RPGClass> slots) {
    // TODO
  }

  /////////////// Java Object Methods /////////////////////////

  // METHOD: returns a copy of the object
  @Override
  public Spell clone(){
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

// hmu whenever u want getter and setter methods
}
