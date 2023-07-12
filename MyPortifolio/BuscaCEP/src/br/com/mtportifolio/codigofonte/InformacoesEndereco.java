package br.com.mtportifolio.codigofonte;

public class InformacoesEndereco {
    String cep;
	String nomedarua;
	String numerodacasa;
	String bairro;
	String uf;
	
	
	
	public String getCep() {
		return cep;
	}
	public String getNomedarua() {
		return nomedarua;
	}
	public String getNumerodacasa() {
		return numerodacasa;
	}
	public String getBairro() {
		return bairro;
	}
	public String getUf() {
		return uf;
	}
	@Override
	public String toString() {
		
		return "CEP: " + cep + "|Nome da rua:  " + nomedarua +
				"| Numero da casa: " + numerodacasa + " Bairro: " +
				bairro + " UF: " + uf;
				
			
	}

}
