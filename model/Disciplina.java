package model;

import java.util.ArrayList;
import java.util.List;


public class Disciplina {
    //private int quantidade;
    private String nome;
    private String professor;
    private int qntCreditos;
    private String codigo;


    /*
        CONSTRUTORES
    */
    public Disciplina(String nome, int qntCreditos, String codigo) {
        this.nome = nome;
        this.qntCreditos = qntCreditos;
        this.codigo = codigo;
        
    }

    public void ExibirDisciplina(){

        System.out.printf("- %s - %s - Professor: %s - Creditos: %d\n", this.nome, this.codigo, this.professor, this.qntCreditos);
    }

    /*
        SETTERS
    */
    public void setProfessor( String professor) {
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

    /*
    public int getQuantidade(){
        return quantidade;
    }
    */

    public int getQntCreditos(){
        return qntCreditos;
    }

    public String getCodigo(){
        return this.codigo;
    }

    /*
    public void adicionarDisciplina(String nome, String professor) {
        List<Disciplina> novaDisciplina = new ArrayList<Disciplina>();
        novaDisciplina.add(new Disciplina(nome, professor, qntCreditos));
        this.quantidade++;
    }
    */

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
