package Futebol;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApresentacaoFutebol extends JFrame {
    private JLabel titleLabel;
    private JTextArea contentArea;
    private JButton startButton;

    public ApresentacaoFutebol() {
        // Configuração da janela
        setTitle("Apresentação sobre Futebol");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Componentes da apresentação
        titleLabel = new JLabel("Futebol: O Esporte Mais Popular do Mundo");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        contentArea = new JTextArea();
        contentArea.setEditable(false);
        contentArea.setLineWrap(true);
        contentArea.setWrapStyleWord(true);
        contentArea.setText("O futebol é um esporte praticado em todo o mundo, com milhões de fãs apaixonados. "
                + "Ele promove a competição, a camaradagem e a paixão. Nesta apresentação, vamos explorar alguns aspectos "
                + "interessantes sobre o futebol.");

        startButton = new JButton("Iniciar Apresentação");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarApresentacao();
            }
        });

        // Adiciona os componentes à janela
        add(titleLabel, BorderLayout.NORTH);
        add(contentArea, BorderLayout.CENTER);
        add(startButton, BorderLayout.SOUTH);
    }

    private void iniciarApresentacao() {
        contentArea.setText("Apresentação iniciada...\n\n");

        // Adicione mais slides ou informações conforme necessário
        contentArea.append("1. Origens do Futebol\n");
        contentArea.append("2. Regras Básicas\n");
        contentArea.append("3. Grandes Times e Jogadores\n");
        contentArea.append("4. Impacto Cultural\n");
        contentArea.append("5. Eventos Importantes\n");

        contentArea.append("\nApresentação concluída. Obrigado!");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ApresentacaoFutebol().setVisible(true);
            }
        });
    }
}

