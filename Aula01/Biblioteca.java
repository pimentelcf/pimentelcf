package Aula01;
import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> acervo;
    private ArrayList<Aluno> alunosCadastrados;

    // Construtor personalizado
    public Biblioteca() {
        this.acervo = new ArrayList<Livro>();
        this.alunosCadastrados = new ArrayList<Aluno>();
    }

    // ---------- GETTERS E SETTERS ----------

    public ArrayList<Livro> getAcervo() {
        return acervo;
    }

    public ArrayList<Aluno> getAlunosCadastrados() {
        return alunosCadastrados;
    }

    // ---------- MÉTODOS PERSONALIZADOS ----------

    // Cadastra um livro, impedindo código duplicado (desafio extra)
    public void cadastrarLivro(Livro livro) {
        for (Livro l : acervo) {
            if (l.getCodigo().equals(livro.getCodigo())) {
                System.out.println("Erro: já existe um livro cadastrado com o código " + livro.getCodigo());
                return;
            }
        }
        acervo.add(livro);
        System.out.println("Livro \"" + livro.getTitulo() + "\" cadastrado com sucesso.");
    }

    public void cadastrarAluno(Aluno aluno) {
        alunosCadastrados.add(aluno);
        System.out.println("Aluno \"" + aluno.getNome() + "\" cadastrado com sucesso.");
    }

    // Valida disponibilidade do livro e limite do aluno antes de efetivar o empréstimo
    public void realizarEmprestimo(Aluno aluno, Livro livro) {
        if (!livro.isDisponivel()) {
            System.out.println("Empréstimo negado: o livro \"" + livro.getTitulo() + "\" não está disponível.");
            return;
        }

        if (!aluno.podePegarEmprestado()) {
            System.out.println("Empréstimo negado: o aluno \"" + aluno.getNome() + "\" atingiu o limite de empréstimos.");
            return;
        }

        boolean sucesso = livro.emprestar();
        if (sucesso) {
            aluno.registrarEmprestimo();
            System.out.println("Empréstimo realizado: \"" + livro.getTitulo() + "\" para " + aluno.getNome() + ".");
        }
    }

    // Realiza a devolução de um livro
    public void realizarDevolucao(Livro livro) {
        livro.devolver();
    }

    // Sobrecarga: devolução já atualizando os dados do aluno também
    public void realizarDevolucao(Aluno aluno, Livro livro) {
        livro.devolver();
        aluno.registrarDevolucao();
    }

    public void listarLivrosDisponiveis() {
        System.out.println("===== Livros disponíveis =====");
        boolean encontrouAlgum = false;
        for (Livro livro : acervo) {
            if (livro.isDisponivel()) {
                livro.exibirInformacoes();
                encontrouAlgum = true;
            }
        }
        if (!encontrouAlgum) {
            System.out.println("Nenhum livro disponível no momento.");
        }
        System.out.println("===============================");
    }

    public void listarAlunosCadastrados() {
        System.out.println("===== Alunos cadastrados =====");
        for (Aluno aluno : alunosCadastrados) {
            aluno.exibirInformacoes();
        }
        System.out.println("===============================");
    }
}
