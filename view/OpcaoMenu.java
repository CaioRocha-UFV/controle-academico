package view;

public enum OpcaoMenu {
    DISCIPLINAS_INSTITUICAO ("Disciplinas cadastradas na instituição de ensino"),
    ALUNO ("Dados aluno"),
    PROFESSOR ("Disciplinas ministradas por cada professor"),
    CURSO("Disciplinas obrigatorias de um semestre da grade"),
    GRADE("Grade curricular de um determinado curso"),
    HISTORICO("Histórico do aluno"),
    DEPARTAMENTO("Dados do departamento"),
    ENCERRARPEDIDO("Encerrar programa");

    private final String opcao;
    public static final int MAXOPCOES = 8;
    public static final int MINOPCOES = 1;

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
            System.out.print(opcao.ordinal()+1 + " - " + opcao.getOpcao() + "\n");
        }
        System.out.println("\n");
    }
}
