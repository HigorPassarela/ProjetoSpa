package paineis;

import javax.swing.*;
import java.awt.*;

public class PainelMostrarPaciente extends JPanel {
    private JLabel jlMostrarPacientes;
    private JTextArea jtaPacientes;
    private JButton jbMostrar;

    private JLabel jlImagem;
    private ImageIcon img;

    public PainelMostrarPaciente() {
        super();
        setSize(1200, 1000);
        setLayout(null);
        iniciarComponentes();
        criarEventos();
    }

    private void iniciarComponentes() {
        //IMG
        img = new ImageIcon(getClass().getResource("/img/mostrarpaciente.png"));
        jlImagem = new JLabel(img);

        //Fonte
        Font font1 = new Font("SansSerif", Font.BOLD, 24);

        //objetos
        jlMostrarPacientes = new JLabel("Mostrar Pacientes:");
        jlMostrarPacientes.setFont(font1);
        jtaPacientes = new JTextArea();

        //add
        add(jlMostrarPacientes);
        add(jtaPacientes);

        //add img
        add(jlImagem);

        //dimensionar
        jlMostrarPacientes.setBounds(125,200,250,50);
        jtaPacientes.setBounds(125,);

        //dimensionar img
        jlImagem.setBounds(0,0,1200,1000);
    }

    private void criarEventos() {
        
    }
}
