/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bufferedimage;

import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author roban
 */

public class JFrameImg extends JFrame{
    
    private JLabel lbImagen;

    public JFrameImg(Image imagen, String title){
        inicializarComponentes(imagen);
        this.setTitle("Imagen "+title);
    }

    private void inicializarComponentes(Image imagen) {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.lbImagen = new JLabel();
        add(this.lbImagen);
        this.lbImagen.setIcon(new ImageIcon(imagen));
        setSize(imagen.getWidth(this),
                imagen.getHeight(this));
        setVisible(true);
    }        
    
}

