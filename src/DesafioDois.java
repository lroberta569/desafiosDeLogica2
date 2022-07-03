import java.util.ArrayList;
import java.util.Scanner;

public class DesafioDois {
    
    public static void main (String[] args) {


        int a = 1;
        int b = 0;
        int c;
        int n;
        ArrayList<Integer> fibonacci = new ArrayList<Integer>();
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um numero: ");
	    n = ler.nextInt();

        for(int i = 0; i<30; i++){
            c = a;
            a = a+b;
            b = c;
            fibonacci.add(c);

        }

        if(fibonacci.contains(n)){
            System.out.println("O numero digitado pertence a sequência de Fibonacci");
        } else{
            System.out.println("O numero digitado não pertence a sequência de Fibonacci");
        }

        ler.close();
    }
}
