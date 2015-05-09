package com.totn.NPCMaker;

public class Racism 
{
	public static void Main()
	{
		if (Main.raceNum == 0 || Main.raceNum == 10)
		      {
		  		One();
		      } else if (Main.raceNum == 1 || Main.raceNum == 9)
		      {
		    	  Two();
		      } else if (Main.raceNum == 2)
		      {
		    	  Three();
		      }else if (Main.raceNum == 8)
		      {
		    	  Four();
		      } else if (Main.raceNum == 3 || Main.raceNum == 7)
		      {
		    	  Five();
		      } else if (Main.raceNum == 4 || Main.raceNum == 6)
		      {
		    	  Six();
		      } else if (Main.raceNum == 5)
		      {
		    	  Seven();
		      }
		Sexism();
	}
	public static void Sexism()
	{
		if (Main.sex == true)
		{
			//If they're a man
			Main.racism[0] = Main.racism[0] + 1000;
			
			Main.racism[1] = Main.racism[1] + 0;
			Main.racism[2] = Main.racism[2] - 10;
			Main.racism[3] = Main.racism[3] - 10;
			Main.racism[4] = Main.racism[4] - 5;
			Main.racism[5] = Main.racism[5] + 0;
			Main.racism[6] = Main.racism[6] + 10;
			Main.racism[7] = Main.racism[7] - 10;

			Main.racism[8] = Main.racism[8] + 0;
			Main.racism[9] = Main.racism[9] + 15;
			Main.racism[10] = Main.racism[10] + 15;
			Main.racism[11] = Main.racism[11] + 10;
			Main.racism[12] = Main.racism[12] + 15;

			Main.racism[13] = Main.racism[13] + 15;

			Main.racism[14] = Main.racism[14] + 20;
		} else {
			//Anyone that's not a man
			Main.racism[0] = Main.racism[0] - 10;
			
			Main.racism[1] = Main.racism[1] - 10;
			Main.racism[2] = Main.racism[2] + 10;
			Main.racism[3] = Main.racism[3] + 10;
			Main.racism[4] = Main.racism[4] + 5;
			Main.racism[5] = Main.racism[5] - 0;
			Main.racism[6] = Main.racism[6] - 10;
			Main.racism[7] = Main.racism[7] + 10;

			Main.racism[8] = Main.racism[8] + 0;
			Main.racism[9] = Main.racism[9] - 15;
			Main.racism[10] = Main.racism[10] - 15;
			Main.racism[11] = Main.racism[11] - 10;
			Main.racism[12] = Main.racism[12] - 15;

			Main.racism[13] = Main.racism[13] + 15;

			Main.racism[14] = Main.racism[14] - 10;
		}
		
	}
	public static void One()
	{
//		Human
		Main.racism[0] = 5; //Age
		
		Main.racism[1] = 10;
		Main.racism[2] = -5;
		Main.racism[3] = -5;
		Main.racism[4] = 5;
		Main.racism[5] = 0;
		Main.racism[6] = 0;
		Main.racism[7] = -10;
		
		Main.racism[8] = 5;
		Main.racism[9] = 5;
		Main.racism[10] = 5;
		Main.racism[11] = 5;
		
		Main.racism[12] = 5;
		Main.racism[13] = 0;
		Main.racism[14] = 5;
		
		Main.racism[15] = 0;
		Main.racism[16] = 5;
		Main.racism[17] = 0;
		
		Main.racism[18] = 10;
		Main.racism[19] = 5;
		Main.racism[20] = 5;
		
		Main.racism[21] = 5;
		Main.racism[22] = 0;
		Main.racism[23] = 5;
		
		Main.racism[24] = 0;
		Main.racism[25] = 0;
		Main.racism[26] = 5;
		
		Main.racism[27] = 0;
		Main.racism[28] = 0;
		Main.racism[29] = 0;
		
		Main.racism[30] = 10;
	}
	public static void Two()
	{
		Main.racism[0] = 5; //Age
		
		Main.racism[1] = 0;
		Main.racism[2] = 10;
		Main.racism[3] = 10;
		Main.racism[4] = 0;
		Main.racism[5] = 0;
		Main.racism[6] = 0;
		Main.racism[7] = 5;

		Main.racism[8] = 0;
		Main.racism[9] = 0;
		Main.racism[10] = 0;
		Main.racism[11] = 0;
		
		Main.racism[12] = 5;
		Main.racism[13] = 5;
		Main.racism[14] = 5;
		
		Main.racism[15] = 5;
		Main.racism[16] = 5;
		Main.racism[17] = 5;
		
		Main.racism[18] = 0;
		Main.racism[19] = 0;
		Main.racism[20] = 0;
		
		Main.racism[21] = 5;
		Main.racism[22] = 0;
		Main.racism[23] = 0;
		
		Main.racism[24] = 0;
		Main.racism[25] = 0;
		Main.racism[26] = 0;
		
		Main.racism[27] = 5;
		Main.racism[28] = 5;
		Main.racism[29] = 5;
		
		Main.racism[30] = 10;
	}
	public static void Three()
	{
		Main.racism[0] = 0;
		
		Main.racism[1] = 0;
		Main.racism[2] = 0;
		Main.racism[3] = 0;
		Main.racism[4] = 0;
		Main.racism[5] = 0;
		Main.racism[6] = 0;
		Main.racism[7] = 0;

		Main.racism[8] = 0;
		Main.racism[9] = 0;
		Main.racism[10] = 0;
		Main.racism[11] = 0;
		Main.racism[12] = 0;

		Main.racism[13] = 0;

		Main.racism[14] = 0;
	}
	public static void Four()
	{
		Main.racism[0] = 0;
		
		Main.racism[1] = 0;
		Main.racism[2] = 0;
		Main.racism[3] = 0;
		Main.racism[4] = 0;
		Main.racism[5] = 0;
		Main.racism[6] = 0;
		Main.racism[7] = 0;

		Main.racism[8] = 0;
		Main.racism[9] = 0;
		Main.racism[10] = 0;
		Main.racism[11] = 0;
		Main.racism[12] = 0;

		Main.racism[13] = 0;

		Main.racism[14] = 0;
	}
	public static void Five()
	{
		Main.racism[0] = 0;
		
		Main.racism[1] = 0;
		Main.racism[2] = 0;
		Main.racism[3] = 0;
		Main.racism[4] = 0;
		Main.racism[5] = 0;
		Main.racism[6] = 0;
		Main.racism[7] = 0;

		Main.racism[8] = 0;
		Main.racism[9] = 0;
		Main.racism[10] = 0;
		Main.racism[11] = 0;
		Main.racism[12] = 0;

		Main.racism[13] = 0;

		Main.racism[14] = 0;
	}
	public static void Six()
	{
		Main.racism[0] = 0;
		
		Main.racism[1] = 0;
		Main.racism[2] = 0;
		Main.racism[3] = 0;
		Main.racism[4] = 0;
		Main.racism[5] = 0;
		Main.racism[6] = 0;
		Main.racism[7] = 0;

		Main.racism[8] = 0;
		Main.racism[9] = 0;
		Main.racism[10] = 0;
		Main.racism[11] = 0;
		Main.racism[12] = 0;

		Main.racism[13] = 0;

		Main.racism[14] = 0;
	}
	public static void Seven()
	{
		Main.racism[0] = 0;
		
		Main.racism[1] = 0;
		Main.racism[2] = 0;
		Main.racism[3] = 0;
		Main.racism[4] = 0;
		Main.racism[5] = 0;
		Main.racism[6] = 0;
		Main.racism[7] = 0;

		Main.racism[8] = 0;
		Main.racism[9] = 0;
		Main.racism[10] = 0;
		Main.racism[11] = 0;
		Main.racism[12] = 0;

		Main.racism[13] = 0;

		Main.racism[14] = 0;
	}
}
