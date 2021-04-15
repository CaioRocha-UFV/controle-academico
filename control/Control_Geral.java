package control;

import model.*;


public class Control_Geral {

    private Instituicao instituicao;

    public Control_Geral(String nome){
        this.instituicao = new Instituicao(nome);
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

    public void AdicionarProfessorInsituicao(String nomeProf){

        Professor professor = new Professor(nomeProf);

        this.instituicao.setProfessores(professor.getNome(), professor);
    }

    public void AdicionarGradeCurso(String codigoCurso, int ano){

        GradeCurricular grade = new GradeCurricular(ano);

        System.out.println(this.instituicao.getCursos().get(codigoCurso).getNome());
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


}
