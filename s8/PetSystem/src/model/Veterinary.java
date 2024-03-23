//Veterinary.java
package model;
import java.util.ArrayList;

public class Veterinary {

    private String name;
    public Client client;
    public Pet pet;
    public Date1 today = new Date1(23,3,2024);
    public ArrayList <Pet> pets = new ArrayList<>();
    public ArrayList <Client> clients = new ArrayList<>();
    

    public Veterinary(String pName) {
        this.name = pName;
    }

    public String toString() {
        return "{:Veterinary name= " + name + "}";
    }

    public void addClient(Client cl){
        this.client = cl;
        clients.add(cl);

    }

    public void addPet(String name, String color, double size, String typeFood){
        // why return boolean?
        this.pet = new Pet("Zuko", "white", 1000, "fruits");
        pets.add(pet);
    }

    public String getAgePet(){
        return pet.getAge();
    }

    public String getTimeTogether(){
        return pet.getTimeTogether();
    }

    public String getPetInfo(){
        return pet.toString();
    }

    public void setColorPet(){
        pet.setColor("white");
    }

    public Client searchClient(String id){
        int numClients = clients.size();
        Client foundClient = null;
        for (int i = 0; i < numClients; i++){
            if(id.equals(clients.get(i).getId())){
                foundClient = clients.get(i);
                i = numClients;
            }
        }
        return foundClient;
    }

    public String showPets(){
        int numPets = pets.size();
        String finalString = "";
        for(int i = 0; i < numPets; i++){
            finalString = finalString + pets.get(i).toString() + ", ";
            
        }

        return finalString;
    }
}