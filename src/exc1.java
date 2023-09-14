import java.util.Scanner;

public class exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("quantos shampoo tem no estoque?");
        int estoquedeshampoo= scanner.nextInt();

        System.out.println("Quantos shampoo deseja comprar?");
        int venda= scanner.nextInt();
          System.out.println("ainda restam no estoque: " + (estoquedeshampoo - venda));
          int estoquetotaldeshampoo= estoquedeshampoo - venda;

        System.out.println(" estoque atual de oléo capilar:");
        int oleocapilar= scanner.nextInt();
        System.out.println("Quantos oléos deseja comprar?");
        int venda2= scanner.nextInt();
         int estoquetotaldeoleo = oleocapilar - venda2;
        System.out.println("ainda restam no estoque: " + (estoquetotaldeoleo));


        System.out.println(" estoque atual de máscaras:");
        int mascaraestoque= scanner.nextInt();
        System.out.println("Quantas máscaras deseja comprar?");
        int venda3= scanner.nextInt();
        int estoquetotal=mascaraestoque - venda3;
        System.out.println("ainda restam no estoque: " + (estoquetotal));


        System.out.println(" estoque atual de todos os produtos:" + (estoquetotaldeoleo + estoquetotal + estoquetotaldeshampoo));
        System.out.println("compras com desconto");

        float compra = scanner.nextFloat();


        if (compra == 200) {
            compra -= (compra*15)/100;
            System.out.println("você recebeu 15% de desconto: " + compra);

        }


        if (compra >= 400) {
            compra -= (compra*30)/100;
            System.out.println("você recebeu 30% de desconto: " + compra);

        }
        else {
            System.out.println("A sua compra não atingiu o valor para descontos");
        }




    }
}
