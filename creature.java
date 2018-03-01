

import java.util.ArrayList;

public class creature {
	private String name;
	private int health;
	private int maxHealth;
	private int armor;
	private int attack;

	/**
	 * default constructor
	 * 
	 */
	public creature() {
		name = "";
		health = 10;
		maxHealth = 10;
		armor = 10;
		attack = 0;
	}

	/**
	 * alternative constructor
	 * 
	 * 
	 * @param String
	 *            n Name
	 * @param int
	 *            h Health
	 * @param int
	 *            maxH maxHealth
	 * @param int
	 *            arm armor
	 * @param int
	 *            att attack
	 */
	public creature(final String n, final int h, final int maxH, final int arm, final int att) {
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
	 * sets creature name
	 * 
	 * @param String
	 *            name
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
	 * sets creature health
	 * 
	 * @param int
	 *            health
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
	 * sets creature max health
	 * 
	 * @param int
	 *            h maxhealth
	 * 
	 */
	public void setMaxHealth(final int h) {
		maxHealth = h;
	}

	/**
	 * @return armor
	 * 
	 */
	public int getArmor() {
		return armor;
	}

	/**
	 * sets creature armor
	 * 
	 * @param int
	 *            arm armor
	 * 
	 */
	public void setArmor(final int arm) {
		armor = arm;
	}

	/**
	 * @return attack
	 * 
	 */
	public int getAttack() {
		return attack;
	}

	/**
	 * sets creature attack
	 * 
	 * @param int
	 *            att attack
	 * 
	 */
	public void setAttack(final int att) {
		attack = att;
	}

	/**
	 * attack damage calculation method.
	 * 
	 * @param creature
	 *            c creature
	 * 
	 */
	public void attack(final creature c) {
		c.setHealth(this.getHealth() - c.getAttack());
		ArrayList<String> a = new ArrayList<String>();
		a.add("You have " + instances.getPlayer().getHealth()+ " health.");
		a.add("They have " + instances.getCurrentRoom().getCreature().getHealth()+ " health.");
		instances.changeDisplay(a);
	}
}