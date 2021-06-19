package entities;

public class Notebook extends Equipamento {
	private Double tamanhoDaTela;

	public Notebook(String nome, String modelo, Double tamanhoDaTela) {
		super(nome, modelo);
		this.tamanhoDaTela = tamanhoDaTela;
	}

	public Double getTamanhoDaTela() {
		return tamanhoDaTela;
	}

	public void setTamanhoDaTela(Double tamanhoDaTela) {
		this.tamanhoDaTela = tamanhoDaTela;
	}

}
