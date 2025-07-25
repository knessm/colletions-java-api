package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double nota){
        alunoSet.add(new Aluno(nome,matricula,nota));
    }

    public void removerAluno(long matricula){
        Aluno alunoRemover = null;
        if(!alunoSet.isEmpty()){
            for (Aluno a : alunoSet){
                if (a.getMatricula() == matricula){
                    alunoRemover = a;
                    break;
                }
            }
            alunoSet.remove(alunoRemover);
            System.out.println("O aluno com a matricula: " + alunoRemover.getMatricula() + " foi removido");

        }

    }

    public Set<Aluno> exibirAlunoPorNome(){
        Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
        return alunoPorNome;
    }

    public Set<Aluno> exibirAlunoPorNota(){
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
        alunoPorNota.addAll(alunoSet);
        return alunoPorNota;
    }

    public Set<Aluno> exibirAlunos(){
        return alunoSet;
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Marcelo",1L,7.5d);
        gerenciadorAlunos.adicionarAluno("João",4L,9d);
        gerenciadorAlunos.adicionarAluno("Carlos",2L,5d);
        gerenciadorAlunos.adicionarAluno("Carlos",2L,5d);

        System.out.println(gerenciadorAlunos.exibirAlunos());
        System.out.println(gerenciadorAlunos.exibirAlunoPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunoPorNota());

        gerenciadorAlunos.removerAluno(2L);
        System.out.println(gerenciadorAlunos.exibirAlunos());

    }
}
