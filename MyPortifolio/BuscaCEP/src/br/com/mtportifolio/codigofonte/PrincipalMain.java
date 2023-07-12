package br.com.mtportifolio.codigofonte;

import java.util.Scanner;

public class PrincipalMain {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean forverdade = true;
		while (forverdade) {
			System.out.println("Digite um Cep: ");	
			var busca = scanner.nextLine();
			ValidaCep validacep = new ValidaCep();
			ValidaCep.ValidaCep(busca);
			
			
			
			
			RequesicaoHttp requisicao = new RequesicaoHttp();
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
