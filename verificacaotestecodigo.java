import java.util.Scanner;

public class verificacaotestecodigo {
    public static void main(String[] args) {

        // Apresentação do Menu Principal do Sistema de Provas. :D

        Scanner leitura = new Scanner(System.in);
        int opcao = -1;
        int provasFeitas = 0;
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
                    int acertosp1 = 0;
                    char respostap1;

                    System.out.println("\n--- PROVA 1: SENHAS SEGURAS ---");

                    // QUESTÃO INICIAL

                    System.out.println("\n1ª QUESTÃO:");
                    System.out.println("Qual opções abaixo representa uma senha segura contra invasão de dados?");
                    System.out.println("A - qwertyuiop");
                    System.out.println("B - K*6%dsd_=832");
                    System.out.println("C - senha12345");
                    System.out.println("D - 2444666668888888");

                    // O while aqui é proposto para caso o usuário escolha outro tipo de opção como 'E', por exemplo, a questão pergunte novamente até que ele dê uma resposta válida.
                    while(true) {
                        System.out.print("Qual sua resposta? :) ");
                        
                        respostap1 = Character.toUpperCase(leitura.next().charAt(0));

                        if (respostap1 == 'A' || respostap1 == 'B' || respostap1 == 'C' || respostap1 == 'D') {
                            break;
                        }

                        System.out.println("[>:(] Opção inválida! Escolha A, B, C ou D.");
                    }

                    if (respostap1 == 'B') {
                        System.out.println("[:D] Resposta correta! Senha com simbolos e letras variadas são extremamente seguras.");
                        acertosp1++;

                    } else if (respostap1 == 'A') {
                        System.out.println("[:(] Resposta incorreta! Este tipo de senha é o que mais facilita a invasão de seus dados. Tenha cuidado!");

                    } else if (respostap1 == 'D') {
                        System.out.println("[:(] Resposta incorreta! Por mais que a senha tenha uma leve variação de caracteres, ainda sim é facilmente descoberta por invasores.");

                    } else if(respostap1 == 'C'){
                        System.out.println("[:(] Resposta incorreta! Nunca utilize este tipo de senha em sua conta. Normalmente, elas são uma das primeiras tentativas de algoritimos para a tentativa de invasão.");
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
                        
                        respostap1 = Character.toUpperCase(leitura.next().charAt(0));

                        if (respostap1 == 'A' || respostap1 == 'B' || respostap1 == 'C' || respostap1 == 'D') {
                            break;
                        }

                        System.out.println("[>:(] Opção inválida! Escolha A, B, C ou D.");
                    }
                    
                    if (respostap1 == 'A') {
                        System.out.println("[:D] Resposta correta! Dessa forma, sua(s) conta(s) sempre se manterão protegidas.");
                        acertosp1++;
                    } else if (respostap1 == 'B') {
                        System.out.println("[:(] Resposta incorreta! Por mais segura que sua senha seja, é sempre recomendável trocá-la de período em período.");
                    } else if (respostap1 == 'C') {
                        System.out.println("[:(] Resposta Incorreta. Jamais faça isso, o risco de vulnerabilidade é muito grande.");
                    } else if (respostap1 == 'D') {
                        System.out.println("[:(] Resposta incorreta! Até é uma opção viável, no entanto, extremamente cansativa.");
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
                        
                        respostap1 = Character.toUpperCase(leitura.next().charAt(0));

                        if (respostap1 == 'A' || respostap1 == 'B' || respostap1 == 'C' || respostap1 == 'D') {
                            break;
                        }
                        System.out.println("[>:(] Opção inválida! Escolha A, B, C ou D.");
                    }

                    if (respostap1 == 'D') {
                        System.out.println("[:D] Resposta correta! Este tipo de confirmação o sistema certificará duas vezes que é realmente o próprio usuário tentando logar na conta.");
                        acertosp1++;
                    } else if (respostap1 == 'A') {
                        System.out.println("[:(] Resposta incorreta! Isso, na verdade, é uma irresponsabilidade do usuário, haha!");
                    } else if (respostap1 == 'B') {
                        System.out.println("[:(] Resposta Incorreta. Ele faz o login, mas não com essa proposta.");
                    } else if (respostap1 == 'C') {
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
                        
                        respostap1 = Character.toUpperCase(leitura.next().charAt(0));

                        if (respostap1 == 'A' || respostap1 == 'B' || respostap1 == 'C' || respostap1 == 'D') {
                            break;
                        }
                        System.out.println("[>:(] Opção inválida! Escolha A, B, C ou D.");
                    }

                     if (respostap1 == 'C') {
                        System.out.println("[:D] Resposta correta! Nunca se deve utilizar nome próprio como senha.");
                        acertosp1++;
                    } else if (respostap1 == 'A') {
                        System.out.println("[:(] Resposta incorreta! Esta prática é uma das melhores recomendações para manter a senha protegida.");
                    } else if (respostap1 == 'B') {
                        System.out.println("[:(] Resposta Incorreta. Esta prática, se bem feita, deixará sua senha muito protegida.");
                    } else if (respostap1 == 'D') {
                        System.out.println("[:(] Resposta incorreta! Esta prática é extremamente importante a ser realizada, na verdade. ");
                    } else {
                        System.out.println("[>:(] Opção inválida! Escolha A, B, C ou D.");
                    } 

                    // NOTA DA PROVA Nº1
                    double nota1 = acertosp1 * 2.5;
                    provasFeitas++;

                    System.out.println("\n---PARABÉNS, VOCÊ CONCLUIU A PROVA Nº1! VEJA SEU RESULTADO ABAIXO :D.");
                    System.out.println("==========================================");
                    System.out.println("Acertos: " + acertosp1 + " de 4");
                    System.out.println("Nota: " + nota1);
                    break;

                case 2:
                    System.out.println("Opção Escolhida: Prova 2!");

                    // Começo da prova e suas determinadas questões

                    System.out.println("\n--- PROVA 2: GOLPES ONLINE ---");
                    int acertosp2 = 0;
                    char respostap2;

                    // QUESTÃO INICIAL

                    System.out.println("\n1ª QUESTÃO");
                    System.out.println("O que é 'Phishing'?");
                    System.out.println("A - Um tipo de vírus que apaga arquivos");
                    System.out.println("B - Golpe que imita sites/emails verdadeiros para roubar dados");
                    System.out.println("C - Um programa de protecao contra hackers");
                    System.out.println("D - Uma rede wi-fi publica segura");

                    while(true) {
                        System.out.print("Qual sua resposta? :) ");
                        
                        respostap2 = Character.toUpperCase(leitura.next().charAt(0));

                        if (respostap2 == 'A' || respostap2 == 'B' || respostap2 == 'C' || respostap2 == 'D') {
                            break;
                        }

                        System.out.println("[>:(] Opção inválida! Escolha A, B, C ou D.");
                    }
                    
                    if (respostap2 == 'B') {
                        System.out.println("[:D] Resposta correta! Phishing 'fisga' vitimas com páginas falsas para acessar seus dados.");
                        acertosp2++;
                    } else if (respostap2 == 'A') {
                        System.out.println("[:(] Resposta incorreta! O phishing em si não é um vírus, mas sim uma técnica de enganação para roubar dados.");
                    } else if (respostap2 == 'C') {
                        System.out.println("[:(] Resposta Incorreta. Programas de proteção ajudam na segurança digital, mas phishing é um tipo de golpe virtual.");
                    } else if (respostap2 == 'D') {
                        System.out.println("[:(] Resposta incorreta! Redes públicas podem até ser perigosas, mas isso não define o conceito de phishing.");
                    } else {
                        System.out.println("[>:(] Opção inválida! Escolha A, B, C ou D.");
                    }

                    // PRÓXIMA QUESTÃO

                    System.out.println("\n2ª QUESTÃO");
                    System.out.println("Você recebe um email dizendo que ganhou um prêmio e precisa clicar num link para resgatar. O que fazer?");
                    System.out.println("A - Clicar rapidamente antes do prazo expirar.");
                    System.out.println("B - Encaminhar para os amigos pra eles ganharem o prêmio também.");
                    System.out.println("C - Ignorar ou deletar, pois é provavel golpe.");
                    System.out.println("D - Responder pedindo mais informações.");

                    while(true) {
                        System.out.println("Qual sua resposta? :)");

                        respostap2 = Character.toUpperCase(leitura.next().charAt(0));

                        if (respostap2 == 'A' || respostap2 == 'B' || respostap2 == 'C' || respostap2 == 'D') {
                            break;
                        }

                        System.out.println("[>:(] Opção inválida! Escolha A, B, C ou D.");
                    }
                    if (respostap2 == 'C') {
                        System.out.println("[:D] Resposta correta! Ofertas urgentes demais são sinais de golpe.");
                        acertosp2++;
                    } else if (respostap2 == 'A') {
                        System.out.println("[:(] Resposta incorreta! Golpistas usam senso de urgência para fazer a vítima clicar sem pensar.");
                    } else if (respostap2 == 'B') {
                        System.out.println("[:(] Resposta Incorreta. Compartilhar mensagens suspeitas pode espalhar golpes para outras pessoas.");
                    } else if (respostap2 == 'D') {
                        System.out.println("[:(] Resposta incorreta! Responder emails suspeitos pode confirmar seus dados para criminosos.");
                    } else {
                        System.out.println("[>:(] Opção inválida! Escolha A, B, C ou D.");
                    }

                    // PRÓXIMA QUESTÃO

                    System.out.println("\n3ª QUESTÃO");
                    System.out.println("Qual das opções abaixo é visivelmente um sinal de que um site pode ser falso?");
                    System.out.println("A - Ter 'cadeado verde' na barra do navegador");
                    System.out.println("B - Endereco com erros de digitação, exemplo: faceb00k.com");
                    System.out.println("C - Ter política de privacidade");
                    System.out.println("D - Rápido carregamento da página");

                    while(true) {
                        System.out.println("Qual sua resposta? :)");

                        respostap2 = Character.toUpperCase(leitura.next().charAt(0));

                        if (respostap2 == 'A' || respostap2 == 'B' || respostap2 == 'C' || respostap2 == 'D') {
                            break;
                        }

                        System.out.println("[>:(] Opção inválida! Escolha A, B, C ou D.");
                    }
                    if (respostap2 == 'B') {
                        System.out.println("[:D] Resposta correta! Endereços com letras trocadas ou erros de digitação são sinais muito comuns de sites falsos.");
                        acertosp2++;
                    } else if (respostap2 == 'A') {
                        System.out.println("[:(] Resposta incorreta! O cadeado pode indicar conexão segura, mas sozinho não garante que o site seja verdadeiro.");
                    } else if (respostap2 == 'C') {
                        System.out.println("[:(] Resposta Incorreta. Muitos sites falsos também copiam políticas de privacidade para parecerem confiáveis.");
                    } else if (respostap2 == 'D') {
                        System.out.println("[:(] Resposta incorreta! A velocidade do site não define se ele é legítimo ou falso.");
                    } else {
                        System.out.println("[>:(] Opção inválida! Escolha A, B, C ou D.");
                    }

                    // PRÓXIMA QUESTÃO

                    System.out.println("\n 4ª QUESTÃO");
                    System.out.println("Alguém te liga dizendo ser do banco e solicita sua senha para 'confirmar sua identidade'. O que fazer nesse caso?");
                    System.out.println("A - Desligar e ligar pro número oficial do banco.");
                    System.out.println("B - Dar apenas os 4 primeiros dígitos.");
                    System.out.println("C - Fornecer a senha, pois aparenta ser muito urgente.");
                    System.out.println("D - Pedir para o atendente adivinhar a senha.");

                    while(true) {
                        System.out.println("Qual sua resposta? :)");

                        respostap2 = Character.toUpperCase(leitura.next().charAt(0));

                        if (respostap2 == 'A' || respostap2 == 'B' || respostap2 == 'C' || respostap2 == 'D') {
                            break;
                        }

                        System.out.println("[>:(] Opção inválida! Escolha A, B, C ou D.");
                    }
                    if (respostap2 == 'A') {
                        System.out.println("[:D] Resposta correta! Bancos nunca pedem senhas por ligação. O mais seguro é desligar e entrar em contato pelo número oficial.");
                        acertosp2++;
                    } else if (respostap2 == 'B') {
                        System.out.println("[:(] Resposta incorreta! Nunca compartilhe partes da sua senha com desconhecidos, mesmo que pareçam confiáveis.");
                    } else if (respostap2 == 'C') {
                        System.out.println("[:(] Resposta Incorreta. Golpistas usam urgência para pressionar vítimas a entregar informações pessoais.");
                    } else if (respostap2 == 'D') {
                        System.out.println("[:(] Resposta incorreta!  Apesar de engraçada, essa atitude não resolve o problema e ainda mantém contato com um possível golpista.");
                    } else {
                        System.out.println("[>:(] Opção inválida! Escolha A, B, C ou D.");
                    }
                    // NOTA DA PROVA Nº2
                    double nota2 = acertosp2 * 2.5;
                    provasFeitas++;

                    System.out.println("\n---PARABÉNS, VOCÊ CONCLUIU A PROVA Nº2! VEJA SEU RESULTADO ABAIXO :D.");
                    System.out.println("==========================================");
                    System.out.println("Acertos: " + acertosp2 + " de 4");
                    System.out.println("Nota: " + nota2);
                    
                    break;
                case 3:
                    System.out.println("Opção Escolhida: Prova 3!");
                    int acertosp3 = 0;
                    int respostap3;

                    System.out.println("\n--- PROVA 3: PRIVACIDADE DIGITAL ---");

                    // QUESTÃO INICIAL

                    
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
