package telas;

import paineis.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class TelaSpa extends JFrame {
    private JMenuBar jmbBarra;
    private JMenu jmCadastro, jmMostrar, jmPesquisar, jmAlterar, jmRemover, jmSair;
    private JMenuItem jmiCadPaciente,jmiMetodos,jmimostrarPacientes, jmiAlterar, jmiPesquisar, jmidelPaciente,
    jmiEvolucao, jmiSair;

    private JLabel jlImagem;
    private ImageIcon img;

    public TelaSpa(String title) throws HeadlessException {
        super(title);
        setSize(1200,1000);
        setLayout(null);
        getContentPane().setBackground(new Color(0,0,0));
        setLocationRelativeTo(getContentPane());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponente();
        CriarEventos();
    }

    private void iniciarComponente() {
        //url icone
        URL url = this.getClass().getResource("/img/LogoSpaZen3.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(iconeTitulo);

        //img fundo login
        img = new ImageIcon(getClass().getResource("/img/fundoclinicaspa.png"));
        jlImagem = new JLabel(img);

        //objetos
        //JMENUBAR
        jmbBarra = new JMenuBar();

        //JMENU
        jmCadastro = new JMenu("Cadastrar");
        jmMostrar = new JMenu("Exibir");
        jmPesquisar = new JMenu("Pesquisar");
        jmAlterar = new JMenu("Alterar");
        jmRemover = new JMenu("Deletar");
        jmSair = new JMenu("Sair");

        //JMENUITEM
        jmiCadPaciente = new JMenuItem("Pacientes");
        jmimostrarPacientes = new JMenuItem("Pacientes");
        jmiMetodos = new JMenuItem("Métodos");
        jmiEvolucao = new JMenuItem("Evolução Do Paciente");
        jmiPesquisar = new JMenuItem("Paciente");
        jmiAlterar = new JMenuItem("Alterar Dados");
        jmidelPaciente = new JMenuItem("Deletar Paciente");
        jmiSair = new JMenuItem("Sair");

        //add
        setJMenuBar(jmbBarra);

        //add JMENU in jmBarra(JMENUBAR)
        jmbBarra.add(jmCadastro);
        jmbBarra.add(jmMostrar);
        jmbBarra.add(jmPesquisar);
        jmbBarra.add(jmAlterar);
        jmbBarra.add(jmRemover);
        jmbBarra.add(jmSair);

        //add JMENUITEM in JMENU
        jmCadastro.add(jmiCadPaciente);
        jmMostrar.add(jmimostrarPacientes);
        jmMostrar.add(jmiMetodos);
        jmMostrar.add(jmiEvolucao);
        jmPesquisar.add(jmiPesquisar);
        jmAlterar.add(jmiAlterar);
        jmRemover.add(jmidelPaciente);
        jmSair.add(jmiSair);

        add(jlImagem);

        //dimensionar
        jlImagem.setBounds(0,0,1200,1000);
    }

    private void CriarEventos() {
        //jmiSair Evento
        jmiSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        //jmiCadastro
        jmiCadPaciente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PainelCadastrarPaciente cadastrarPaciente = new PainelCadastrarPaciente();
                getContentPane().removeAll();
                getContentPane().add(cadastrarPaciente);
                getContentPane().validate();
                repaint();
            }
        });

        //jmiPesquisar
        jmiPesquisar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PainelPesquisarPacientes pesquisarClientes = new PainelPesquisarPacientes();
                getContentPane().removeAll();
                getContentPane().add(pesquisarClientes);
                getContentPane().validate();
                repaint();
            }
        });

        //jmiDeletar
        jmidelPaciente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PainelDeletarPaciente deletarPaciente = new PainelDeletarPaciente();
                getContentPane().removeAll();
                getContentPane().add(deletarPaciente);
                getContentPane().validate();
                repaint();
            }
        });

        //jmiAlterar
        jmiAlterar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PainelAlterarDados alterarDados = new PainelAlterarDados();
                getContentPane().removeAll();
                getContentPane().add(alterarDados);
                getContentPane().validate();
                repaint();
            }
        });

        //jmiMostrar
        jmimostrarPacientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PainelMostrarPaciente mostrarPaciente = new PainelMostrarPaciente();
                getContentPane().removeAll();
                getContentPane().add(mostrarPaciente);
                getContentPane().validate();
                repaint();
            }
        });

        //jmiEvolucao
        jmiEvolucao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PainelEvolucaoPaciente evolucaoPaciente = new PainelEvolucaoPaciente();
                getContentPane().removeAll();
                getContentPane().add(evolucaoPaciente);
                getContentPane().validate();
                repaint();
            }
        });

        //jmiMetodos
        jmiMetodos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PainelMetodos metodos = new PainelMetodos();
                getContentPane().removeAll();
                getContentPane().add(metodos);
                getContentPane().validate();
                repaint();
            }
        });
    }
}
