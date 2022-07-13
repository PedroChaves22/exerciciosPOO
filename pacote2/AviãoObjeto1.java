package pacote2;



public class AviãoObjeto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Avião1 Pedro = new Avião1();
        
        Pedro.setModelo("Boeing777");
        Pedro.setPoltronas(320);
        Pedro.setCompanhia("TAM Airlines");
        
        System.out.println(Pedro.getModelo());
        System.out.println(Pedro.getPoltronas());
        System.out.println(Pedro.getCompanhia());
	}

}
