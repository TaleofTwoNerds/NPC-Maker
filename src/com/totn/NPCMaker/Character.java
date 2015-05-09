package com.totn.NPCMaker;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Character {
	
	@SuppressWarnings("unused")
	public static void Generation() throws IOException
	{
		Racism.Main();
		Racism.Sexism();
		String name,sex = null,race,age,hair,eyes,height;
		System.out.println("Name?");
		Scanner user_input=new Scanner(System.in);
		name = user_input.nextLine();
		System.out.println("Gender?");
		sex = user_input.nextLine();
		if (sex.startsWith("Male"))
		{
			Main.sex = true;
		} else {
			Main.sex = false;
		}
		Character(name,sex);
	}
	public static void Character(String name,String sex) throws IOException
	{
		Racism.Main();
		Skills.Skill();
		double Block = (Generator.random() + Main.racism[18]);
		System.out.println(Main.racism[1]);
		
		String br = System.getProperty("line.separator");
		WriteFile data;
        data = new WriteFile(WriteFile.path, false);
		
        PrintWriter writer = new PrintWriter(new File("~/hello.tsf"));
        
        writer.println("Name: " + name);
        writer.println("Gender: " + sex);
        writer.println("Race: " + Main.race );
        writer.println(br);
        writer.println("Age: " + (Generator.age() + Main.racism[0]));
        writer.println("Hair: " + Generator.hairColor());
        writer.println("Eyes: " + Generator.eyeColor());
        
        writer.close();
        
        data.writeToFile("Name: " + name + br
				+ "Gender: " + sex + br
				+ "Race: " + Main.race 
					+ br 
				
				+ "Age: " + (Generator.age() + Main.racism[0]) + br 
				+ "Hair: " + Generator.hairColor() + br 
				+ "Eyes: " + Generator.eyeColor() + br
					+ br
					
				+ "Strength: " + (Generator.random() + Main.racism[1]) + br
				+ "Intelligence: " + (Generator.random() + Main.racism[2]) + br
				+ "Willpower: " + (Generator.random()  + Main.racism[3]) + br
				+ "Agility: " + (Generator.random() + Main.racism[4])  + br
				+ "Speed: " + (Generator.random() + Main.racism[5])  + br
				+ "Endurance:  " + (Generator.random() + Main.racism[6])  + br
				+ "Personality:  " + (Generator.random() + Main.racism[7])  + br
					+ br    
					
				+ "Strength Skills" + br
				+ "Hand-to-Hand: " + (Generator.random() + Main.racism[8])  + br
				+ "Blades: " + (Generator.random() + Main.racism[9])  + br
				+ "Blunt: " + (Generator.random() + Main.racism[10])  + br
	            + "Armor: " + (Generator.random() + Main.racism[11])  + br
	            	+ br
	            	
	            + "Intelligence Skills" + br
				+ "Alchemy: " + (Generator.random() + Main.racism[12])  + br
				+ "Conjuration: " + (Generator.random() + Main.racism[13])  + br
				+ "Mystisicm: " + (Generator.random() + Main.racism[14])  + br
	            	+ br
	            	
	            + "Willpower Skills" + br
				+ "Alteration: " + (Generator.random() + Main.racism[15])  + br
				+ "Destruction: " + (Generator.random() + Main.racism[16])  + br
				+ "Restoration: " + (Generator.random() + Main.racism[17])  + br
	            	+ br
	            	
	            + "Agility Skills" + br
				+ "Block: " + (Block)  + br
				+ "Marksman: " + (Generator.random() + Main.racism[19])  + br
				+ "Sneak: " + (Generator.random() + Main.racism[20])  + br
	            	+ br
	            	
	            + "Speed Skills" + br
				+ "Acrobatics: " + (Generator.random() + Main.racism[21])  + br
				+ "Athletics: " + (Generator.random() + Main.racism[22])  + br
				+ "Light Armor: " + (Generator.random() + Main.racism[23])  + br
	            	+ br
	            	
	            + "Endurance Skills" + br
				+ "Armorer: " + (Generator.random() + Main.racism[24])  + br
				+ "Block: " + (Block)  + br
				+ "Heavy Armor: " + (Generator.random() + Main.racism[26])  + br
	            	+ br
	            	
	            + "Personality Skills" + br
				+ "Illusion: " + (Generator.random() + Main.racism[27])  + br
				+ "Mercantile: " + (Generator.random() + Main.racism[28])  + br
				+ "Speechcraft: " + (Generator.random() + Main.racism[29])  + br
	            	+ br
	            	
	            + "Misc Skills" + br
	            + "Luck: " + (Generator.random() + Main.racism[30])  + br
	            	+ br 
	            	
	            + "2014 (C) Blaine Harper");
	}
	
	public static String CharBio() 
	{
		String bla = null;
		return bla;
	}
	
	public static String CharString() 
	{

		String name, sex, br = System.getProperty("line.separator");
		name = Gui.nameField.getText();
		sex = Gui.genderField.getText();
		Racism.Main();
		Skills.Skill();
		CharBio.CharBio();
		int Block = Skills.skills[18], i;
//		System.out.println(Block);
		String bobby = 
				"Name: " + name + br
				+ "Gender: " + sex + br
				+ "Race: " + Main.race 
					+ br 
				
				+ "Age: " + (Generator.age() + Main.racism[0]) + br 
				+ "Hair: " + Generator.hairColor() + br 
				+ "Eyes: " + Generator.eyeColor() + br
					+ br
					
				+ "Strength: " + Skills.skills[1] + br
				+ "Intelligence: " + Skills.skills[2] + br
				+ "Willpower: " + Skills.skills[3] + br
				+ "Agility: " + Skills.skills[4]  + br
				+ "Speed: " + Skills.skills[5]  + br
				+ "Endurance:  " + Skills.skills[6]  + br
				+ "Personality:  " + Skills.skills[7]  + br
					+ br    
					
				+ "Strength Skills" + br
				+ "Hand-to-Hand: " + Skills.skills[8]  + br
				+ "Blades: " + Skills.skills[9]  + br
				+ "Blunt: " + Skills.skills[10]  + br
	            + "Armor: " + Skills.skills[11]  + br
	            	+ br
	            	
	            + "Intelligence Skills" + br
				+ "Alchemy: " + Skills.skills[12]  + br
				+ "Conjuration: " + Skills.skills[13]  + br
				+ "Mystisicm: " + Skills.skills[14]  + br
	            	+ br
	            	
	            + "Willpower Skills" + br
				+ "Alteration: " + Skills.skills[15]  + br
				+ "Destruction: " + Skills.skills[16]  + br
				+ "Restoration: " + Skills.skills[17]  + br
	            	+ br
	            	
	            + "Agility Skills" + br
				+ "Block: " + (Block)  + br
				+ "Marksman: " + Skills.skills[19]  + br
				+ "Sneak: " + Skills.skills[20]  + br
	            	+ br
	            	
	            + "Speed Skills" + br
				+ "Acrobatics: " + Skills.skills[21]  + br
				+ "Athletics: " + Skills.skills[22]  + br
				+ "Light Armor: " + Skills.skills[23]  + br
	            	+ br
	            	
	            + "Endurance Skills" + br
				+ "Armorer: " + Skills.skills[24]  + br
				+ "Block: " + (Block)  + br
				+ "Heavy Armor: " + Skills.skills[26]  + br
	            	+ br
	            	
	            + "Personality Skills" + br
				+ "Illusion: " + Skills.skills[27] + br
				+ "Mercantile: " + Skills.skills[28]  + br
				+ "Speechcraft: " + Skills.skills[29]  + br
	            	+ br
	            	
	            + "Misc Skills" + br
	            + "Luck: " + Skills.skills[30]  + br
	            	+ br
	            + CharBio.bioArray[1]
	    	    + CharBio.bioArray[2]
	    	    + CharBio.bioArray[3]
	    	    + CharBio.bioArray[4]
	    	    + CharBio.bioArray[5]
	    	    + CharBio.bioArray[6]
	    	    + CharBio.bioArray[7]
	    	    + CharBio.bioArray[8]	    	    
	            	+ br
	            + "2014 (C) Blaine Harper";
		return bobby;
		
	}
}