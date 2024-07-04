package orm.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.*;

@Entity
@Table(name="alunos")
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	private String nome;
	private String email;
	private String cpf;
	private String dataNascimento;
	private String naturalidade;
	private String endereco;
	
	public Aluno() {
		
	}
	
	public Aluno(long id, String nome, String email, String cpf, String dataNascimento, String naturalidade,
			String endereco) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.naturalidade = naturalidade;
		this.endereco = endereco;
	}

	public long getId() {
		return id;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	@Override
	public String toString() {
		return "Aluno:" + "\n"+
				"id=" + id + "\n"+
				"nome='" + nome + '\'' + "\n"+
				"email='" + email + '\'' + "\n"+
				"cpf='" + cpf + '\'' + "\n"+
				"dataNascimento='" + dataNascimento + '\'' + "\n"+
				"naturalidade='" + naturalidade + '\'' + "\n"+
				"endereco='" + endereco + '\'' + "\n"+
				"-----------------------------------------------" + '\n';
	}
	
	
	
	

}
	

	