package br.com.poo.slides;

public class Livro {
	
	// ABSTRAÇÃO
	private String titulo;
	private String autor;
	private int numeroPaginas;

	public Livro(String titulo, String autor, int numeroPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}

	// 	ENCAPSULAMENTO
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getPaginas() {
		return numeroPaginas;
	}
	
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    // POLIMORFISMO
    public double calcularDesconto() {
        return 0; // Implementação padrão sem desconto
    }

}

