---
runme:
  id: 01HR866509FK362ZP4BYPYF171
  version: v3
---

# Brightrealm TTRPG

Brightrealm University is a a fantasy-inspired TTRPG based on the experiences of academia.

# File Structure

🇲🇽 denotes files/folders that Reyna should be editing

```md {"id":"01HRFGHRNF44YTBA5C1B3C9B5G"}
brightrealmTTRPG
├── .idea 
├── 🇲🇽 javaclasses 
│   ├── 🇲🇽 characters (all subclasses of Person)
│   │   ├── 🇲🇽 Player.java
│   │   ├── 🇲🇽 NPC.java
│   │   ├── 🇲🇽 Creature.java
│   │   ├── 🇲🇽 Monster.java
│   ├── 🇲🇽 gear (all subclasses of gear)
│   │   ├── 🇲🇽 MagicItem.java
│   │   ├── 🇲🇽 Weapon.java
│   ├── 🇲🇽 Condition.java
│   ├── 🇲🇽 Gear.java
│   ├── 🇲🇽 Feature.java
│   ├── 🇲🇽 Main.java
│   ├── 🇲🇽 Person.java
│   ├── 🇲🇽 RPGClass.java
│   └── 🇲🇽 Spell.java
├── src
│   ├── data
│   │   ├── test.sqlite
│   ├── pages
│   │   ├── materials (currently empty)
│   │   ├── campaign-manager.html
│   │   ├── campaign.html
│   │   ├── character-creation.html
│   │   ├── character.html
│   │   ├── materials.html
│   │   ├── profile.html
│   │   ├── search.html
│   ├── 🇲🇽 resources
│   │   ├── 🇲🇽 img (currently empty)
│   │   ├── 🇲🇽 materials
│   │   │   ├── 🇲🇽 classes.json
│   ├── scripts
│   │   ├── person.js
│   │   ├── RPGClass.js
│   ├── sql-js
│   │   ├── api.js
│   │   ├── exported_functions.json
│   │   ├── exported_runtime_methods.json
│   │   ├── shell.js
│   │   ├── sql-wasm.wasm
│   │   ├── worker.js
│   ├── styles
│   │   ├── index.css
│   │   ├── nav.css
│   ├── ui
│   │   ├── character-creation.js
│   │   ├── index.js
├── index.html
└── README.md
```

# File Descriptions

## .idea

This is a folder that contains the settings for the PyCharm IDE. It is not necessary for the game.

## 🇲🇽 javaclasses

This is a folder that contains the compiled Java classes. It is not necessary for the game, however, it is helpful to understand the structure of the game and how the classes will be implemented in JavaScript. Reyna should be editing these files to fit what each class should do. Most of them contain pre-written code that can be modified to fit the game, and Reyna should be filling out all of the methods with a `// TODO` comment.

### 🇲🇽 characters

This folder contains the subclasses for the characters in the game. They all extend the `Person` class. Reyna should extending the `Person` class in each subclass and adding in any extra methods that are necessary for the game. It is worth noting that the `Person` class creates a stat block for each character, and the only reason it is not called Character is because the `Character` class is already used in Java.

### 🇲🇽 gear

This folder contains the subclasses for the gear in the game. They all extend the `Gear` class. Reyna should be extending the `Gear` class in each subclass and adding in any extra methods that are necessary for the game.

### 🇲🇽 `Condition.java`

This is a class that contains the conditions that can be applied to characters. It contains the name, description, and affected senses of the condition. The intention is that the conditions will be applied to characters and will affect their stats in some way.

### 🇲🇽 `Gear.java`

This is a class that contains the gear that can be equipped by characters. It contains the name, description, and price of the gear. Any stat blocks for the gear should be in the subclasses MagicItem and Weapon above.

### 🇲🇽 `Feature.java`

This is a class that contains the features that can be applied to characters. It contains the name, description, slots, and reset option of the feature. The intention is that the player will be able to view these features and apply them to their character manually.

### 🇲🇽 `Main.java`

This is the main class for the game. It contains the main method and the game loop. It is the class that should be run to start the game so that Reyna can test all of the classes. 

### 🇲🇽 `Person.java`

This is a class that defines a character of the game. It utilizes all of the other methods to create a statblock for the character. It contains many fields pertaining to the character, such as name, level, different classes, stats, skills, and proficiencies. Reyna should update the class to fit the game.

### 🇲🇽 `RPGClass.java`

This is a class that contains the classes that can be chosen by characters. It contains the name, description, and other information about the class. Rina did a poor job at filling out the class, so Reyna should be updating the class to fit the game. The fields that Rina has set out will be used to fill out the character's stat block.

### 🇲🇽 `Spell.java`

This is a class that contains the spells that can be cast by characters. It contains the name, description, and cost of the spell. Any stat blocks for the spell should be in the subclasses AttackSpell and UtilitySpell above.

## src

This is a folder that contains the source code for the website and game. It contains 
- the data stored about all users, characters, gear, etc.
- the pages for the website
- the resources (such as images and materials)
- the scripts for the game so that it can be run in the browser
- the styles for the website to make it look nice
- the ui scripts for the website to add dynamic features

### data

This folder contains all the `sqlite` databases that store the data for the game. It contains the databases for all users, characters, gear, etc. ll the files within will be used so that any user can access their characters and gear from any device.

### pages

This folder contains all the pages for the website. It contains the main page, the character creation page, the character page, the gear page, etc. All the files within will be used so that the user can navigate the website and play the game. The current pages are:
- materials 
  - will contain templates for all game materials, such as class information, spell cards, etc.
- `campaign-manager.html`
  - will contain the page for a user to manage their campaigns, such as creating a new campaign, updating locations, encounters, NPCs, etc.
- `campaign.html`
  - will contain the page for a user to view a campaign, such as viewing the locations, encounters, NPCs, etc.
- `character-creation.html`
  - will contain the page for a user to create a new character
- `character.html`
  - will contain the page for a user to view a character
- `materials.html`
  - will contain the landing page for a user to view all game materials
- `profile.html`
  - will contain the page for a user to view their profile, characters, and campaigns
- `search.html`
  - will contain the page for a user to search for a campaign, character, or gear

### 🇲🇽 resources

This folder contains all the resources for the website. It contains the images, game materials that will be used to make the website fit with the information of the TTRPG. The current resources are:

- 🇲🇽 img (images)
  - will contain all the images for the website, such as the logo, background, etc.
- 🇲🇽 materials
  - will contain all the game materials in `json` format, such as class information, so that it can be displayed on the website.

### scripts

This folder contains all the scripts for the game. It contains the scripts for the game so that it can be run in the browser. The current scripts are:

- `person.js`
- `rpgclass.js`

### sql-js

This folder contains the `sql.js` library that is used to interact with the `sqlite` databases via JavaScript. It has been imported from [the Github Repo](https://github.com/sql-js/sql.js/?tab=readme-ov-file) and the documentation can be viewed [here](https://sql.js.org/documentation/).

### styles

This folder contains all the styles for the website. It contains the styles for the website to make it look nice. The current styles are:

- index.css (styles for the main page)
- nav.css (styles for the top navigation menu)

### ui

This folder contains all the ui scripts for the website. It contains the scripts for the website to add dynamic features. The current ui scripts are:

- `character-creation.js`
- `index.js`

## index.html

This is the main page for the website. It is the first page that the user will see when they go to the website.

## README.md

This is the file that you are currently reading. It contains information about the game and the file structure. It is what appears on the Github repository.