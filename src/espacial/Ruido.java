/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espacial;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 *
 * @author MiLaptop
 */
public class Ruido {
    
    public static Image agregarRuidoAditivo(Image orginal, double por){
        BufferedImage bi = bufferedimage.HerramientasImagen.toBufferedImage(orginal);
        // double aux = por/100;
        int cp = (int)((por/100)*(bi.getHeight()*bi.getWidth()));
        Color aditivo = new Color(255,255,255);
        Random ran = new Random();
        int x,y;
        for(int j=0; j<cp;j++){
            // posicion aleatoria dentro de la imagen
            x = ran.nextInt(bi.getWidth());
            y = ran.nextInt(bi.getHeight());
            bi.setRGB(x, y, aditivo.getRGB());
        }
        return bufferedimage.HerramientasImagen.toImage(bi);
    }
    
}
