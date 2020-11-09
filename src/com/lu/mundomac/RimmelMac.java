package com.lu.mundomac;

public class RimmelMac {
    private int idRimmelMac;
    private String tipoRimmel;
    private String colorRimmel;
    private double precioRimmel;
    private static int contadorRimmelMac;

    public RimmelMac() {
        this.idRimmelMac = ++contadorRimmelMac;
    }

    public RimmelMac(String colorRimmel, double precioRimmel) {
        this.colorRimmel = colorRimmel;
        this.precioRimmel = precioRimmel;
    }

}
