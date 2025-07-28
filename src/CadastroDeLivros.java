public class CadastroDeLivros {
    public static void main (String[] args) {

        double desconto = 0.3;

        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        autor.setEmail("rodrigo.turini@caelum.com.br");
        autor.setCpf("123.456.789.10");

        Livro livro = new LivroFisico(autor);
        livro.setNome("Java 8 Prático");
        livro.setDescricao("Novos recursos da linguagem");
        livro.setValor(59.90);
        livro.setIsbn("978-85-66250-46-6");
        livro.setAutor(autor);
        System.out.println(livro);

        if (!livro.aplicaDescontoDe(desconto)){
            System.out.println("Desconto não pode ser maior do que 30%");
        }
        livro.mostrarDetalhes();
    }



}
