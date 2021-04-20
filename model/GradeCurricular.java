package model;

import java.util.ArrayList;
import java.util.List;



public class GradeCurricular {
    private int ano;
    private int totalCredito;
    private ArrayList<Semestre> grade;

    
    /*
        CONSTRUTORES
    */
    public GradeCurricular(int ano) {
        this.ano = ano;
        grade = new ArrayList<Semestre>();
        // this.nomeDisciplina = nomeDisciplina;
        // this.totalCredito = totalCredito;
    }

    public void ExibirGradeCurricular(){
        System.out.println("################################## GRADE CURRICULAR ##################################");
        System.out.println("");
        for (Semestre semestre : this.grade){
            semestre.ExibirSemestre();
            System.out.println("\n");
        }
        System.out.println("######################################################################################");
    }

    public void AdicionarSemestreGrade(Semestre semestre){

        this.grade.add(semestre);
    }

    public Semestre RetornarSemetre(int numSemetre){

        for (Semestre semestre : this.grade){
            if (semestre.getnumeroSemetre() == numSemetre){
                return semestre;
            }
        }
        return null;
    }

    /*
        SETTERS
    */
    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setTotalCredito(int totalCredito){
        this.totalCredito = totalCredito;
    }



    /*
        GETTERS
    */
    public int getAno() {
        return ano;
    }

    public int getTotalCredito(){
        return totalCredito;
    }

    
    /*
        METODOS
    */
    /*
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
    */
    
    
}
