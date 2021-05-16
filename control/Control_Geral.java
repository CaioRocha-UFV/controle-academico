package control;

import java.util.ArrayList;
import java.util.Collections;

import model.*;


public class Control_Geral {

    private Instituicao instituicao;
    private Aluno aluno;

    public Control_Geral(String nome){
        this.instituicao = new Instituicao(nome);
    }
    
    public void CadastrarAluno(String nome, String email, String matricula){
        this.aluno = new Aluno(nome, email, matricula);
    }

    public void RegistrarHistoricoAluno(int numSemestreAtual){

        for (int i = 1; i < numSemestreAtual; i++){

            Semestre semestreCursado = this.instituicao.getCursos().get("CDC").getGradePadrao().RetornarSemetre(i);
            this.aluno.getHistorico().setHistorico(semestreCursado);
        }
    }

    public void CadastrarSemestreAtual(int numSemestreAtual){
        Semestre semestreAtual = this.instituicao.getCursos().get("CDC").getGradePadrao().RetornarSemetre(numSemestreAtual);
        this.aluno.setSemestreAtual(semestreAtual);;
    }

    public void ExibirDadosAlunoControle(){
        this.aluno.ExibirDadosAluno();
        
    }

    public void ExibirHistoricoAlunoControle(){
        this.aluno.ExibirHistoricoAluno();
    }

    public Instituicao getInstituicao(){

        return this.instituicao;
    }

    public void AdicionarDepartamentoInstituicao(String nome, String codigo, String email, String telefone){
        Departamento dep = new Departamento(nome, codigo, email, telefone);

        this.instituicao.setDepartamentos(dep.getCodigo(), dep);
    }

    public void AdicionarCursoInstituicao(String id, String nome){
        Curso curso = new Curso(id, nome);

        //System.out.println(curso.getNome());
        this.instituicao.setCursos(curso.getCodigo(), curso);
    }


    public void AdicionarDisciplinaInstituicao(String nome, int qntCreditos, String codigo){

        Disciplina disciplina = new Disciplina(nome, qntCreditos, codigo);

        this.instituicao.setDisciplina(disciplina.getCodigo(), disciplina);
    }

    public void AdicionarProfessorInsituicao(String nomeProf, String email){

        Professor professor = new Professor(nomeProf, email);

        this.instituicao.setProfessores(professor.getNome(), professor);
    }

    public void AdicionarGradeCurso(String codigoCurso, int ano){

        GradeCurricular grade = new GradeCurricular(ano);

        //System.out.println(this.instituicao.getCursos().get(codigoCurso).getNome());
        this.instituicao.getCursos().get(codigoCurso).setGradePadrao(grade);
    }

    public void AdicionarSemetreGradeCurso(String codigoCurso, int numeroSemestre){

        Semestre semestre = new Semestre(numeroSemestre);

        this.instituicao.getCursos().get(codigoCurso).getGradePadrao().AdicionarSemestreGrade(semestre);
    }

    public void AdicionarDisciplinaSemetreGradeCurso(String codigoCurso, String codigoDiscp, int numSemetre){

        Disciplina disciplina = this.instituicao.getDisciplinas().get(codigoDiscp);

        Semestre semestre = this.instituicao.getCursos().get(codigoCurso).getGradePadrao().RetornarSemetre(numSemetre);

        if (semestre != null){
            semestre.AdicionarDisciplina(disciplina);
        }
        else {
            System.err.println("Nao ha um semestre cadastrado para este numero");
        }
    }

    public void VincularProfessorDisciplina(String nomeProf, String codigoDiscp){

        Professor professor = this.instituicao.getProfessores().get(nomeProf);

        Disciplina disciplina = this.instituicao.getDisciplinas().get(codigoDiscp);

        disciplina.setProfessor(professor.getNome());
        professor.setDisciplinasLecionadas(disciplina);
    }


    public void listarDisciplinasProfessores(){
        for(var p: this.instituicao.getProfessores().keySet()){
            Professor professor = this.instituicao.getProfessores().get(p);
            System.out.println("|--------------------- PROFESSOR --------------------------|");
            System.out.println("");
            System.out.printf("Nome : %s\n", professor.getNome());
            System.out.printf("E-mail: %s\n", professor.getEmail());
            System.out.println("");
            professor.listarDisciplinas();
        }
    }

    public void exibirGradeCurricularCurso(String codigoCurso){

        GradeCurricular grade = this.instituicao.getCursos().get(codigoCurso).getGradePadrao();

        grade.ExibirGradeCurricular();

    }

    public void exibirSemestreGrade(int numSemestre, String codigoCurso){

        Semestre semestre = this.instituicao.getCursos().get(codigoCurso).getGradePadrao().RetornarSemetre(numSemestre);

        semestre.ExibirSemestre();

    }

    public int porcentagemCreditosCursados(String codigoCurso){
        Semestre semestre = this.aluno.getSemestreAtual();
        ArrayList<Semestre>  semestres = this.instituicao.getCursos().get(codigoCurso).getGradePadrao().getSemestres();
        Collections.sort(semestres);
        double porcentagem;
        int creditos = 0;

        for(Semestre s: semestres){
            if(s.getnumeroSemetre() == semestre.getnumeroSemetre()){
                break;
            }
            creditos += s.ObterCreditosSemestre();
        }

        System.out.println("Total creditos: " + this.instituicao.getCursos().get(codigoCurso).getGradePadrao().ObterTotalCreditosGrade());

        porcentagem = (double) creditos/this.instituicao.getCursos().get(codigoCurso).getGradePadrao().ObterTotalCreditosGrade();
        porcentagem *= 100;

        System.out.println("Porcentagem: " + (int) porcentagem + "%");

        return (int) porcentagem;
    }


    public void ExibirDepartamentoControle(){
        this.instituicao.getDepartamentos().get("IFF").ExibirDepartamento();
    }
}
