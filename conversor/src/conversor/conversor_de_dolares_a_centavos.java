package conversor;

import java.util.Scanner;

public class conersor_de_dolares_a_centavos {
    Scanner lector = new Scanner(System.in);

    public conersor_de_dolares_a_centavos(){
        int dolares;
        float centavos;
        float dolar = 100;
        System.out.println("Ingresar la cantidad de Dolares : ");
        dolares =lector.nextInt();

        centavos =dolar*dolares;

        System.out.println(+dolares+ " Dolares equivalen a "+centavos+" centavos");
    }

    public static void main(String[] args) {
	Main solucion = new Main();

    }
}