package com.company.dawidplesniarski.solid.interfacesegragation;

public class FormatToPdf implements PdfFormatter {
    @Override
    public byte[] formatToPdf() {
        return new byte[0];
    }
}
