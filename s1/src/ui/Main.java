package ui;

import model.Manager;

public class Main{
	
	public static void main(String[] arga){
		Manager m = new Manager("hola mundo!");
		System.out.print(m.getTexto());
	}
	
}