package Aula01;
public class Livro {

    private String titulo;
    private String autor;
    private String codigo;
    private boolean disponivel;

    // Construtor personalizado
    public Livro(String titulo, String autor, String codigo) {
        this.setTitulo(titulo);
        this.autor = autor;
        this.codigo = codigo;
        this.disponivel = true; // todo livro cadastrado começa disponível
    }

    // ---------- GETTERS E SETTERS ----------

    public String getTitulo() {
        return titulo;
    }

    // Setter com validação: título não pode ser vazio
    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            System.out.println("Erro: o título do livro não pode ser vazio.");
        } else {
            this.titulo = titulo;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    // ---------- MÉTODOS PERSONALIZADOS ----------

    // Muda disponivel para false, só se ainda não estiver emprestado
    public boolean emprestar() {
        if (this.disponivel) {
            this.disponivel = false;
            return true;
        } else {
            System.out.println("O livro \"" + this.titulo + "\" já está emprestado.");
            return false;
        }
    }

    // Muda disponivel para true
    public void devolver() {
        this.disponivel = true;
        System.out.println("O livro \"" + this.titulo + "\" foi devolvido.");
    }

    public void exibirInformacoes() {
        System.out.println("----- Livro -----");
        System.out.println("Código: " + this.codigo);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Disponível: " + (this.disponivel ? "Sim" : "Não"));
        System.out.println("-----------------");
    }
}
