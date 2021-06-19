package repositories;

import java.util.ArrayList;

import entities.Equipamento;

public class EquipamentoRepository {

	private ArrayList<Equipamento> equipamento;
	
	public EquipamentoRepository() {
		this.equipamento = new ArrayList<Equipamento>();
		
	}
	
	public void adicionarEquipamento(Equipamento equip) {
		this.equipamento.add(equip);
		
	}
	
	public void listarEquipamentos() {
		for(Equipamento equip : equipamento) {
			System.out.println(equip.toString());
		}
		System.out.println("Total = " + this.equipamento.size() + "equipamentos listados com sucesso!\n");
		
		
	}
	

	
}
