package br.com.poo.slides;

class LivroNaoFiccao extends Livro {
    private String genero;
    
    public LivroNaoFiccao(String titulo, String autor, int numeroPaginas, String genero) {
        super(titulo, autor, numeroPaginas);
        this.genero = genero;
    }
    
    public String getGenero() {
        return genero;
    }
    
    
    // POLIMORFISMO
    @Override
    public double calcularDesconto() {
        return 0.05; // 5% de desconto para livros não ficcao
    }
    
}
