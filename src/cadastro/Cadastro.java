/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;

import javax.swing.JFrame;

/**
 *
 * @author Senac 19
 */
public class Cadastro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadDados tela = new CadDados();
        tela.setVisible(true);
        tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
}
