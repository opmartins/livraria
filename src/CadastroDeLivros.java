public class CadastroDeLivros {
    public static void main (String[] args) {

        Autor autor = new Autor();
        autor.nome = "Rodrigo Turini";
        autor.email = "rodrigo.turini@caelum.com.br";
        autor.cpf = "123.456.789.10";

        Livro livro = new Livro();
        livro.nome = "Java 8 Prático";
        livro.descricao = "Novos recursos da linguagem";
        livro.valor = 59.90;
        livro.isbn = "978-85-66250-46-6";
        livro.autor = autor;

        if (!livro.aplicaDescontoDe(0.5)){
            System.out.println("Desconto não pode ser maior do que 30%");
        }
        livro.mostrarDetalhes();
    }
}
