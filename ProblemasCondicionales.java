
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
        int num2 = scanner.nextInt();´
        if (num1 != num2){
            System.out.println("El número mayor es: " + obtenerNumeroMayor(num1, num2));
        }
        else {
            System.out.println("Los numeros son iguales");
        }
        
        // y si los numeros son iguales
        
        // Problema 3: Calificación de exámenes
        System.out.println("Problema 3: Calificación de exámenes");
        System.out.print("Ingrese la calificación en el valor del porcentaje de preguntas acertadas: ");
        int calificacion = scanner.nextInt();
        System.out.println("Calificación en letra: " + obtenerCalificacionEnLetra(calificacion));
        

        // Problema 4: Día de la semana
        System.out.println("\nProblema 4: Día de la semana");
        System.out.print("Ingrese un número del 1 al 7: ");
        int numeroDia = scanner.nextInt();
        System.out.println("El día de la semana es: " + obtenerDiaDeLaSemana(numeroDia));
        
        // Problema 5: Calculadora simple
        System.out.println("\nProblema 5: Calculadora simple");
        System.out.print("Ingrese el primer número: ");
        double num3 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num4 = scanner.nextDouble();
        System.out.print("Ingrese la operación (+, -, *, /): ");
        String operacion = scanner.next();
        System.out.println("El resultado es: " + calcular(num3, num4, operacion));
        
        // Problema 5: 
        scanner.close();
    }

    // Método para el problema 1: Edad y voto
    public static void esElegibleParaVotar(int edad) {
        if(edad >= 18){
            print("Puedes votar");
        }
        else {
            print("No puedes votar menor, largate de aqui");
        }  
        }

    
    // Método para el problema 2: Número mayor
    public static int obtenerNumeroMayor(int num1, int num2) {
        int greaterNumber;
        if (num1 > num2 ){
            return num1;
        }
        else if (num2 > num1){
            greaterNumber = num2;
        }
        return greaternumber;
        
    }

    // Método para el problema 3: Calificación de exámenes
    public static char obtenerCalificacionEnLetra(int calificacion) {
        int num = 93
        int multiplier =0
            
        if ( num =< calificacion< 100){
            multiplier ++;
            return A;
        }
        else if (num-3*multiplier =<calificacion< 93){
            multiplier ++;
            return -A;
        }
        else if (num-3*multiplier =<calificacion< num-3*(multiplier-1)){
            return B+;

        }
        else if (num-3*multiplier=<calificacion<num-3*(multiplier-1)){
            return B;
        }
        else if (num-3*multiplier=<calificaion< num-3*(multiplier-1)){
            return B-;
        }
        else if (num-3*multiplier=<calificacion< num-3*(multiplier-1)){
            return C+
        }
        else if (num-3*multiplier=<calificacion< num-3*(multiplier-1)){
            return C;
        }
        else if (num-3*multiplier=< calificacin< num-3*(multiplier-1)){
            return C-;
        }
        else if (num-3*multiplier=<calificacion< num-3*(multiplier-1)){
            return D+;
        }
        else if (num-3*multiplier =< calificacion < num-3*(multiplier-1)){
            return D;
        }
        else if (num-3*multiplier =< calificacion < num-3*(multiplier-1)){
            rerutn D-;
        }
        else if (0< calificacion <num-3*(multiplier-1)){
            return F;
        }
    }

    // Método para el problema 4: Día de la semana
    public static String obtenerDiaDeLaSemana(int numeroDia) {
        if (numeroDia=1){
            return "Lunes";
        }
        else if (numeroDia=2){
            return "Martes";
        }
        else if (numeroDia=3){
            return "Miercoles";
        }
        else if (numeroDia=4){
            return "Jueves";
        }
        else if (numeroDia=5){
            return "Viernes";
        }
        else if (numeroDia=6){
            return "Sabado";
        }
        else if (numeroDia=7){
            return "Domingo";
        }
    }
    // Método para el problema 5: Calculadora simple
    public static double calcular(double num1, double num2, String operacion) {
        if (operacion == "+"){
            return num1 + num2;
        }
        else if (operacion == "-"){
            return num1 - num2;
        }
        else if (operacion == "*"){
            return num1*num2;
        }
        else if (operacion == "/"){
            return num1/num2;
        }
    }

    


}
