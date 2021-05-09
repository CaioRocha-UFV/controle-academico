package model;

import java.util.ArrayList;

public class Historico {

    private ArrayList<Semestre> historico;

    public Historico(){
        this.historico = new ArrayList<Semestre>();
    }

    public void ExibirGradeCurricular(){
        System.out.println("-------------HISTORICO-------------");
        for (Semestre semestre : this.historico){
            semestre.ExibirSemestre();
        }
        System.out.println("-----------------------------------");
    }

    public ArrayList<Semestre> getHistorico() {
        return historico;
    }

    public void setHistorico(Semestre semestreCursado) {
        this.historico.add(semestreCursado);
    }

    public int ObterTotalCreditosGrade(){
        int creditos = 0;

        for (Semestre semestre : this.historico){
            creditos += semestre.ObterCreditosSemestre();
        }

        return creditos;
    }

    
}