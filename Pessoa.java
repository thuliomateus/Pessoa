import java.time.LocalDate;

public class Pessoa {
    // Atributos
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private String email;
    private String telefone;

    // Variáveis constantes
    private final String CPF = "123.456.789-00";
    private final String PAIS_NACIONALIDADE = "Brasil";

    // Construtor
    public Pessoa(String nome, String sobrenome, LocalDate dataNascimento, String email, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
    }

    // Métodos para as ações
    public void andar() {
        System.out.println(nome + " está andando.");
    }

    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    public void correr() {
        System.out.println(nome + " está correndo.");
    }

    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    // Método para exibir os valores no console
    public void exibirValores() {
        // a) Nome e Sobrenome.
        System.out.println("Nome: " + nome + " " + sobrenome);
        // b) Email - Data de nascimento - telefone.
        System.out.println("Detalhes de contato: " + email + " - " + dataNascimento + " - " + telefone);
        // c) País da nacionalidade.
        System.out.println("País da Nacionalidade: " + PAIS_NACIONALIDADE);
        // d) CPF.
        System.out.println("CPF: " + CPF);
    }

    public static void main(String[] args) {
        // Criando uma instância de Pessoa com os valores fornecidos
        Pessoa pessoa = new Pessoa("Thulio", "Mateus", LocalDate.of(1997, 9, 20), "exemplo@example.com", "123456789");

        // Chamando os métodos para as ações
        pessoa.andar();
        pessoa.comer();
        pessoa.correr();
        pessoa.dormir();

        // Exibindo os valores das variáveis 
        pessoa.exibirValores();
    }
}
