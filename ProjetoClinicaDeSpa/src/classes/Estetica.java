package classes;

import interfaces.Atividades;

public class Estetica extends Paciente implements Atividades {
    //Construtor
    public Estetica(String nome, String sexo, String endereco, int telefone, int cpf, float peso, int codigoPaciente) {
        super(nome, sexo, endereco, telefone, cpf, peso, codigoPaciente);
    }

    @Override
    public String TipoAtividade() {
        return null;
    }
}
