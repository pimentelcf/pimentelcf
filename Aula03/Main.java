package Aula03;

import java.util.Scanner;

 public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        
        
        int opcao = -1;

        while (opcao != 0) {
            
            System.out.println("\n===== CALCULADORA =====");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();

           
            if (opcao == 0) {
                System.out.println("\nPrograma encerrado. Até logo!");
                break;
            }

        
            if (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida! Tente novamente.");
                continue;
            }

           
            System.out.print("Entre com o primeiro número: ");
            double n1 = scanner.nextDouble();

            System.out.print("Entre com o segundo número: ");
            double n2 = scanner.nextDouble();

            
            calculadora.setPrimeiroNumero(n1);
            calculadora.setSegundoNumero(n2);

            
            System.out.print("Resultado: ");
            switch (opcao) {
                case 1:
                    System.out.println(calculadora.somar());
                    break;
                case 2:
                    System.out.println(calculadora.subtrair());
                    break;
                case 3:
                    System.out.println(calculadora.multiplicar());
                    break;
                case 4:
                    System.out.println(calculadora.dividir());
                    break;
            }
        }

        scanner.close();
    }

}

