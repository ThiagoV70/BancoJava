import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
dados dados;
        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
         char response = sc.next().charAt(0);

         if (response == 'y') {

             System.out.print("Enter initial deposit value: ");
             double initialdeposit = sc.nextDouble();
             dados = new dados(number, name, initialdeposit);
         }else {
             dados = new dados(number, name);
         }
        System.out.println();
        System.out.print(dados);
        System.out.println();

        System.out.print("Enter deposit value: ");
        double add = sc.nextDouble();
        dados.addeposit(add);
        System.out.println("Update account data:");
        System.out.print(dados);

        System.out.println();
        System.out.print("Enter a withdrawal value: ");
        double remov = sc.nextDouble();
        dados.removdeposit(remov);
        System.out.println("Update account data:");
        System.out.print(dados);
sc.close();
    }
}