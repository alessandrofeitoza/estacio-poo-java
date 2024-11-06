package estacio;

public class Usuario {
    private String nome;
    private String nickname;
    private String foto;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFoto() {
        return this.foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    

    public void save() {
        String sql = "INSERT INTO tb_users (legenda, foto, likes) VALUES('a', 'b', 'c')";

        System.out.println("Novo Usuario salvo no banco");
    }

    public void findAll() {
        String sql = "SELECT * FROM tb_users;";

        System.out.println("Todos os Usuario do banco");
    }

    public void update() {
        String sql = "UPDATE tb_users SET nome='a';";

        System.out.println("Usuario atualizado");
    }

    public void delete() {
        String sql = "DELETE FROM tb_users;";

        System.out.println("Usuario excluido");
    }
}