package entities;

public class Aluno extends Usuario {
    private String matriculaAluno;
    private int anoLetivo;

    private boolean situacaoMatricula;

    public Aluno(boolean situacaoMatricula) {
        this.situacaoMatricula = situacaoMatricula;
    }

    public Aluno(String idUsuario, String nomeUsuario, String cpf, date dataNascimento, String email, date dataRegistro, boolean situacaoMatricula) {
        super(idUsuario, nomeUsuario, cpf, dataNascimento, email, dataRegistro);
        this.situacaoMatricula = situacaoMatricula;
    }

    public Aluno(String matriculaAluno, int anoLetivo) {
        this.matriculaAluno = matriculaAluno;
        this.anoLetivo = anoLetivo;
    }

    public Aluno(String idUsuario, String nomeUsuario, String cpf, date dataNascimento, String email, date dataRegistro, String matriculaAluno, int anoLetivo) {
        super(idUsuario, nomeUsuario, cpf, dataNascimento, email, dataRegistro);
        this.matriculaAluno = matriculaAluno;
        this.anoLetivo = anoLetivo;
    }
}
