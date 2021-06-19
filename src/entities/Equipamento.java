package entities;

public abstract class Equipamento {

	private String nome;
	private String modelo;

	public Equipamento() {

	}

	public Equipamento(String nome, String modelo) {
		super();
		this.nome = nome;
		this.modelo = modelo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
