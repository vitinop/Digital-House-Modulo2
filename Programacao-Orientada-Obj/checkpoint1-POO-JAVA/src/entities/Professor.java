package entities;

public class Professor extends Usuario {
    private String formacaoAcademica;

    public Professor(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public Professor(String idUsuario, String nomeUsuario, String cpf, date dataNascimento, String email, date dataRegistro, String formacaoAcademica) {
        super(idUsuario, nomeUsuario, cpf, dataNascimento, email, dataRegistro);
        this.formacaoAcademica = formacaoAcademica;
    }
}

//Metodos costumizados

