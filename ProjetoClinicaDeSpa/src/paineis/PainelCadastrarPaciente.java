package paineis;

import javax.swing.*;
import java.awt.*;

public class PainelCadastrarPaciente extends JPanel {
    private JLabel jlNome, jlSexo, jlEndereco, jlTelefone, jlCpf, jlPeso;
    private JTextField jtfNome, jtfSexo, jtfEndereco, jtfTelefone, jtfCpf, jtfPeso;
    private JButton jbCadastrar;

    private JLabel jlImagem, jlImagemCad;
    private ImageIcon img, imgCad;

    public PainelCadastrarPaciente() {
        super();
        setSize(1200, 1000);
        setLayout(null);
        iniciarComponentes();
        criarEventos();
    }

    private void iniciarComponentes() {
        //IMG
        img = new ImageIcon(getClass().getResource("/img/painelcadastro.png"));
        jlImagem = new JLabel(img);

        //ImgCadastro
        imgCad = new ImageIcon(getClass().getResource("/img/cadastrar.png"));
        jlImagemCad = new JLabel(imgCad);

        //Fonte
        Font font1 = new Font("SansSerif", Font.BOLD, 24);
        Font font2 = new Font("SansSerif", Font.PLAIN,18);

        //objetos
        //JLABEL
        jlNome = new JLabel("Nome:");
        jlNome.setFont(font1);
        jlSexo = new JLabel("Genêro:");
        jlSexo.setFont(font1);
        jlEndereco = new JLabel("Endereço:");
        jlEndereco.setFont(font1);
        jlTelefone = new JLabel("Telefone:");
        jlTelefone.setFont(font1);
        jlCpf = new JLabel("Cpf:");
        jlCpf.setFont(font1);
        jlPeso = new JLabel("Peso:");
        jlPeso.setFont(font1);
        //JTEXTFIELD
        jtfNome = new JTextField();
        jtfNome.setFont(font2);
        jtfSexo = new JTextField();
        jtfSexo.setFont(font2);
        jtfEndereco = new JTextField();
        jtfEndereco.setFont(font2);
        jtfTelefone = new JTextField();
        jtfTelefone.setFont(font2);
        jtfCpf = new JTextField();
        jtfCpf.setFont(font2);
        jtfPeso = new JTextField();
        jtfPeso.setFont(font2);
        //JBUTTON
        jbCadastrar = new JButton("CADASTRAR");
        jbCadastrar.setBackground(Color.white);
        jbCadastrar.setFont(font2);

        //add
        add(jlNome);
        add(jlSexo);
        add(jlEndereco);
        add(jlTelefone);
        add(jlCpf);
        add(jlPeso);

        add(jtfNome);
        add(jtfSexo);
        add(jtfEndereco);
        add(jtfTelefone);
        add(jtfCpf);
        add(jtfPeso);

        add(jbCadastrar);

        //add img
        add(jlImagemCad);
        add(jlImagem);

        //dimensionar
        jlNome.setBounds(100,200,200,50);
        jtfNome.setBounds(100,245,300,30);
        jlSexo.setBounds(100,275,200,50);
        jtfSexo.setBounds(100,320,300,30);
        jlEndereco.setBounds(100,350,200,50);
        jtfEndereco.setBounds(100,395,300,30);
        jlTelefone.setBounds(100,425,200,50);
        jtfTelefone.setBounds(100,470,300,30);
        jlCpf.setBounds(100,500,200,50);
        jtfCpf.setBounds(100,545,300,30);
        jlPeso.setBounds(100,570,200,50);
        jtfPeso.setBounds(100,615,300,30);
        jbCadastrar.setBounds(150,700,200,50);

        //dimensionar img
        jlImagemCad.setBounds(550,240,512,521);
        jlImagem.setBounds(0,0,1200,1000);
    }

    private void criarEventos() {
        
    }
}
