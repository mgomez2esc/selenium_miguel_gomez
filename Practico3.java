package Clase3;

import java.util.Scanner;

public class Practico3 {

    public static void main (String args[]){

    System.out.println(dameDoble(2));
    System.out.println(operacionesMatematicas(1,2,3));

    }

    public static int dameDoble (int num){
        return num*2;

    }
    public static boolean numMayo20 (int num){

        if(num>20){
            return true;
        }else{
            return false;
        }
    }
    public static int multiDosNum (int num1, int num2){

        return num1*num2;
    }
    public static double multiDosNum (int num1, double num2){

        double aux = num1;

        return aux * num2;
    }
    public static int cualEsMayor (int num1, int num2){

        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }
    public static int multiNumRecibido (int num1){

        int multi=1;
        for(int i = 1; i<=num1; i++){
            multi = multi + num1;
        }
        return multi;
    }
    public static boolean esPar (int num1){

        if(num1%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static double areaCirculo (int num1){

        double pi = 3.14;

        return (num1^2)*pi;
    }
    public static int areaParalelogramo(int alto, int ancho){

        return alto*ancho;
    }
    public static void retornaDolEur(int num){

        System.out.println("Los dolares son: "+ num + "Mientras que los euros serian: " + num);
    }
    public static float calculoIva(float num1){

        float aux= (float) 0.200;
        float IVA = 0;

        IVA = (float) (num1*1.200);
        IVA = IVA * aux;

        return IVA;

    }
    public static boolean numRango(int numayor, int numenor, int num1){
        boolean esCierto = false;
        if (numayor>num1 && numenor<num1){
            return esCierto;
        }
        return esCierto;
    }
    public static double coversorMillas(double km){

        return km*1.6;
    }
    public static int sumaNumPare(int num1){

        int resultado = 0;
        for(int i=1; i<=num1; i++){
            if(i%2==0){
                resultado = resultado + i;
            }
        }
        return resultado;
    }
    public static String tipoTriangulo (int a, int b, int c){

        if (a==b && b==c){
            return "Triangulo escaleno";
        }
        if (a==b || b==c){
            return "Triangulo isosceles";
        }else{
            return "Triangulo escaleno";
        }

    }
    public static int factorial (int num1){

        int factorial=1;
        
        for(int i=1; i<=num1; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
    public static int valorAbsoluto (int num1){

        if (num1<0){
            num1= num1 * -1;
        }
        return num1;
    }
    public static int operacionesMatematicas (int opt, int num1, int num2){
        Scanner input = new Scanner(System.in);
        int resultado = 0;

        System.out.println("Introduzca una opcion");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. Division");
        opt = input.nextInt();

        switch (opt){
            case 1:
                resultado = num1+num2;
                break;
            case 2:
                resultado = num1-num2;
                break;
            case 3:
                resultado = num1*num2;
                break;
            case 4:
                resultado = num1/num2;
                break;
            default:
                System.out.println("Opcion desconozida");
                break;
        }
        return resultado;

    }
    public static void calculoPromedio(){
        Scanner input = new Scanner(System.in);
        int num = 1;
        int cont1 = 0;
        int suma = 0;
        boolean repeat = true;

        System.out.println("Programa peticion de numeros hasta ingresar 0, luego aparecer el promedio");

        while (repeat){

            System.out.println("Por favor, ingrese un numero");
            int numeroingresado = input.nextInt();
            System.out.println("El numero ingreado ha sido: " + numeroingresado );
            cont1++;
            if(numeroingresado == 0){
                repeat = false;
            }
            suma = suma + numeroingresado;
        }
        System.out.println("Fin de programa por haber introducir el numero 0");
        System.out.println("El promedio es: " + suma/cont1);
    }
    public static boolean esMayorEdad(int num1){
        if(num1>18){
            return true;
        }else{
            return false;
        }
    }
    public static boolean esVerdadero(int num1, int num2){
        if(num1>num2){
            return true;
        }else{
            return false;
        }
    }
}
