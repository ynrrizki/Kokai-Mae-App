/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.core;

import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author yanu
 */
public class Route { 
    public void nextPanel(JPanel panel, Component changePanel) {
        //remove panel
        panel.removeAll();
        panel.repaint();
        panel.revalidate();
        
        //add panel
        panel.add(changePanel);
        panel.repaint();
        panel.revalidate();
    }
}
