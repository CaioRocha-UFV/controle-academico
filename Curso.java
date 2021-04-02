import java.util.HashMap;

import entities.GradeCurricular;

public class Curso {
    private String codigo;
    private String nome;
    private Professor coordenador;
    private GradeCurricular gradePadrao;
    private HashMap<String, Professor> professores = new HashMap<String, Professor>();
    private int alunosMatriculados; // Ver se eh uma informacao cabivel no contexto presente


    /*
        CONSTRUTORES
    */
    public Curso(String id, String nome, Professor coordenador, GradeCurricular grade){

        this.setCodigo(id);
        this.setNome(nome);
        this.setCoordenador(coordenador);
        this.setGradePadrao(grade);
    }

    /*
        GETTERS
    */
    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Professor getCoordenador() {
        return coordenador;
    }

    public GradeCurricular getGradePadrao() {
        return gradePadrao;
    }

    public HashMap<String, Professor> getProfessores() {
        return professores;
    }

    public int getAlunosMatriculados() {
        return alunosMatriculados;
    }


    /*
        SETTERS
    */

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
    }

    public void setGradePadrao(GradeCurricular gradePadrao) {
        this.gradePadrao = gradePadrao;
    }

    public void setProfessores(HashMap<String, Professor> professores) {
        //this.professores.put(professores.getNome(), professores);
    }

    public void setAlunosMatriculados(int alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }

}
