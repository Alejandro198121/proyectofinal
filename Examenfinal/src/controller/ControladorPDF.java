/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.jfree.chart.ChartUtilities;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class ControladorPDF {

    public static void main(String[] args) {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1, "Laura", "fidelidad");
        dataset.addValue(2, "Category 2", "Value 2");
        dataset.addValue(3, "Category 3", "Value 3");

        JFreeChart chart = ChartFactory.createBarChart("Grafico 1", "Eje X", "Eje Y", dataset);

        // Ajustar el tamaño del título del gráfico
        chart.getTitle().setFont(chart.getTitle().getFont().deriveFont(18f)); // Tamaño de fuente del título

      

        int width = 200; // Ancho del gráfico
        int height = 250; // Alto del gráfico
        BufferedImage bufferedImage = chart.createBufferedImage(width, height);

        try {
            // Crear un nuevo documento PDF
            PDDocument document = new PDDocument();
            PDPage page1 = new PDPage(PDRectangle.A6);
            document.addPage(page1);

            // Crear contenido para el PDF
            PDPageContentStream contentStream = new PDPageContentStream(document, page1);
            contentStream.drawImage(PDImageXObject.createFromByteArray(
                    document, ChartUtilities.encodeAsPNG(bufferedImage), null), 20, 80, width, height);
            contentStream.beginText();
            contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
            // Ubicación del texto
            contentStream.newLineAtOffset(90, 390);
            contentStream.showText("PDF moda media y mediana de ...........");
            contentStream.endText();
            contentStream.close();

            
            PDPage page2 = new PDPage(PDRectangle.A6);
            document.addPage(page2);
            
            // Contenido para la segunda página (puedes ajustarlo según tu necesidad)
            DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
            dataset2.addValue(4, "Category 4", "Value 4");
            dataset2.addValue(5, "Category 5", "Value 5");
            dataset2.addValue(6, "Category 6", "Value 6");
            JFreeChart chart2 = ChartFactory.createBarChart("Grafico 2", "Eje X", "Eje Y", dataset2);
            chart2.getTitle().setFont(chart2.getTitle().getFont().deriveFont(18f)); 
            BufferedImage bufferedImage2 = chart2.createBufferedImage(width, height);

            PDPageContentStream contentStream2 = new PDPageContentStream(document, page2);
            contentStream2.drawImage(PDImageXObject.createFromByteArray(
                    document, ChartUtilities.encodeAsPNG(bufferedImage2), null), 20, 80, width, height);
            contentStream2.beginText();
            contentStream2.setFont(PDType1Font.TIMES_ROMAN, 12);
            contentStream2.newLineAtOffset(90, 390);
            contentStream2.showText("pagina 2");
            // Añadir más contenido si es necesario para la segunda página
            contentStream2.endText();
            contentStream2.close();
            
            
            // Guardar el documento PDF
            document.save("C:\\Users\\aleja\\OneDrive\\Escritorio\\pdf\\prueba pdf.pdf");
            document.close();
            System.out.println("PDF creado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
