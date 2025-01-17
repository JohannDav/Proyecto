
package com.rs.modelo;

public class Carrito {
    int item;
    int idReporte;
    String nombres;
    String imagen;
    String descripcion;
    String fechasuceso;
    double precioCompra;
    int cantidad;
    double subTotal;
    String turno;
    String lugar;
    String correou;

    public Carrito() {
    }

    public Carrito(int item, int idReporte, String nombres, String imagen, String descripcion, String fechasuceso, double precioCompra, int cantidad, double subTotal, String turno, String lugar, String correou) {
        this.item = item;
        this.idReporte = idReporte;
        this.nombres = nombres;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.fechasuceso = fechasuceso;
        this.precioCompra = precioCompra;
        this.cantidad = cantidad;
        this.subTotal = subTotal;
        this.turno = turno;
        this.lugar = lugar;
        this.correou = correou;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getFechasuceso() {
        return fechasuceso;
    }

    public void setFechasuceso(String fechasuceso) {
        this.fechasuceso = fechasuceso;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
    
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getCorreou() {
        return correou;
    }

    public void setCorreou(String correou) {
        this.correou = correou;
    }
}
