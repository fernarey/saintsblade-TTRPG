package javaclasses;
import java.util.List;

public class RPGClass {
  private String name;
  private List<Feature> classFeatures;
  private List<Spell> availableSpells;
  private List<Gear> startingInventory;

  // METHOD: basic constructor
  // initializes data structures
  public RPGClass() {
    // TODO
  }

  // METHOD: more in-depth constructor
  public RPGClass(String name, List<Feature> classFeatures, List<Spell> availableSpells, List<Gear> startingInventory) {
    // TODO
  }

  /////////////// Java Object Methods /////////////////////////

  // METHOD: cloning method
  // returns a copy of the character
  @Override
  public RPGClass clone(){
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

  /////////////// Getters and Setters /////////////////////////
  public String getName() { return name; }
  public void setName(String name) { this.name = name; }

  public List<Feature> getClassFeatures() { return classFeatures; }
  public void setClassFeatures(List<Feature> classFeatures) { this.classFeatures = classFeatures; }

  public List<Spell> getAvailableSpells() { return availableSpells; }
  public void setAvailableSpells(List<Spell> availableSpells) { this.availableSpells = availableSpells; }

  public List<Gear> getStartingInventory() { return startingInventory; }
  public void setStartingInventory(List<Gear> startingInventory) { this.startingInventory = startingInventory; }
}
