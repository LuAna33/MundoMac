package com.lu.mundomac;

public class CorrectorMac {

   private int idCorrectorMac;
   private String colorCorrector;
   private double precioCorrector;
   private static int contadorCorrectorMac;

    public CorrectorMac() {
        this.idCorrectorMac = ++contadorCorrectorMac;
    }

    public CorrectorMac(String colorCorrector, double precioCorrector) {
        this.colorCorrector = colorCorrector;
        this.precioCorrector = precioCorrector;
    }

    public String getColorCorrector() {
        return colorCorrector;
    }

    public void setColorCorrector(String colorCorrector) {
        this.colorCorrector = colorCorrector;
    }

    public double getPrecioCorrector() {
        return precioCorrector;
    }

    public void setPrecioCorrector(double precioCorrector) {
        this.precioCorrector = precioCorrector;
    }

   }


