package model;

import java.util.HashMap;

public class Professor extends Pessoa{
    HashMap<String, Aluno> alunosOrientados;
    HashMap<String, Departamento> departamentos;
    HashMap<String, Disciplina> disciplinasLecionadas;

    boolean coordenador;



    public Professor (String nomeProf){
        super(nomeProf);
        setNome(nomeProf);
    }

    protected Professor (Builder builder){
        super(builder);


        this.coordenador = builder.coordenador;
        this.alunosOrientados = builder.alunosOrientados;
        this.departamentos = builder.departamentos;
        this.disciplinasLecionadas = builder.disciplinasLecionadas;
    }


    @Override
    public String toString() {
        return ">> Professor [" + super.toString() + "\n         alunosOrientados=" + alunosOrientados + ", coordenador=" + coordenador + ", departamentos="
                + departamentos + ", disciplinasLecionadas=" + disciplinasLecionadas + "]";
    }

    public static Builder builder() {
        return new Builder();
    }
    
    public static class Builder extends Pessoa.Builder<Builder> {
        HashMap<String, Aluno> alunosOrientados;
        HashMap<String, Departamento> departamentos;
        HashMap<String, Disciplina> disciplinasLecionadas;
        boolean coordenador;

        @Override
        public Builder getThis(){
            return this;
        }

        public Builder alunosOrientados(HashMap<String, Aluno> alunosOrientados){
            this. alunosOrientados = alunosOrientados;
            return this;
        }

        public Builder departamentos(HashMap<String, Departamento> departamentos){
            this. departamentos = departamentos;
            return this;
        }

        public Builder disciplinasLecionadas(HashMap<String, Disciplina> disciplinasLecionadas){
            this. disciplinasLecionadas = disciplinasLecionadas;
            return this;
        }

        public Builder coordenador(boolean coordenador){
            this. coordenador = coordenador;
            return this;
        }

        public Professor CriarProfessor(){
            return new Professor(this);
        }
    }


    // GETTERS E SETTERS
    public HashMap<String, Aluno> getAlunosOrientados() {
        return alunosOrientados;
    }


    public void setAlunosOrientados(HashMap<String, Aluno> alunosOrientados) {
        this.alunosOrientados = alunosOrientados;
    }


    public HashMap<String, Departamento> getDepartamentos() {
        return departamentos;
    }


    public void setDepartamentos(HashMap<String, Departamento> departamentos) {
        this.departamentos = departamentos;
    }


    public HashMap<String, Disciplina> getDisciplinasLecionadas() {
        return disciplinasLecionadas;
    }


    public void setDisciplinasLecionadas(Disciplina disciplina) {
        this.disciplinasLecionadas.put(disciplina.getCodigo(), disciplina);
    }


    public boolean isCoordenador() {
        return coordenador;
    }


    public void setCoordenador(boolean coordenador) {
        this.coordenador = coordenador;
    }


    
}