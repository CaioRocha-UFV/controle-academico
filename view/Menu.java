package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.*;

// import entities.Disciplina;
// import entities.GradeCurricular;

public class Menu {
    Scanner sc = new Scanner(System.in);
    String nome, professor, ano;
    int qntCreditos;

    List<Disciplina> disciplinas = new ArrayList<Disciplina>();
    List<GradeCurricular> grade = new ArrayList<GradeCurricular>();
    
    OpcaoMenu[] opcaoMenu = OpcaoMenu.values();
    OpcaoMenu opcao = OpcaoMenu.PESSOA; // Inicializando opcoes de menu
    
    public void mostrarMenu(){
            System.out.println("-----------------------------------------------------------------");
            System.out.println("-------------------------- MENU ---------------------------------");
            OpcaoMenu.mostrarOpcoes();
        
        do{    
            System.out.print("Qual classe você deseja testar:");
            int tmp = sc.nextInt();
            System.out.println("-----------------------------------------------------------------");

            while (tmp < OpcaoMenu.MINOPCOES || tmp > OpcaoMenu.MAXOPCOES){
                System.out.println("-------------------------- MENU ---------------------------------");
                OpcaoMenu.mostrarOpcoes();
                System.out.print("Digite a operação que você deseja fazer: ");
                tmp = sc.nextInt();
            }
            opcao = opcaoMenu[tmp-1];

            switch (opcao) {

                case PESSOA:
                    break;
                case ALUNO:
                    TesteAluno();

                    break;
                case PROFESSOR:
                    break;
                case CURSO:
                    break;
                case DISCIPLINA:
                    sc.nextLine();

                    System.out.print("Digite o nome da disciplina:");
                    nome = sc.nextLine();
                    System.out.print("Digite o nome do professor responsável pela disciplina: ");
                    professor = sc.nextLine();
                    System.out.print("Digite a quantidade de créditos da disciplina: ");
                    qntCreditos = sc.nextInt();
                    Disciplina temp = new Disciplina(nome, professor, qntCreditos, "CCF");
                    disciplinas.add(temp);
                    Disciplina.mostrarDisciplinas(disciplinas);
                    break;
                case ATIVIDADECOMPLEMENTAR:
                    break;
                case GRADE:
                    sc.nextLine();
                    System.out.print("Digite o ano da grade que deseja cadastrar: ");
                    ano = sc.nextLine();
                    GradeCurricular temp2 = new GradeCurricular(ano);
                    grade.add(temp2);
                    GradeCurricular.mostrarGrade(grade);
                    break;
                case HISTORICO:
                    break;
                case INSTITUICAOENSINO:
                    break;
                case DEPARTAMENTO:
                    break;
                case ENCERRARPEDIDO:
            }
        } while (opcao != OpcaoMenu.ENCERRARPEDIDO);
    }

    void TesteAluno(){
        //Scanner sc2 = new Scanner(System.in).useDelimiter("\\n");
        
        

        String entrada1, entrada2;

        entrada1 = sc.nextLine();
        
        System.out.println("Insira: NOME  CPF EMAIL CELULAR DATAANIVERSARIO");
        entrada1 = sc.nextLine();
        System.out.println("Insira: MATRICULA COEFICIENTE");
        entrada2 = sc.nextLine();
        String[] tokens1 = entrada1.split(" ");
        String[] tokens2 = entrada2.split(" ");

        // Controi o aluno
        Aluno aluno = Aluno.builder()
                .nome(tokens1[0])
                .cpf(tokens1[1])
                .email(tokens1[2])
                .celular(tokens1[3])
                .dataNascimento(tokens1[4])
                .matricula(tokens2[0])
                .coeficiente(Float.parseFloat(tokens2[1]))
                .CriarAluno();

        
        System.out.println("\n" + aluno.toString() + "\n");
    }
}

