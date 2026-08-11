package Aula01;
public class Aluno {

    private String nome;
    private String matricula;
    private int limiteEmprestimos;
    private int quantidadeEmprestada;

    // Construtor personalizado
    public Aluno(String nome, String matricula, int limiteEmprestimos) {
        this.nome = nome;
        this.setMatricula(matricula);
        this.setLimiteEmprestimos(limiteEmprestimos);
        this.quantidadeEmprestada = 0;
    }

    // ---------- GETTERS E SETTERS ----------

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    // Setter com validação: matrícula não pode ser vazia
    public void setMatricula(String matricula) {
        if (matricula == null || matricula.trim().isEmpty()) {
            System.out.println("Erro: matrícula não pode ser vazia.");
        } else {
            this.matricula = matricula;
        }
    }

    public int getLimiteEmprestimos() {
        return limiteEmprestimos;
    }

    // Setter com validação: limite não pode ser negativo
    public void setLimiteEmprestimos(int limiteEmprestimos) {
        if (limiteEmprestimos < 0) {
            System.out.println("Erro: limite de empréstimos não pode ser negativo.");
        } else {
            this.limiteEmprestimos = limiteEmprestimos;
        }
    }

    public int getQuantidadeEmprestada() {
        return quantidadeEmprestada;
    }

    public void setQuantidadeEmprestada(int quantidadeEmprestada) {
        if (quantidadeEmprestada < 0) {
            System.out.println("Erro: quantidade emprestada não pode ser negativa.");
        } else {
            this.quantidadeEmprestada = quantidadeEmprestada;
        }
    }

    // ---------- MÉTODOS PERSONALIZADOS ----------

    // Verifica se o aluno ainda está dentro do limite de empréstimos
    public boolean podePegarEmprestado() {
        return this.quantidadeEmprestada < this.limiteEmprestimos;
    }

    // Incrementa a quantidade emprestada (chamado quando o empréstimo é efetivado)
    public void registrarEmprestimo() {
        this.quantidadeEmprestada++;
    }

    // Decrementa a quantidade emprestada (chamado quando o livro é devolvido)
    public void registrarDevolucao() {
        if (this.quantidadeEmprestada > 0) {
            this.quantidadeEmprestada--;
        }
    }

    public void exibirInformacoes() {
        System.out.println("----- Aluno -----");
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Empréstimos: " + this.quantidadeEmprestada + "/" + this.limiteEmprestimos);
        System.out.println("-----------------");
    }
}
