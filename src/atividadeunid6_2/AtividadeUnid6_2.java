/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeunid6_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author AdrianoBenelliBastos
 */
public class AtividadeUnid6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Definição da janela principal
        JFrame frmPrincipal = new JFrame("Uso de JComboBox, Botões, Eventos e outros componentes");
        frmPrincipal.setDefaultCloseOperation(3);
        frmPrincipal.setBounds(300, 300, 1300, 150);
        frmPrincipal.setLayout(null);
        frmPrincipal.setVisible(true);
        

        //Label Selecione polo...
        JLabel lblPoloSelection = new JLabel("Selecione o seu Pólo EAD Univates: ");
        lblPoloSelection.setBounds(100, 30, 300, 20);
        frmPrincipal.add(lblPoloSelection);

        //ArrayList Polos
        ArrayList<String> arrayPolos = new ArrayList(Arrays.asList("", "Alvorada", "Arroio do Meio", "Arvorezinha", "Bento Gonçalves", "Bom Retiro do Sul",
                "Carlos Barbosa", "Encantado", "Estrela", "Guaporé", "Lajeado - Polo Sede", "Montenegro", "Nova Mutum", "Serafina Corrêa",
                "Soledade", "Taquari", "Teutônia", "Venâncio Aires", "Vera Cruz", "Veranópolis"));

        //ComboBox recebe vetor polos
        JComboBox cboPolos = new JComboBox();
        cboPolos.setBounds(320, 30, 150, 25);
        frmPrincipal.add(cboPolos);
        for (String i : arrayPolos) {
            cboPolos.addItem(i);
        }

        //Label polo selecionado
        JLabel lblPolos = new JLabel();
        lblPolos.setBounds(480, 30, 195, 20);
        frmPrincipal.add(lblPolos);

        //Action para label polo selecionar exibir o mesmo
        cboPolos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //String lblPoloSelecionado;
                //lblPoloSelecionado = cboPolos.getSelectedItem().toString();
                lblPolos.setText(cboPolos.getSelectedItem().toString() + " selecionado");

            }
        });

        //TextField para receber novas cidades
        JTextField tfdNovaCidade = new JTextField("");
        tfdNovaCidade.setBounds(680, 30, 250, 25);
        frmPrincipal.add(tfdNovaCidade);

        //Botão Adicionar
        JButton btnAdicionar = new JButton("Adicione");
        btnAdicionar.setBounds(950, 30, 100, 25);
        frmPrincipal.add(btnAdicionar);

        //Botão Remover
        JButton btnRemover = new JButton("Remova");
        btnRemover.setBounds(1060, 30, 100, 25);
        frmPrincipal.add(btnRemover);
        /*----------------------------------Validar se polo já existe ao inserir--------------------------------------------------------------*/
        //Ação para botão adicionar
        btnAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String novoPolo;
                novoPolo = tfdNovaCidade.getText();
                boolean poloExiste = false;
                int aux;

                for (int i = 0; i < cboPolos.getItemCount(); i++) {
                    if (cboPolos.getItemAt(i).toString().equals(novoPolo)) {
                        JOptionPane.showMessageDialog(null, "Polo Já existe");
                        tfdNovaCidade.setText("");
                        poloExiste = true;
                    }
                }

                if (!poloExiste) {
                    cboPolos.addItem(novoPolo);
                    tfdNovaCidade.setText("");
                    JOptionPane.showMessageDialog(null, "Polo adicionado a lista!");
                }

            }
        });
        /*-------------------------------------------------------------------------------------------------------------------*/

        //Ação para botão Remover
        btnRemover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (cboPolos.getSelectedItem().toString() == "") {
                    JOptionPane.showMessageDialog(null, "Selecione um polo!");
                } else {
                    cboPolos.removeItem(cboPolos.getSelectedItem());
                    cboPolos.setSelectedIndex(0);
                    lblPolos.setText("");
                    JOptionPane.showMessageDialog(null, "Polo Removido");
                }
            }
        });

    }

}
