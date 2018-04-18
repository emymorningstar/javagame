package adventurePath;
import java.util.ArrayList;
/**
 * class handles the creatures.
 *
 */
public class Creature {
	/**
	 * stores current creature name.
	 */
	private String name;
	/**
	 * stores current creature health.
	 */
	private int health;
	/**
	 * max health the creature can have.
	 */
	private int maxHealth;
	/**
	 * the armor level of a creature.
	 */
	private int armor;
	/**
	 * how much damage the creature can do per turn.
	 */
	private int attack;

	/**
	 * default constructor.
	 * 
	 */
	public Creature() {
		name = "";
		health = 10;
		maxHealth = 10;
		armor = 10;
		attack = 0;
	}

	/**
	 * alternative constructor.
	 * 
	 * 
	 * @param n Name
	 * @param h Health
	 * @param maxH maxHealth
	 * @param arm armor
	 * @param att attack
	 */
	public Creature(final String n, final int h, final int maxH, final int arm, final int att) {
		name = n;
		health = h;
		maxHealth = maxH;
		armor = arm;
		attack = att;
	}

	/**
	 * @return name
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * sets creature name.
	 * 
	 * @param n name
	 * 
	 */
	public void setName(final String n) {
		name = n;
	}

	/**
	 * @return health
	 * 
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * sets creature health.
	 * 
	 * @param h health
	 * 
	 */
	public void setHealth(final int h) {
		health = h;
	}

	/**
	 * @return maxhealth
	 * 
	 */
	public int getMaxHealth() {
		return maxHealth;
	}

	/**
	 * sets creature max health.
	 * 
	 * @param  h maxhealth
	 * 
	 */
	public void setMaxHealth(final int h) {
		maxHealth = h;
	}

	/**
	 * gets armor level.
	 * @return armor
	 * 
	 */
	public int getArmor() {
		return armor;
	}

	/**
	 * sets creature armor.
	 * 
	 * @param arm armor
	 * 
	 */
	public void setArmor(final int arm) {
		armor = arm;
	}

	/**
	 * gets attack.
	 * 
	 * @return attack
	 * 
	 */
	public int getAttack() {
		return attack;
	}

	/**
	 * sets creature attack.
	 * 
	 * @param att attack
	 * 
	 */
	public void setAttack(final int att) {
		attack = att;
	}

	/**
	 * attack damage calculation method.
	 * 
	 * @param c creature
	 * 
	 */
	public void attack(final Creature c) {
		c.setHealth(this.getHealth() - c.getAttack());
		ArrayList<String> a = new ArrayList<String>();
		a.add("You have " + Instances.getPlayer().getHealth() + " health.");
		a.add("They have " + Instances.getCurrentRoom().getCreature().getHealth() + " health.");
		if (Instances.getCurrentRoom().getCreature().getHealth() <= 0) {
			a.add("(look)"); 
		} else {
			a.add("(attack)");
		}
		Instances.changeDisplay(a);
		if (Instances.getPlayer().getHealth() <= 0) {
			Instances.setGame(false);
		}
			
	}
}
