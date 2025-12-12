/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.sql.Date;

/**
 *
 * @author Carlos DEFINITIVO
 */
public class Pago {
    
    private int idPago;
    private int idOrden; // Clave foránea a la Orden de Venta
    private double montoPagado;
    private String medioPago; // Ejemplo: Efectivo, Tarjeta, App Movil
    private String nroBoletaFactura; // Número registrado en el JPanel
    private Date fechaPago;
    
    
    private String estadoConfirmacion; 


    // 1. Constructor por defecto (vacío)
    public Pago() {
    }
    
    // 2. Constructor para CREAR/INSERTAR un nuevo Pago
    // No incluye idPago (es autoincremental)
    // Usamos double para el monto y Date para la fecha
    public Pago(int idOrden, double montoPagado, String medioPago, 
                String nroBoletaFactura, Date fechaPago) {
        this.idOrden = idOrden;
        this.montoPagado = montoPagado;
        this.medioPago = medioPago;
        this.nroBoletaFactura = nroBoletaFactura;
        this.fechaPago = fechaPago;
        this.estadoConfirmacion = "Confirmado"; // Valor por defecto en la BD
    }
    
    // 3. Constructor COMPLETO para LEER/OBTENER datos de la BD
    public Pago(int idPago, int idOrden, double montoPagado, String medioPago, 
                String nroBoletaFactura, Date fechaPago, String estadoConfirmacion) {
        this.idPago = idPago;
        this.idOrden = idOrden;
        this.montoPagado = montoPagado;
        this.medioPago = medioPago;
        this.nroBoletaFactura = nroBoletaFactura;
        this.fechaPago = fechaPago;
        this.estadoConfirmacion = estadoConfirmacion;
    }
    
    // =========================================================
    // GETTERS Y SETTERS
    // =========================================================

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public double getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(double montoPagado) {
        this.montoPagado = montoPagado;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getNroBoletaFactura() {
        return nroBoletaFactura;
    }

    public void setNroBoletaFactura(String nroBoletaFactura) {
        this.nroBoletaFactura = nroBoletaFactura;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getEstadoConfirmacion() {
        return estadoConfirmacion;
    }

    public void setEstadoConfirmacion(String estadoConfirmacion) {
        this.estadoConfirmacion = estadoConfirmacion;
    }
    
}
