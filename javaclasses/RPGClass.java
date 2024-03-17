package javaclasses;
import java.util.Map;
import java.util.List;

public class RPGClass {
  private String name;
  private Map<Integer, List<Feature>> classFeatures;
  private Map<Integer, List<Spell>> availableSpells;
  private List<Gear> startingInventory;

  // METHOD: basic constructor
  // initializes data structures
  public RPGClass() {
    // TODO
  }

  // METHOD: more in-depth constructor
  public RPGClass(String name, Map<Integer, List<Feature>> classFeatures, Map<Integer, List<Spell>> availableSpells, List<Gear> startingInventory) {
    // TODO
  }

  // TODO: methods such as 
  public List<Feature> featuresAt(int level) {
    return this.classFeatures.get(level);
  }

  public void /* THIS IS WRONG */ spellsAt(int level) {

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
  // Getter and Setter methods for name field
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // Getter and Setter methods for classFeatures field
  public Map<Integer, List<Feature>> getClassFeatures() {
    return classFeatures;
  }

  public void setClassFeatures(Map<Integer, List<Feature>> classFeatures) {
    this.classFeatures = classFeatures;
  }

  // Getter and Setter methods for availableSpells field
  public Map<Integer, List<Spell>> getAvailableSpells() {
    return availableSpells;
  }

  public void setAvailableSpells(Map<Integer, List<Spell>> availableSpells) {
    this.availableSpells = availableSpells;
  }

  // Getter and Setter methods for startingInventory field
  public List<Gear> getStartingInventory() {
    return startingInventory;
  }

  public void setStartingInventory(List<Gear> startingInventory) {
    this.startingInventory = startingInventory;
  }
}
