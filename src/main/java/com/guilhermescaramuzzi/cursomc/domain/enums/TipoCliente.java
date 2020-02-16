package com.guilhermescaramuzzi.cursomc.domain.enums;

public enum TipoCliente {
	
	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Juridica");
	
	private int cod;
	
	
	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		
	}
	
	public int getCod() {
		return cod;
	
	}
	public String getDescricao () {
		return getDescricao();
		
	}
	public static TipoCliente toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		
		for(TipoCliente x : TipoCliente.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
