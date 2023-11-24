/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.IOException;

public class ControladorPDF {
	public static void main(String[] args) {
		try {
			// Crear un nuevo documento PDF
			PDDocument document = new PDDocument();
			PDPage page = new PDPage(PDRectangle.A6);
			document.addPage(page);

			// Crear contenido para el PDF
			PDPageContentStream contentStream = new PDPageContentStream(document, page);
			contentStream.beginText();
			contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
			contentStream.newLineAtOffset(10, 400);
			contentStream.showText("¡Hola, este es un documento PDF generado con PDFBox!");
			contentStream.endText();
			contentStream.close();

			// Guardar el documento PDF
			document.save("C:\\Users\\aleja\\OneDrive\\Escritorio\\pdf\\prueba pdf.pdf");
			document.close();
			System.out.println("PDF creado exitosamente.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}