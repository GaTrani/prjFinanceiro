package com.xyz.financeiro.view;

import com.xyz.financeiro.business.ContaBus;
import com.xyz.financeiro.model.Conta;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ContaView {
    private JPanel painelConta;
    private JTextField textNumConta;
    private JTextField textNomeCliente;
    private JButton depositarButton;
    private JButton sacarButton;
    private JTextField textValorDeposito;
    private JTextField textValorSaque;
    private JButton cadastrarContaButton;
    private JButton FECHARButton;
    private JLabel labelSaldo;
    private JLabel labelMsg;

    private Conta conta;
    public ContaView() {
        cadastrarContaButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int numConta = Integer.parseInt(textNumConta.getText());
                String nome = textNomeCliente.getText();
                conta = new Conta(numConta, nome, 0.0);
                JOptionPane.showMessageDialog(null, "Conta cadastrada com sucesso.",
                        "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
                labelSaldo.setText(Double.toString(conta.getSaldo()));

            }
        });
        depositarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor = Double.parseDouble(textValorDeposito.getText());
                ContaBus bus = new ContaBus(conta);
                bus.depositar(valor);
                JOptionPane.showMessageDialog(null, "Deposito efetuado com sucesso.",
                        "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
                labelSaldo.setText(Double.toString(conta.getSaldo()));
            }
        });
    }

    public JPanel getPainelConta() {
        return painelConta;
    }
}
