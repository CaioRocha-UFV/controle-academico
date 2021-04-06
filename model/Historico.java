package model;

import java.util.ArrayList;
import java.util.HashMap;

import control.Semestre;

// import entities.Disciplina;

public class Historico {


    private ArrayList<Semestre> historico;
    private double pontosAtividadesComplementares;

    public Historico(){
        this.historico = new ArrayList<Semestre>();
        this.pontosAtividadesComplementares = 0;
    }

    public ArrayList<Semestre> getHistorico() {
        return historico;
    }

    public void setHistorico(Semestre semestreCursado) {
        this.historico.add(semestreCursado);
    }

    public double getPontosAtividadesComplementares() {
        return pontosAtividadesComplementares;
    }

    public void AcrescetarPontosAtividades(double pontos){
        this.pontosAtividadesComplementares += pontos;
    }




    /*
    private HashMap<String, Disciplina> disciplinasCursadas;
    public Historico(HashMap<String, Disciplina> disciplinasCursadas){
        this.disciplinasCursadas = disciplinasCursadas;
    }
    */
    
    
    //private ArrayList<Double> notas;
    //private String semestre;
    //private double coeficiente;
    //private Curso grade; //Curso?

    /*
    public Historico(ArrayList<Double> notas, String semestre, double coeficiente, Curso grade){
        this.notas = notas;
        this.semestre = semestre;
        this.coeficiente = coeficiente;
        this.grade = grade;
    }
    

    // Getters
    public HashMap<String, Disciplina> getDisciplinasCursadas() {
        return disciplinasCursadas;
    } 

    public ArrayList<Double> getNotas() {
        return notas;
    }
    
    
    public String getSemestre() {
        return semestre;
    }
    
    public double getCoeficiente() {
        return coeficiente;
    }

    public Curso getGrade() {
        return this.grade;    
    }
    
    // Setters 
    public void setDisciplinasCursadas(HashMap<String, Disciplina> disciplinasCursadas) {
        this.disciplinasCursadas = disciplinasCursadas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }    
    
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    
    public void setCoeficiente(double coeficiente) {
        this.coeficiente = coeficiente;
    }

    public void setGrade(Curso grade){
        this.grade = grade;
    }
    */
}
