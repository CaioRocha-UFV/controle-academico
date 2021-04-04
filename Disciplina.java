// package entities;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private int quantidade;
    private String nome;
    private String professor;
    private int qntCreditos;


    /*
        CONSTRUTORES
    */
    public Disciplina(String nome, String professor, int qntCreditos) {
        this.nome = nome;
        this.professor = professor;
        this.qntCreditos = qntCreditos;
        this.quantidade = 0;
    }

    /*
        SETTERS
    */
    public void setProfessor(String professor) {
        this.professor = professor;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQntCreditos(int qntCreditos){
        this.qntCreditos = qntCreditos;
    }

    /*
        GETTERS
    */
    public String getProfessor() {
        return professor;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public int getQntCreditos(){
        return qntCreditos;
    }

    public void adicionarDisciplina(String nome, String professor) {
        List<Disciplina> novaDisciplina = new ArrayList<Disciplina>();
        novaDisciplina.add(new Disciplina(nome, professor, qntCreditos));
        this.quantidade++;
    }

    /*
        METODOS
    */
    public static void mostrarDisciplinas(List<Disciplina> disciplinas) {
        System.out.println(disciplinas);
    }
    
    public String toString(){
        return "Disciplina: "
        + nome
        + "\nProfessor: "
        + professor
        + "\n"
        + "Creditos: "
        + qntCreditos
        +"\n";
    }
}
