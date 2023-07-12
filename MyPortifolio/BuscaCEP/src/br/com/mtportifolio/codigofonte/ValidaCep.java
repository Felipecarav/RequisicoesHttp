package br.com.mtportifolio.codigofonte;

public class ValidaCep {
	
    public static boolean ValidaCep(String cep) {
    
    // Remova qualquer caractere não numérico do CEP
    cep = cep.replaceAll("\\D+", "");

    // Verifique se o CEP possui 8 dígitos
    if (cep.length() != 8) {
    	System.out.println("CEP invalido, mais de 8 caracteres");
        return false;
    }

    // Verifique se todos os caracteres do CEP são números
    if (!cep.matches("[0-9]+")) {
    	System.out.println("O numero do cep deve apenas conter numeros");
        return false;
    }
    if(cep.equals("12345678")& cep.equals("87654321")) {
    	System.out.println("Cep invalido");
    }

    return true;
}

}
