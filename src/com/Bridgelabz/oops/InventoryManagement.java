package com.Bridgelabz.oops;
import java.io.File;
import java.util.Scanner;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class InventoryManagement 
{
	
	@SuppressWarnings("null")
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String path="/home/admin1/Desktop/akshay/inventory.json";
		File file=new File(path);
		
		ObjectMapper mapper=new ObjectMapper();
		int num;
		try
		{
			JsonNode rootNode=mapper.readTree(file);
			do
			{
				System.out.println("Enter the choice : ");
				System.out.println("\n (1)Rice"+" \t (2)Wheats"+"\t (3)Pulses ");
				System.out.println("==========================================");
				num=sc.nextInt();
				
				
			}
			
			while(num < 0 || num > 4);
			{
				String Inventoryproduct=" ";
				switch(num)
				{
					case 1: Inventoryproduct="Rice";
							break;
							
					case 2: Inventoryproduct="Wheat";
							break;
							
					case 3: Inventoryproduct="Pulses";
							break;
							
					default: System.err.println(" *Invalid input give only valid Input[1,2,3]* ");
							 break;
				}
				JsonNode inventory=rootNode.path(Inventoryproduct);
				
				
				@SuppressWarnings("unused")
				class Json
				{
					{
					for(JsonNode node:inventory);
					}
				}

				{
					JsonNode node = null;
					String name=node.path("name").asText();
					int price=node.path("price").asInt();
					int weight=node.path("weight").asInt();
					
					System.out.println("Name: " + name + "\tprice: " + price + "\tWeight: "+ weight);
					System.out.println("--------------------------------------------> \nTotal Cost = " + price * weight + "Rs" + "\n");
				}				
			}
		}
			
		
		catch(Exception e)
		{
			//System.out.println(" "+e.getMessage());
			System.err.println(" ****************** invalid arguments *****************");
		}
		sc.close();
		}
		
		
	 	
	}
	





