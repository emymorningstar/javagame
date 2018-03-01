import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class processInputTest {

	@Test
	public void testRoomConstruct() {
		creature Bob = new creature("Bob",10,10, 2, 2);
		ArrayList<String> td = new ArrayList<String>();
		td.add("This is the test room description");
		Room test = new Room("Test Room", td, Bob);
		
		assert(test.getDescription()==td);
		assert(test.getTitle()=="Test Room");
		assert(test.getCreature() == Bob);
	}

	@Test
	public void testRoomSetters(){
		ArrayList<String> td = new ArrayList<String>();
		td.add("Start description");
		
		ArrayList<String> ts = new ArrayList<String>();
		ts.add("Set description");
		creature Bob = new creature("Bob",10,10, 2, 2);
		Room test = new Room("Test", td);
		
		Room test2 = new Room();
		Door door1 = new Door(test2, test2, test2);
		test.setDoor(door1);
		test.setTitle("Test Title");
		test.setDescription(ts);
		test.setCreature(Bob);
		
		assert(test.getDoors() == door1);
		assert(test.getTitle() == "Test Title");
		assert(test.getDescription() == ts);
		assert(test.getCreature() == Bob);
		
	}
	
	@Test
	public void testDoor(){
		Room test = new Room();
		Door testDoor = new Door();
		testDoor.setLeadsTo(test);
		
		assert(testDoor.getLeadsTo()== test);
	}
	
	@Test
	public void testCreature(){
		creature Bob = new creature("Bob",10,10, 2, 2);
		creature tim = new creature();
		
		tim.setName("tim");
		tim.setArmor(10);
		tim.setAttack(20);
		tim.setHealth(1000);
		tim.setMaxHealth(1000);
		
		assert(tim.getName() == "tim");
		assert(tim.getArmor() == 10);
		assert(tim.getAttack() == 20);
		assert(tim.getHealth() == 1000);
		assert(tim.getMaxHealth() == 1000);
		
	}
	
	@Test
	public void testDisplay(){
		
		ArrayList<String> tdis = new ArrayList<String>();
		tdis.add("Test Display");
		instances.changeDisplay(tdis);
		
		
		assert(instances.getDisplay() == tdis);
	
		
	}
	
	@Test
	public void testCurrentRoom(){
		ArrayList<String> td = new ArrayList<String>();
		td.add("Start description");
		Room test = new Room("Test", td);
		instances.setCurrentRoom(test);
		
		assert(instances.getCurrentRoom().getTitle() == "Test");
	}
	
	@Test
	public void testFight(){
		instances.setfight(true);
		
		assert(instances.getfight());
	}
	
	@Test
	public void testPlayer(){
		instances.getPlayer().setHealth(20);
		
		assert(instances.getPlayer().getHealth() == 20);
	}
	
	@Test
	public void testNorth(){
		ArrayList<String> t1 = new ArrayList<String>();
		t1.add("Start description");
		Room test = new Room("Test", t1);
		
		ArrayList<String> t2 = new ArrayList<String>();
		t2.add("Set description");
		Room test2 = new Room("Test 2", t2);
		
		Door door1 = new Door(test2, test2, test2);
		
		test.setDoor(door1);
		
		instances.setCurrentRoom(test);
		
		processInput.doInput("north");
		
		assert(instances.getCurrentRoom().getTitle() == "Test 2");
	}
	
	@Test
	public void testWork(){
		ArrayList<String> t5 = new ArrayList<String>();
		t5.add("Start description");
		Room test = new Room("Work", t5);
		instances.setCurrentRoom(test);
		
		processInput.doInput("work");
		
		assert(instances.getDisplay().contains("You start to work. The day goes on, and you can feel the boredom kick in."));
	}
	
	@Test
	public void testWork2(){
		ArrayList<String> t5 = new ArrayList<String>();
		t5.add("Start description");
		Room test = new Room("Work", t5);
		instances.setCurrentRoom(test);
		
		processInput.doInput("office");
		
		assert(instances.getDisplay().contains("In the office you can see the manager: a giant troll with a nametage that says Bob."));
	}
	
	@Test
	public void testWork3(){
		ArrayList<String> t5 = new ArrayList<String>();
		t5.add("Start description");
		Room test = new Room("Work", t5);
		instances.setCurrentRoom(test);
		
		processInput.doInput("talk to bob");
		
		assert(instances.getDisplay().contains("Get back to work, work Monkey!"));
	}
	
	@Test
	public void testFairy1(){
		ArrayList<String> t5 = new ArrayList<String>();
		t5.add("Start description");
		Room test = new Room("Fairy Forest", t5);
		instances.setCurrentRoom(test);
		
		processInput.doInput("look tree");
		
		assert(instances.getDisplay().contains("In the tree you see a glowing helmet."));
	}
	
	@Test
	public void testFairy2(){
		ArrayList<String> t5 = new ArrayList<String>();
		t5.add("Start description");
		Room test = new Room("Fairy Forest", t5);
		instances.setCurrentRoom(test);
		
		processInput.doInput("get helmet");
		
		assert(instances.getDisplay().contains("You got the fairy helmet! Your defense goes up by 3!"));
	}
	
	@Test
	public void testFairy3(){
		ArrayList<String> t5 = new ArrayList<String>();
		t5.add("Start description");
		Room test = new Room("Fairy Forest", t5);
		instances.setCurrentRoom(test);
		
		processInput.doInput("talk fairy");
		
		assert(instances.getDisplay().contains("The fairy says she lost her helmet. If you can find it, she will give it to you!"));
	}
	
	@Test
	public void testFairy4(){
		ArrayList<String> t5 = new ArrayList<String>();
		t5.add("Start description");
		Room test = new Room("Fairy Forest", t5);
		instances.setCurrentRoom(test);
		
		processInput.doInput("look pond");
		
		assert(instances.getDisplay().contains("the pond seems wet."));
	}
	
	@Test
	public void testCave1(){
		ArrayList<String> t5 = new ArrayList<String>();
		t5.add("Start description");
		Room test = new Room("Secret Cave", t5);
		instances.setCurrentRoom(test);
		
		processInput.doInput("get helmet");
		
		assert(instances.getDisplay().contains("You got the helmet of +2 beating. Your defense goes up by 1, but your attack "));
	}
	
	@Test
	public void testMer1(){
		creature Bob = new creature("Bob",10,10, 2, 2);
		ArrayList<String> t5 = new ArrayList<String>();
		t5.add("Start description");
		Room test = new Room("Mermaids Lake", t5, Bob);
		instances.setCurrentRoom(test);
		
		processInput.doInput("island");
		
		assert(instances.getDisplay().contains("you try to swim to the island, but before you can a giant monster comes out of the"));
	}
	
	@Test
	public void testMer2(){
		creature Bob = new creature("Bob",0,0, 2, 2);
		ArrayList<String> t5 = new ArrayList<String>();
		t5.add("Start description");
		Room test = new Room("Mermaids Lake", t5, Bob);
		instances.setCurrentRoom(test);
		
		processInput.doInput("island");
		
		assert(instances.getDisplay().contains("With the monster dead, you swim to the island and find the armor of seashells! Your"));
	}
	
	@Test
	public void testGhost1(){
		creature Bob = new creature("Bob",0,0, 2, 2);
		ArrayList<String> t5 = new ArrayList<String>();
		t5.add("Start description");
		Room test = new Room("Ghost House", t5, Bob);
		instances.setCurrentRoom(test);
		
		processInput.doInput("look armor");
		
		assert(instances.getDisplay().contains("As you look at the armor, something crawls out of it. It’s a ghost! The specter"));
	}
	
	@Test
	public void testGhost2(){
		creature Bob = new creature("Bob",0,0, 2, 2);
		ArrayList<String> t5 = new ArrayList<String>();
		t5.add("Start description");
		Room test = new Room("Ghost House", t5, Bob);
		instances.setCurrentRoom(test);
		
		processInput.doInput("look");
		
		assert(instances.getDisplay().contains("The ghost dies… somehow. You now have the armor of Sir. Spookington! Your armor goes "));
	}
	
	@Test
	public void testMed(){
		ArrayList<String> t5 = new ArrayList<String>();
		t5.add("Start description");
		Room test = new Room("Meadow of Frollicking", t5);
		instances.setCurrentRoom(test);
		
		processInput.doInput("get armor");
		
		assert(instances.getDisplay().contains("This is the armor of the noble knight. Your armor goes up by 3."));
	}
	
	@Test
	public void testDragLair1(){
		creature Bob = new creature("Bob",10,10, 2, 2);
		ArrayList<String> t5 = new ArrayList<String>();
		t5.add("Start description");
		Room test = new Room("The Dragon's Cave", t5, Bob);
		instances.setCurrentRoom(test);
		
		instances.setfight(true);
		
		processInput.doInput("look");
		
		assert(instances.getDisplay().contains("The dragon wakes up! Prepare yourself!"));
	}
	
	@Test
	public void testDragLair2(){
		creature Bob = new creature("Bob",0,0, 2, 2);
		ArrayList<String> t5 = new ArrayList<String>();
		t5.add("Start description");
		Room test = new Room("The Dragon's Cave", t5, Bob);
		instances.setCurrentRoom(test);
		
		processInput.doInput("look");
		
		assert(instances.getDisplay().contains("The dragon dies, leaving the sword. The sword is the sword of dragon slaying. You"));
	}
	
	@Test
	public void testLich1(){
		creature Bob = new creature("Bob",0,0, 2, 2);
		ArrayList<String> t5 = new ArrayList<String>();
		t5.add("Start description");
		Room test = new Room("The lair of the Lich", t5, Bob);
		instances.setCurrentRoom(test);
		
		processInput.doInput("open");
		
		assert(instances.getDisplay().contains("The skeleton jumps up, his bones rattling. He announces that he will be attacking "));
	}
	
	@Test
	public void testLich2(){
		creature Bob = new creature("Bob",0,0, 2, 2);
		ArrayList<String> t5 = new ArrayList<String>();
		t5.add("Start description");
		Room test = new Room("The lair of the Lich", t5, Bob);
		instances.setCurrentRoom(test);
		
		processInput.doInput("look");
		
		assert(instances.getDisplay().contains("The skeleton falls. In his chest, you find the hammer of bone crushing. +3 to attack "));
	}
	
	@Test
	public void testFarm1(){
		creature Bob = new creature("Bob",10,10, 2, 2);
		ArrayList<String> t5 = new ArrayList<String>();
		t5.add("Start description");
		Room test = new Room("The farm of eternal despair", t5, Bob);
		instances.setCurrentRoom(test);
		
		processInput.doInput("yes");
		
		assert(instances.getDisplay().contains("The old man treats you to dinner. You feel energized by his meal. +1 to attack and "));
	}
	
	@Test
	public void testFarm2(){
		creature Bob = new creature("Bob",10,10, 2, 2);
		ArrayList<String> t5 = new ArrayList<String>();
		t5.add("Start description");
		Room test = new Room("The farm of eternal despair", t5, Bob);
		instances.setCurrentRoom(test);
		
		processInput.doInput("no");
		
		assert(instances.getDisplay().contains("The man is enraged! He raises his arms and a swarm of chickens descends. They band"));
	}
	
	@Test
	public void testFarm3(){
		creature Bob = new creature("Bob",0,0, 2, 2);
		ArrayList<String> t5 = new ArrayList<String>();
		t5.add("Start description");
		Room test = new Room("The farm of eternal despair", t5, Bob);
		instances.setCurrentRoom(test);
		
		processInput.doInput("look");
		
		assert(instances.getDisplay().contains("the chicken swarm disperses and the old man runs into his house, locking his door. "));
	}
	
	@Test
	public void testBadLair1(){
		creature Bob = new creature("Bob",0,0, 2, 2);
		ArrayList<String> t5 = new ArrayList<String>();
		t5.add("Start description");
		Room test = new Room("Dr. Big Bad's Lair", t5, Bob);
		instances.setCurrentRoom(test);
		
		processInput.doInput("");
		assert(instances.getDisplay().contains("Dr. Big Bad falls before you. You hear birds start to sing and the sky turns a "));
	}
	
	@Test
	public void testError(){
		processInput.doInput("hi");
		
		assert(instances.getDisplay().contains("I'm sorry. That's not a valid input."));
	}
}
