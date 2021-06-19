package entities;

public class Smartwatch extends Equipamento {
	private String tipoDePulseira;

	public Smartwatch(String nome, String modelo, String tipoDePulseira) {
		super(nome, modelo);
		this.tipoDePulseira = tipoDePulseira;
	}

	public String getTipoDePulseira() {
		return tipoDePulseira;
	}

	public void setTipoDePulseira(String tipoDePulseira) {
		this.tipoDePulseira = tipoDePulseira;
	}

}
