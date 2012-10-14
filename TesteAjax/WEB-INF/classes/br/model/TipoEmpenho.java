package br.model;

public enum TipoEmpenho {

	BO("BO"), BOS("BOS");

	private String descricao;

	TipoEmpenho(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return this.descricao;
	}
}
