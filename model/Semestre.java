package model;

import java.util.Comparator;
import java.util.HashMap;



public class Semestre implements Comparable<Semestre> {

    private HashMap<String, Disciplina> semestre;
    private int numeroSemestre;


    public Semestre(int numeroSemestre){
        this.numeroSemestre = numeroSemestre;
        this.semestre = new HashMap<String, Disciplina>();
    }


    public void ExibirSemestre(){
        System.out.printf("                            Semestre: %d                            \n\n", this.numeroSemestre);
        System.out.println(("Disciplinas:\n"));
        for (String codigoDisc : this.semestre.keySet()){

            this.semestre.get(codigoDisc).ExibirDisciplina();
        }
        System.out.println("Quantidade de creditos: " + ObterCreditosSemestre());
        System.out.println(("------------------------------------------------------------------------------------"));
    }

    public int ObterCreditosSemestre(){

        int totalcreditos = 0;

        for (String codigoDisc : this.semestre.keySet()){
            totalcreditos += this.semestre.get(codigoDisc).getQntCreditos();
        }
        return totalcreditos;
    }

    public int getnumeroSemetre(){
        return this.numeroSemestre;
    }

    public void AdicionarDisciplina(Disciplina disciplina){

        this.semestre.put(disciplina.getCodigo(), disciplina);
    }
    
    public int compareTo(Semestre s1){
        if(this.getnumeroSemetre() < s1.getnumeroSemetre()){
            return -1;
        } else if(this.getnumeroSemetre() == s1.getnumeroSemetre()){
            return 0;
        } else {
            return 1;
        }
    }

}
