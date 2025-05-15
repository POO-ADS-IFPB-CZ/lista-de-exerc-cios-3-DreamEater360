import java.util.ArrayList;
import java.util.Scanner;

// SEQUENCIA DE FIBONACCI COMEÇA DO 1 E NAO DO 0
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        // se trocar os valores de aux e sum ele começa do 0
        int aux = 0;
        int sum = 1;

        System.out.println("Informe um numero:");
        int num = sc.nextInt();

        for (int i=0; i<=num-1; i++){
            nums.add(sum);
            int temp = aux;
            aux = sum;
            sum = temp + aux;

        }

        System.out.println(nums);
    }
}