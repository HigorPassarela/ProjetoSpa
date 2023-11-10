package classes;

import interfaces.Atividades;

public class Emagrecimento extends Paciente implements Atividades {
    protected String tipoAtividade;

    //Construtor
    public Emagrecimento(String nome, String sexo, String endereco, int telefone, int cpf, float peso, String tipoAtividade) {
        super(nome, sexo, endereco, telefone, cpf, peso);
        this.tipoAtividade = tipoAtividade;
    }

    @Override
    public String Atividade() {
        return null;
    }
}
