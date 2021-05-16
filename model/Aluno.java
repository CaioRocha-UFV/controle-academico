package model;

public class Aluno extends Pessoa {
    private String matricula;
    private Historico historico;
    private Semestre semestreAtual;

    public Aluno(String nome, String email, String matricula){
        super(nome, email);
        this.matricula = matricula;
        this.historico = new Historico();
    }

    public void ExibirDadosAluno(){

        System.out.println("---------------------------------------------------------");
        System.out.println("                         DADOS                           ");
        System.out.println("Nome: " + this.nome + " - E-mail: " + this.email);
        System.out.println("Total de créditos já cursados: " + this.historico.ObterTotalCreditosGrade());
        System.out.println("");
        System.out.println("Semestre atual: ");
        this.semestreAtual.ExibirSemestre();
        System.out.println("---------------------------------------------------------");

    }

    public void ExibirHistoricoAluno(){
        this.historico.ExibirHistorico();
    }

    // GETTERS E SETTERS 
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Historico getHistorico() {
        return historico;
    }

    public void setHistorico(Semestre semestreCursado) {
        this.historico.setHistorico(semestreCursado);
    }

    public Semestre getSemestreAtual() {
        return semestreAtual;
    }

    public void setSemestreAtual(Semestre semestreAtual) {
        this.semestreAtual = semestreAtual;
    }
}
