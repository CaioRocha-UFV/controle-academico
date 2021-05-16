package view;

import java.io.IOException;
import java.util.Scanner;

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

    OpcaoMenu[] opcaoMenu = OpcaoMenu.values();
    OpcaoMenu opcao; // Inicializando opcoes de menu
    
    public void mostrarMenu() throws InterruptedException, IOException{

        int numeroSemestre;

        System.out.println("Digite o numero do semestre que esta cursando: ");
        numeroSemestre = this.sc.nextInt();

        sistema.CadastrarProfessores();
        sistema.CadastrarDisciplinas();
        sistema.CadastrarCurso();
        sistema.CadastrarDepartamento();
        sistema.CadastrarGrade();
        sistema.CadastrarSemestre();
        sistema.CadastrarDisciplinaSemestre();
        sistema.Conectar();    
        sistema.CadastrarAlunoSistema(numeroSemestre);

        System.out.println("\n\n");


        System.out.println("########################### MENU ###########################");
        System.out.println("\n\n");
        OpcaoMenu.mostrarOpcoes();
        
        do{    
            System.out.print("Selecione uma opção (9 para voltar ao menu):");
            int tmp = this.sc.nextInt();
            //new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            while (tmp < OpcaoMenu.MINOPCOES || tmp > OpcaoMenu.MAXOPCOES){
                System.out.println("-------------------------- MENU ---------------------------------");
                System.out.println("\n");
                OpcaoMenu.mostrarOpcoes();
                System.out.print("Digite a operação que você deseja fazer: ");
                tmp = this.sc.nextInt();
            }
            opcao = opcaoMenu[tmp-1];
            //new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            switch (opcao) {
                    
                case DISCIPLINAS_INSTITUICAO:
                    
                    sistema.controladorGeral.getInstituicao().ExibirDisciplinaInstituicao();
                    
                    break;
                case ALUNO:
                    sistema.getControladorGeral().ExibirDadosAlunoControle();
                    sistema.getControladorGeral().porcentagemCreditosCursados("CDC");

                    break;
                case PROFESSOR:
                    sistema.controladorGeral.listarDisciplinasProfessores();
                    break;
                case CURSO:
                    
                    System.out.println("Digite em cada linha o codigo do curso e o semestre a ser consultado:");
                    System.out.println("OPCOES DISPONIVEIS -> curso : CDC , semestre -> (1-8)");
                    System.out.print("> ");
                    codigoCurso = this.sc.next();
                    System.out.print("> ");
                    numSemestre = this.sc.nextInt();

                    sistema.getControladorGeral().exibirSemestreGrade(numSemestre, codigoCurso);
                    


                    break;
                case GRADE:
                
                    System.out.println("Digite o codigo do curso a ser consultado:");
                    System.out.println("OPCOES DISPONIVEIS -> curso : CDC");
                    System.out.print("> ");
                    codigoCurso = this.sc.next();

                    sistema.getControladorGeral().exibirGradeCurricularCurso(codigoCurso);
                    
                    break;
                case HISTORICO:
                    sistema.getControladorGeral().ExibirHistoricoAlunoControle();;
                    break;
                case DEPARTAMENTO:
                    sistema.getControladorGeral().ExibirDepartamentoControle();
                    break;
                case ENCERRARPEDIDO:
                    break;
            }
        } while (opcao != OpcaoMenu.ENCERRARPEDIDO);
    }



    public void ExibirTelaInicio(){

        System.out.println("-----------------------------------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("                       Projeto POO                          ");
        System.out.println("                           -                                ");
        System.out.println("                 Acompanhamento Acadêmico                   ");
        System.out.println("");
        System.out.println("");
        System.out.println("-----------------------------------------------------------");
        System.out.println("\n\n");
    }
}
