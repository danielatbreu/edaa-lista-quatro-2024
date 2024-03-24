public class Programa {
    public static void main(String[] args) {
        Pessoa vinicius = new Pessoa("Vinícius", 18);
        Pessoa daniela = new Pessoa("Daniela", 18);
        Pessoa ana = new Pessoa("Ana", 18);
        Pessoa carla = new Pessoa("Carla", 18);
        Pessoa daniel = new Pessoa("Daniel Paiva", 18);
        Pessoa felipe = new Pessoa("Felipe", 18);
        Pessoa patricia = new Pessoa("Patricia", 18);
        Pessoa rafael = new Pessoa("Rafael", 18);
        Pessoa pedro = new Pessoa("Pedro", 18);
        Pessoa marcela = new Pessoa("Marcela", 18);
        Pessoa amanda = new Pessoa("Amanda", 18);

        Pessoa[] listaPessoas = { vinicius, daniela, ana, carla, daniel, felipe, pedro, patricia, rafael, marcela, amanda };


        System.out.println("\nNome das pessoas e suas idades após a alteração: \n");
        for (Pessoa pessoa : listaPessoas) {
            System.out.println(pessoa.getNome() + ": " + pessoa.getIdade());
        }
    }
}