class RPGClass {
  #name
  #classFeatures
  #availableSpells
  #startingInventory

  constructor() {
    this.#name = ""
    this.#classFeatures = new Map()
    this.#availableSpells = new Map()
    this.#startingInventory = new Array()
  }

  constructor(name, classFeatures, availableSpells, startingInventory) {
    this.#name = name;
    this.#classFeatures = classFeatures;
    this.#availableSpells = availableSpells;
    this.#startingInventory = startingInventory;
  }

  // Getter and setter for name
  get name() { return this.#name; }
  set name(value) { this.#name = value; }

  // Getter and setter for classFeatures
  get classFeatures() { return this.#classFeatures; }
  getClassFeatures(level) { return this.#classFeatures.get(level) }
  set classFeatures(value) { this.#classFeatures = value; }
  addClassFeature(level, value) { this.#classFeatures.set(level, new Array(value)) }
  setLevelFeatures(level, arr) { this.#classFeatures.set(level, arr) }

  // Getter and setter for availableSpells
  get availableSpells() { return this.#availableSpells; }
  getAvailableSpells(level) { return this.#availableSpells.get(level) }
  set availableSpells(value) { this.#availableSpells = value; }
  addAvailableSpells(level, value) { this.#availableSpells.set(level, new Array(value)) }
  setAvailableSpells(level, arr) { this.#availableSpells.set(level, arr) }


  // Getter and setter for startingInventory
  get startingInventory() { return this.#startingInventory; }
  set startingInventory(value) { this.#startingInventory = value; }
  addStartingInventory(value) { this.#startingInventory.push(value) }
}

// Export the class
export default RPGClass;