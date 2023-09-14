import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("digite sua idade:" );
//
//        int idade = scanner.nextInt();
//        int resultado = idade*12;
//        System.out.println("resultado da idade em meses é:"+ resultado);
//        int resultado2=idade*365;
//        System.out.println("resultado da idade em dias é:"+ resultado2);
//        int resultado3= idade;
//        System.out.println("resultado da idade em anos é:"+ resultado3);
/// exercício --
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("digite um número:" );
//        int numero = scanner.nextInt();
//        System.out.println("o antecessor desse número é:" + (numero - 1));
//        System.out.println("o sucessor desse número é:" +( numero + 1));


//    Scanner scanner = new Scanner(System.in);
//    float numero1= 8;
//    float numero2= 9;
//    float numero3= 7;
//    float numero4= 4;
//    float numero5 = 5;
//        int numero6= 6;
//float media= (numero1 + numero2 + numero3)/3;
//        float media2= (numero4 + numero5 + numero6)/3;
//
//       System.out.println("a média aritmética desses números é :" + media);
//        System.out.println("a média aritmética desses números é :" + media2);
//        System.out.println("a soma das médias:" + (media2+media));
//        System.out.println("a média geral é :" + (media+media2)/2);

// EXERCÍCIO SOBRE ENTRADA LIBERADA

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um número:");
        int senha = scanner.nextInt();
        int senhacorreta = 159632;

        if (senha == senhacorreta) {
            System.out.println("acesso liberado");

        } else {
            System.out.println("acesso negado");
        }
    }
}
