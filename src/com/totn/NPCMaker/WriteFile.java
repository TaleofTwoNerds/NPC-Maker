package com.totn.NPCMaker;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class WriteFile 
{
	static String path = Main.file_path;
	private boolean append_to_file = false;
	public WriteFile(String file_path , boolean append_value) 
	{
		
		path = file_path;
		append_to_file = append_value;
	}
	
	public void writeToFile(String textLine) throws IOException 
	{
		
		FileWriter write = new FileWriter(path , append_to_file);
		PrintWriter print_line = new PrintWriter( write );
		
		print_line.printf( "%s" + "%n" , textLine);
		print_line.close();
	}
	
	public static void Main() throws IOException
	{
		Character.Generation();
		String[] args = null;
		ReadFile.Main(path);
	}
	public static void GuiWrite() throws IOException
	{
		WriteFile data = new WriteFile(Main.file_path, false);
		data.writeToFile(Gui.jTextArea1.getText());
	}
}
