package unicesumar.segundoBimestre;

import java.util.ArrayList;
import java.util.List;

public class Reservar {
	private String nomeLivro;
	
	private List<Academico> academicos = new ArrayList<>();

	public Reservar(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public List<Academico> getAcademicos() {
		return academicos;
	}
	
	public void addAcademicos(Academico a) {
		academicos.add(a);		
	}

}
