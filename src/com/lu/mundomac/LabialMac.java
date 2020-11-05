package com.lu.mundomac;

public class LabialMac {

    private int idLabialMac;
    private String colorLabial;
    private String tipoLabial;
    private double precioLabial;
    private static int contadorLabialMac;

    public LabialMac(){
        this.idLabialMac = ++contadorLabialMac;
    }

    public LabialMac(String colorLabial, String tipoLabial, double precioLabial){
        this.colorLabial = colorLabial;
        this.tipoLabial = tipoLabial;
        this.precioLabial = precioLabial;

    }

    public String getColorLabial() {
        return colorLabial;
    }

    public void setColorLabial(String colorLabial) {
        this.colorLabial = colorLabial;
    }

    public String getTipoLabial() {
        return tipoLabial;
    }

    public void setTipoLabial(String tipoLabial) {
        this.tipoLabial = tipoLabial;
    }

    public double getPrecioLabial() {
        return precioLabial;
    }

    public void setPrecioLabial(double precioLabial) {
        this.precioLabial = precioLabial;
    }

    @Override
    public String toString() {
        return "LabialMac{" +
                "idLabialMac=" + idLabialMac +
                ", colorLabial='" + colorLabial + '\'' +
                ", tipoLabial='" + tipoLabial + '\'' +
                ", precioLabial=" + precioLabial +
                '}';
    }
}
