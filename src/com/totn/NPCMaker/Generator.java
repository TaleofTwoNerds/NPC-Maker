package com.totn.NPCMaker;

import java.util.Random;

public class Generator 
{
	static int raceNum = Main.raceNum;
	static String race = Main.race;
	
	public static String raceName()
	{
		if (Main.raceNum == 0 || Main.raceNum == 10)
	      {
	  		race = "Human";
	      } else if (Main.raceNum == 1 || Main.raceNum == 9)
	      {
	      	race = "Breton";
	      } else if (Main.raceNum == 2)
	      {
	      	race = "High Elf";
	      }else if (Main.raceNum == 8)
	      {
	      	race = "Dark Elf";
	      } else if (Main.raceNum == 3 || Main.raceNum == 7)
	      {
			race = "Imperial";
	          } else if (Main.raceNum == 4 || Main.raceNum == 6)
	          {
			race = "Nord";
	          } else if (Main.raceNum == 5)
	          {
			race = "Assassin";
	          }
//		System.out.println("raceName Began: " + race);
		return race;
		}
	
	public static int raceNum()
	{
		int raceNum = 0;
        Random rand = new Random();
//		int raceNum =  (rand.nextInt(10 - 0) + 0);
//		System.out.println(raceNum);
		return raceNum;
	}
	
	public static int age()
	{
		double x = 1.0;
        Random rand = new Random();
        x = (rand.nextInt(40 - 20) + 20);
        return (int) x;
	}
	
	public static String hairColor()
	{

            String hair = null;
            int hairNum = (int) (Math.random() * 10);
            if (hairNum == 0 || hairNum == 10)
            {
            	hair = "Blonde";
            } else if (hairNum == 1 || hairNum == 9)
            {
            	hair = "Brown";
            } else if (hairNum == 2 || hairNum == 8)
            {
            	hair = "Black";
            } else if (hairNum == 3 || hairNum == 7)
            {
            	hair = "Brown";
            } else if (hairNum == 4 || hairNum == 6)
            {
            	hair = "Blue";
            } else if (hairNum == 5)
            {
            	hair = "Ginger";	
            }
            return hair;
	}
	
	public static String eyeColor()
	{
            String eye = null;
            int eyeNum = (int) (Math.random() * 10);
            if (eyeNum == 0 || eyeNum == 10)
            {   
            	eye = "Black";
            } else if (eyeNum == 1 || eyeNum == 9 || eyeNum == 4)
            {
            	eye = "Brown";
            } else if (eyeNum == 2 || eyeNum == 8 || eyeNum == 7)
            {
            	eye = "Hazel";
            } else if (eyeNum == 3)
            {
            	eye = "Red";
            } else if (eyeNum == 6)
            {
            	eye = "Blue";
            } else if (eyeNum == 5)
            {
               	eye = "Green";
            }
            return eye;
	}
	
	public static double height()
	{
            double height = 1.0;
            Random rand = new Random();
            height = (rand.nextInt((250) - 50) + 50);
            height = height / 100;
            return height;
	}
        
        public static double random()
	{
            double x = 1.0;
            Random rand = new Random();
            x = (rand.nextInt((50) - 10) + 10);
            return x;
	}
}