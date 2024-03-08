class Character{
  #name
  #level
  #classes
  #maxHP
  #currHP

  // stats
  #officialStats
  #stats
  #savingThrowMod
  #officialSenses
  #senses
  #walkingSpeed
  #initiative
  #armorClass
  #inspiration
  #currConditions

  // skills
  #officialSkills
  #proficientSkills
  #skillMod

  // proficiencies
  #proficiencyBonus
  #officialProficiencies
  #proficiencies

  // available information
  #spells
  #inventory
  #features

  constructor(){
      this.#name = ""
      this.#level = 0
      this.#classes = new Map()
      this.#maxHP = 0
      this.#currHP = 0
      this.#armorClass = 10

      // stats 
      this.#officialStats = new Array("STAT1", "STAT2")
      this.#stats = new Map()
      this.#savingThrowMod = new Map()
      for (const stat of this.#officialStats) {
        this.#stats.set(stat, 10)
        this.#savingThrowMod.set(stat, 10)
      }
      this.#officialSenses = new Array("passive X")
      this.#senses = new Map()
      for (const sense of this.#officialSenses) {
        this.#senses.set(sense, 10)
      }
      this.#walkingSpeed = 30
      this.#initiative = 0
      this.#armorClass = 10
      this.#inspiration = false
      this.#currConditions = new Array()

      // skills
      this.#officialSkills = new Array("SKILL1", "SKILL2")
      this.#proficientSkills = new Array()
      this.#skillMod = new Map()
      for (const skill of this.#officialSkills) {
        this.#skillMod.set(skill, 0)
      }

      // proficiencies
      this.#proficiencyBonus = 0
      this.#officialProficiencies = new Array("PROF1", "PROF2")
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
    this.#classes.set(newClass.name(), 1)
    this.#spells.push(newClass.getAvailableSpells(1))
    this.#features.push(newClass.getClassFeatures(1))
    this.#inventory.push(newClass.startingInventory())
  }

  levelUp(currClass) {
    this.#classes.set(currClass.name(), this.#classes.get(currClass) + 1)
    console.log(this.#classes)
    this.#spells.push(newClass.getAvailableSpells(this.#classes.get(currClass) + 1))
    console.log(this.#spells)
    this.#features.push(newClass.getClassFeatures(this.#classes.get(currClass) + 1))
    console.log(this.#features)
    this.#level = sumArray(this.#classes.values())
    if (this.#level % 2 == 0) {
      this.#proficiencyBonus += 1
      this.updateSkills()
    } 
    console.log(this.#skillMod)
  }

  updateSkills() {
    for (const skill of this.#proficientSkills) {
      this.#skillMod.set(skill, this.#skillMod.get(skill) + 1)
    }
  }

  addToInventory(gear) {
    this.#inventory.push(gear)
    console.log(this.#inventory)
  }

  // Getter functions
  getName = () => this.#name;
  getLevel = () => this.#level;
  getClasses = () => this.#classes;
  getMaxHP = () => this.#maxHP;
  getCurrHP = () => this.#currHP;
  getOfficialStats = () => this.#officialStats;
  getStats = () => this.#stats;
  getSavingThrowMod = () => this.#savingThrowMod;
  getOfficialSenses = () => this.#officialSenses;
  getSenses = () => this.#senses;
  getWalkingSpeed = () => this.#walkingSpeed;
  getInitiative = () => this.#initiative;
  getArmorClass = () => this.#armorClass;
  getInspiration = () => this.#inspiration;
  getCurrConditions = () => this.#currConditions;
  getOfficialSkills = () => this.#officialSkills;
  getProficientSkills = () => this.#proficientSkills;
  getSkillMod = () => this.#skillMod;
  getProficiencyBonus = () => this.#proficiencyBonus;
  getOfficialProficiencies = () => this.#officialProficiencies;
  getProficiencies = () => this.#proficiencies;
  getSpells = () => this.#spells;
  getInventory = () => this.#inventory;
  getFeatures = () => this.#features;

  // Setter functions
  setName = (name) => this.#name = name;
  setLevel = (level) => this.#level = level;
  setClasses = (classes) => this.#classes = classes;
  setMaxHP = (maxHP) => this.#maxHP = maxHP;
  setCurrHP = (currHP) => this.#currHP = currHP;
  setOfficialStats = (officialStats) => this.#officialStats = officialStats;
  setStats = (stats) => this.#stats = stats;
  setSavingThrowMod = (savingThrowMod) => this.#savingThrowMod = savingThrowMod;
  setOfficialSenses = (officialSenses) => this.#officialSenses = officialSenses;
  setSenses = (senses) => this.#senses = senses;
  setWalkingSpeed = (walkingSpeed) => this.#walkingSpeed = walkingSpeed;
  setInitiative = (initiative) => this.#initiative = initiative;
  setArmorClass = (armorClass) => this.#armorClass = armorClass;
  setInspiration = (inspiration) => this.#inspiration = inspiration;
  setCurrConditions = (currConditions) => this.#currConditions = currConditions;
  setOfficialSkills = (officialSkills) => this.#officialSkills = officialSkills;
  setProficientSkills = (proficientSkills) => this.#proficientSkills = proficientSkills;
  setSkillMod = (skillMod) => this.#skillMod = skillMod;
  setProficiencyBonus = (proficiencyBonus) => this.#proficiencyBonus = proficiencyBonus;
  setOfficialProficiencies = (officialProficiencies) => this.#officialProficiencies = officialProficiencies;
  setProficiencies = (proficiencies) => this.#proficiencies = proficiencies;
  setSpells = (spells) => this.#spells = spells;
  setInventory = (inventory) => this.#inventory = inventory;
  setFeatures = (features) => this.#features = features;
}

export default Character;