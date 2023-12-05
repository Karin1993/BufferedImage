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
public class Convolucion2 {
    //Mascaras de deteccion de bordes
    BufferedImage imagenOriginal;
    
    public Convolucion2 (BufferedImage imagenOriginal){
        this.imagenOriginal = imagenOriginal;
    }
    
    //convolucion simple
    public Image convolucionar (int[] mascara, int div){
        Color nuevo;
        BufferedImage aux = new BufferedImage(this.imagenOriginal.getWidth(), 
                this.imagenOriginal.getHeight(), BufferedImage.TYPE_INT_RGB);
        
        //Color f = new Color (this.imagenOriginal.getRGB(0, 0));
        //System.out.println();
        //el proceso de convolucion se hace para todos los pixeles
        for(int x=0;x<this.imagenOriginal.getWidth();x++){
            for(int y=0;y<this.imagenOriginal.getHeight();y++){
                //tenemos un nuevo tono
                int rgb = convolucionar(x,y,mascara, div);
                nuevo = new Color(rgb);
                aux.setRGB(x, y, nuevo.getRGB());
            }
        }
        return bufferedimage.HerramientasImagen.toImage(aux);
    }

    private int convolucionar(int x, int y, int[] mascara, int div) {
        Color aux;
        int aR = 0,aG = 0,aB = 0;
        aux = new Color(this.imagenOriginal.getRGB(x, y));
        int valorRojo = aux.getRed();
    
        for(int j=0; j< mascara.length;j++){
            //canales
            int rgb = obtenerRGB(x,y,j);
            if(rgb!=0){
                aux = new Color(rgb);
                aR+=aux.getRed()*mascara[j];
                aG+=aux.getGreen()*mascara[j];
                aB+=aux.getBlue()*mascara[j];
            }
        }
        //evaluar la division
        aR/=div;
        aG/=div;
        aB/=div;
        aux = new Color (OperacionesBasicas.validar(aR),
                         OperacionesBasicas.validar(aG),
                         OperacionesBasicas.validar(aB));
        return aux.getRGB();
    }

   private int obtenerRGB(int x, int y, int j) {
        int rgb = 0;
        
        try{
        switch(j){
            case 0:{
             if((x-2<0) || (y-2<0)) return 0;
             if((x-2>=this.imagenOriginal.getWidth())
                     ||(y-2>=this.imagenOriginal.getHeight())) return 0;
             rgb = this.imagenOriginal.getRGB(x-2, y-2);
            break;
            }
            case 1:{
             if((x-2<0) || (y-1<0)) return 0;
             if((x-2>=this.imagenOriginal.getWidth())
                     ||(y-1>=this.imagenOriginal.getHeight())) return 0;
             rgb = this.imagenOriginal.getRGB(x-2, y-1);
            break;
            }
            case 2:{
             if((x-2<0) || (y<0)) return 0;
             if((x-2>=this.imagenOriginal.getWidth())
                     ||(y>=this.imagenOriginal.getHeight())) return 0;
             rgb = this.imagenOriginal.getRGB(x-2, y);
            break;
            }
            case 3:{
             if((x-2<0) || (y+1<0)) return 0;
             if((x-2>=this.imagenOriginal.getWidth())
                     ||(y+1>=this.imagenOriginal.getHeight())) return 0;
             rgb = this.imagenOriginal.getRGB(x-2, y+1);
            break;
            }
            case 4:{
             if((x-2<0) || (y+2<0)) return 0;
             if((x-2>=this.imagenOriginal.getWidth())
                     ||(y+2>=this.imagenOriginal.getHeight())) return 0;
             rgb = this.imagenOriginal.getRGB(x-2, y+2);
            break;
            }
            case 5:{
             if((x-1<0) || (y-2<0)) return 0;
             if((x-1>=this.imagenOriginal.getWidth())
                     ||(y-2>=this.imagenOriginal.getHeight())) return 0;
             rgb = this.imagenOriginal.getRGB(x-1, y-2);
            break;
            }
            case 6:{
             if((x-1<0) || (y-1<0)) return 0;
             if((x-1>=this.imagenOriginal.getWidth())
                     ||(y-1>=this.imagenOriginal.getHeight())) return 0;
             rgb = this.imagenOriginal.getRGB(x-1, y-1);
            break;
            }
            case 7:{
             if((x-1<0) || (y<0)) return 0;
             if((x-1>=this.imagenOriginal.getWidth())
                     ||(y>=this.imagenOriginal.getHeight())) return 0;
             rgb = this.imagenOriginal.getRGB(x-1, y);
            break;
            }
            case 8:{
             if((x-1<0) || (y+1<0)) return 0;
             if((x-1>=this.imagenOriginal.getWidth())
                     ||(y+1>=this.imagenOriginal.getHeight())) return 0;
             rgb = this.imagenOriginal.getRGB(x-1, y+1);
            break;
            }
            case 9:{
             if((x-1<0) || (y+2<0)) return 0;
             if((x-1>=this.imagenOriginal.getWidth())
                     ||(y+2>=this.imagenOriginal.getHeight())) return 0;
             rgb = this.imagenOriginal.getRGB(x-1, y+2);
            break;
            }
            case 10:{
             if((x<0) || (y-2<0)) return 0;
             if((x>=this.imagenOriginal.getWidth())
                     ||(y-2>=this.imagenOriginal.getHeight())) return 0;
             rgb = this.imagenOriginal.getRGB(x, y-2);
            break;
            }
            case 11:{
             if((x<0) || (y-1<0)) return 0;
             if((x>=this.imagenOriginal.getWidth())
                     ||(y-1>=this.imagenOriginal.getHeight())) return 0;
             rgb = this.imagenOriginal.getRGB(x, y-1);
            break;
            }
            case 12:{
             if((x<0) || (y<0)) return 0;
             if((x>=this.imagenOriginal.getWidth())
                     ||(y>=this.imagenOriginal.getHeight())) return 0;
             rgb = this.imagenOriginal.getRGB(x, y);
            break;
            }
            case 13:{
             if((x<0) || (y+1<0)) return 0;
             if((x>=this.imagenOriginal.getWidth())
                     ||(y+1>=this.imagenOriginal.getHeight())) return 0;
             rgb = this.imagenOriginal.getRGB(x, y+1);
            break;
            }
            case 14:{
             if((x<0) || (y+2<0)) return 0;
             if((x>=this.imagenOriginal.getWidth())
                     ||(y+2>=this.imagenOriginal.getHeight())) return 0;
             rgb = this.imagenOriginal.getRGB(x, y+2);
            break;
            }
            case 15:{
             if((x+1<0) || (y-2<0)) return 0;
             if((x+1>=this.imagenOriginal.getWidth())
                     ||(y+2>=this.imagenOriginal.getHeight())) return 0;
             rgb = this.imagenOriginal.getRGB(x+1, y-2);
            break;
            }
            case 16:{
             if((x+1<0) || (y-1<0)) return 0;
             if((x+1>=this.imagenOriginal.getWidth())
                     ||(y-1>=this.imagenOriginal.getHeight())) return 0;
             rgb = this.imagenOriginal.getRGB(x+1, y-1);
            break;
            }
            case 17:{
             if((x+1<0) || (y<0)) return 0;
             if((x+1>=this.imagenOriginal.getWidth())
                     ||(y>=this.imagenOriginal.getHeight())) return 0;
             rgb = this.imagenOriginal.getRGB(x+1, y);
            break;
            }
            case 18:{
             if((x+1<0) || (y+1<0)) return 0;
             if((x+1>=this.imagenOriginal.getWidth())
                     ||(y+1>=this.imagenOriginal.getHeight())) return 0;
             rgb = this.imagenOriginal.getRGB(x+1, y+1);
            break;
            }
            case 19:{
             if((x+1<0) || (y+2<0)) return 0;
             if((x+2>=this.imagenOriginal.getWidth())
                     ||(y+1>=this.imagenOriginal.getHeight())) return 0;
             rgb = this.imagenOriginal.getRGB(x+1, y+2);
            break;
            }
            case 20:{
             if((x+2<0) || (y-2<0)) return 0;
             if((x+2>=this.imagenOriginal.getWidth())
                     ||(y-2>=this.imagenOriginal.getHeight())) return 0;
             rgb = this.imagenOriginal.getRGB(x+2, y-2);
            break;
            }
            case 21:{
             if((x+2<0) || (y-1<0)) return 0;
             if((x+2>=this.imagenOriginal.getWidth())
                     ||(y-1>=this.imagenOriginal.getHeight())) return 0;
             rgb = this.imagenOriginal.getRGB(x+2, y-1);
            break;
            }
            case 22:{
             if((x+2<0) || (y<0)) return 0;
             if((x+2>=this.imagenOriginal.getWidth())
                     ||(y>=this.imagenOriginal.getHeight())) return 0;
             rgb = this.imagenOriginal.getRGB(x+2, y);
            break;
            }
            case 23:{
             if((x+2<0) || (y+1<0)) return 0;
             if((x+2>=this.imagenOriginal.getWidth())
                     ||(y+1>=this.imagenOriginal.getHeight())) return 0;
             rgb = this.imagenOriginal.getRGB(x+2, y+1);
            break;
            }
            case 24:{
             if((x+2<0) || (y+2<0)) return 0;
             if((x+2>=this.imagenOriginal.getWidth())
                     ||(y+2>=this.imagenOriginal.getHeight())) return 0;
             rgb = this.imagenOriginal.getRGB(x+2, y+2);
            break;
            }
        }
        } catch(Exception e){
            System.out.println();
        }
        return rgb;
    }
}
