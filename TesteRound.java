import java.util.Random;
import java.util.Scanner;

public class TesteRound {
    private Random random = new Random();
    private Boolean personagemVivo = true;
    private Boolean respostaValida;
    private Boolean atkValido;
    private int aleatorio;
    private Personagens personagens[];
    private int i;
    private Boolean sair = false;

    public void round(Personagens personagens[], int controle) {
        this.personagens = personagens;
        this.i = controle - 1;
        System.out.printf("%n%nA batalha começa!%n%n");

    do {
        if(sair == true) break;
        for (int j = 0; j <= i; j++) { //For para ações dos personagens.

            personagens[j].setDefendendo(false); //Resetar o status de defesa.

            if(sair == true) break;
            if(personagens[3].getHp()<0) break;

            do {
                if(personagens[j].getHp()>0) { //Tem vida?
                    System.out.printf("O que o " + personagens[j].getNomeClasse() + ", " + personagens[j].getNome() +
                                      ", vai fazer?" +
                                      "%n1 - Atacar" +
                                      "%n2 - Defender" +
                                      "%n3 - Sair da batalha" +
                                      "%nInput: ");
                    Scanner scanner = new Scanner(System.in);
                    int escolha = scanner.nextInt();

                    if(escolha == 1) {
                        personagens[j].setDefendendo(false);
                       respostaValida = true;
                       atacarODragao(j);
                       System.out.printf("Atacou o dragão, o dragão " + personagens[3].getNome() + " agora tem " + personagens[3].getHp() + " pontos de vida!%n%n");
                    }
                    else if(escolha == 2) {
                        respostaValida = true;
                        defender(j);
                    }
                    else if(escolha == 3) {
                        sair = true;
                        break;
                    }
                    else {
                    System.out.println("Favor digitar uma resposta válida.");
                    respostaValida = false;
                    }
                }
                else {
                    personagens[j].setVivo(false);
                    System.out.println("O " + personagens[j].getNomeClasse() +  " " +
                    personagens[j].getNome() + " foi derrotado.");
                }
            } while(respostaValida == false);
        } //Fim do for p/ ações dos personagens.

        personagemVivo = Status.checagem(personagens, i);
        if(personagemVivo == false) break;

        if (personagens[3].getHp()>0) {
            if (i == 0) {
                aleatorio = i;
            }
            else {
                do {
                    aleatorio = random.nextInt(i+1);
                        if (personagens[aleatorio].getHp() > 0) {
                            atkValido = true;
                        }
                        else {
                            atkValido = false;
                        }
                } while(atkValido == false);
            }
            if(sair == true) break;
            else {
            System.out.printf("O dragão ataca o " + personagens[aleatorio].getNomeClasse() + ", " + personagens[aleatorio].getNome() + "!%n");
            danoLevado(aleatorio);
            System.out.printf("%nPontos de vida restante: " + personagens[aleatorio].getHp() + "%n");
            }
        }

        else {
            break;
        }
    } while(personagemVivo == true && personagens[3].getHp()>0);

    if(sair == true) {
        System.out.println("Saiu da batalha.");
    }
    else if(personagens[3].getHp()>0) {
        System.out.println("Derrota!");
    }

    else System.out.println("Vitória!");
    }



    public void danoLevado(int aleatorio) {
        int dano;
        if(personagens[aleatorio].getDefendendo() == true) {
            dano = personagens[3].getAtk() - personagens[aleatorio].getDefesaEnqDefende();
        }
        else {
            dano = personagens[3].getAtk() - personagens[aleatorio].getDef();
        }
        
        if(dano>0) {
            personagens[aleatorio].setHp(personagens[aleatorio].getHp() - dano);
        }
        else {
        personagens[aleatorio].setHp(personagens[aleatorio].getHp() - 0);
        }
    }



    public void defender(int j) {
        double tmp = personagens[j].getDef()*0.1;
        int defAdd = (int) tmp;

        personagens[j].setDefesaEnqDefende(personagens[j].getDef() + defAdd);
        personagens[j].setDefendendo(true);
    }



    public void atacarODragao(int j) {

        int vidaDragao = personagens[3].getHp();
        int dano = personagens[j].getAtk() - personagens[3].getDef();
    
        if(dano>0) {
            personagens[3].setHp(vidaDragao - dano);
        }
        else {
            personagens[3].setHp(vidaDragao - 0);
        }
    } //Fim do metodo atacar dragao
} //Fim da classe TesteRound
