package classes;

public class Paciente {
    protected String nome;
    protected String sexo;
    protected String endereco;
    protected int telefone;
    protected int cpf;
    protected float peso;
    protected int codigoPaciente;

    //Construtor
    public Paciente(String nome, String sexo, String endereco, int telefone, int cpf, float peso, int codigoPaciente) {
        this.nome = nome;
        this.sexo = sexo;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.peso = peso;
        this.codigoPaciente = codigoPaciente;
    }
}
