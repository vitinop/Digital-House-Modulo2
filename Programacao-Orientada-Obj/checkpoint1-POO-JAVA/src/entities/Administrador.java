package entities;

public class Administrador extends Usuario{
    private String admPassword;

    public Administrador(String admPassword) {
        this.admPassword = admPassword;
    }

    public Administrador(String idUsuario, String nomeUsuario, String cpf, date dataNascimento, String email, date dataRegistro, String admPassword) {
        super(idUsuario, nomeUsuario, cpf, dataNascimento, email, dataRegistro);
        this.admPassword = admPassword;
    }
}

//Metodos costumizados
