public class CalculadoraDeEstoque {
    public static void main(String[] args) {
       
        double soma = 0;
        int contador = 1;

        while (contador <=35) {
            double valorDoLivro = 59.90;
            soma += valorDoLivro;
            contador++;
        }

        System.out.println("O valor total em estoque é: " + soma);

        if (soma < 150) {
            System.out.println("Seu estoque está baixo!");
        } else if (soma >= 2000) {
            System.out.println("Seu estoque está muito alto.");
        } else {
            System.out.println("Seu estoque está bom.");
        }
    }
}
