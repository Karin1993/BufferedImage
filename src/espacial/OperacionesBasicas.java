/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espacial;

import bufferedimage.HerramientasImagen;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;

/**
 *
 * @author MiLaptop
 */
public class OperacionesBasicas {
    public static Image escalaDeGrises(Image original){
        // to Buffer
        BufferedImage aux = bufferedimage.HerramientasImagen.toBufferedImage(original);
        
        for(int x=0; x<aux.getWidth(); x++){
            for(int y=0; y<aux.getHeight(); y++){
                
                //promedio de colores rgb
                int c = aux.getRGB(x, y);
                //instanciar un color para conocer los valores RGB por separado
                Color color = new Color(c);
                //sacar el nuevo valor en gris por medio de un promedio
                int prom = ((color.getRed()+color.getGreen()+color.getBlue())/3);
                //System.out.println(prom);
                //actualizamos el nuevo color
                color = new Color(prom,prom,prom);
                aux.setRGB(x,y,color.getRGB());
            }
        }
        //Image img = HerramientasImagen.toImage(aux);
        return HerramientasImagen.toImage(aux);
    }
    
    public static Image modificarIluminacion(Image original, int m){
        // to Buffer
        BufferedImage aux = bufferedimage.HerramientasImagen.toBufferedImage(original);
        
        for(int x=0; x<aux.getWidth(); x++){
            for(int y=0; y<aux.getHeight(); y++){
                
                //promedio de colores rgb
                int c = aux.getRGB(x, y);
                //instanciar un color para conocer los valores RGB por separado
                Color color = new Color(c);
                //actualizamos el nuevo color
                color = new Color(validar(color.getRed()+m),
                                  validar(color.getGreen()+m),
                                  validar(color.getBlue()+m));
                aux.setRGB(x,y,color.getRGB());
            }
        }
        //Image img = HerramientasImagen.toImage(aux);
        //return img;
        return HerramientasImagen.toImage(aux);
    }
    
    public static Image modificarCalor(Image original, int m){
        // to Buffer
        BufferedImage aux = bufferedimage.HerramientasImagen.toBufferedImage(original);
        
        for(int x=0; x<aux.getWidth(); x++){
            for(int y=0; y<aux.getHeight(); y++){
                
                //promedio de colores rgb
                int c = aux.getRGB(x, y);
                //instanciar un color para conocer los valores RGB por separado
                Color color = new Color(c);
                //actualizamos el nuevo color
                color = new Color(validar(color.getRed()+m),
                                           (color.getGreen()),
                                  validar(color.getBlue()-m));
                aux.setRGB(x,y,color.getRGB());
            }
        }
        //Image img = HerramientasImagen.toImage(aux);
        //return img;
        return HerramientasImagen.toImage(aux);
    }
    
    public static Image modificarFrio(Image original, int m){
        // to Buffer
        BufferedImage aux = bufferedimage.HerramientasImagen.toBufferedImage(original);
        
        for(int x=0; x<aux.getWidth(); x++){
            for(int y=0; y<aux.getHeight(); y++){
                
                //promedio de colores rgb
                int c = aux.getRGB(x, y);
                //instanciar un color para conocer los valores RGB por separado
                Color color = new Color(c);
                //actualizamos el nuevo color
                color = new Color(validar(color.getRed()-m),
                                           (color.getGreen()),
                                  validar(color.getBlue()+m));
                aux.setRGB(x,y,color.getRGB());
            }
        }
        //Image img = HerramientasImagen.toImage(aux);
        //return img;
        return HerramientasImagen.toImage(aux);
    }
    
    public static Image aumentarIluminacion(Image original, int j){
        // to Buffer
        BufferedImage aux = bufferedimage.HerramientasImagen.toBufferedImage(original);
        int r;
        for(int x=0; x<aux.getWidth(); x++){
            for(int y=0; y<aux.getHeight(); y++){
                
                //promedio de colores rgb
                int c = aux.getRGB(x, y);
                //instanciar un color para conocer los valores RGB por separado
                Color color = new Color(c);
                //condicional
                if (j >= 200) {
                r = 4;
                } else {
                r = 1;
                }
                //actualizamos el nuevo color
                color = new Color(validar(color.getRed()+j*r),
                                  validar(color.getGreen()+j*r),
                                  validar(color.getBlue()+j*r));
                aux.setRGB(x,y,color.getRGB());
            }
        }
        //Image img = HerramientasImagen.toImage(aux);
        //return img;
        return HerramientasImagen.toImage(aux);
    }

    public static int validar(int i) {
        if(i>255)return 255;
        if(i<0)return 0;
        return i;
    }
}
