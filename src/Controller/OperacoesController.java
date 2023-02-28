package Controller;

public class OperacoesController {

	public OperacoesController() {
		super();
	}
	
	public String InverteString(String palavra) {
		if(palavra.length()<=1) {
			return palavra;
		}else {
			return palavra.charAt(palavra.length() - 1) + InverteString(palavra.substring(0,palavra.length()-1));
		}
	}

}
