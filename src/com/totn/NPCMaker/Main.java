package com.totn.NPCMaker;

import java.io.IOException;
import java.util.Scanner;

public class Main
{
	public static boolean submitted = false;
	public static int raceNum = Generator.raceNum();
	public static boolean sex = false;
	public static int[] racism = new int[31];
	public static String race = Generator.raceName();
	private static int Write = 2;
	public static String extension = ".dcf", file_path = "res/Default"+extension;
	
	public static void main(String[] args) throws IOException
	{
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("os.arch"));
		Gui.Main();
	}
}