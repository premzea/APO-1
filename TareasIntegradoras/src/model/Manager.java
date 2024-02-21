import java.util.Scanner;

public class Manager{

    public static void main(String[] x){
        double LugggageWeight;
        int TravelType, NumberofPassengers;

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a travel type between travelling alone (1) or travelling with friends (2): ")
        TravelType = sc.getInt();
        System.out.println("Luggage Weight: ")
        LugggageWeight = sc.getDouble();
        NumberofPassengers = TravelType == 1 ? 1:3;

    }

    
}