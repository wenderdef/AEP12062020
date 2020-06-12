package arma;

public class ARMA {

	private String marcaArma;
	private int[] qtdMunicao;

	public ARMA(String marcaArma) {
		this.marcaArma = marcaArma;
		this.qtdMunicao = new int[0];

	}

	public void recarregaArma(int mag, int disparo) {
		qtdMunicao = new int[3];
		qtdMunicao[1] = mag - disparo;
		qtdMunicao[2] = disparo;

		qtdMunicao[0] = qtdMunicao[1] - (qtdMunicao[1] - qtdMunicao[2]);

		System.out.println("Municao: " + qtdMunicao[0] + "\n Municao total do mag: " + qtdMunicao[1]
				+ "\n Municao por vez na arma: " + qtdMunicao[2]);

	}

	public boolean destravaArma() {
		boolean destravada = false;

		if (destravada == false) {
			destravada = true;
			System.out.println("Arma destravada com sucesso !!!");
			return destravada;
		} else
			System.out.println("Sua arma ja esta destravada !");
		return false;

	}

	public int getBalas() {
		return qtdMunicao[0];
	}

	public void setBalas(int x) {
		this.qtdMunicao[0] = x;
	}

	public boolean semMunicao() {

		if (qtdMunicao[0] <= 0 && qtdMunicao[1] <= 0) {
			return true;
		} else
			return false;

	}

	public boolean precisaCarregar() {

		if (qtdMunicao[0] <= 0 && qtdMunicao[1] != 0) {
			return true;
		} else
			return false;

	}

	public void carregarArma() {
		setBalas(qtdMunicao[2]);
		qtdMunicao[1] -= qtdMunicao[2];

		System.out.println("Municao: " + qtdMunicao[0] + "\n Municao total do mag: " + qtdMunicao[1]
				+ "\n Municao por vez na arma: " + qtdMunicao[2]);
	}

	public void atirar() {
		if (precisaCarregar()) {
			System.out.println("Arma está vazia voce precisa recarregar o Mag");
		}
		if (destravaArma() == false) {
			System.out.println("arma travada");
		} else if (getBalas() <= 0) {
			carregarArma();
		} else {
			setBalas(getBalas() - 1);
			System.out.print("PewWwwWWW!check check !!! Balas restantes: " + getBalas() + "\n");
		}

	}

}
