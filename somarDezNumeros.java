package somaDosNumeros;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class SomarDezNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorFinal = 0;
        for (int i = 1; i <=10;i++){
            System.out.println(new String(String.format("Informe o %sª valor: ",i).getBytes(StandardCharsets.UTF_8)));
            int valor = sc.nextInt();
            valorFinal = valor + valorFinal;
        }

        System.out.println(new String(String.format("A soma dos dez números é: %s",valorFinal).getBytes(StandardCharsets.UTF_8)));




    }
}
