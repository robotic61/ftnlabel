package com.forthems.ftnlabel.service;


import com.forthems.ftnlabel.model.Ftn;
import com.forthems.ftnlabel.repository.FtnRepository;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.springframework.stereotype.Service;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;

@Service
public class FtnService {

    private final FtnRepository ftnRepository;

    public FtnService(FtnRepository ftnRepository) {
        this.ftnRepository = ftnRepository;
    }

    public BufferedImage generateQRCode(String text, int width, int height) throws Exception {
        BitMatrix matrix = new MultiFormatWriter().encode(text, BarcodeFormat.QR_CODE, width, height);

        return MatrixToImageWriter.toBufferedImage(matrix);
    }




    /*
    Sizing

    1 inch = 72 units
    1 inch = 2.54 cm

    1 cm = 1/2.54 inch
    8.5 cm = 1/2.54 x 8.5 = 3.346 inch
    4.5 cm = 1/2.54 x 4.5 = 1.772 inch

    Thus
    8.5 cm = 3.346 x 72 = 240.912f units
    4.5 cm = 1.772 x 72 = 127.584f units
    */

//    public PDDocument pdfCreation() throws Exception {
//        try(PDDocument document = new PDDocument()) {
//            PDRectangle customSize = new PDRectangle(240.912f, 127.584f);
//            PDPage page = new PDPage(customSize);
//            document.addPage(page);
//            return document;
//        }
//    }

    public void pdfTemplate() {
        try(PDDocument document = new PDDocument()) {
            PDRectangle customSize = new PDRectangle(240.912f, 127.584f);
            PDPage page = new PDPage(customSize);
            document.addPage(page);

            try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
                contentStream
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public List<Ftn> findByFtnNo(String word) {
        return ftnRepository.findByFtnNo(word);
    }





    /*
    method to extract labels
    method to put labels
    method to create template for the product label
   (like:
   Desc:
   Brand:
   Maker:
   )

   What to do if the field is null? shows empty string(nothing)
   Where to get the text to create the Qr code?
   from
   1. "ftnNo": "2001000027"
   2. "pn": "10101-0040-02962"
   for 2 qr codes

   Make template for the paper like where to put the texts for each field
   then just input the ftnno to the method and then info will be input into the
   pdf

   use the object after acquiring from the database, to paste into the label.

   use any font to be nicely readable.
     */










}
