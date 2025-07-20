public class EstudoForContinue {
    public static void main(String[] args) {
       for (int i = 0; i <= 10; i ++) {
            if (i == 7) {
                continue; // Pula o número 7
            }
            System.out.println("Número: " + i);
       }
    }
}
