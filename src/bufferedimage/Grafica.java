/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bufferedimage;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author roban
 */
public class Grafica {
    
    private JFreeChart grafica;
    private XYSeriesCollection series;
    private String ejeX, ejeY,titulo;

    public Grafica(String ejeX, String ejeY, String titulo) {
        this.grafica = null;
        this.series = new XYSeriesCollection();
        this.ejeX = ejeX;
        this.ejeY = ejeY;
        this.titulo = titulo;
    }
     
    public void agregarSerie(String nombre, double[] datos){
    
        XYSeries serie = new XYSeries(nombre);
        // agregar cada uno de los datos en la serie 
        for (int x=0; x < datos.length;x++){
            serie.add(x, datos[x]);
        }
        // agregamos la serie que se generÃ³ 
        this.series.addSeries(serie);
    }
    
    public JFreeChart getGrafica(){
        return this.grafica;
    }
    public void crearGrafica(){
        this.grafica = ChartFactory.createXYAreaChart(titulo, ejeX, ejeY, getSeries());
    }
    
     public void muestraGrafica(){
         ChartFrame frame = new ChartFrame("Histograma de color", grafica);
        frame.setVisible(true);
        frame.setSize(500,370);
        
    }

    /**
     * @return the series
     */
    public XYSeriesCollection getSeries() {
        return series;
    }
  
}
