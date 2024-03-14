package javaclasses;

import java.util.List;
import java.util.Map;

public class Person {
  // basic information
  private String name;
  private int level;
  private Map<RPGClass, Integer> classes;
  private int maxHP;
  private int currHP;

  // stats
  private List<String> officialStats;
  private Map<String, Integer> stats;
  private Map<String, Integer> savingThrowMod;
  private List<String> officialSenses;
  private Map<String, Integer> senses;
  private int traversalSpeed;
  private int initiative;
  private int armorClass;
  private boolean inspiration;
  private List<Condition> currConditions;

  // skills
  private List<String> officialSkills;
  private Map<String, Integer> skillMod;

  // proficiencies
  private int proficiencyBonus;
  private List<String> officialProficiencies;
  private Map<String, List<String>> proficiencies;

  // available information
  private List<Spell> spells;
  private List<Gear> inventory;
  private List<Feature> features;


  // METHOD: basic constuctor, takes no inputs
  public Person() {
    // TODO
  }

  // METHOD: more specific constructor, mostly for testing
  public Person(String name, int level) {
    this.name = name;
    this.level = level;
    // TODO
  }

  // TODO: add more methods such as
  public int takeDamage(int damageTaken) {
    if (damageTaken >= currHP) {
      currHP = 0;
      return this.currHP;
    }
    currHP -= damageTaken;
    return this.currHP;
  }
  
  public int heal(int damageHealed) {
    if (damageHealed > maxHP) {
      int maxHeal = maxHP - damageHealed;
      damageHealed = maxHP;
    }
    currHP = this.currHP + damageHealed;
    return this.currHP;
  }

/////////////// Java Object Methods /////////////////////////

  // METHOD: cloning method
  // returns a copy of the Person
  @Override
  public Person clone(){
    return this; 
    // TODO
  }

  // METHOD: determines if two Persons are the same
  @Override
  public boolean equals(Object other){
    return false;
    // TODO
  }

  // METHOD: allows for Persons to be sorted in a list
  @Override
  public int hashCode() {
    return name.hashCode()+level;
  }

  @Override
  public String toString() {
    String result = "Person{ "+name;
    for (RPGClass c : this.classes.keySet()) {
      result += " "+c+this.classes.get(c)+" /";
    }
    result = result.substring(0, result.length()-2);
    return result;
  }

/////////////// Getters and Setters /////////////////////////
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public int getLevel() {
    return level;
  }
  public void setLevel(int level) {
    this.level = level;
  }

  public Map<RPGClass, Integer> getClasses() {
    return classes;
  }
  public void setClass(Map<RPGClass, Integer> classes) {
    this.classes = classes;
  }
  
  public int getMaxHP() {
    return maxHP;
  }
  public void setMaxHP(int maxHP) {
    this.maxHP = maxHP;
  }

  public int getCurrHP() {
    return currHP;
  }
  public void setCurrHP(int currHP) {
    this.currHP = currHP;
  }

  public List<String> getOfficialStats() {
    return officialStats;
  }
  public void setOfficialStats(List<String> officialStats) {
    this.officialStats = officialStats;
  }

  public Map<String, Integer> getStats() {
    return stats;
  }
  public void setStats(Map<String, Integer> stats) {
    this.stats = stats;
  }

  public Map<String, Integer> getSavingThrowMod() {
    return savingThrowMod;
  }
  public void setSavingThrowMod(Map<String, Integer> savingThrowMod) {
    this.savingThrowMod = savingThrowMod;
  }

  public Map<String, Integer> getSenses() {
    return senses;
  }
  public void setSenses(Map<String, Integer> senses) {
    this.senses = senses;
  }

  public int getTraversalSpeed() {
    return traversalSpeed;
  }
  public void setTraversalSpeed(int traversalSpeed) {
    this.traversalSpeed = traversalSpeed;
  }

  public int getInitiative() {
    return initiative;
  }
  public void setInitiative(int initiative) {
    this.initiative = initiative;
  }

  public int getArmorClass() {
    return armorClass;
  }
  public void setArmorClass(int armorClass) {
    this.armorClass = armorClass;
  }

  public boolean isInspiration() {
    return inspiration;
  }
  public void setInspiration(boolean inspiration) {
    this.inspiration = inspiration;
  }

  public List<Condition> getCurrConditions() {
    return currConditions;
  }
  public void setCurrConditions(List<Condition> currConditions) {
    this.currConditions = currConditions;
  }

  public List<String> getOfficialSkills() {
    return officialSkills;
  }
  public void setOfficialSkills(List<String> officialSkills) {
    this.officialSkills = officialSkills;
  }

  public Map<String, Integer> getSkillMod() {
    return skillMod;
  }
  public void setSkillMod(Map<String, Integer> skillMod) {
    this.skillMod = skillMod;
  }

  public int getProficiencyBonus() {
    return proficiencyBonus;
  }
  public void setProficiencyBonus(int proficiencyBonus) {
    this.proficiencyBonus = proficiencyBonus;
  }

  public List<String> getOfficialProficiencies() {
    return officialProficiencies;
  }
  public void setOfficialProficiencies(List<String> officialProficiencies) {
    this.officialProficiencies = officialProficiencies;
  }

  public Map<String, List<String>> getProficiencies() {
    return proficiencies;
  }
  public void setProficiencies(Map<String, List<String>> proficiencies) {
    this.proficiencies = proficiencies;
  }

  public List<Spell> getSpells() {
    return spells;
  }
  public void setSpells(List<Spell> spells) {
    this.spells = spells;
  }

  public List<Gear> getInventory() {
    return inventory;
  }
  public void setInventory(List<Gear> inventory) {
    this.inventory = inventory;
  }

  public List<Feature> getFeatures() {
    return features;
  }
  public void setFeatures(List<Feature> features) {
    this.features = features;
  }

}
