/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bufferedimage;

import espacial.Convolucion;
import espacial.Convolucion2;
import espacial.Expansion;
import espacial.OperacionesBasicas;
import espacial.UmbralAutomatico;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JPanel {

   public void paint(Graphics g) {
      //Image img = createImageWithText();
      Image img = dibujarFigura();
      //Image img = dibujarDegradado();
      g.drawImage(img, 20,20,this);
   }

   private Image createImageWithText() {
      BufferedImage bufferedImage = new BufferedImage(200,200,BufferedImage.TYPE_INT_RGB);
      Graphics g = bufferedImage.getGraphics();

      g.drawString("www.tutorialspoint.com", 20,20);
      //g.drawString("www.tutorialspoint.com", 20,40);
      //g.drawString("www.tutorialspoint.com", 20,60);
      //g.drawString("www.tutorialspoint.com", 20,80);
      //g.drawString("www.tutorialspoint.com", 20,100);
      
      return bufferedImage;
   }
   
   private Image dibujarFigura(){
       BufferedImage bufferedImage = new BufferedImage(200,200,BufferedImage.TYPE_INT_RGB);
       //Graphics g = bufferedImage.getGraphics
       Color color = new Color(127,63,63);
       for(int x=15; x<185; x++) {
           for(int y=15; y<185; y++) {
               bufferedImage.setRGB(x, y, color.getRGB());
           }
       }
    return bufferedImage;   
   }
   
   private Image dibujarDegradado(){
       BufferedImage bufferedImage = new BufferedImage(200,200,BufferedImage.TYPE_INT_RGB);
       //Graphics g = bufferedImage.getGraphics
       for(int x=0; x<200; x++) {
           for(int y=0; y<200; y++) {
               int r = 50;
               int g = (int)(255 * (1.0 - (double)x/200));
               int b = (int)(255 * (1.0 - (double)y/200));
               
               Color color = new Color(r, g, b);
               bufferedImage.setRGB(x, y, color.getRGB());
           }
       }
    return bufferedImage;   
   }
   
   public static void main(String[] args) {
      //JFrame frame = new JFrame();
      //frame.getContentPane().add(new Test());

      //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //frame.setSize(200, 200);
      //frame.setVisible(true);
      
      //Color p = new Color(255,0,0);
      //Color p1 = new Color(8,5,178);
      
      //p.getRGB();
      //p1.getRGB();
      
      //System.out.println(p.getRGB());
      //System.out.println(p1.getRGB());
      
      //Abrir imagen original
      Image imagen = HerramientasImagen.abrirImagen();
      JFrameImg frame = new JFrameImg(imagen, "original");
      //HerramientasImagen.calcularHistograma(imagen, "Original");

      //Imagen blanco y negro
      //Image byn = OperacionesBasicas.escalaDeGrises(imagen);
      //JFrameImg frameByN = new JFrameImg(byn);
      //HerramientasImagen.calcularHistograma(byn, "Blanco y Negro");
      
      //Imagen iluminada
      //Image imagen2 = espacial.OperacionesBasicas.modificarIluminacion(imagen, 50);
      //JFrameImg framegray = new JFrameImg(imagen2);
      //HerramientasImagen.calcularHistograma(imagen2, "Iluminada");
      
      //Imagen más calida
      //Image calida = espacial.OperacionesBasicas.modificarCalor(imagen, 50);
      //JFrameImg framecalida = new JFrameImg(calida);
      //HerramientasImagen.calcularHistograma(calida, "Calido");
      
      //Imagen más fría
      //Image fria = espacial.OperacionesBasicas.modificarFrio(imagen, 50);
      //JFrameImg framefria = new JFrameImg(fria);
      //HerramientasImagen.calcularHistograma(fria, "Frio");
      
      //Imagen binarizada
      //Image binarizada = espacial.Binarizacion.binarizarImagen(imagen, 100);
      //JFrameImg framebinarizada = new JFrameImg(binarizada);
      //HerramientasImagen.calcularHistograma(binarizada, "Binarizada");
      
      //Imagen invertida
      //Image invertida = espacial.Binarizacion.invertir(imagen, 50);
      //JFrameImg frameinvertida = new JFrameImg(invertida);
      //HerramientasImagen.calcularHistograma(invertida, "Invertida");
      
      //Imagen Umbral Automatico
      //double[] histogramaByN = HerramientasImagen.ByN(byn);
      //int u = UmbralAutomatico.metodoIterativo(histogramaByN);
      //Image binarizada = espacial.Binarizacion.binarizarImagen(imagen, u);
      //JFrameImg frameUmbral = new JFrameImg(binarizada);
      //HerramientasImagen.calcularHistograma(binarizada, "Umbral Automatico");
      
      //Imagen Aumentar iluminación por pixel
      //Image aumentarIluminacion = OperacionesBasicas.aumentarIluminacion(imagen,u);
      //JFrameImg frameAIluminacion = new JFrameImg(aumentarIluminacion);
      //HerramientasImagen.calcularHistograma(aumentarIluminacion, "Aumentar Iluminación");
      
      //Imagen Aumentar iluminación por pixel
      //Image expansionLineal = Expansion.expansionLineal(30,50,byn);
      //JFrameImg frameExpansionLineal = new JFrameImg(expansionLineal);
      //HerramientasImagen.calcularHistograma(expansionLineal, "Expansion Lineal");
      
      //Imagen expansión linear color
      //int rs[] = new int[]{15,20,5,245,250,235};
      //Image expansionLinealColor = Expansion.expansionLinealColor(rs,imagen2);
      //JFrameImg frameExpansionLinealColor = new JFrameImg(expansionLinealColor);
      //HerramientasImagen.calcularHistograma(expansionLinealColor, "Expansion Lineal Color");
      
      //Imagen Convolución 3x3
      //Convolucion convo = new Convolucion(HerramientasImagen.toBufferedImage(imagen));
      //Image ImgConvolucion = convo.convolucionar(new int[]{0,1,0,
       //                                                   1,-4,1,
       //                                                   0,1,0},1);
      //Enfocar: 0,-1,0,-1,5,-1,0,-1,0
      //Desenfoque: 1,1,1,1,1,1,1,1,1
      //Realzar bordes: 0,0,0,-1,1,0,0,0,0
      //Detectar bordes: 0,1,0,1,-4,1,0,1,0
      //Repujado: -2,-1,0,-1,1,1,0,1,2
      //JFrameImg frameConvolucion = new JFrameImg(ImgConvolucion, "convolucionada");
      
      //Imagen Convolución 5x5
      Convolucion2 convo = new Convolucion2(HerramientasImagen.toBufferedImage(imagen));
      Image ImgConvolucion2 = convo.convolucionar(new int[]{0,0,0,0,0,
                                                            0,0,-1,0,0,
                                                            0,-1,5,-1,0,
                                                            0,0,-1,0,0,
                                                            0,0,0,0,0},1);
      JFrameImg frameConvolucion2 = new JFrameImg(ImgConvolucion2, "convolucionada");
   }
}