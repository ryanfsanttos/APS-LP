import java.util.Scanner;

public class verificacaotestecodigo {
    public static void main(String[] args) {

        // Apresentação do Menu Principal do Sistema de Provas. :D

        Scanner leitura = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {

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
                    
                // Começo da prova e suas determinadas questões
                    System.out.println("Opção Escolhida: Prova 1!");
                    int acertos = 0;
                    char resposta;

                    System.out.println("\n--- PROVA 1: SENHAS SEGURAS ---");

                    // Questão inicial

                    System.out.println("\n1ª QUESTÃO:");
                    System.out.println("Qual opções abaixo representa uma senha segura contra invasão de dados?");
                    System.out.println("A - qwertyuiop");
                    System.out.println("B - K*6%dsd_=832");
                    System.out.println("C - senha12345");
                    System.out.println("D - 2444666668888888");

                    // O while aqui é proposto para caso o usuário escolha outro tipo de opção como 'E', por exemplo, a questão pergunte novamente até que ele dê uma resposta válida.
                    while(true) {
                        System.out.print("Qual sua resposta? :) ");
                        
                        resposta = Character.toUpperCase(leitura.next().charAt(0));

                        if (resposta == 'A' || resposta == 'B' || resposta == 'C' || resposta == 'D') {
                            break;
                        }

                        System.out.println("[>:(] Opção inválida! Escolha A, B, C ou D.");
                    }

                    if (resposta == 'B') {
                        System.out.println("[:D] Resposta correta! Senha com simbolos e letras variadas são extremamente seguras.");
                        acertos++;

                    } else if (resposta == 'A') {
                        System.out.println("[:(] Resposta incorreta! Este tipo de senha é o que mais facilita a invasão de seus dados. Tenha cuidado!");

                    } else if (resposta == 'D') {
                        System.out.println("[:(] Resposta incorreta! Por mais que a senha tenha uma leve variação de caracteres, ainda sim é facilmente descoberta por invasores.");

                    } else if(resposta == 'C'){
                        System.out.println("[:(] Resposta incorreta! Nunca utilize este tipo de senha em sua conta. Normalmente, elas são uma das primeiras tentativas de algorítimos para a tentativa de invasão.");
                    } else {
                        System.out.println("[>:(] Opção inválida! Escolha A, B, C ou D.");
                    }

                    // PRÓXIMA QUESTÃO

                    System.out.println("\n2ª QUESTÃO");
                    System.out.println("Com que frequência se deve trocar as senhas da(s) sua(s) conta(s)?");
                    System.out.println("A - A cada 3 a 6 meses.");
                    System.out.println("B - Se for forte, nunca. Eles não conseguiriam acertar, haha!");
                    System.out.println("C - Somente quando esquecê-la");
                    System.out.println("D - Uma vez por dia");
                    
                    while(true) {
                        System.out.print("Qual sua resposta? :) ");
                        
                        resposta = Character.toUpperCase(leitura.next().charAt(0));

                        if (resposta == 'A' || resposta == 'B' || resposta == 'C' || resposta == 'D') {
                            break;
                        }

                        System.out.println("[>:(] Opção inválida! Escolha A, B, C ou D.");
                    }
                    
                    if (resposta == 'A') {
                        System.out.println("[:D] Resposta correta! Dessa forma, sua(s) conta(s) sempre se manterão protegidas.");
                        acertos++;
                    } else if (resposta == 'B') {
                        System.out.println("[:(] Resposta incorreta! Por mais segura que sua senha seja, é sempre recomendável trocá-la de período em período.");
                    } else if (resposta == 'C') {
                        System.out.println("[:(] Resposta Incorreta. Jamais faça isso, o risco de vulnerabilidade é muito grande.");
                    } else if (resposta == 'D') {
                        System.out.println("[:(] Resposta incorreta! Até é uma opção víavel, no entanto, extremamente cansativa.");
                    } else {
                        System.out.println("[>:(] Opção inválida! Escolha A, B, C ou D.");
                    }

                    // PRÓXIMA QUESTÃO

                    System.out.println("\n3ª QUESTÃO");
                    System.out.println("O que é autenticação de dois fatores?");
                    System.out.println("A - Utilização de duas senhas iguais");
                    System.out.println("B - Fazer login na conta duas vezes");
                    System.out.println("C - Ter duas contas no mesmo aplicativo");
                    System.out.println("D - Confirmar a identidade do usuário com dois métodos diferentes");

                    while(true) {
                        System.out.print("Qual sua resposta? :) ");
                        
                        resposta = Character.toUpperCase(leitura.next().charAt(0));

                        if (resposta == 'A' || resposta == 'B' || resposta == 'C' || resposta == 'D') {
                            break;
                        }

                        System.out.println("[>:(] Opção inválida! Escolha A, B, C ou D.");
                    }

                    if (resposta == 'D') {
                        System.out.println("[:D] Resposta correta! Este tipo de confirmação o sistema certificará duas vezes que é realmente o proprio usuário tentando logar na conta.");
                        acertos++;
                    } else if (resposta == 'A') {
                        System.out.println("[:(] Resposta incorreta! Isso, na verdade, é uma irresponsabilidade do usuário, haha!");
                    } else if (resposta == 'B') {
                        System.out.println("[:(] Resposta Incorreta. Ele faz o login, mas não com essa proposta.");
                    } else if (resposta == 'C') {
                        System.out.println("[:(] Resposta incorreta! É algo totalmente distinto do que é proposto.");
                    } else {
                        System.out.println("[>:(] Opção inválida! Escolha A, B, C ou D.");
                    } 

                    // PRÓXIMA QUESTÃO

                    System.out.println("\n4ª QUESTÃO");
                    System.out.println("Qual das opções abaixo representa uma prática ERRADA ao criar uma senha?");
                    System.out.println("A - Misturar letras, números e símbolos");
                    System.out.println("B - Utilizar senhas longas");
                    System.out.println("C - Utilizar o próprio nome como senha");
                    System.out.println("D - Não repetir senhas em sites diferentes");

                    while(true) {
                        System.out.print("Qual sua resposta? :) ");
                        
                        resposta = Character.toUpperCase(leitura.next().charAt(0));

                        if (resposta == 'A' || resposta == 'B' || resposta == 'C' || resposta == 'D') {
                            break;
                        }

                        System.out.println("[>:(] Opção inválida! Escolha A, B, C ou D.");
                    }

                     if (resposta == 'C') {
                        System.out.println("[:D] Resposta correta! Nunca se deve utilizar nome próprio como senha.");
                        acertos++;
                    } else if (resposta == 'A') {
                        System.out.println("[:(] Resposta incorreta! Esta prática é uma das melhores recomendações para manter a senha protegida.");
                    } else if (resposta == 'B') {
                        System.out.println("[:(] Resposta Incorreta. Esta prática, se bem feita, deixará sua senha muito protegida.");
                    } else if (resposta == 'D') {
                        System.out.println("[:(] Resposta incorreta! Esta prática é extremamente importante a ser realizada, na verdade. ");
                    } else {
                        System.out.println("[>:(] Opção inválida! Escolha A, B, C ou D.");
                    } 

                    double nota1 = acertos * 2.5;

                    System.out.println("\n---PARABÉNS, VOCÊ CONCLUIU A PROVA Nº1! VEJA SEU RESULTADO ABAIXO :D.");
                    System.out.println("==========================================");
                    System.out.println("Acertos: " + acertos + " de 4");
                    System.out.println("Nota: " + nota1);
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

        leitura.close();
    }
}