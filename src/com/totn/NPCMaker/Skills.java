package com.totn.NPCMaker;

public class Skills {
	
	static int numberOfSkills = 31;
	static int[] skills = new int[numberOfSkills];

	public static void Skill() {
		
		int i;
		for (i=1;i<numberOfSkills;i++)
		{
			int random = (int) Generator.random();
			skills[i] = (int) (random + Main.racism[i]);
		}
	}
}
