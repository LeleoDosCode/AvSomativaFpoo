package desafio5;

public class Principal {
	
	public static void main(String [] args) {
		Livro livro = new Livro("Diário de um Banana", "Romero Britto", 290);
		
		System.out.println("Produto: "+livro.getNome());
		System.out.println("Autor: "+livro.getAutor());
		System.out.println("páginas: "+livro.getPaginas());
	}
	
	
}
