import java.util.Scanner;

public class ProblemasCondicionales {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Problema 1: Edad y voto
        System.out.println("\nProblema 1: Edad y voto");
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        esElegibleParaVotar(edad); //llamado void
      
        // Problema 2: Número mayor
        System.out.println("\nProblema 2: Número mayor");
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        if (num1 != num2){
            System.out.println("El número mayor es: " + obtenerNumeroMayor(num1, num2) + "\n");
        }
        else {
            System.out.println("Los numeros son iguales \n");
        }
        
        // y si los numeros son iguales
        
        // Problema 3: Calificación de exámenes
        System.out.println("Problema 3: Calificación de exámenes");
        System.out.print("Ingrese la calificación en el valor del porcentaje de preguntas acertadas: ");
        int calificacion = scanner.nextInt();
        System.out.println("Calificación en letra: " + obtenerCalificacionEnLetra(calificacion) + "\n");
        

        // Problema 4: Día de la semana
        System.out.println("\nProblema 4: Día de la semana");
        System.out.print("Ingrese un número del 1 al 7: ");
        int numeroDia = scanner.nextInt();
        System.out.println("El día de la semana es: " + obtenerDiaDeLaSemana(numeroDia) + "\n");
        
        // Problema 5: Calculadora simple
        System.out.println("\nProblema 5: Calculadora simple");
        System.out.print("Ingrese el primer número: ");
        double num3 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num4 = scanner.nextDouble();
        System.out.print("Ingrese la operación (+, -, *, /): ");
        String operacion = scanner.next();
        System.out.println("El resultado es: " + calcular(num3, num4, operacion) + "\n");
        
        // Problema 5: 
        scanner.close();
    }

    // Método para el problema 1: Edad y voto
    public static void esElegibleParaVotar(int edad) {
        if(edad >= 18){
            System.out.println("Puedes votar");
        }
        else {
            System.out.println("No puedes votar menor, largate de aqui");
        }  
    }

    
    // Método para el problema 2: Número mayor
    public static int obtenerNumeroMayor(int num1, int num2) {
        int greaterNumber = 0;
        if (num1 > num2 ){
            return num1;
        }
        else if (num2 > num1){
            greaterNumber = num2;
        }
        return greaterNumber;
        
    }

    // Método para el problema 3: Calificación de exámenes
    public static char obtenerCalificacionEnLetra(int calificacion) {
        int num = 93;
        char grade = ' ';

        if ( num <= calificacion && calificacion< 100){
            grade = 'A';
        }

        else if (90 <= calificacion && calificacion< 93){
            grade = 'A';
        }

        else if (87 <= calificacion && calificacion< 90){
            grade = 'B';

        }

        else if (83 <= calificacion && calificacion< 87){
             grade = 'B';
        }

        else if (80 <= calificacion && calificacion< 83){
            grade = 'B';
        }

        else if (77 <= calificacion && calificacion < 80){
            grade = 'C';
        }
        else if (73 <= calificacion && calificacion < 77){
            grade = 'C';
         }
         else if (70 <= calificacion && calificacion < 73){
            grade = 'C';
         }
         else if (67 <= calificacion && calificacion < 70){
            grade = 'D';
         }
         else if (63 <= calificacion && calificacion < 67){
            grade = 'D';
         }
         else if (60 <= calificacion && calificacion < 63){
            grade = 'D';
         }
         else if (0 <= calificacion && calificacion < 60){
            grade = 'F';
         }

         return grade;
    }

    // Método para el problema 4: Día de la semana
    
    public static String obtenerDiaDeLaSemana(int numeroDia) {
        String dia = "";
        if (numeroDia == 1){
            dia = "Lunes";
        }
        else if (numeroDia == 2){
            dia = "Martes";
        }
        else if (numeroDia == 3){
            dia =  "Miercoles";
        }
        else if (numeroDia == 4){
            dia = "Jueves";
        }
        else if (numeroDia == 5){
            dia = "Viernes";
        }
        else if (numeroDia == 6){
            dia = "Sabado";
        }
        else if (numeroDia == 7){
            dia =  "Domingo";
        }
        return dia;
    }
    
    // Método para el problema 5: Calculadora simple
    public static double calcular(double num1, double num2, String operacion) {
        double answer = 0;

        if (operacion.equals("+")){
            answer = (double) num1 + num2;
        }
        else if (operacion.equals("-") ){
            answer = (double) num1 - num2;
        }
        else if (operacion.equals("*")){
            answer = (double) num1*num2;
        }
        else if (operacion.equals("/")){
            answer = (double) num1/num2;
        }

        return answer;
    }
}