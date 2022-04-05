import java.util.Scanner;

    public class Menu {
        public static void main(String[] args) {
            System.out.println("|   MENU                     |");
            int option;
            do {
                System.out.println("| Opções:                    |");
                System.out.println("|         1. Opção 1         |");
                System.out.println("|         2. Opção 2         |");
                System.out.println("|         3. Sair            |");
                Scanner menu = new Scanner(System.in);

                System.out.print(" Selecione uma opção: ");
                option = menu.nextInt();


                switch (option) {

                    case 1 -> System.out.println("Você escolheu a primeira opção");

                    case 2 -> System.out.println("Você escolheu a segunda opção");

                    case 3 -> System.out.println("O programa foi encerrado");

                    default -> System.out.println("Seleção inválida"); }

                } while ( option != 3) ;

                System.out.print("    ");

            }
        }