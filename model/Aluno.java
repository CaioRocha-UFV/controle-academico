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

    /*
    // TUTORIAL PARA A CONTRUÇÃO DO BUILDER
    // https://ducmanhphan.github.io/2020-04-06-how-to-apply-builder-pattern-with-inhertitance/

    protected Aluno(Builder builder){
        super(builder);

        this.matricula = builder.matricula;
        this.coeficiente = builder.coeficiente;
        this.orientador = builder.orientador;
        this.semestreAtual = builder.semestreAtual;
        this.historico = builder.historico;
    }

    @Override
    public String toString() {
        return ">> Aluno [" + super.toString() +  "\n         coeficiente=" + coeficiente + ", matricula="
        + matricula + ", historico=" + historico + ", orientador=" + orientador + ", semestreAtual=" + semestreAtual + "]";
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder extends Pessoa.Builder<Builder> {
        String matricula;
        Float coeficiente;
        Professor orientador;
        Historico historico;
        Semestre semestreAtual;
        GradeCurricular grade;

        @Override
        public Builder getThis(){
            return this;
        }

        public Builder matricula(String matricula) {
            this.matricula = matricula;
            return this;
        }

        public Builder coeficiente(Float coeficiente) {
            this.coeficiente = coeficiente;
            return this;
        }

        

        public Aluno CriarAluno(){
            return new Aluno(this);
        }
    }

    */

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
