import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Personagens personagem[] = new Personagens[4]; //Array para personagens.
        personagem[3] = new Dragao(30,30,300); //Criação estática do dragão.
        personagem[3].setNome("LazyProg");
        Armas arma[] = new Armas[3];
        Boolean valido = true; //Validação para do/while.
        Boolean umPersonagemCriado = false; //Validação do mínimo de personagens.
        Boolean v = true; //Validação para do/while de criar personagens, caso digite algo inválido.
        Boolean armaEscolhida = false; //Armaescolhida? Sim? Não?

        System.out.printf("Bem-Vindo ao jogo: Heroes of POO!%n" +
                          "1 - Iniciar Jogo%n" + 
                          "2 - Sair do Jogo%nInput: ");

        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();
        int controle = 0;

        if(escolha == 1) { //CASO A PESSOA DESEJE INICIAR O JOGO.
            do {
                System.out.printf("%n1 - Criar personagem%n" +
                              "2 - Iniciar partida%n" +
                              "3 - Sair do jogo%nInput: ");

                scanner = new Scanner(System.in);
                escolha = scanner.nextInt(); //Input desta.
                //armaEscolhida = false; //Reseta o valor para false, para que assim não haja problema em criar um novo personagem.

                if(escolha == 1) { //Criar personagem
                    if(controle <= 2) { //Checagem para ver se a array está cheia já.
                    do {
                    System.out.printf("%nEscolha uma classe.%n" +
                                      "1 - Guerreiro%n" + 
                                      "2 - Mago%n" + 
                                      "3 - Arqueiro%nInput: ");
                    scanner = new Scanner(System.in);
                    escolha = scanner.nextInt();
                    
                    if(escolha == 1) { //Criar Guerreiro.
                        personagem[controle] = new Guerreiro(30,20,180);
                        personagem[controle].setNomeClasse("Guerreiro");
                        System.out.printf("%nDigite o nome do " + personagem[controle].getNomeClasse() + ": ");

                        scanner = new Scanner(System.in);
                        String a = scanner.nextLine();
                        

                        if(a.length() < 2) { //Digitou mais que duas letras?
                            System.out.println("Digite ao menos duas letras.");
                            v = false;
                        } //If checagem de letras minimas.
                        
                        else {
                        personagem[controle].setNome(a);

                        do {
                            System.out.printf("%n" + personagem[controle].getNomeClasse() + " " + personagem[controle].getNome() + " criado." +
                                          "%nAgora escolha uma arma para o " + personagem[controle].getNomeClasse() + 
                                          "%n1 - Espada" +
                                          "%n2 - Machado%nInput: ");
                            scanner = new Scanner(System.in);
                            escolha = scanner.nextInt();
                            if(escolha == 1 || escolha == 2) { //Caso a escolha for válida.
                                if(escolha == 1) {
                                    arma[controle] = new Espada(10,15);
                                    arma[controle].setNomeArma("Espada");
                                    personagem[controle].setAtk(personagem[controle].getAtk() + arma[controle].getAtk());
                                    personagem[controle].setDef(personagem[controle].getDef() + arma[controle].getDef());
                                }
                                else if(escolha == 2) {
                                    arma[controle] = new Machado(17,8);
                                    arma[controle].setNomeArma("Machado");
                                    personagem[controle].setAtk(personagem[controle].getAtk() + arma[controle].getAtk());
                                    personagem[controle].setDef(personagem[controle].getDef() + arma[controle].getDef());
                                }
                            armaEscolhida = true; //Seta esse valor como true para sair do do/while.
                            v = true;
                            controle = controle + 1;
                            umPersonagemCriado = true;
                            valido = false;
                            }
                            else {
                                System.out.println("Favor escolher uma arma.");
                                armaEscolhida = false;
                            }
                        } while(armaEscolhida == false);
                        }
                    } //FIM DO IF DE CRIAR GUERREIRO.


                    else if(escolha == 2) { //Criar Mago.
                        personagem[controle] = new Mago(20,10,200);
                        personagem[controle].setNomeClasse("Mago");
                        System.out.printf("%nDigite o nome do " + personagem[controle].getNomeClasse() + ": ");

                        scanner = new Scanner(System.in);
                        String a = scanner.nextLine();
                        

                        if(a.length() < 2) { //Digitou mais que duas letras?
                            System.out.println("Digite ao menos duas letras.");
                            v = false;
                        } //If checagem de letras minimas.
                        
                        else {
                        personagem[controle].setNome(a);

                        do {
                            System.out.printf("%n"+ personagem[controle].getNomeClasse() + " " + personagem[controle].getNome() + " criado." +
                                          "%nAgora escolha uma arma para o " + personagem[controle].getNomeClasse() + 
                                          "%n1 - Varinha" +
                                          "%n2 - Cajado%nInput: ");
                            scanner = new Scanner(System.in);
                            escolha = scanner.nextInt();
                            if(escolha == 1 || escolha == 2) { //Caso a escolha for válida.
                                if(escolha == 1) {
                                    arma[controle] = new Varinha(16,9);
                                    arma[controle].setNomeArma("Varinha");
                                    personagem[controle].setAtk(personagem[controle].getAtk() + arma[controle].getAtk());
                                    personagem[controle].setDef(personagem[controle].getDef() + arma[controle].getDef());
                                }
                                else if(escolha == 2) {
                                    arma[controle] = new Cajado(13,12);
                                    arma[controle].setNomeArma("Cajado");
                                    personagem[controle].setAtk(personagem[controle].getAtk() + arma[controle].getAtk());
                                    personagem[controle].setDef(personagem[controle].getDef() + arma[controle].getDef());
                                }
                            armaEscolhida = true; //Seta esse valor como true para sair do do/while.
                            v = true;
                            controle = controle + 1;
                            umPersonagemCriado = true;
                            valido = false;
                            }
                            else {
                                System.out.println("Favor escolher uma arma.");
                                armaEscolhida = false;
                            }
                        } while(armaEscolhida == false);
                        }
                    } //FIM DO IF DE CRIAR MAGO


                    else if(escolha == 3) { //Criar Arqueiro.
                        personagem[controle] = new Arqueiro(20,30,160);
                        personagem[controle].setNomeClasse("Arqueiro");
                        System.out.printf("%nDigite o nome do " + personagem[controle].getNomeClasse() + ": ");

                        scanner = new Scanner(System.in);
                        String a = scanner.nextLine();
                        

                        if(a.length() < 2) { //Digitou mais que duas letras?
                            System.out.println("Digite ao menos duas letras.");
                            v = false;
                        } //If checagem de letras minimas.
                        
                        else {
                        personagem[controle].setNome(a);

                        do {
                            System.out.printf("%n"+ personagem[controle].getNomeClasse() + " " + personagem[controle].getNome() + " criado." +
                                          "%nAgora escolha uma arma para o " + personagem[controle].getNomeClasse() + 
                                          "%n1 - Arco Longo" +
                                          "%n2 - Balestra%nInput: ");
                            scanner = new Scanner(System.in);
                            escolha = scanner.nextInt();
                            if(escolha == 1 || escolha == 2) { //Caso a escolha for válida.
                                if(escolha == 1) {
                                    arma[controle] = new ArcoLongo(12,13);
                                    arma[controle].setNomeArma("Arco Longo");
                                    personagem[controle].setAtk(personagem[controle].getAtk() + arma[controle].getAtk());
                                    personagem[controle].setDef(personagem[controle].getDef() + arma[controle].getDef());
                                }
                                else if(escolha == 2) {
                                    arma[controle] = new Balestra(15,10);
                                    arma[controle].setNomeArma("Balestra");
                                    personagem[controle].setAtk(personagem[controle].getAtk() + arma[controle].getAtk());
                                    personagem[controle].setDef(personagem[controle].getDef() + arma[controle].getDef());
                                }
                            armaEscolhida = true; //Seta esse valor como true para sair do do/while.
                            v = true;
                            controle = controle + 1;
                            umPersonagemCriado = true;
                            valido = false;
                            }
                            else {
                                System.out.println("Favor escolher uma arma.");
                                armaEscolhida = false;
                            }
                        } while(armaEscolhida == false);
                        }
                    } //FIM DO IF DE CRIAR ARQUEIRO
                    else {
                        System.out.println("Escolha uma classe válida.");
                        v = false;
                    }

                    } while(v == false);
                } //Fim da checagem de array.
                    else {
                        System.out.println("Máximo de personagens escolhidos.");
                    }
                }
                
                else if(escolha == 2) { //Iniciar a partida
                    if(umPersonagemCriado==true) { //Checagem para ver se ao menos um personagem existe.
                        if(controle == 1) {
                            System.out.printf("O Herói bravamente sobe a montanha onde fora construído o castelo " +
                                              "em que o temível dragão " + personagem[3].getNome() + " reside." +
                                              "%nAo finalmente chegar nas portas do castelo, surgem duas opções para o Herói." +
                                              "%n1 - Abrir as portas do castelo e enfrentar o dragão." +
                                              "%n2 - Voltar a cidade (Menu)%nInput: ");
                        }
                        else if(controle>=2) {
                            System.out.printf("Os Heróis bravamente sobem a montanha onde fora construído o castelo " +
                                              "em que o temível dragão " + personagem[3].getNome() + " reside." +
                                              "%nAo finalmente chegarem nas portas do castelo, surgem duas opções." +
                                              "%n1 - Abrir as portas do castelo e enfrentar o dragão." +
                                              "%n2 - Voltar a cidade (Menu)%nInput: ");
                        }

                        scanner = new Scanner(System.in);
                        escolha = scanner.nextInt();

                        if(escolha == 1) {
                            TesteRound novoRound = new TesteRound();
                            novoRound.round(personagem, controle);
                            break;
                        }
                        else if(escolha == 2) {
                            System.out.println("Retornando a cidade.");
                            valido = false;
                        }
                        else {
                                System.out.println("Digite um valor válido. Retornando a cidade.");
                                valido = false;
                        }
                    } //If de checagem para ver se ao menos um personagem existe.
                    else {
                    System.out.println("Favor criar ao menos um personagem.");
                    valido = false;
                    }
                }
                else if(escolha == 3) { //Sair do jogo
                    System.out.printf("Saindo do jogo...");
                    break;
                }
                else {
                    valido = false;
                    System.out.println("Digite um valor válido.");
                }
            } while(valido == false); //Fim while inicial.
        } //If que começa o jogo.

        else if(escolha == 2) { //CASO A PESSOA TENHA FINALIZADO O JOGO.
            System.out.println("Saindo do jogo...");
        }

        else System.out.println("Inválido, saindo do jogo..."); //CASO A PESSOA TENHA DIGITADO OUTRA COISA.
    } //End of main method
} //End of main class

/*
Existem muitas coisas que eu poderia ter pegado e colocado dentro de outras classes para o código não ter ficado
desse jeito. Vou fazer isso depois em meu tempo livre para melhor aprendizado.
*/