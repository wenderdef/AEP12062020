package unicesumar.segundoBimestre;

import java.util.ArrayList;
import java.util.List;

public class Academico {
	private String nome;
	private String cpf;
	private String ra;
	private String endereco;
	private String telefone;
	
	private List<Reservar> reservas = new ArrayList<>();

	public Academico(String nome, String cpf, String ra, String endereco, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.ra = ra;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getRa() {
		return ra;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public List<Reservar> getReservas() {
		return reservas;
	}
	
	public void addReservas(Reservar r) {
		reservas.add(r);		
	}
	
}
