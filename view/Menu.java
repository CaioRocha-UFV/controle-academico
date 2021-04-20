package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import control.Control_Geral;
import model.*;
import control.*;

// import entities.Disciplina;
// import entities.GradeCurricular;

public class Menu {
    Scanner sc = new Scanner(System.in);
    String nome, professor, ano;
    int qntCreditos;
    String codigoCurso;
    int numSemestre;

    Sistema sistema = new Sistema("UFV");

    //List<Disciplina> disciplinas = new ArrayList<Disciplina>();
    //List<GradeCurricular> grade = new ArrayList<GradeCurricular>();
    
    OpcaoMenu[] opcaoMenu = OpcaoMenu.values();
    OpcaoMenu opcao = OpcaoMenu.DISCIPLINAS_INSTITUICAO; // Inicializando opcoes de menu
    
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

                case DISCIPLINAS_INSTITUICAO:
                    sistema.CadastrarProfessores();
                    sistema.CadastrarDisciplinas();
                    sistema.CadastrarCurso();
                    sistema.CadastrarDepartamento();
                    sistema.CadastrarGrade();
                    sistema.CadastrarSemestre();
                    sistema.CadastrarDisciplinaSemestre();
                    sistema.Conectar();

                    System.out.println("Informacoes:");
                    sistema.controladorGeral.getInstituicao().ExibirDisciplina();
                    
                    //System.out.println("Nome: " + sistema.controladorGeral.getInstituicao().getNome());
                    break;
                case ALUNO:
                    //TesteAluno();

                    break;
                case PROFESSOR:
                    sistema.CadastrarProfessores();
                    sistema.CadastrarDisciplinas();
                    sistema.Conectar();
                    sistema.controladorGeral.listarDisciplinasProfessores();
                    break;
                case CURSO:
                    sistema.CadastrarProfessores();
                    sistema.CadastrarDisciplinas();
                    sistema.CadastrarCurso();
                    sistema.CadastrarDepartamento();
                    sistema.CadastrarGrade();
                    sistema.CadastrarSemestre();
                    sistema.CadastrarDisciplinaSemestre();
                    sistema.Conectar();


                    System.out.println("Digite em cada linha o codigo do curso e o semestre a ser consultado:");
                    System.out.println("OPCOES DISPONIVEIS -> curso : CDC , semestre -> (1-4)");
                    System.out.print("> ");
                    codigoCurso = this.sc.next();
                    System.out.print("> ");
                    numSemestre = this.sc.nextInt();

                    sistema.getControladorGeral().exibirSemestreGrade(numSemestre, codigoCurso);


                    break;
                case DISCIPLINA:
                /*
                    sc.nextLine();

                    System.out.print("Digite o nome da disciplina:");
                    nome = sc.nextLine();
                    System.out.print("Digite o nome do professor responsável pela disciplina: ");
                    professor = sc.nextLine();
                    System.out.print("Digite a quantidade de créditos da disciplina: ");
                    qntCreditos = sc.nextInt();
                    //Disciplina temp = new Disciplina(nome, professor, qntCreditos, "CCF");
                    disciplinas.add(temp);
                    Disciplina.mostrarDisciplinas(disciplinas);
                    */
                    break;
                case ATIVIDADECOMPLEMENTAR:
                    break;
                case GRADE:
                    sistema.CadastrarProfessores();
                    sistema.CadastrarDisciplinas();
                    sistema.CadastrarCurso();
                    sistema.CadastrarDepartamento();
                    sistema.CadastrarGrade();
                    sistema.CadastrarSemestre();
                    sistema.CadastrarDisciplinaSemestre();
                    sistema.Conectar();

                    System.out.println("Digite o codigo do curso a ser consultado:");
                    System.out.println("OPCOES DISPONIVEIS -> curso : CDC");
                    System.out.print("> ");
                    codigoCurso = this.sc.next();

                    sistema.getControladorGeral().exibirGradeCurricularCurso(codigoCurso);
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

}




    /*
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
    */
