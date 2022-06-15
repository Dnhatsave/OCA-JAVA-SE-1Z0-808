package com.sydevelop.ArrayList;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contacts> myContacts;

    public MobilePhone(){
        this.myContacts = new ArrayList<>();
    }

    // Versao antiga
    public void store(Contacts item){
        myContacts.add(item);
    }

    // Nova versao
    public boolean add (Contacts contacts){
        // verificar se o contacto existe na lista
        if (findContact(contacts.getName()) >= 0){
            System.out.println("Contact already exists!!");
            return false;
        }
        this.myContacts.add(contacts);
        return true;
    }

    public void printList(){
        System.out.println("You have " + myContacts.size() + " contact on your list");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println( (i+1) + " - " + myContacts.get(i).getName() + "->" +
                                myContacts.get(i).getPhoneNumber());
        }
    }

    // Nova versao
    public boolean remove(Contacts contacts){
        int foundPosition = findContact(contacts);
        if (foundPosition >= 0){
            this.myContacts.remove(contacts);
            System.out.println( contacts.getName() + ", was successfully removed");
            return true;
        }
        return false;
    }

    public void modify(Contacts currentPosition,Contacts newItem){
        int position = findContact(currentPosition);
        if (position >- 0){
            modify(position,newItem);
        }

    }

    private void modify(int position, Contacts newItem){
        myContacts.set(position,newItem);
        System.out.println("The contact was updated");
    }

    // Nova versao
    public boolean update(Contacts oldContact, Contacts newContact){
        int position = findContact(oldContact);
        // Verficar se o contacto existe
        if (position < 0){
            System.out.println("Contact " + oldContact.getName() + " was not found, update failed");
            return false;
        }else if (findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() + " Already exists, Error");
            return false;
        }
        this.myContacts.set(position, newContact);
        System.out.println("Contact " + oldContact.getName() + " was changed to " + newContact.getName());
        return true;
    }


    private int findContact(Contacts position){
        // retornar a posicao da lista de contactos
        return myContacts.indexOf(position);
    }

    private int findContact(String contactName){
        for (int i = 0; i < myContacts.size(); i++) {
            // instanciar uma classe equivalente a lista
            Contacts myContacts = this.myContacts.get(i);
            // comparar se o contacto existe
            if (myContacts.getName().equals(contactName)){
                // retornar o contacto existente
                return i;
            }
        }
        return -1;
    }

    // return contact name string
    public String queryContact(Contacts contacts){
        if (findContact(contacts) >=0){
            return contacts.getName();
        }
        return null;
    }


    //Return contact object based on name
    public Contacts queryContact(String name){
        int position = findContact(name);
        if( position >=0){
            return this.myContacts.get(position);
        }
        return null;
    }

    public boolean onFile(Contacts item){
        int position = findContact(item);
        if (position >= 0 ){
            return true;
        }
        return false;
    }
}
