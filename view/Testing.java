package view;

import java.util.Locale;
import model.*;
// import utils.*;

public class Testing {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        /*
            CLASSE MENU FOI CRIADA PARA PERMITIR TESTAR A APLICAÇÃO5
        
        Menu menu = new Menu();
        menu.mostrarMenu();  
        */

        // Instituição
        Instituicao ufv = new Instituicao("Universidade Federal de Viçosa");
        // Departamento
        Departamento dep_Mat = new Departamento("Dep Matematica", "MAT001", "depmat.ufv.br", "3838-1111");

        // Professores
        Professor p1 = new Professor("Diretor");
        Professor p2 = new Professor("Supervisora");
        Professor p3 = new Professor("Coordenador");
        
        GradeCurricular grade = new GradeCurricular("2020");
        // Cursos
        Curso cdc = new Curso("CDC", "Computacao", p1, grade);
        
        // Disciplinas
        //Disciplina calc = new Disciplina("Calculo 3", "diretor", 4);



        ufv.setCursos(cdc.getCodigo(), cdc);
        ufv.setDepartamentos(dep_Mat.getCodigo(), dep_Mat);
        //ufv.setDisciplina(calc.getNome(), calc);
        //ufv.setProfessores(diretor.getNome(), diretor);

        dep_Mat.setCursosAssociados(cdc);






    }
}
