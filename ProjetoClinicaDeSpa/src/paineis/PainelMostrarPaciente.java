package paineis;

import javax.swing.*;
import java.awt.*;

public class PainelMostrarPaciente extends JPanel {
    private JLabel jlMostrarPacientes;
    private JTextArea jtaPacientes;
    private JButton jbMostrar;
    private JScrollPane jspMostrar;

    private JLabel jlImagem, jlImagemMostrar;
    private ImageIcon img, imgMostar;

    public PainelMostrarPaciente() {
        super();
        setSize(1200, 1000);
        setLayout(null);
        iniciarComponentes();
        criarEventos();
    }

    private void iniciarComponentes() {
        //IMG MOSTRAR
        imgMostar = new ImageIcon(getClass().getResource("/img/usuario.png"));
        jlImagemMostrar = new JLabel(imgMostar);

        //IMG
        img = new ImageIcon(getClass().getResource("/img/mostrarpaciente.png"));
        jlImagem = new JLabel(img);

        //Fonte
        Font font1 = new Font("SansSerif", Font.BOLD, 24);
        Font font2 = new Font("SansSerif", Font.PLAIN,18);

        //objetos
        jlMostrarPacientes = new JLabel("Mostrar Pacientes:");
        jlMostrarPacientes.setFont(font1);
        jtaPacientes = new JTextArea();
        jtaPacientes.setEditable(false);
        jtaPacientes.setFont(font2);
        jspMostrar = new JScrollPane(jtaPacientes);
        jbMostrar = new JButton("Mostrar Dados");
        jbMostrar.setBackground(Color.white);
        jbMostrar.setFont(font2);

        //add
        add(jlMostrarPacientes);
        add(jspMostrar);
        add(jbMostrar);

        //add imgMostrar
        add(jlImagemMostrar);

        //add img
        add(jlImagem);

        //dimensionar
        jlMostrarPacientes.setBounds(125,200,250,50);
        jspMostrar.setBounds(125,250,500,400);
        jbMostrar.setBounds(265,700,200,50);

        //dimensionar imgMostrar
        jlImagemMostrar.setBounds(650,200,512,512);

        //dimensionar img
        jlImagem.setBounds(0,0,1200,1000);
    }

    private void criarEventos() {
        
    }
}
