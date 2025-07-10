package List.Pesquisa;

public class Livro {

    private String autor;
    private String titulo;
    private int ano;

    public Livro(String autor, String titulo, int ano) {
        this.autor = autor;
        this.titulo = titulo;
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", ano=" + ano +
                '}';
    }
}
