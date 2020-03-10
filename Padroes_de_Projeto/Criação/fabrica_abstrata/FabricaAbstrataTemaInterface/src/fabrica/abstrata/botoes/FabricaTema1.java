/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.abstrata.botoes;

import javax.swing.JButton;

/**
 *
 * @author 20181bsi0105
 */
public class FabricaTema1 extends FabricaAbstrataBotoes{
    
    @Override
    public JButton criaBotaoOK(){
        JButton botaoOK = new ButtonOK("tema1");
        return botaoOK;
    }

    @Override
    public JButton criaBotaoCancel() {
        JButton botaoCancel = new ButtonCancel("tema1");
        return botaoCancel;
    }
}
