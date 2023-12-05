/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espacial;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;

/**
 *
 * @author MiLaptop
 */
public class Binarizacion {
    
    public static Image binarizarImagen(Image original, int j){
        BufferedImage aux = bufferedimage.HerramientasImagen.toBufferedImage(original);
        
        //recoremos la imagen
        for(int x = 0; x < aux.getWidth(); x++){
            for(int y = 0; y < aux.getHeight(); y++){
                //obtenemos el color del pixel
                Color col = new Color(aux.getRGB(x, y));
                //asignamos una base usando uno de los canales
                int base = col.getGreen();
                //binarizamos, si el color base es mayor que el valor de binarizacion (j) es 255, si no es 0
                if(base >= j){ base = 255;
                }else{ base = 0; }
                //asignamos el nuevo color binarizado al pixel
                col = new Color(base, base, base);
                aux.setRGB(x, y,col.getRGB());
            }
        }
        Image img = bufferedimage.HerramientasImagen.toImage(aux);
        return img;
    }
    
    public static Image invertir (Image original, int m){
        // to Buffer
        BufferedImage aux = bufferedimage.HerramientasImagen.toBufferedImage(original);
        
        for(int x=0; x<aux.getWidth(); x++){
            for(int y=0; y<aux.getHeight(); y++){
                
                int c = aux.getRGB(x, y);
                //instanciar un color para conocer los valores RGB por separado
                Color color = new Color(c);
                //actualizamos el nuevo color
                int r = color.getRed();
                int g = color.getGreen();
                int b = color.getBlue();
                //valores nuevos
                aux.setRGB(x,y, new Color (255-r, 255-g, 255-b).getRGB());
            }
        }
        Image img = bufferedimage.HerramientasImagen.toImage(aux);
        return img;
    }
    
    public static Image binarizarImagen(Image original, int j, int j2){
        BufferedImage aux = bufferedimage.HerramientasImagen.toBufferedImage(original);
        
        //recoremos la imagen
        for(int x = 0; x < aux.getWidth(); x++){
            for(int y = 0; y < aux.getHeight(); y++){
                //obtenemos el color del pixel
                Color col = new Color(aux.getRGB(x, y));
                //asignamos una base usando uno de los canales
                int base = col.getGreen();
                //binarizamos, si el color base es mayor que el valor de binarizacion (j) es 255, si no es 0
                if(base >= j){ base = 255;
                }else{ base = 0; }
                //asignamos el nuevo color binarizado al pixel
                col = new Color(base, base, base);
                aux.setRGB(x, y,col.getRGB());
            }
        }
        Image img = bufferedimage.HerramientasImagen.toImage(aux);
        return img;
    }
    
}
