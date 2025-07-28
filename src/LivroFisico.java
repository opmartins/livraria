public class LivroFisico extends Livro {
    
    Autor autor;

    public LivroFisico(Autor autor){
        super(autor);
        this.autor = autor;
    }

    public double getTaxaImpressao(){
        return this.getValor() * 0.05;
    }

    @Override
    public String toString() {
        return "Este é um livro Físico." + getNome();
    }

}
