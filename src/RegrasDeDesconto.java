public class RegrasDeDesconto {
    public static void main(String[] args) {
        
        double desconto = 0.4;

        Autor autor = new Autor();
        Livro livro = new Livro(autor);
        
        livro.setValor(59.90);

        System.out.println("Valor atual: " + livro.getValor());

        if (!livro.aplicaDescontoDe(desconto)){
            System.out.println("Desconto não pode ser maior do que 30%.");
        } else {
            System.out.println("Valor com desconto: " + livro.getValor());
        }
    }
}
