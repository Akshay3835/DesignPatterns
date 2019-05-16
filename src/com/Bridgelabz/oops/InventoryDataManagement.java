package com.Bridgelabz.oops;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class InventoryDataManagement
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String Path="/home/admin1/Desktop/akshay/inventory.json";
		File file=new File(Path);
		ObjectMapper mapper=new ObjectMapper();
		try 	
		{
			JsonNode rootNode=mapper.readTree(file);
			JsonNode inventory=rootNode.get("Rice");				
			System.out.println("Rice");	
			System.out.println("-------------------------------------------");
			for(JsonNode node:inventory)
			{	
				String name=node.path("name").asText();
				int price=node.path("price").asInt();
				int weight=node.path("weight").asInt();
			
				System.out.println("Name:"+name+"\tPrice: "+price+" Rs"+"\tWeight: "+weight+" Kg");
				System.out.println("Total: "+price*weight+" Rs"+"\n");
			}
			
			JsonNode inventory1=rootNode.get("Pulses");
			System.out.println("Pulses");
			System.out.println("--------------------------------------------");
			for(JsonNode node:inventory1)
			{		
				String name=node.path("name").asText();
				int price=node.path("price").asInt();
				int weight=node.path("weight").asInt();
			
				System.out.println("Name:"+name+"\tPrice: "+price+" Rs"+"\tWeight: "+weight+" Kg");
				System.out.println("Total: "+price*weight+" Rs"+"\n");
			}
		
			JsonNode inventory2=rootNode.get("Wheat");
			System.out.println("Wheat");
			System.out.println("----------------------------------------------");
			for(JsonNode node:inventory2)
			{		
				String name=node.path("name").asText();
				int price=node.path("price").asInt();
				int weight=node.path("weight").asInt();
			
				System.out.println("Name:"+name+"\tPrice: "+price+" Rs"+"\tWeight: "+weight+" Kg");
				System.out.println("Total: "+price*weight+" Rs"+"\n");
			}
	
		}
	
		catch (IOException e)
		{
			System.out.println(""+e.getMessage());		
			e.printStackTrace();
		}
		sc.close();
	}
}


