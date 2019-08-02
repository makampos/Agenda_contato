/**
 *
 * Matheus de Campos
 *
 */
package com.company;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class Agenda extends JFrame {

    ArrayList <String> Pessoa = new ArrayList<>();

    public Agenda(){

        super ("Agenda de Contatos");
        JPanel p1 = new JPanel(null);
        JLabel lTitulo = new JLabel("Agenda de contatos");
        JLabel lNome = new JLabel("Nome:");
        JLabel lEndereco = new JLabel("Endereço:");
        JLabel lAnivesario = new JLabel("Anivesario:");
        JLabel lTelefone = new JLabel("Telefone:");
        JButton bGravar = new JButton("Gravar");
        JButton bDeletar = new JButton("Deletar");
        JButton bAlterar = new JButton("Alterar");
        JButton bProcurar = new JButton("Procurar");
        JButton bLimpar = new JButton("Limpar");
        JButton bSair = new JButton("Sair");
        JButton bSelecionaE = new JButton("<<");
        JButton bSelecionaD = new JButton(">>");
        JTextField tNome = new JTextField(20);
        JTextField tEndereco = new JTextField(20);
        JTextField tAnivesario = new JTextField(20);
        JTextField tTelefone = new JTextField(20);
        DefaultListModel modelo = new DefaultListModel();
        JList lista = new JList();
        JScrollPane scroll = new JScrollPane(lista);

        lTitulo.setFont(new Font("Dialog", Font.PLAIN, 20));

        p1.add(lTitulo);
        p1.add(lNome);
        p1.add(tNome);
        p1.add(lEndereco);
        p1.add(tEndereco);
        p1.add(lAnivesario);
        p1.add(tAnivesario);
        p1.add(lTelefone);
        p1.add(tTelefone);
        p1.add(bGravar);
        p1.add(bDeletar);
        p1.add(bAlterar);
        p1.add(bSelecionaE);
        p1.add(bProcurar);
        p1.add(bSelecionaD);
        p1.add(bLimpar);
        p1.add(bSair);
        p1.add(scroll);

        add(p1);

        lista.setModel(modelo);

        lTitulo.setBounds(140, 20, 200, 80);
        lNome.setBounds(40, 130, 100, 25);
        tNome.setBounds(90, 130, 350, 25);
        lEndereco.setBounds(15, 180, 100, 25);
        tEndereco.setBounds(90, 180, 350, 25);
        lAnivesario.setBounds(45, 230, 100, 25);
        tAnivesario.setBounds(90, 230, 350, 25);
        lTelefone.setBounds(20, 280, 100, 25);
        tTelefone.setBounds(90, 280, 350, 25);
        bGravar.setBounds(60, 330, 100, 23);
        bDeletar.setBounds(200, 330, 100, 23);
        bAlterar.setBounds(340, 330, 100, 23);
        bSelecionaE.setBounds(60, 420, 100, 23);
        bProcurar.setBounds(200, 420, 100, 23);
        bSelecionaD.setBounds(340, 420, 100, 23);
        bLimpar.setBounds(200, 510, 100, 23);
        bSair.setBounds(340, 510, 100, 23);
        scroll.setBounds(540, 90, 400, 400);


        setSize(1100, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        //AÇÕES DE BUTÕES

        bGravar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                modelo.addElement(tNome.getText()+"-"+tEndereco.getText()+"-"+tTelefone.getText()+"-"+tAnivesario.getText());

            }

        });


    }

    public static void main (String args[]){
        new Agenda();
    }
}