class Person {
  #name
  #age
  #desc
  #level
  #class
  #maxHP
  #currHP

  // Specialties
  #officialStats
  #stats
  #savingThrowMod
  #traversal
  #arcaneBonus
  #physicalBonus
  #currConditions

  // specialities
  #officialSpecialties
  #proficientSpecialties
  #specialtyMod

  // proficiencies
  #proficiencyBonus
  #officialProficiencies 
  // like armor, etc.
  #proficiencies

  // available information
  #spells
  #inventory
  #features

  constructor(){
      this.#name = ""
      this.#age = 0
      this.#desc = ""
      this.#level = 0
      this.#class = new RPGClass()
      this.#maxHP = 0
      this.#currHP = 0

      // Specialties 
      this.#officialStats = new Array("BRILLIANCE", "TEMPERAMENT", "ATHLETICISM", "FORTITUDE", "SUPERSTITION")
      this.#stats = new Map()
      this.#savingThrowMod = new Map()
      for (const Specialty of this.#officialStats) {
        this.#stats.set(Specialty, 10)
        this.#savingThrowMod.set(Specialty, 0)
      }
      this.#traversal = 30
      this.#arcaneBonus = 0
      this.#physicalBonus = 0
      this.#currConditions = new Array()

      // specialty
      this.#officialSpecialties = new Array("Conversation", "Inconspicuity", "Recollection", "Inspection", "Reminiscence", "Reactivity", "Performance", "Agility", "Endurance", "Discipline")
      this.#proficientSpecialties = new Array()
      this.#specialtyMod = new Map()
      for (const skill of this.#officialSpecialties) {
        this.#specialtyMod.set(skill, 0)
      }

      // proficiencies
      this.#proficiencyBonus = 0
      this.#officialProficiencies = new Array("Armor", "Weapons", "Tools", "Languages")
      this.#proficiencies = new Map()
      for (const prof of this.#officialProficiencies) {
        this.#proficiencies.set(prof, new Array())
      }

      // available information
      this.#spells = new Array()
      this.#inventory = new Array()
      this.#features = new Array()
  }

  setAllStats(stat1, stat2, stat3, stat4, stat5) {
    this.#stats.set(this.#officialStats[0], stat1)
    this.#stats.set(this.#officialStats[1], stat2)
    this.#stats.set(this.#officialStats[2], stat3)
    this.#stats.set(this.#officialStats[3], stat4)
    this.#stats.set(this.#officialStats[4], stat5)
    console.log(this.#stats)
    // TODO: update armor class
    // update HP
    // update senses
    // update initiative, etc.
  }

  setStat(name, value) {
    this.#stats.set(name, value)
    // TODO: update armor class
    // update HP
    // update senses
    // update initiative, etc.
  }

  addClass(newClass) {
    this.#class.set(newClass.name(), 1)
    this.#spells.push(newClass.getAvailableSpells(1))
    this.#features.push(newClass.getClassFeatures(1))
    this.#inventory.push(newClass.startingInventory())
  }

  levelUp(currClass) {
    this.#class.set(currClass.name(), this.#class.get(currClass) + 1)
    console.log(this.#class)
    this.#spells.push(newClass.getAvailableSpells(this.#class.get(currClass) + 1))
    console.log(this.#spells)
    this.#features.push(newClass.getClassFeatures(this.#class.get(currClass) + 1))
    console.log(this.#features)
    this.#level = sumArray(this.#class.values())
    if (this.#level % 2 == 0) {
      this.#proficiencyBonus += 1
      this.updateSkills()
    } 
    console.log(this.#specialtyMod)
  }

  updateSkills() {
    for (const skill of this.#proficientSpecialties) {
      this.#specialtyMod.set(skill, this.#specialtyMod.get(skill) + this.#proficiencyBonus)
    }
  }

  addToInventory(gear) {
    this.#inventory.push(gear)
    console.log(this.#inventory)
  }

  // Getter functions
  // Getter functions
  getName = () => this.#name;
  getLevel = () => this.#level;
  getClasses = () => this.#class;
  getMaxHP = () => this.#maxHP;
  getCurrHP = () => this.#currHP;
  getOfficialStats = () => this.#officialSpecialties;
  getStats = () => this.#stats;
  getSavingThrowMod = () => this.#savingThrowMod;
  getTraversal = () => this.#traversal;
  getArcaneBonus = () => this.#arcaneBonus;
  getPhysicalBonus = () => this.#physicalBonus;
  getCurrConditions = () => this.#currConditions;
  getOfficialSpecialties = () => this.#officialSpecialties;
  getProficientSpecialties = () => this.#proficientSpecialties;
  getSpecialtyMod = () => this.#specialtyMod;
  getProficiencyBonus = () => this.#proficiencyBonus;
  getOfficialProficiencies = () => this.#officialProficiencies;
  getProficiencies = () => this.#proficiencies;
  getSpells = () => this.#spells;
  getInventory = () => this.#inventory;
  getFeatures = () => this.#features;

  // Setter functions
  setName = (name) => this.#name = name;
  setLevel = (level) => this.#level = level;
  setMaxHP = (maxHP) => this.#maxHP = maxHP;
  setCurrHP = (currHP) => this.#currHP = currHP;
  setOfficialStats = (officialStats) => this.#officialSpecialties = officialSpecialties;
  setStats = (stats) => this.#stats = stats;
  setSavingThrowMod = (savingThrowMod) => this.#savingThrowMod = savingThrowMod;
  setTraversal = (traversal) => this.#traversal = traversal;
  setArcaneBonus = (arcaneBonus) => this.#arcaneBonus = arcaneBonus;
  setPhysicalBonus = (physicalBonus) => this.#physicalBonus = physicalBonus;
  setCurrConditions = (currConditions) => this.#currConditions = currConditions;
  setOfficialSpecialties = (officialSpecialties) => this.#officialSpecialties = officialSpecialties;
  setProficientSpecialties = (proficientSpecialties) => this.#proficientSpecialties = proficientSpecialties;
  setSpecialtyMod = (specialtyMod) => this.#specialtyMod = specialtyMod;
  setProficiencyBonus = (proficiencyBonus) => this.#proficiencyBonus = proficiencyBonus;
  setOfficialProficiencies = (officialProficiencies) => this.#officialProficiencies = officialProficiencies;
  setProficiencies = (proficiencies) => this.#proficiencies = proficiencies;
  setSpells = (spells) => this.#spells = spells;
  setInventory = (inventory) => this.#inventory = inventory;
  setFeatures = (features) => this.#features = features;
}