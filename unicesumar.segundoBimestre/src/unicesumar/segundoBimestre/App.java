package unicesumar.segundoBimestre;

public class App {
	public static void main(String[] args) {
		Academico wender = new Academico("Wender Rezende Custodio", "75726634878", "19953992", "Av.Jose Alves Nendo",
				"62997002764");
		Livro amabis = new Livro("Biologia dos Organismos", "Moderna", "Amabis e Martho", 1, 1947);
		Livro bruna = new Livro("Doce veneno do Escorpiao", "Brasileirinhas", "Bruna Sufistinha", 2, 2006);
		Emprestimo empWender = new Emprestimo("11/06/2020", "15:56", "11/07/2020", false, wender);

		empWender.addLivro(amabis);
		empWender.addLivro(bruna);

		Reservar oPrincipe = new Reservar("O Principe");
		Reservar maquelele = new Reservar("Maquelele Prateado");
		wender.addReservas(oPrincipe);
		wender.addReservas(maquelele);

		mostrarTudo(empWender);
		mostrarReserva(wender);
	}

	public static void mostrarTudo(Emprestimo e) {
		System.out.println(" EMPRESTIMO: " + e.getAcademico().getNome() + "\n");
		System.out.println(" Data Emprestimo: " + e.getDataEmp());
		System.out.println(" Horas Emprestimo: " + e.getHoraEmp());
		System.out.println(" Data Entrega: " + e.getDataEntrega());
		System.out.println(" Status Entrega: " + e.isStatusEmp());

		System.out.println("\n ACADEMICO DADOS");
		System.out.println(" Nome Academico: " + e.getAcademico().getNome());
		System.out.println(" CPF: " + e.getAcademico().getCpf());
		System.out.println(" R.A: " + e.getAcademico().getRa());
		System.out.println(" Endereco:" + e.getAcademico().getEndereco());
		System.out.println(" Numero Telefone: " + e.getAcademico().getTelefone());

		System.out.println("\n LIVROS DADOS" + "\n");
		for (int i = 0; i < e.getLivros().size(); i++) {
			System.out.println(" Nome do Livro: " + e.getLivros().get(i).getNome());
			System.out.println(" Editora: " + e.getLivros().get(i).getEditora());
			System.out.println(" Autor: " + e.getLivros().get(i).getAutor());
			System.out.println(" Numero Livro: " + e.getLivros().get(i).getNumero());
			System.out.println(" Ano Livro: " + e.getLivros().get(i).getAno() + "\n");
		}
		System.out.println("=============================================================\n\n");
	}

	public static void mostrarReserva(Academico a) {
		System.out.println("RESERVAS DO " + a.getNome());
		for (int i = 0; i < a.getReservas().size(); i++) {
			System.out.println("Nome do livro: " + a.getReservas().get(i).getNomeLivro());
		}

	}

}
