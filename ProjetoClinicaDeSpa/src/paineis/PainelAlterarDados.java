package paineis;

import javax.swing.*;
import java.awt.*;

public class PainelAlterarDados extends JPanel {
    private JLabel jlImagem;
    private ImageIcon img;

    public PainelAlterarDados() {
        super();
        setSize(1200, 1000);
        setLayout(null);
        iniciarComponentes();
        criarEventos();
    }

    private void iniciarComponentes() {
        img = new ImageIcon(getClass().getResource("/img/alterarpacientes.png"));
        jlImagem = new JLabel(img);

        //add
        add(jlImagem);

        //dimensionar
        jlImagem.setBounds(0,0,1200,1000);
    }

    private void criarEventos() {
        
    }
}
