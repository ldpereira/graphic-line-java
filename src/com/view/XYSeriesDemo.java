package com.view;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author ldpereira
 */
public class XYSeriesDemo extends ApplicationFrame {

    public XYSeriesDemo(final String title) {
        super(title);

        //Create a dataSet collection
        XYSeriesCollection data = new XYSeriesCollection();

        //Criando uma serie (linha)
        XYSeries serie1 = new XYSeries("Linha 1");
        serie1.add(3.0, 110.0);
        serie1.add(2.5, 90.0);
        serie1.add(5.0, 105.0);
        serie1.add(8.7, 150.0);
        serie1.add(13.9, 101.0);
        serie1.add(15.7, 100.0);
        data.addSeries(serie1);

        //Criando outra serie 
        XYSeries serie2 = new XYSeries("Linha 2");
        serie2.add(2.0, 100.0);
        serie2.add(3.0, 10.0);
        serie2.add(4.7, 70.0);
        serie2.add(10, 10.0);
        serie2.add(2, 150.0);
        serie2.add(20, 100.0);
        data.addSeries(serie2);
        
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Gráfico", //Titulo do grafico
                "X", // Titulo eixo X
                "Y", // Titulo eixo Y
                data, // Setando o dataSet no grafico
                PlotOrientation.VERTICAL, // Formato de visualizacao
                true, // Apresentar legenda
                true, // Apresentar tooltip
                false // URL
        );
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);
    }

    
    public static void main(String[] args) {
        XYSeriesDemo demo = new XYSeriesDemo("Tela do gráfico");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);
    }
}
