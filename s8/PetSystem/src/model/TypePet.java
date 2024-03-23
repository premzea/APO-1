// TypePet.java
package model;

public enum TypePet{
    GATO,
    PERRO,
    PAJARO,
    SERPIENTE;


    public int getPetType(){
        return this.ordinal();
    }

    public String toString(){
        return "Perro";
    }
}

//do not understand what this class supossed to do 