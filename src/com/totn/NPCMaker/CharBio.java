package com.totn.NPCMaker;

import java.io.IOException;

public class CharBio 
{
	static int bioNum = 10;
	static String[] bioArray = new String[bioNum];
	static String[] bio = new String[bioNum];
	static String br = System.getProperty("line.separator");
	
	public static String CharBio()
	{
		int i;
		
		CharGen();
		
		for(i=0;i<bioNum;i++)
		{
			if(bioArray[i]==null)
			{
				bioArray[i]="";
			}
			bio[i] = bioArray[i];
		};
		return bioArray[1];
	}
	public static void CharGen()
	{
		if (Skills.skills[1]>50)
		{
			bioArray[1] = "You worked hard as a laborer for the first part of your life." + br;
		}if (Skills.skills[2]>50)
		{
			bioArray[2] = "You were a scholar. You worked with many intelectuals." + br;
		}if (Skills.skills[3]>50)
		{
			bioArray[3] = "You were once addicted to many things, but have since broken your addictions." + br;
		}
	}
}
