package estacio;

public class Post {
    public String legenda;
    public String foto;
    private int likes;
    private Usuario autor;

    public Usuario getAutor() {
        return this.autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public void like() {
        this.likes += 1;
    }

    public void dislike() {
        this.likes -= 1;
    }

    public int getLikes() {
        return this.likes;
    }

    public void save() {
        String sql = "INSERT INTO tb_posts (legenda, foto, likes) VALUES('a', 'b', 'c')";

        System.out.println("Novo post salvo no banco");
    }

    public void findAll() {
        String sql = "SELECT * FROM tb_posts;";

        System.out.println("Todos os post do banco");
    }

    public void update() {
        String sql = "UPDATE tb_posts SET legenda='a';";

        System.out.println("Post atualizado");
    }

    public void delete() {
        String sql = "DELETE FROM tb_posts;";

        System.out.println("Post excluido");
    }
}