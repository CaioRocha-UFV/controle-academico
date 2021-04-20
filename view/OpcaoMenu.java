package view;

public enum OpcaoMenu {
    DISCIPLINAS_INSTITUICAO ("Disciplinas cadastradas na instituição de ensino"),
    ALUNO ("Aluno"),
    PROFESSOR ("Disciplinas ministradas por cada professor"),
    CURSO("Disciplinas obrigatorias de um semestre da grade"),
    DISCIPLINA("Disciplina"),
    ATIVIDADECOMPLEMENTAR("Atividade Complementar"),
    GRADE("Grade curricular de um determinado curso"),
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
        System.out.println("OPCOES DISPONIVEIS -> 1-3-4-7");
    }
}
