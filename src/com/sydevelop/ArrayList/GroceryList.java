package com.sydevelop.ArrayList;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String item){
        groceryList.add(item);
    }

    public void printList(){
        System.out.println("You have " + groceryList.size() + " itens in your list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println( (i+1)+  ". " + groceryList.get(i));
        }
    }

    public void updateList(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("List item " + (position + 1) + " has been updated" );
    }

    public void removeItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println( theItem + " was removed from the list");
    }

    public String findItem(String searchItem){
        //boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if (position >= 0){
            return searchItem;
        }
        return null;
    }

}
