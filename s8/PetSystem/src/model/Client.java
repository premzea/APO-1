//Client.java
package model;

import java.util.ArrayList;

public class Client {

    private String name;
    private String id;
    public Pet pet;
    public ArrayList <Pet> pets = new ArrayList<>();

    public Client(String pClient, String id) {
        this.name = pClient;
        this.id = id;
    }

    public String toString(){
        return "{Client name = " + name + ", Client ID = " + id + "}";
    }

    public void addPet(Pet myPet){
        // why return boolean?
        this.pet = new Pet("Zuko", "white", 1000, "fruits");
        pets.add(pet);
    }

    public Object searchPet(String name){
        int numPets = pets.size();
        Pet foundPet = null;
        for (int i = 0; i < numPets; i++){
            if(name.equals(pets.get(i).getName())){
                foundPet = pets.get(i);
                i = numPets;
            }
        }
        return foundPet;
    }

    public String getId(){
        return id;
    }

    public ArrayList<Pet> getPets(){
        // return type changed so i can have unlimited pets :)
        return pets;
    }
}