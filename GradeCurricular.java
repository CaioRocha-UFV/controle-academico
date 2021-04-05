// package entities;

import java.util.ArrayList;
import java.util.List;

public class GradeCurricular {
    private String ano;
    private int totalCredito;
    private ArrayList<Semestre> grade;

    
    /*
        CONSTRUTORES
    */
    public GradeCurricular(String ano) {
        this.ano = ano;
        grade = new ArrayList<Semestre>();
        // this.nomeDisciplina = nomeDisciplina;
        // this.totalCredito = totalCredito;
    }

    /*
        SETTERS
    */
    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setTotalCredito(int totalCredito){
        this.totalCredito = totalCredito;
    }

    /*
        GETTERS
    */
    public String getAno() {
        return ano;
    }

    public int getTotalCredito(){
        return totalCredito;
    }

    
    /*
        METODOS
    */
    public void cadastrarGradeCurricular(String ano){
        // int somaCreditos = 0;

        System.out.println("Disciplinas que podem ser incluidas: ");
        // Disciplina.mostrarDisciplinas(disciplinas);

        // while(this.totalCredito > somaCreditos){
            // List<GradeCurricular> incluirDisciplina = new ArrayList<GradeCurricular>();
            // incluirDisciplina.add(new GradeCurricular(nome, professor, qntCreditos));
        // }
    }

    public static void mostrarGrade(List<GradeCurricular> grade) {
        System.out.println(grade);
    }

    public String toString(){
        return "Grade: "
        + ano
        +"\n";
    }
    
    
}
