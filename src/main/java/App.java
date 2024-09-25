package main.java;
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        //Biblioteca para entrada de dados
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Entre com a massa: ");
        double massa = sc.nextDouble();

        System.out.print("Entre com a altura: ");
        double altura = sc.nextDouble();

        CorpoHumano cp = new CorpoHumano(massa , altura);

        System.out.println(cp.calcIMC());

        sc.close();

    }
}
// RESPOSTAS
/*
 * 1° A não é possível alterar diretamente  c1.massa = "2"; pois o atributo massa é privado;
 * 2° Ao alterar o o acesso para oublic é possível fazer alterações diretamente;
 * 3° O tipo private não permite ter acesso além da própria classe, então retorna erro;
 * 
 */