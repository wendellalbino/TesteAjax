package br.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@SuppressWarnings("serial")
public class Empenho implements Serializable, Cloneable {

	private Integer codigo;
	private Date dataEmpenho;
	private Date dataLocal;
	private Date dataTermino;
	private String drogas;
	private Integer armaBranca;
	private Integer armaFogo;
	private Integer prisao;
	private Integer menor;
	private String reds;
	private TipoEmpenho tipo;
	private Integer ano;
	private Integer sequencial;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Date getDataEmpenho() {
		return dataEmpenho;
	}

	public void setDataEmpenho(Date dataEmpenho) {
		this.dataEmpenho = dataEmpenho;
	}

	public Date getDataLocal() {
		return dataLocal;
	}

	public void setDataLocal(Date dataLocal) {
		this.dataLocal = dataLocal;
	}

	public Date getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}

	public String getDrogas() {
		return drogas;
	}

	public void setDrogas(String drogas) {
		this.drogas = drogas;
	}

	public Integer getArmaBranca() {
		return armaBranca;
	}

	public void setArmaBranca(Integer armaBranca) {
		this.armaBranca = armaBranca;
	}

	public Integer getArmaFogo() {
		return armaFogo;
	}

	public void setArmaFogo(Integer armaFogo) {
		this.armaFogo = armaFogo;
	}

	public Integer getPrisao() {
		return prisao;
	}

	public void setPrisao(Integer prisao) {
		this.prisao = prisao;
	}

	public Integer getMenor() {
		return menor;
	}

	public void setMenor(Integer menor) {
		this.menor = menor;
	}

	public String getReds() {
		return reds;
	}

	public void setReds(String reds) {
		this.reds = reds;
	}

	@Enumerated(EnumType.STRING)
	public TipoEmpenho getTipo() {
		return tipo;
	}

	public void setTipo(TipoEmpenho tipo) {
		this.tipo = tipo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getSequencial() {
		return sequencial;
	}

	public void setSequencial(Integer sequencial) {
		this.sequencial = sequencial;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empenho other = (Empenho) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
