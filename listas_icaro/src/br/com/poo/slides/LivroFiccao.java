package br.com.poo.slides;

// HERANÇA
class LivroFiccao extends Livro {
    private String genero;
    
    public LivroFiccao(String titulo, String autor, int numeroPaginas, String genero) {
        super(titulo, autor, numeroPaginas);
        this.genero = genero;
    }
    
    public String getGenero() {
        return genero;
    }
    
    
    // POLIMORFISMO
    @Override
    public double calcularDesconto() {
        return 0.1; // 10% de desconto para livros de ficcao
    }
    
}
