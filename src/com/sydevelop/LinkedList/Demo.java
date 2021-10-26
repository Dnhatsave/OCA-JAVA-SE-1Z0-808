package com.sydevelop.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {

    LinkedList<String> placesToVisit = new LinkedList<String>();

    public void addList(){
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit);

        placesToVisit.add(1,"Alice Spring");
        printList(placesToVisit);
        placesToVisit.remove(4);

        printList(placesToVisit);
    }

    private void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now is visiting " + i.next());
        }
        System.out.println("================================");
    }

}
