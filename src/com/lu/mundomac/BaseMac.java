package com.lu.mundomac;

public class BaseMac {

    private int idBaseMac;
    private String tipoBase;
    private String colorBase;
    private double precioBase;
    private static int contadorBaseMac;

    public BaseMac() {
        this.idBaseMac = ++contadorBaseMac;
    }
    public BaseMac(String tipoBase, String colorBase, double precioBase){
        this.tipoBase = tipoBase;
        this.colorBase = colorBase;
        this.precioBase = precioBase;
    }

    public int getIdBaseMac() {
        return idBaseMac;
    }

    public void setIdBaseMac(int idBaseMac) {
        this.idBaseMac = idBaseMac;
    }

    public String getTipoBase() {
        return tipoBase;
    }

    public void setTipoBase(String tipoBase) {
        this.tipoBase = tipoBase;
    }
    public String getColor() {
        return colorBase;
    }

    public void setColorBase(String colorBase) {
        this.colorBase = colorBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return "BaseMac{" +
                "idBaseMac=" + idBaseMac +
                ", tipoBase='" + tipoBase + '\'' +
                ", colorBase='" + colorBase + '\'' +
                ", precioBase=" + precioBase +
                '}';
    }
}
