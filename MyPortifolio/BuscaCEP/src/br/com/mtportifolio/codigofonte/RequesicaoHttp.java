package br.com.mtportifolio.codigofonte;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;


import com.google.gson.Gson;

public class RequesicaoHttp {
     
	public InformacoesEndereco buscacep(String cep) {
		HttpResponse<String> response = null;
		   try {
				URI enderco = URI.create("https://viacep.com.br/ws/" + cep +  "/json/");
				 HttpClient client = HttpClient.newHttpClient();
				   HttpRequest request = HttpRequest.newBuilder()
				         .uri(enderco)
				         .build();
				   
		      response = client
					     .send(request, BodyHandlers.ofString());
		} catch (IOException | InterruptedException e) {
			new RuntimeException("Não foi possível encontrar o cep informado");
			e.printStackTrace();
		} catch(IllegalStateException ex) {
			ex.getClass();
		}
		return new Gson().fromJson(response.body(), InformacoesEndereco.class);
	}

}
