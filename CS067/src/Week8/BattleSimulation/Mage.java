package Week8.BattleSimulation;

import java.util.Random;

public class Mage extends Character {
	
	protected int currentMana;
	protected int maxMana;
	protected int manaRegen;
	protected Random DamageGenerator;
	protected String spellDamageMessage;

	/** 
	 * @param n - Name of mage
	 * @param h = Health of mage
	 * @param mm - Max mana of mage
	 * @param mg - Mana regeneration of mage
	 */
	public Mage(String n, int h, int mm, int mg) {
		super(n, h);
		maxMana = mm;
		currentMana = mm;
		manaRegen = mg;
		DamageGenerator = new Random();
	}
	
	/**
	 * Sets message to be output to console for spell used and damage spell inflicted
	 * @param message - Message to be sent to console
	 */
	public void setSpellDamageMessage(String message) {
		spellDamageMessage = message;
	}
	
	/**
	 * Calculates damage that spell fireball will deal to enemy
	 * @return - int representing how much damage fireball will cause
	 */
	public int castFireball() {
		currentMana -= 10;
		int totalDamage = 0;
		totalDamage += DamageGenerator.nextInt(10) + 10;
		totalDamage -= DamageGenerator.nextInt(3) + 3;
		setSpellDamageMessage("Fireball dealt " + totalDamage + " damage!");
		return totalDamage;
		
	}
	
	/**
	 * Calculates damage that spell magic missile will deal to enemy
	 * @return - int representing how much damage magic missile will cause
	 */
	public int castMagicMissile() {
		currentMana -= 5;
		int totalDamage = 0;
		totalDamage += DamageGenerator.nextInt(4);
		totalDamage += DamageGenerator.nextInt(4);
		totalDamage += DamageGenerator.nextInt(4);
		setSpellDamageMessage("Magic Missile dealt " + totalDamage + " damage!");
		
		return (totalDamage);
	}
	
	@Override
	public int attack() {
		int attackDamage = 0;	// Keeps track of how much damage mage will deal this turn
		
		// Mage will cast fireball if current mana store is >= 10
		if(currentMana >= 10) {
			attackDamage = castFireball();
			regenMana();
			System.out.println(spellDamageMessage);
		}
		// Mage will cast magic missile if current mana store is >= 5
		else if (currentMana >= 5) {
			attackDamage = castMagicMissile();
			regenMana();
			System.out.println(spellDamageMessage);
		}
		// Mage will use default weapon if current mana store is below threshold to cast spells
		else {
			regenMana();
			attackDamage = super.attack();
		}
		
		return attackDamage;
	}
	
	/**
	 * Regenerates mana based on manaRegen field (how fast mage can regenerate mana)
	 */
	public void regenMana() {
		currentMana += ( manaRegen + ( DamageGenerator.nextInt(manaRegen) - (manaRegen / 2) ) );
		if(currentMana > maxMana) {
			currentMana = maxMana;
		}
	}

	@Override
	public String toString() {
		String characterInfo = super.toString();
		String mageInfo = " | [Mana: " + currentMana + "/" + maxMana + " | Regen: " + manaRegen + "]";
		return characterInfo + mageInfo;
	}
	
	

}
