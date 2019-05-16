package com.bridgelabs.statepattern;

public class TvRemote_Basic 
{
	private String state="";
	
	public void setState(String state){
		this.state=state;
	}
	
	public void doAction(){
		if(state.equalsIgnoreCase("ON")){
			System.out.println("TV is turned ON");
		}else if(state.equalsIgnoreCase("OFF")){
			System.out.println("TV is turned OFF");
		}
	}

	public static void main(String args[]){
		TvRemote_Basic remote = new TvRemote_Basic();
		
		remote.setState("ON");
		remote.doAction();
		
		remote.setState("OFF");
		remote.doAction();
	}

}


