import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<=5; i++){
            System.out.println("Informe um numero entre 1 a 60: ");
            int num = sc.nextInt();
            while (num < 1 || num > 60 || numeros.contains(num)){
                System.out.println("Numero invalido, tente novamente:");
                num = sc.nextInt();

            }

            numeros.add(num);
        }

        Collections.sort(numeros);
        System.out.println(numeros);

    }
}