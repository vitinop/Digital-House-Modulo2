package entities;

public class Usuario {
 // Criação de super clase

 protected String idUsuario;
 protected String nomeUsuario;
 protected String cpf;
 protected date dataNascimento ;
 protected String email;
 protected date dataRegistro;

 public Usuario(){
}

 public Usuario(String idUsuario, String nomeUsuario, String cpf, date dataNascimento, String email, date dataRegistro) {
  this.idUsuario = idUsuario;
  this.nomeUsuario = nomeUsuario;
  this.cpf = cpf;
  this.dataNascimento = dataNascimento;
  this.email = email;
  this.dataRegistro = dataRegistro;
 }

//Metodos costumizados


