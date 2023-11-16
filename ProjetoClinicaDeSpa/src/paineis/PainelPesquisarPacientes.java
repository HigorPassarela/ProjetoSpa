package paineis;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class PainelPesquisarPacientes extends JPanel {
    private JLabel jlCodigoPac;
    private JTextField jtfCodigoPac;
    private JTextArea jtaMostrar;
    private JScrollPane jspMostrar;
    private JButton jbPesquisar;

    private JLabel jlImagem;
    private ImageIcon img;

    public PainelPesquisarPacientes() {
        super();
        setSize(1200, 1000);
        setLayout(null);
        iniciarComponentes();
        criarEventos();
    }

    private void iniciarComponentes() {
        //img
        img = new ImageIcon(getClass().getResource("/img/pesquisarpaciente.png"));
        jlImagem = new JLabel(img);

        //Fonte
        Font font1 = new Font("SansSerif", Font.BOLD, 24);
        Font font2 = new Font("SansSerif", Font.PLAIN,18);

        //objetos
        jlCodigoPac = new JLabel("Código Do Paciente:");
        jlCodigoPac.setFont(font1);
        jtfCodigoPac = new JTextField();
        jtfCodigoPac.setFont(font2);
        jtaMostrar = new JTextArea();
        jspMostrar = new JScrollPane(jtaMostrar);
        jbPesquisar = new JButton();
        jbPesquisar.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/img/pesquisar.png"))));
        jbPesquisar.setBorderPainted(false);
        jbPesquisar.setContentAreaFilled(false);
        jbPesquisar.setFocusPainted(false);
        jbPesquisar.setCursor(new Cursor(Cursor.HAND_CURSOR));

        //add
        add(jbPesquisar);
        add(jlCodigoPac);
        add(jtfCodigoPac);
        add(jspMostrar);

        //add img
        add(jlImagem);

        //dimensionar
        jlCodigoPac.setBounds(100,200,250,50);
        jtfCodigoPac.setBounds(100,240,50,30);
        jbPesquisar.setBounds(150,240,50,50);

        //dimensionar img
        jlImagem.setBounds(0,0,1200,1000);
    }

    private void criarEventos() {
        
    }
}
