public class CalculadoraDeEstoque {
    public static void main(String[] args) {
       
        double soma = 0;
        for (double i = 0; i <35 ; i ++) {
            soma += 59.90; // Preço fixo de cada produto
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
