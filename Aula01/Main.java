package Aula01;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        // ---------- Cadastro de livros ----------
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", "L001");
        Livro livro2 = new Livro("O Cortiço", "Aluísio Azevedo", "L002");
        Livro livro3 = new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", "L003");

        biblioteca.cadastrarLivro(livro1);
        biblioteca.cadastrarLivro(livro2);
        biblioteca.cadastrarLivro(livro3);

        // Tentando cadastrar um livro com código duplicado (desafio extra)
        Livro livroDuplicado = new Livro("Iracema", "José de Alencar", "L001");
        biblioteca.cadastrarLivro(livroDuplicado);

        System.out.println();

        // ---------- Cadastro de alunos ----------
        Aluno aluno1 = new Aluno("Vitor Pimentel", "2026001", 3);
        Aluno aluno2 = new Aluno("Maria Silva", "2026002", 1);

        biblioteca.cadastrarAluno(aluno1);
        biblioteca.cadastrarAluno(aluno2);

        System.out.println();

        // ---------- Testando validações dos setters ----------
        livro1.setTitulo("");            // deve mostrar erro e não alterar
        aluno1.setMatricula("");         // deve mostrar erro e não alterar
        aluno2.setLimiteEmprestimos(-5); // deve mostrar erro e não alterar

        System.out.println();

        // ---------- Simulando empréstimos ----------
        biblioteca.realizarEmprestimo(aluno1, livro1); // deve funcionar
        biblioteca.realizarEmprestimo(aluno1, livro2); // deve funcionar
        biblioteca.realizarEmprestimo(aluno2, livro1); // deve falhar: livro já emprestado
        biblioteca.realizarEmprestimo(aluno2, livro3); // deve funcionar

        System.out.println();

        // Aluno2 tem limite 1, então esse segundo empréstimo deve ser negado
        biblioteca.realizarEmprestimo(aluno2, livro2);

        System.out.println();

        // ---------- Exibindo estado atual ----------
        biblioteca.listarLivrosDisponiveis();
        System.out.println();
        biblioteca.listarAlunosCadastrados();

        System.out.println();

        // ---------- Simulando devolução ----------
        biblioteca.realizarDevolucao(aluno1, livro1);

        System.out.println();

        // Depois da devolução, o livro1 deve estar disponível novamente
        biblioteca.listarLivrosDisponiveis();
    }
}
