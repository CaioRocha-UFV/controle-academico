package Model;

import java.util.HashMap;

public class Departamento {
    
    private String codigo;
    private String nome;
    private String email;
    private String telefone;

    private HashMap<String, Curso> cursos = new HashMap<String, Curso>();
    
    private Professor diretor;

    /*
        CONSTRUTORES
    */

    public Departamento(String nome, String codigo, Professor diretor, String email, String telefone){

        this.setNome(nome);
        this.setCodigo(codigo);
        this.setDiretor(diretor);
        this.setEmail(email);
        this.setEmail(email);
        this.setTelefone(telefone);
    }

    /*
        GETTERS
    */

    public String getNome() {
        return nome;
    }

    public HashMap<String, Curso> getCursosAssociados() {
        return cursos;
    }

    public Professor getDiretor() {
        return diretor;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCodigo() {
        return codigo;
    }

    /*
        SETTERS
    */

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCursosAssociados(Curso cursoAssociado) {
        this.cursos.put(cursoAssociado.getNome(), cursoAssociado);
    }

    public void setDiretor(Professor diretor) {
        this.diretor = diretor;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
