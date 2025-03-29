package com.javalogic.pdf;
import org.apache.pdfbox.multipdf.PDFMergerUtility;
import java.io.File;
import java.io.IOException;
public class PdfFilesMerge {
        public static void main(String[] args) {
            // Folder path containing PDFs
            String folderPath = "F:/Documents/fakhar/MyCaseInCourt/CivilSuit/s_pdfs";

            // Output merged PDF file
            String outputFilePath = "F:/Documents/fakhar/MyCaseInCourt/CivilSuit/s_pdfs/final_merged.pdf";

            // Create PDFMergerUtility instance
            PDFMergerUtility pdfMerger = new PDFMergerUtility();

            try {
                // Get all PDF files from the folder
                File folder = new File(folderPath);
                File[] pdfFiles = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".pdf"));

                if (pdfFiles == null || pdfFiles.length == 0) {
                    System.out.println("No PDF files found in the folder.");
                    return;
                }

                // Add each PDF to the merger
                for (File pdf : pdfFiles) {
                    System.out.println("Merging: " + pdf.getName());
                    pdfMerger.addSource(pdf);
                }

                // Set the destination file
                pdfMerger.setDestinationFileName(outputFilePath);

                // Merge the PDFs
                pdfMerger.mergeDocuments(null);

                System.out.println("PDFs merged successfully to: " + outputFilePath);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

}
