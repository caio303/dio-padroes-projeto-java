package gof.facade;

import gof.facade.subsistema1.crm.CrmService;
import gof.facade.subsistema2.cep.CepApi;

public class Facade {
	
	private Facade() {}
	
	private static Facade instancia = new Facade();
	
	public static Facade getInstancia() {
		return instancia;
	}
	
	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
