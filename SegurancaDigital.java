import java.util.Scanner;

public class SegurancaDigital {
    public static void main(String[] args) {
       
    // Apresentação do Menu Principal do Sistema de Provas. :D
       
        Scanner leitura = new Scanner(System.in);
        int opcao = -1;


        while (opcao != 0 ) {

            System.out.println("============================================");
            System.out.println("   BEM-VINDO AO QUIZ DE SEGURANÇA DIGITAL!  ");
            System.out.println("============================================");
            System.out.println("Escolha uma das opções abaixo :)!");
            System.out.println("1 - Prova 1: Senhas seguras");
            System.out.println("2 - Prova 2: Golpes Online");
            System.out.println("3 - Prova 3: Privacidade Digital");
            System.out.println("0 - Sair");
            System.out.println("============================================");
            opcao = leitura.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Opção Escolhida: Prova 1!");
                break;
            case 2:
                System.out.println("Opção Escolhida: Prova 2!");
                break;
            case 3:
                System.out.println("Opção Escolhida: Prova 3!");
                break;
            case 0:
                System.out.println("Encerrando. Até breve!");
                break;
            default:
                System.out.println("Opção Inválida! Revise sua escolha e tente novamente!");
                break;

        }
        }
    
    //  Criação das provas e suas perguntas sobre Segurança Digital. :D

        int acertos = 0;
        char resposta;

        System.out.println("\n--- PROVA 1: SENHAS SEGURAS ---");
        System.out.println("\nPergunta 1:");
        System.out.println("Qual opções abaixo representa uma senha segura contra invasão de dados?");
        System.out.println("A - qwertyuiop");
        System.out.println("B - K*6%dsd_=832");
        System.out.println("C - senha12345");
        System.out.println("D - 2444666668888888");
        System.out.print("Qual sua resposta? :)");
        
        resposta = leitura.next().charAt(0);

        if (resposta == 'B') {
            System.out.println("✓ Resposta correta! Senha com simbolos e letras variadas são extremamente seguras.");
            acertos++;
        }else if (resposta == 'A'){
            System.out.println("✗ Resposta incorreta! Este tipo de senha é o que mais facilita a invasão de seus dados. Tenha cuidado!");
        }else if (resposta == 'D'){
            System.out.println("✗ Resposta incorreta! Por mais que a senha tenha uma leve variação de caracteres, ainda sim é facilmente descoberta por invasores.");
        }else {
            System.out.println("✗ Resposta incorreta! Nunca utilize este tipo de senha em sua conta. Normalmente, elas são uma das primeiras tentativas de algorítimos para a tentativa de invasão.");
        }

        System.out.println("\nPergunta 2");
        }
    }
