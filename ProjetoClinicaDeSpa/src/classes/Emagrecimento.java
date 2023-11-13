package classes;

import interfaces.Atividades;

public class Emagrecimento extends Paciente implements Atividades {
    //Construtor
    public Emagrecimento(String nome, String sexo, String endereco, int telefone, int cpf, float peso) {
        super(nome, sexo, endereco, telefone, cpf, peso);
    }

    @Override
    public String TipoAtividade() {
        return null;
    }
}
