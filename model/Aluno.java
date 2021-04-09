package model;



public class Aluno extends Pessoa {
    String matricula;
    Float coeficiente;

    Professor orientador;

    Historico historico;
    Semestre semestreAtual;

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


    // GETTERS E SETTERS 
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Float getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(Float coeficiente) {
        this.coeficiente = coeficiente;
    }

    public Professor getOrientador() {
        return orientador;
    }

    public void setOrientador(Professor orientador) {
        this.orientador = orientador;
    }

    public Historico getHistorico() {
        return historico;
    }

    public void setHistorico(Historico historico) {
        this.historico = historico;
    }

    public Semestre getSemestreAtual() {
        return semestreAtual;
    }

    public void setSemestreAtual(Semestre semestreAtual) {
        this.semestreAtual = semestreAtual;
    }


    
}
