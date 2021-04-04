import java.util.HashMap;
import java.util.HashSet;

// import entities.Disciplina;

public class Instituicao {
    private String nome;
    private HashMap<String, Disciplina> disciplinas; //Disciplina? 
    private HashMap<String, Professor> professores;
    private HashMap<String, Curso> cursos;
    private HashMap<String, Departamento> departamentos;


    public Instituicao(String nome){
        this.nome = nome;
    }


    /* Getters */
    public String getNome(){
        return this.nome;
    }

    public HashMap<String, Disciplina> getDisciplina(){
        return this.disciplinas;
    }

    public HashMap<String, Professor> getProfessores(){
        return this.professores;
    }

    public HashMap<String, Curso> getCursos(){
        return this.cursos;
    }

    public HashMap<String, Departamento> getDepartamentos(){
        return this.departamentos;
    }



    /* Setters */
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDisciplina(HashMap<String, Disciplina> disciplinas){
        this.disciplinas = disciplinas;
    }

    public void setProfessores(HashMap<String, Professor> professores){
        this.professores = professores;
    }

    public void  setCursos(HashMap<String, Curso> cursos){
        this.cursos = cursos;
    }

    public void setDepartamentos(HashMap<String, Departamento> departamentos){
        this.departamentos = departamentos;
    }


    

    
}
