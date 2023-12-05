/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bufferedimage;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author MiLaptop
 */
public class HerramientasImagen {
    public static Image abrirImagen (){
    
          try {
            // definir los filtros para lectura
            FileNameExtensionFilter filtro =
                    new FileNameExtensionFilter("Imagenes","jpg","jpeg","png","bmp");
            // crear un selector de archivos
            JFileChooser selector = new JFileChooser("C:\\Users\\orfeo\\Pictures");
            // agregar el filtro al selector
            selector.addChoosableFileFilter(filtro);
            // especificar que solo se puedan abrir archivos
            selector.setFileSelectionMode(JFileChooser.FILES_ONLY);
            
            //ejecutar el selector de imagenes
            
            int res = selector.showOpenDialog(null);
            
            if (res == 1 ){
                
                return null;
                
            }
            
            File archivo = selector.getSelectedFile();
            
            BufferedImage bi = ImageIO.read(archivo);
            
            return toImage(bi);
        } catch (IOException ex) {
//            Logger.getLogger(HerramientasImagen.class.getName()).log(Level.SEVERE, null, ex);
              System.out.println("Exepcion");
        }
        return null;
    
    }  
    
    public static Image toImage (BufferedImage bi){
        return bi.getScaledInstance(bi.getWidth(),bi.getHeight(), BufferedImage.TYPE_INT_RGB);
    }
    
    public static BufferedImage toBufferedImage (Image imagen){
         // imagen es un objeto de tipo BufferedImage
//        if (imagen instanceof BufferedImage){
//          return (BufferedImage)imagen;
//        }
        BufferedImage bi = 
                new BufferedImage(imagen.getWidth(null), imagen.getHeight(null), BufferedImage.TYPE_INT_RGB);
        
        Graphics2D nueva = bi.createGraphics();
        nueva.drawImage(imagen, 0, 0,null);
        nueva.dispose();
        
        return bi;
    }
    public static Image copiarImagen(Image i){
        BufferedImage bi = toBufferedImage(i);
        return bi.getScaledInstance(bi.getWidth(),bi.getHeight(), BufferedImage.TYPE_INT_RGB);
    }
    
    public static void calcularHistograma(Image imagen, String Titulo){
        //contadores
        double[] contR = new double[256];
        double[] contG = new double[256];
        double[] contB = new double[256];
        
        //recorrer los pixeles de la imagen
        BufferedImage bi = toBufferedImage(imagen);
        for(int x=0; x<bi.getWidth(); x++){
            for(int y=0; y<bi.getHeight(); y++){
                Color col = new Color(bi.getRGB(x, y));
                contR[col.getRed()] = contR[col.getRed()]+1;
                contG[col.getGreen()] = contG[col.getGreen()]+1;
                contB[col.getBlue()] = contB[col.getBlue()]+1;
            }
        }
        
        Grafica grafica = new Grafica("ejeX", "ejeY", "Histograma "+Titulo);
        grafica.agregarSerie("Red", contR);
        grafica.agregarSerie("Green", contG);
        grafica.agregarSerie("Blue", contB);
        
        grafica.crearGrafica();
        grafica.muestraGrafica();
    }
    
    public static double[] ByN(Image imagen){
        BufferedImage aux = toBufferedImage(imagen);
        double[] canal = new double[256];
        
        for(int x=0; x<aux.getWidth(); x++){
            for(int y=0; y<aux.getHeight(); y++){
                Color color = new Color(aux.getRGB(x,y));
                canal[color.getRed()]++;
            }
        }
        return canal;
    }
}
