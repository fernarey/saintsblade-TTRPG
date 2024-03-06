import java.util.List;

public class Spell {
  private String name;
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

  // Getters
  public String getName() { return name; }
  public String getDesc() { return desc; }
  public List<RPGClass> getAvailableTo() { return availableTo; }
  public int getLevel() { return level; }
  public int getRange() { return range; }
  public int getCastingTime() { return castingTime; }
  public int getDuration() { return duration; }
  public String getSave() { return save; }
  public int[] getDamageRange() { return damageRange; }

  // Setters
  public void setName(String name) { this.name = name; }
  public void setDesc(String desc) { this.desc = desc; }
  public void setAvailableTo(List<RPGClass> availableTo) { this.availableTo = availableTo; }
  public void setLevel(int level) { this.level = level; }
  public void setRange(int range) { this.range = range; }
  public void setCastingTime(int castingTime) { this.castingTime = castingTime; }
  public void setDuration(int duration) { this.duration = duration; }
  public void setSave(String save) { this.save = save; }
  public void setDamageRange(int[] damageRange) { this.damageRange = damageRange; }
}
