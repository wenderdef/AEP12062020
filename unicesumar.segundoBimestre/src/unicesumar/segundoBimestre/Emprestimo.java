package unicesumar.segundoBimestre;

import java.util.ArrayList;
import java.util.List;

public class Emprestimo {

	private String dataEmp;
	private String horaEmp;
	private String dataEntrega;
	private boolean statusEmp;

	private Academico academico;
	
	private List<Livro> livros = new ArrayList<>();

	public Emprestimo(String dataEmp, String horaEmp, String dataEntrega, boolean statusEmp, Academico academico) {
		this.dataEmp = dataEmp;
		this.horaEmp = horaEmp;
		this.dataEntrega = dataEntrega;
		this.statusEmp = statusEmp;
		this.academico = academico;
	}
		
	public String getDataEmp() {
		return dataEmp;
	}

	public String getHoraEmp() {
		return horaEmp;
	}

	public String getDataEntrega() {
		return dataEntrega;
	}

	public boolean isStatusEmp() {
		return statusEmp;
	}

	public Academico getAcademico() {
		return academico;
	}
	
	public void addLivro(Livro l) {
		livros.add(l);		
	}

	public List<Livro> getLivros() {
		return livros;
	}
	
	
}
