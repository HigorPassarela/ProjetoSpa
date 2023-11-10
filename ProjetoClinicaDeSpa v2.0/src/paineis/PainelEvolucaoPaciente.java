package paineis;

import javax.swing.*;
import java.awt.*;

public class PainelEvolucaoPaciente extends JPanel {
    private JLabel jlImagem;
    private ImageIcon img;

    public PainelEvolucaoPaciente() {
        super();
        setSize(1200, 1000);
        setLayout(null);
        iniciarComponentes();
        criarEventos();
    }

    private void iniciarComponentes() {
        img = new ImageIcon(getClass().getResource("/img/evolucaopaciente.png"));
        jlImagem = new JLabel(img);

        //add
        add(jlImagem);

        //dimensionar
        jlImagem.setBounds(0,0,1200,1000);
    }

    private void criarEventos() {
        
    }
}
