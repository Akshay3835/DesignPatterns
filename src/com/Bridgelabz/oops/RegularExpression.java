package com.Bridgelabz.oops;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class RegularExpression
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		String path="/home/admin1/Desktop/regularexpersion.json";
		File file=new File(path);
		Scanner sc=new Scanner(System.in);
		
		ObjectMapper mapper=new ObjectMapper();
		try 
		{
			JsonNode rootNode=mapper.readTree(file);
			
			String values="regular";
			System.out.println(""+values);
			
			JsonNode regular=rootNode.path(values);
			String str=regular.asText();
			System.out.println(""+str);
	/*-----------------------------------------------------------------------------*/		
			System.out.println("Enter the name");
			String name=sc.nextLine();
			if(name.matches("[a-zA-Z]+"))					
			{
				str=str.replace("<<name>>", name);				
			}
   /*------------------------------------------------------------------------------*/
			System.out.println("Enter the fullname");
			String fullname=sc.nextLine();
			if(fullname.matches("[a-zA-Z]+" ))				
			{
				str=str.replace("<<full name>>", fullname);		
			}
   /*-------------------------------------------------------------------------------*/
			System.out.println("Enter the phone number ");
			String number=sc.nextLine();
			
			if(Pattern.matches("[0-9]+",number))	
			{
				str=str.replaceAll("x{10}",number);
			}
   /*--------------------------------------------------------------------------------*/			
			Date currentDate = new Date();								 
	        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
	        String date = sdf.format(currentDate);
	        str=str.replaceAll("dd/mm/yyyy", date);
			
	        System.out.println(""+str);
						
		}
		catch (IOException e)
		{
			//System.out.println(""+e.getMessage());
			e.printStackTrace();
			
		}
	}
}



