import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Produto> produtos = new ArrayList<>();
		
		produtos.add(new Produto("Geladeira", "Consul"));
		produtos.add(new Produto("Maquina de Lavar", "Dako"));
		produtos.add(new Produto("Forno Eletrico", "Wallita"));
		produtos.add(new Produto("Televisao", "Sony"));
		
		System.out.println("Produtos Cadastrados: ");
		for(Produto prod : produtos) {
			System.out.println(prod.getNome() + ": " + prod.getMarca());
		}
		
		System.out.println();
		
		
		for(int i = 0; i < produtos.size(); i++) {
			if(produtos.get(i).getNome().contentEquals("Geladeira"))
				produtos.remove(i);		
		}
		
		System.out.println("Produto Geladeira Removido: ");
		for(Produto prod : produtos) {
			System.out.println(prod.getNome() + ": " + prod.getMarca());
		}
		
		System.out.println();
		for(Produto prod : produtos) {
			if(prod.getMarca().contentEquals("Sony"))
				prod.setMarca("Positivo");
		}
		
		System.out.println("Produto Modificado");
		for(Produto prod : produtos) {
			System.out.println(prod.getNome() + ": " + prod.getMarca());
	}

}
