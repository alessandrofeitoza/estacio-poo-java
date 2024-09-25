package estacio;

public class Main {
    public static void main(String[] args) {
        // Util utilidades = new Util();
        // System.out.println( utilidades.welcome("Maria") );

        Usuario chiquim = new Usuario();
        chiquim.setNome("Chico da Silva");
        chiquim.setNickname("chiquimDaSelva");

        Post praia = new Post();
        praia.foto = "eu-em-tambaba.jpg";
        praia.legenda = "Liberdade ou Solidão?";
        praia.setAutor(chiquim); 

        praia.save();

        praia.legenda = "Liberdade ou Solitude?";

        praia.update();

        praia.like();
        praia.like(); 

        praia.delete();

        System.out.println("Conheça o novo post do " + praia.getAutor().getNome());
        System.out.println(praia.legenda);
        System.out.println(praia.getLikes()); 
    }
}