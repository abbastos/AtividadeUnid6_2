/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeunid6_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
        frmPrincipal.setBounds(300, 300, 1300, 200);
        frmPrincipal.setLayout(null);
        frmPrincipal.setVisible(true);

        JLabel lblPoloSelection = new JLabel("Selecione o seu Pólo EAD Univates: ");
        lblPoloSelection.setBounds(100, 30, 300, 20);
        frmPrincipal.add(lblPoloSelection);

        String[] listaPolos = {"", "Alvorada", "Arroio do Meio", "Arvorezinha", "Bento Gonçalves", "Bom Retiro do Sul",
            "Carlos Barbosa", "Encantado", "Estrela", "Guaporé", "Lajeado - Polo Sede", "Montenegro", "Nova Mutum", "Serafina Corrêa",
            "Soledade", "Taquari", "Teutônia", "Venâncio Aires", "Vera Cruz", "Veranópolis"};

        JComboBox cboPolos = new JComboBox(listaPolos);
        cboPolos.setBounds(320, 30, 150, 25);
        frmPrincipal.add(cboPolos);

        JLabel lblPolos = new JLabel();
        lblPolos.setBounds(500, 30, 150, 20);
        frmPrincipal.add(lblPolos);

        cboPolos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //String lblPoloSelecionado;
                //lblPoloSelecionado = cboPolos.getSelectedItem().toString();
                lblPolos.setText(cboPolos.getSelectedItem().toString());

            }
        });

    }

}
