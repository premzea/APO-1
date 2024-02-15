import java.util.Scanner;

public class Manager{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] x){
        // creating variables
        int precioQueensalchi = 65000;

        int Unidades;

        System.out.println("Unidades de Queen Papa: ");
        Unidades = sc.nextInt();

        int precioUnidades = precioQueensalchi * Unidades;

        int precioImpuesto = (int) (precioUnidades * 0.08); 

        int precioTotal = precioUnidades + precioImpuesto;

        System.out.println("\nQueen Papa \n");

        System.out.println("Factura de Venta \n");
        System.out.println(""+ Unidades + "x Unidades Queen Salchi.......$" + precioUnidades);
        System.out.println("Impuesto por consumo (8%).......$" + precioImpuesto);
        System.out.println("Total a pagar...................$" + precioTotal);
        System.out.println("Gracias por preferirnos!");

    }

    


}