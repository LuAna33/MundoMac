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

    public String getTipoRimmel() {
        return tipoRimmel;
    }

    public void setTipoRimmel(String tipoRimmel) {
        this.tipoRimmel = tipoRimmel;
    }

    public String getColorRimmel() {
        return colorRimmel;
    }

    public void setColorRimmel(String colorRimmel) {
        this.colorRimmel = colorRimmel;
    }

    public double getPrecioRimmel() {
        return precioRimmel;
    }

    public void setPrecioRimmel(double precioRimmel) {
        this.precioRimmel = precioRimmel;
    }

    @Override
    public String toString() {
        return "RimmelMac{" +
                "idRimmelMac=" + idRimmelMac +
                ", tipoRimmel='" + tipoRimmel + '\'' +
                ", colorRimmel='" + colorRimmel + '\'' +
                ", precioRimmel=" + precioRimmel +
                '}';
    }
}
