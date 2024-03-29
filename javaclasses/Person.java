package javaclasses;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class Person {
  // BASICS
  private String name;
  private int level;
  private Lineage lineage;
  private Map<RPGClass, Integer> classes;
  private int maxHP;
  private int currHP;

  // STATS
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

  // SKILLS
  private List<String> officialSkills;
  private Map<String, Integer> skillMod;

  // PROFICIENCIES
  private int proficiencyBonus;
  private List<String> officialProficiencies;
  private Map<String, List<String>> proficiencies;

  // INFORMATION
  private List<Spell> spells;
  private List<Gear> inventory;
  private List<Feature> features;


  // METHOD: CONSTRUCTOR OF "PERSON"
  // BEHAVIOR: creates an empty Person object, meaning that all data structures have been
  // created but hold no relevant values
  // RETURN: an "empty" Person object, with all data sturctures able to be added to
  // PARAMETERS: none!
  public Person() {
    // TODO: initialize all data structures
    // i.e. make empty Maps and Lists
    // create the "officialStats" and "officialSenses" lists and fill with values
  }

  // METHOD: more specific constructor, mostly for testing
  // BEHAVIOR: gives the relevant data structures values
  // RETURN: a fully instantiated Person object with no empty fields
  // PARAMETERS: as many as you want
  public Person(String name, int level) {
    this.name = name;
    this.level = level;
    // TODO
  }

  /////////////// CHARACTER CREATION ///////////////////////

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

  public void levelUp() {
    this.level++;
    if (this.level % 5 == 0) {
      promptMultiClass();
    }
  }

  public void promptMultiClass() {

  }
  
  public void setAllStats(int stat1, int stat2, int stat3, int stat4, int stat5) {
    // TODO: update stats
    // update HP
    // update senses
    // update initiative, etc.
  }

  public int rollInitiative() {
    Random r = new Random();
    int initiative = r.nextInt(1, 20);
    initiative += proficiencyBonus;
    return  initiative;
  }

  public void setStat(String name, int value) {
    this.stats.put(name, value);
    // TODO: update armor class
    // update HP
    // update senses
    // update initiative, etc.
  }
  
  public void addClass(RPGClass newClass) {
    // this.#class.set(newClass.name(), 1)
    // this.#spells.push(newClass.getAvailableSpells(1))
    // this.#features.push(newClass.getClassFeatures(1))
    // this.#inventory.push(newClass.startingInventory())

  }

/////////////// Java Object Methods /////////////////////////

  // METHOD: cloning method, returns a copy of the Person
  @Override
  public Person clone(){
    return this; 
    // TODO
  }

  // METHOD: determines if two Persons are the same by comparing relevant fields
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

  public Lineage getLineage() {
    return lineage;
  }

  public void setLineage(Lineage lineage) {
    this.lineage = lineage;
  }

  public Map<RPGClass, Integer> getClasses() {
    return classes;
  }

  public void setClasses(Map<RPGClass, Integer> classes) {
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

  public List<String> getOfficialSenses() {
    return officialSenses;
  }

  public void setOfficialSenses(List<String> officialSenses) {
    this.officialSenses = officialSenses;
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