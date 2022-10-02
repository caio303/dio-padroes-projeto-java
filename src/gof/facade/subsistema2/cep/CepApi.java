package gof.facade.subsistema2.cep;

public class CepApi {

	private static class Holder {
		private static CepApi instancia = new CepApi();
	}

	private CepApi() {}
	
	public static CepApi getInstancia() {
		return Holder.instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "João Pessoa";
	}
	
	public String recuperarEstado(String cep) {
		return "PB";
	}
	
	
}
