public class Senha {

	private static String gerarSenha(){
		int qtdeMaximaCaracteres = 8;
	    String[] caracteres = { "0", "1", "b", "2", "4", "5", "6", "7", "8",
	                "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
	                "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
	                "x", "y", "z" ,"-","/","*","_","!","@","$","%","&", "<", ">", 
                        ";", ":", "?", "#", "(", ")", "'", "|", "A", "B", "C", "D", "E", 
                        "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", 
                        "S", "T", "U", "V", "W", "X", "Y", "Z"};
	    
		StringBuilder senha = new StringBuilder();

        for (int i = 0; i < qtdeMaximaCaracteres; i++) {
            int posicao = (int) (Math.random() * caracteres.length);
            senha.append(caracteres[posicao]);
        }
        return senha.toString();
        
	}
	private static String gerarSenha(int qtdeMaximaCaracteres){
		
	    String[] caracteres = { "0", "1", "b", "2", "4", "5", "6", "7", "8",
	                "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
	                "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
	                "x", "y", "z" ,"-","/","*","_","!","@","$","%","&" , "<", ">",
                        ";", ":", "?", "#", "(", ")", "'", "|" , "A", "B", "C", "D", "E",
                        "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
                        "S", "T", "U", "V", "W", "X", "Y", "Z"};
	    
		StringBuilder senha = new StringBuilder();

        for (int i = 0; i < qtdeMaximaCaracteres; i++) {
            int posicao = (int) (Math.random() * caracteres.length);
            senha.append(caracteres[posicao]);
        }
        return senha.toString();
	}
	public String gerarSenha(String ContemPalavra, int Repetir){
		// implementar o codigo para gerar a senha e repetir a Palavra especial
		return "Sua senha";
	}
	
	public static void main(String[] args) {
		System.out.println(gerarSenha());
		System.out.println(gerarSenha(16));

}
}