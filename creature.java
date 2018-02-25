public class creature {
	private String name;
	private int health;
	private int maxHealth;
	private int armor;
	private int attack;
	
	public creature() {
		name = "";
		health = 10;
		maxHealth =10;
		armor = 10;
		attack = 0;
	}
	
	public creature(String n, int h, int maxH, int arm, int att){
		name = n;
		health = h;
		maxHealth = maxH;
		armor = arm;
		attack = att;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public int getHealth(){
		return health;
	}
	
	public void setHealth(int h){
		health = h;
	}
	
	public int getMaxHealth(){
		return maxHealth;
	}
	
	public void setMaxHealth(int h){
		maxHealth = h;
	}
	
	public int getArmor(){
		return armor;
	}
	
	public void setArmor(int arm){
		armor = arm;
	}
	
	public int getAttack(){
		return attack;
	}
	
	public void setAttack(int att){
		attack = att;
	}
	public void attack(creature c) {
		c.setHealth(this.getHealth()-c.getAttack());
		System.out.println("you have"+ instances.getPlayer().getHealth()+"health");
		System.out.println("they have"+ instances.getCurrentRoom().getCreature().getHealth()+"health");
	}
}
