package com.bridgelabz.designpatterns.creationalpatterns.singleton;

public class LazyInialization 
{
private static LazyInialization instance;
    
    private LazyInialization(){}
    
    public static LazyInialization getInstance(){
        if(instance == null){
            instance = new LazyInialization();
        }
        return instance;
    }

}
