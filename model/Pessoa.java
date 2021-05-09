package model;

public abstract class Pessoa {

    String cpf;
    String nome;
    String email;
    String celular;
    String dataNascimento;

    public Pessoa(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    /*
    public static HashMap<String, Pessoa> todasAsPessoas;

    // TUTORIAL PARA A CONTRUÇÃO DO BUILDER
    // https://ducmanhphan.github.io/2020-04-06-how-to-apply-builder-pattern-with-inhertitance/
    protected Pessoa(Builder<?> builder) {
        this.cpf = builder.cpf;
        this.nome = builder.nome;
        this.email = builder.email;
        this.celular = builder.celular;
        this.dataNascimento = builder.dataNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa [celular=" + celular + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", email=" + email
                + ", nome=" + nome + "]";
    }
    

    public static Builder<?> builder(){
        return new Builder() {
            @Override
            public Builder<?> getThis() {
                return this;
            }
        };
    }

    public abstract static class Builder<T extends Builder<T>>{
        String cpf;
        String nome;
        String email;
        String celular;
        String dataNascimento;

        public abstract T getThis();

        public Builder () { }

        public T cpf(String cpf){
            this.cpf = cpf;
            return this.getThis();
        }
        public T nome(String nome){
            this.nome = nome;
            return this.getThis();
        }
        public T email(String email){
            this.email = email;
            return this.getThis();
        }
        public T celular(String celular){
            this.celular = celular;
            return this.getThis();
        }
        public T dataNascimento(String dataNascimento){
            this.dataNascimento = dataNascimento;
            return this.getThis();
        }

        public Pessoa CriarPessoa(){
            return new Pessoa(this);
        }
    }
    */

    // GETTERS E SETTERS

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }



    

    
}
