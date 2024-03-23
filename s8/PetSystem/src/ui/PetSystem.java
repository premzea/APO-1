//PetSystem.java
package ui;

// import java.util.Scanner;

import model.Veterinary;
import model.Client;
import model.Pet;
import java.util.ArrayList;

public class PetSystem {

    //pero cual diferencia declaracion de aqui y mas abajo sin el private? y aun asi segun esto objVterinary no se usa

    // static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("The template complies!!");
        Veterinary vet1, vet2, vet3;
        vet1 = new Veterinary("Super Mascotas");
        vet2 = new Veterinary("Perros y gatos");
        vet3 = new Veterinary("Paz animal");

        System.out.println(vet1.toString());
        System.out.println(vet2.toString());
        System.out.println(vet3.toString() + "\n");


        Client cl1, cl2,cl3;
        //cl1 = new Client(String pClient, String id);
        cl1 = new Client("Marcela", "1234");
        cl2 = new Client("String pClient", "A00405049");
        cl3 = new Client("Catalina Luna", "LOL12321");

        vet1.addClient(cl1);
        vet1.addClient(cl3);
        vet1.addClient(cl2);

        Client foundClient = vet1.searchClient("A00405049");
        System.out.println(foundClient.toString());


        System.out.println(cl1.toString());
        System.out.println(cl2.toString());
        System.out.println(cl3.toString() + "\n");
        System.out.println(cl2.toString());
        System.out.println(cl3.toString() + "\n");

        Pet pet1,pet2, pet3;

        //pet1 = new Pet(String pName, String bDate, String pColor, String dateOA, double pSize, String typeFood);
        pet1 = new Pet("Zuko", "White", 100, "Fruit");

        pet2 = new Pet("Koi",  "Multicolor", 0.5, "dead");

        pet3 = new Pet("Tatsu",  "Monocromatico", 50, "Love");

        pet1.setColor("Blanco con manchas");

        cl1.addPet(pet3);
        cl1.addPet(pet2);
        cl1.addPet(pet1);
        vet1.addPet("Zuko", "White", 100, "Fruit");
        vet1.addPet("Koi",  "Multicolor", 0.5, "dead");
        vet1.addPet("Tatsu",  "Monocromatico", 50, "Love");

        System.out.println(pet1.toString());
        System.out.println(pet2.toString());
        System.out.println(pet3.toString() + "\n");

        System.out.println(pet1.getName());
        System.out.println("Age: " + pet2.getAge());
        System.out.println("Time together: " + pet3.getTimeTogether() + "\n");
        System.out.println(pet1.getType());
        ArrayList<Pet> cl1Pets = cl1.getPets();
        System.out.println(cl1Pets.toString());

        System.out.println(vet1.showPets());
        
        



    }
}