package desafio3;

public class ObjetoPedido {

	public static void main(String [] args) {
		Pedido pedido = new Pedido(1, "Computador", 1);
		
		
		System.out.println("ID do pedido: "+pedido.getId());
		System.out.println("Produto: "+pedido.getProduto());
		System.out.println("Quantidade: "+pedido.getQuantidade());
		
	}
}
