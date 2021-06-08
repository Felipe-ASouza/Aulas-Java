import java.util.*;
public class Valores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro numero:");

        int n1 = sc.nextInt();

        System.out.println("Informe o segundo numero:");

        int n2 = sc.nextInt();

        System.out.println("Informe o terceiro numero:");

        int n3 = sc.nextInt();

        if(n1 > n2 && n1 > n3){
            System.out.println("O numero maior e :" + n1);
        }

        else if(n2 > n1 && n2 > n3){
            System.out.println("O numero maior e :" + n2);
        }

        else if( n3 > n2 && n3 > n1){
            System.out.println("O numero maior e :" + n3);
        }
}
}