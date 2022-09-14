import com.xyz.financeiro.view.ContaView;

import javax.swing.*;

public class GerenciadorFinanceiro {
    public static void main(String[] args) {
        JFrame tela = new JFrame();
        tela.setSize(500,500);
        tela.setTitle("Controle de Contas");
        tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        tela.setContentPane(new ContaView().getPainelConta());

        tela.setVisible(true);
    }
}