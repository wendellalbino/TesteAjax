package br.view;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import br.model.Empenho;
import br.model.TipoEmpenho;

@SuppressWarnings("serial")
@ManagedBean
public class EncerrarEmpenhoBean implements Serializable {

	private Empenho empenho = new Empenho();

	public void salvar() {

		System.out.println(empenho.getArmaBranca());
		System.out.println(empenho.getArmaFogo());
		System.out.println(empenho.getMenor());
		System.out.println(empenho.getPrisao());
		System.out.println(empenho.getDrogas());
		System.out.println(empenho.getReds());

	}

	public void empenhoTipoModificado(ValueChangeEvent event) {
		this.empenho.setTipo((TipoEmpenho) event.getNewValue());
		this.empenho.setArmaBranca(null);
		this.empenho.setArmaFogo(null);
		this.empenho.setDrogas(null);
		this.empenho.setMenor(null);
		this.empenho.setReds(null);
		this.empenho.setPrisao(null);
		FacesContext.getCurrentInstance().renderResponse();
		System.out.println("Tipo selecionado: " + this.empenho.getTipo());
	}

	public TipoEmpenho[] getTipoEmpenho() {
		return TipoEmpenho.values();
	}

	public Empenho getEmpenho() {
		return empenho;
	}

	public void setEmpenho(Empenho empenho) throws CloneNotSupportedException {
		this.empenho = empenho;
		if (this.empenho == null) {
			this.empenho = new Empenho();
		} else {
			this.empenho = (Empenho) empenho.clone();
		}
	}

}
