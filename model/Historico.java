package model;

import java.util.ArrayList;

public class Historico {

    private ArrayList<Semestre> historico;

    public Historico(){
        this.historico = new ArrayList<Semestre>();
    }

    public void ExibirHistorico(){
        System.out.println("----------------------------------- HISTORICO -----------------------------------");
        System.out.println("\n\n");
        for (Semestre semestre : this.historico){
            semestre.ExibirSemestre();
        }
        System.out.println("---------------------------------------------------------------------------------");
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