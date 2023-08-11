/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.awt.Component;
import java.awt.Container;

/**
 *
 * @author ecpau
 */
public class MetodosPaneles {
    public void ocultarPaneles(Container grupoPaneles) {
        for (Component componente : grupoPaneles.getComponents()) {
            componente.setVisible(false);
        }
    }
}
