package classes;

import interfaces.Atividades;

public class Estetica extends Paciente implements Atividades {
    protected String tipoAtividade;

    //Construtor
    public Estetica(String nome, String sexo, String endereco, int telefone, int cpf, float peso, String tipoAtividade) {
        super(nome, sexo, endereco, telefone, cpf, peso);
        this.tipoAtividade = tipoAtividade;
    }

    @Override
    public String Atividade() {
        return null;
    }
}
