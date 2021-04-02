import java.util.HashMap;

public class Departamento {
    
    private String nome;
    private HashMap<String, Curso> cursosAssociados = new HashMap<String, Curso>();
    private Professor diretor;
    private String email;
    private String telefone;
    private String codigo;


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
        return cursosAssociados;
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
        this.cursosAssociados.put(cursoAssociado.getNome(), cursoAssociado);
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
