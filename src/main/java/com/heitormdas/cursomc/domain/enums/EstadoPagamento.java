package com.heitormdas.cursomc.domain.enums;

public enum EstadoPagamento {

	PENDENTE(1, "Pendente"),
	QUITADO(2, "Quitado"),
	CANCELADO(2, "Cancelado");
	
	private int cod;
	private String descrição;
	
	private EstadoPagamento(int cod, String descricao) {
		this.cod = cod;
		this.descrição = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescrição() {
		return descrição;
	}

	public static EstadoPagamento toEnum(Integer cod) {
		
		if (cod == null ) {
			return null;
		}
		
		for (EstadoPagamento x: EstadoPagamento.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			} 
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
