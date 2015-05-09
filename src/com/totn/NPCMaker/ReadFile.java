package com.totn.NPCMaker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile
{
	
	private static String path = Main.file_path;
	
	public static void GuiReader() throws IOException
	{
		ReadFile file = new ReadFile(Main.file_path);
		String[] aryLines = file.OpenFile();
		String br = System.getProperty("line.separator");
		
		Gui.jTextArea1.setText("");
		int i;
		for(i = 0; i < aryLines.length; i++)
		{	
			Gui.jTextArea1.append(aryLines[i] + br);
		}
		Gui.jTextArea1.setCaretPosition(0);
	}
	
	public static void Main(String file_path)
	{
//		System.out.println("Beginning...");
		try 
		{
			ReadFile file = new ReadFile(Main.file_path);
			String[] aryLines = file.OpenFile();
			
			int i;
//			System.out.println("");
			for(i = 0; i < aryLines.length; i++)
			{	
				System.out.println(aryLines[i]);
			}
		} 
		catch ( IOException e ) 
		{
			System.out.println( e.getMessage() );
		}
	}
	
	public ReadFile(String file_path) 
	{
		path = file_path;
	}

	public static String[] OpenFile() throws IOException
	{
//		System.out.println("File Opening...");
		FileReader fr = new FileReader(path);
		BufferedReader textReader = new BufferedReader(fr);
		
		int numberOfLines = ReadLines();
		
		String[] textData =  new String[numberOfLines];
		
		int i;
		
		for (i=0; i < numberOfLines; i++)
		{
			textData[i] = textReader.readLine();
		}
		
		String name = textData[0],race = textData[2];
		name = name.substring(6,name.length());
		race = race.substring(5,race.length());
		System.out.println(name + ", " + race);
		textReader.close();
		return textData;
	}

	public static int ReadLines() throws IOException
	{
		FileReader fr = new FileReader(path);
		BufferedReader textReader = new BufferedReader(fr);
		
		@SuppressWarnings("unused")
		String aLine;
		int numberOfLines = 0;
		while ((aLine = textReader.readLine()) != null)
		{
			numberOfLines++;
		}
		textReader.close();
//		System.out.println(numberOfLines + " Lines Read...");
		return numberOfLines;
	}
	public static String ReadLine(int line_number) throws IOException
	{
		String line = null;
		return line;
	}
}
