package entities;

public class Smartphone extends Equipamento {
	private Integer quantidadeDeChipsOperadora;

	public Smartphone(String nome, String modelo, Integer quantidadeDeChipsOperadora) {
		super(nome, modelo);
		this.quantidadeDeChipsOperadora = quantidadeDeChipsOperadora;
	}

	public Integer getQuantidadeDeChipsOperadora() {
		return quantidadeDeChipsOperadora;
	}

	public void setQuantidadeDeChipsOperadora(Integer quantidadeDeChipsOperadora) {
		this.quantidadeDeChipsOperadora = quantidadeDeChipsOperadora;
	}
	
}
