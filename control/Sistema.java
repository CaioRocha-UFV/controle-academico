package control;

import model.*;
import view.*;

public class Sistema{

    public Control_Geral controladorGeral;

    public Sistema(String nomeInstituicao){
        this.controladorGeral = new Control_Geral(nomeInstituicao);
    }

    public Instituicao getInstituicaoControlador(){

        return this.controladorGeral.getInstituicao();
    }

    public void CadastrarProfessores(){
        
        this.controladorGeral.AdicionarProfessorInsituicao("Daniel");
        this.controladorGeral.AdicionarProfessorInsituicao("Thais");
        this.controladorGeral.AdicionarProfessorInsituicao("Fabricio");
        this.controladorGeral.AdicionarProfessorInsituicao("Glaucia");
        this.controladorGeral.AdicionarProfessorInsituicao("Nacif");
        this.controladorGeral.AdicionarProfessorInsituicao("Marcus");

    }

    public void CadastrarDisciplinas(){

        this.controladorGeral.AdicionarDisciplinaInstituicao("Programacao", 6, "CCF 110");
        this.controladorGeral.AdicionarDisciplinaInstituicao("Calculo Integral e Diferencial 1", 6, "MAF 141");
        this.controladorGeral.AdicionarDisciplinaInstituicao("Matematica Discreta", 4, "CCF 130");
        this.controladorGeral.AdicionarDisciplinaInstituicao("Introdução a Ciencia da Computacao", 2, "CCF 191");

        this.controladorGeral.AdicionarDisciplinaInstituicao("Algoritmos e Estruturas de Dados I", 6, "CCF 211");
        this.controladorGeral.AdicionarDisciplinaInstituicao("Introdução aos Sistemas Lógicos e Digitais", 4, "CCF 251");
        this.controladorGeral.AdicionarDisciplinaInstituicao("Inglês 1", 4, "LEF 215");
        this.controladorGeral.AdicionarDisciplinaInstituicao("Geometria Analitica e Algebra Linear", 6, "MAF 135");
        this.controladorGeral.AdicionarDisciplinaInstituicao("Calculo Integral e Diferencial 2", 4, "MAF 143");


        this.controladorGeral.AdicionarDisciplinaInstituicao("Empreendedorimo e Inovacao I", 4, "ADF 117");
        this.controladorGeral.AdicionarDisciplinaInstituicao("Organizacao de Computadores 1", 4, "CCF 252");
        this.controladorGeral.AdicionarDisciplinaInstituicao("Fisica 1", 4, "FIF 201");
        this.controladorGeral.AdicionarDisciplinaInstituicao("Iniciacao a Estatistica", 4, "MAF 105");
        this.controladorGeral.AdicionarDisciplinaInstituicao("Calculo Integral e Diferencial 3", 4, "MAF 243");
        this.controladorGeral.AdicionarDisciplinaInstituicao("Algoritmos e Estruturas de Dados 2", 6, "CCF 212");

        this.controladorGeral.AdicionarDisciplinaInstituicao("Banco de Dados", 4, "CCF 221");
        this.controladorGeral.AdicionarDisciplinaInstituicao("Programacao Orientada a Objetos", 4, "CCF 313");
        this.controladorGeral.AdicionarDisciplinaInstituicao("Projeto e Analise de Algoritmos", 4, "CCF 330");
        this.controladorGeral.AdicionarDisciplinaInstituicao("Teoria e Modelo de Grafos", 4, "CCF 331");
        this.controladorGeral.AdicionarDisciplinaInstituicao("Fisica 3", 4, "FIF 203");
        this.controladorGeral.AdicionarDisciplinaInstituicao("Portugues Instrumental", 4, "LEF 100");
        this.controladorGeral.AdicionarDisciplinaInstituicao("Teoria Geral da Administracao", 2, "TGA 371");

    }

    public void CadastrarCurso(){

        this.controladorGeral.AdicionarCursoInstituicao("CDC", "Bacharelado em Ciencia da Computacao");
    }

    public void CadastrarDepartamento(){

        this.controladorGeral.AdicionarDepartamentoInstituicao("Instituto de Ciencias Exatas e Tecnologicas", 
        "IFF", "cienciadacomputacao.caf@ufv.br", "(31) 3602-1000");
    }

    public void CadastrarGrade(){

        this.controladorGeral.AdicionarGradeCurso("CDC", 2020);
    }

    public void CadastrarSemestre(){

        this.controladorGeral.AdicionarSemetreGradeCurso("CDC", 1);
        this.controladorGeral.AdicionarSemetreGradeCurso("CDC", 2);
        this.controladorGeral.AdicionarSemetreGradeCurso("CDC", 3);
        this.controladorGeral.AdicionarSemetreGradeCurso("CDC", 4);
    }

    public void CadastrarDisciplinaSemestre(){

        this.controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 110", 1);
        this.controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 130", 1);
        this.controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 191", 1);
        this.controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "MAF 141", 1);

        this.controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 211", 2);
        this.controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 251", 2);
        this.controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "LEF 215", 2);
        this.controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "MAF 135", 2);
        this.controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "MAF 143", 2);

        this.controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 212", 3);
        this.controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 252", 3);
        this.controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "FIF 201", 3);
        this.controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "ADF 117", 3);
        this.controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "MAF 105", 3);
        this.controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "MAF 243", 3);

        this.controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 221", 4);
        this.controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 313", 4);
        this.controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 330", 4);
        this.controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "CCF 331", 4);
        this.controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "FIF 203", 4);
        this.controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "TGA 371", 4);
        this.controladorGeral.AdicionarDisciplinaSemetreGradeCurso("CDC", "LEF 100", 4);
    }


    public void Conectar(){

        this.controladorGeral.VincularProfessorDisciplina("Daniel", "CCF 221");
        this.controladorGeral.VincularProfessorDisciplina("Daniel", "CCF 331");
        this.controladorGeral.VincularProfessorDisciplina("Nacif", "CCF 110");
        this.controladorGeral.VincularProfessorDisciplina("Nacif", "CCF 251");
        this.controladorGeral.VincularProfessorDisciplina("Nacif", "CCF 252");
        this.controladorGeral.VincularProfessorDisciplina("Thais", "CCF 211");
        this.controladorGeral.VincularProfessorDisciplina("Glaucia", "CCF 212");
    }

}