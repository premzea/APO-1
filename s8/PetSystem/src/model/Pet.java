//Pet.java
package model;



public class Pet {
    private String name;
    private String color;
    private double size;
    private String typeFood;
    public Date1 birthDate;
    public Date1 dateOfAdoption;
    public Date1 today;

    public Pet(String pName, String pColor, double pSize, String typeFood) {
        this.name = pName;
        this.color = pColor;
        this.size = pSize;
        this.typeFood = typeFood;
        this.birthDate=new Date1(1,2,2023);
        this.dateOfAdoption=new Date1(2,3,2024); 
        this.today=new Date1(23,3,2024);
    }





    public String toString(){
        return ("Pet name =" + name + ", Birth Date= " + birthDate.toString() + ", Color= " +
        color + ", Date of Adoption: " +
        dateOfAdoption.toString() + ", Size= " + size + ", Type Food= " + typeFood);
    }

    public String getAge() {
        String age = Date1.diffDatetoString(birthDate.timeBetween(today));
        return age;
    }

    public String getTimeTogether() {
        String timeTogether = Date1.diffDatetoString(dateOfAdoption.timeBetween(today));
        return timeTogether;
    }

    public String getName() {
        return name;
    }

    public void setColor(String pColor){
        this.color = pColor;
    }

    public String getType(){
        TypePet type = TypePet.PERRO;
        return type.toString();
    } 
}