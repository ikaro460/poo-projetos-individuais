package br.com.poo.slides;

public class Main {
	public static void main(String[] args) {

		Livro l = new Livro("Aventuras Incríveis", "Autor Desconhecido", 200);
		System.out.println(l.getTitulo());
		System.out.println(l.getAutor());
		System.out.println(l.getPaginas());
		
		System.out.println();
		
		LivroFiccao lf = new LivroFiccao("Aventuras Científicas", "Autor Mais desconhecido", 200, "Ficção Científica");
		System.out.println(lf.getTitulo());
		System.out.println(lf.getAutor());
		System.out.println(lf.getPaginas());
		System.out.println(lf.getGenero());
		System.out.println("Desconto: " + (lf.calcularDesconto() * 100) + "%");
		
		System.out.println();
		
		LivroNaoFiccao lnf = new LivroNaoFiccao("Aventuras Nao Científicas", "Autor Mais desconhecido", 200, "Ficção Científica");
		System.out.println(lnf.getTitulo());
		System.out.println(lnf.getAutor());
		System.out.println(lnf.getPaginas());
		System.out.println(lnf.getGenero());
		System.out.println("Desconto: " + (lnf.calcularDesconto() * 100) + "%");
	}
}
