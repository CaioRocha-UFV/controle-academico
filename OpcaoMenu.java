// package utils;

public enum OpcaoMenu {
    PESSOA ("Pessoa"),
    ALUNO ("Aluno"),
    PROFESSOR ("Professor"),
    CURSO("Curso"),
    DISCIPLINA("Disciplina"),
    ATIVIDADECOMPLEMENTAR("Atividade Complementar"),
    GRADE("Grade"),
    HISTORICO("Histórico"),
    INSTITUICAOENSINO("Instituição de Ensino"),
    DEPARTAMENTO("Departamento"),
    ENCERRARPEDIDO("Encerrar programa");

    private final String opcao;
    public static final int MAXOPCOES = 11;
    public static final int MINOPCOES =1;

    /*
        CONSTRUTOR
    */  
    OpcaoMenu(String opcao){
        this.opcao = opcao;
    }
    
    /*
        GETTER
    */
    public String getOpcao(){
        return opcao;
    }

    /*
        MÉTODOS ADICIONAL
    */
    public static void mostrarOpcoes() {
        OpcaoMenu[] opcoes = OpcaoMenu.values();
        for (OpcaoMenu opcao : opcoes) {
            System.out.print(opcao.ordinal()+1 + "-" + opcao.getOpcao() + "\n");
        }
        System.out.println();
    }
}
