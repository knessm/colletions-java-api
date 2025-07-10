package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {

    private List<Livro> livroList;

    public CatalagoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano){
        Livro livro = new Livro(autor,titulo,ano);
        livroList.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAno = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro livro : livroList){
                if (livro.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAno.add(livro);
                }
            }
            return livrosPorAno;
        } else {
            throw new RuntimeException("a listá está vazia");
        }
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoIncial, int anoFinal){
        List<Livro> livrosPorAno = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro livro : livroList){
                if (livro.getAno() >= anoIncial && livro.getAno() <= anoFinal){
                    livrosPorAno.add(livro);
                }
            }

        }
        return livrosPorAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroAutor = null;
        if(!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroAutor = livro;
                    break;
                }
            }
        }
        return livroAutor;
    }

    @Override
    public String toString() {
        return "CatalagoLIvros{" +
                "livroList=" + livroList +
                '}';
    }

    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();
        catalagoLivros.adicionarLivro("Pequeno Principe","Antoine de Saint-Exupéry",1943);
        catalagoLivros.adicionarLivro("O conto de aia","Margaret Atwood", 2017);
        catalagoLivros.adicionarLivro("O santo inquerito","Gomes Dias",1977);

        System.out.println(catalagoLivros.pesquisarPorTitulo("Pequeno Principe"));
        System.out.println("--------------------------------------------------------");
        System.out.println(catalagoLivros.pesquisarPorIntervaloAnos(1940,1980));
        System.out.println("--------------------------------------------------------");
        System.out.println(catalagoLivros.pesquisarPorAutor("Gomes Dias"));
    }
}
