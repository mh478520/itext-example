package com.itext.demo.ItextDemo;

import java.io.File;
import java.io.IOException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

public class ItextDemo {

	public static void main(String[] args) throws IOException {
	
	    File file = new File("hello.pdf");
	
	    // Open PDF document in write mode
	    PdfWriter pdfWriter = new PdfWriter(file);
	    PdfDocument pdfDocument = new PdfDocument(pdfWriter);
	
	    // Create document to add new elements
	    Document document = new Document(pdfDocument);
	
	    // Create Paragraph
	    Paragraph paragraph = new Paragraph("Hello Itext7");
	    paragraph.add("\n");
	    paragraph.add("My first PDF document in iText7.");
	
	    // Add Paragraph to document
	    document.add(paragraph);
	
	    // Close document
	    document.close();
	
	}


}
