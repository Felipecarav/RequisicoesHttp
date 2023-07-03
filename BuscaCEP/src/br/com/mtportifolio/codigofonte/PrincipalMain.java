package br.com.mtportifolio.codigofonte;

import java.util.Scanner;

public class PrincipalMain {
	
	public static void main(String[] args) {
		// Objeto Scnner, responsavél por receber as informações via teclado
		Scanner scanner = new Scanner(System.in);
		//forverdaden inializada com true para relizar um loop infinito
		boolean forverdade = true;
		while (forverdade) {
			System.out.println("Digite um Cep: ");	
			var busca = scanner.nextLine();
			// Objeto criado para realizar a validação do CEP informado
			ValidaCep validacep = new ValidaCep();
			ValidaCep.ValidaCep(busca);
			
			
			RequesicaoHttp requisicao = new RequesicaoHttp();
			// Passandp a variavel busca no método onde sera realizado a Requisição Http
		    InformacoesEndereco novo =  requisicao.buscacep(busca);
		    System.out.println(novo);
		    System.out.println("Deseja realizar outra busca: ");
		    String respostausuario = scanner.nextLine();
		    if (respostausuario.equalsIgnoreCase("nao")) {
		    	forverdade = false;
		    }    
		
	}

}
}
