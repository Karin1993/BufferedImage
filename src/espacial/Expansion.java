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
public class Expansion {
    
    public static int calcularMinimo(double h[]){
        for(int x=0; x<h.length; x++){
            if(h[x]!=0) return x;
        }
        return -1;
    }
    
    public static int calcularMaximo(double h[]){
        for(int x=h.length-1; x>=0; x--){
            if(h[x]!=0) return x;
        }
        return -1;
    }
    
    //arreglo de rs: arreglo de 6 elementos, donde
    //los 3 primeros son los r1 de los canales (r,g,b)
    //los 3 segundos son los r2 de los canales(r,g,b)
    //R[0,3]
    //G[1,4]
    //B[2,5]
    public static Image expansionLineal(int r1,int r2,Image imagen){
    BufferedImage aux = bufferedimage.HerramientasImagen.toBufferedImage(imagen);
    
    for (int x=0; x< aux.getWidth();x++)
        for(int y=0; y< aux.getHeight();y++){
            // obtener el color
            Color pixel = new Color(aux.getRGB(x, y));
            int r = validar((pixel.getRed()-r1)*(255/(r2-r1)));
            int g = validar((pixel.getGreen()-r1)*(255/(r2-r1)));
            int b = validar((pixel.getBlue()-r1)*(255/(r2-r1)));
            // validamos 
            pixel = new Color(r, g, b);
            aux.setRGB(x, y, pixel.getRGB());
            }        
        return aux;
    }
    
    public static Image expansionLinealColor(int rs[],Image imagen){
    BufferedImage aux = bufferedimage.HerramientasImagen.toBufferedImage(imagen);
    
    for (int x=0; x< aux.getWidth();x++)
        for(int y=0; y< aux.getHeight();y++){
            // obtener el color
            Color pixel = new Color(aux.getRGB(x, y));
            int r = validar((pixel.getRed()-rs[0])*(255/(rs[3]-rs[0])));
            int g = validar((pixel.getGreen()-rs[1])*(255/(rs[4]-rs[1])));
            int b = validar((pixel.getBlue()-rs[2])*(255/(rs[5]-rs[2])));
            // validamos 
            pixel = new Color(r, g, b);
            aux.setRGB(x, y, pixel.getRGB());
            }        
        return aux;
    }
    
    private static int validar(int i) {
        if(i>255)return 255;
        if(i<0)return 0;
        return i;
    }
    
    public static Image expansionLn(Image imagen){
    BufferedImage aux = bufferedimage.HerramientasImagen.toBufferedImage(imagen);
    
        for (int x=0; x< aux.getWidth();x++)
            for(int y=0; y< aux.getHeight();y++){
              // obtener el color
              Color pixel = new Color(aux.getRGB(x, y));
              int r = (int)((255*Math.log(1+pixel.getRed()))/(Math.log(1+255)));
              int g = (int)((255*Math.log(1+pixel.getGreen()))/(Math.log(1+255)));
              int b = (int)((255*Math.log(1+pixel.getBlue()))/(Math.log(1+255)));
             
            // validamos 
            pixel = new Color(r, g, b);
            aux.setRGB(x, y, pixel.getRGB());
            }
        
        return aux;    
    }
}
