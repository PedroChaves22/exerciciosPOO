package pacote1;

public class ClienteObjeto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cliente1 Pedro = new Cliente1();
        
        Pedro.setLogin("Pedrin");
        Pedro.setCpf(30000000);
        Pedro.setCompras("1 compra feita.");
        
        System.out.println(Pedro.getLogin());
        System.out.println(Pedro.getCpf());
        System.out.println(Pedro.getCompras());
		
		
	


}
}