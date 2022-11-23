package com.grupo03.petshop.domain.enuns;

public enum SituacaoCastrado {
	CASTRADO(1, "castrado"),
	NAO_CASTRADO(2, "não castrado");
	
	public Integer cod;
	public String descricao;
	
	private SituacaoCastrado(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public static SituacaoCastrado toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}		
		for (SituacaoCastrado sp : SituacaoCastrado.values()) {
			if (cod.equals(sp.getCod())) {
				return sp;
			}
		}
		
		throw new IllegalArgumentException();
		
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
