package unicesumar.segundoBimestre;

public class Livro {
	private String nome;
	private String editora;
	private String autor;
	private int numero;
	private int ano;
	
	private Emprestimo emprestimo;

	public Livro(String nome, String editora, String autor, int numero, int ano) {
		this.nome = nome;
		this.editora = editora;
		this.autor = autor;
		this.numero = numero;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public String getEditora() {
		return editora;
	}

	public String getAutor() {
		return autor;
	}

	public int getNumero() {
		return numero;
	}

	public int getAno() {
		return ano;
	}

	public Emprestimo getEmprestimo() {
		return emprestimo;
	}
	
	
	

}
