package com.rakesh.devOps;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ShoppingList {
	private List<Device> items = new ArrayList<>(); 
	  
    public void addItem(Device item) { 
        items.add(item); 
    } 
  
    public List<Device> getItems() { 
        return items; 
    } 

}
