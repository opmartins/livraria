package br.com.casadocodigo.livraria.teste;
import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.MiniLivro;

public class RegrasDeDesconto {
    public static void main(String[] args) {
        
        double descontoFisico = 0.3;
        double descontoEbook = 0.15;

        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        
        Livro livro = new MiniLivro(autor);
        livro.setValor(39.90);

        if (!livro.aplicaDescontoDe(descontoFisico)){
            System.out.println("Desconto no livro não pode ser maior do que 30%.");
        } else {
            System.out.println("Valor do livro com desconto: " + livro.getValor());
        }

        Ebook ebook = new Ebook(autor);
        ebook.setValor(29.90);

        if (!ebook.aplicaDescontoDe(descontoEbook)){
            System.out.println("Desconto no livro não pode ser maior do que 15%.");
        } else {
            System.out.println("Valor do ebook com desconto: " + ebook.getValor());
        }

    }
}
