package dao;

import conexion.ConexionBD; 
import modelos.Pago; 
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date; 

/**
 * Data Access Object para la entidad Pago.
 * Maneja las operaciones CRUD con la tabla 'pagos' de BD_CARPINTERIATABLON.
 */
public class PagoDAO { // Nombre de la clase corregido a PagoDAO
    private Connection conexion;
    
    // Constructor: Inicializa la conexión a la BD
    public PagoDAO() {
        // Llama al método obtenerConexion() en la clase ConexionBD
        this.conexion = ConexionBD.obtenerConexion(); 
    }
    
    
    // =============================================================
    // METODO 1: GUARDAR PAGO (INSERT)
    // =============================================================
    
    public boolean guardarPago(Pago pago) {
        // Los campos de la tabla 'pagos' son: id_orden, monto_pagado, medio_pago, nro_boleta_factura, fecha_pago
        String sql = "INSERT INTO pagos (id_orden, monto_pagado, medio_pago, "
                + "nro_boleta_factura, fecha_pago) VALUES(?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            
            // Mapeo de campos:
            // 1. id_orden (INT): 
            ps.setInt(1, pago.getIdOrden()); 
            
            // 2. monto_pagado (DECIMAL)
            ps.setDouble(2, pago.getMontoPagado());
            
            // 3. medio_pago (ENUM/VARCHAR)
            ps.setString(3, pago.getMedioPago());
            
            // 4. nro_boleta_factura (VARCHAR)
            ps.setString(4, pago.getNroBoletaFactura());
            
            // 5. fecha_pago (DATE)
            ps.setDate(5, pago.getFechaPago());
            
            ps.executeUpdate();
            ps.close();
            
            System.out.println("↨ Pago registrado correctamente en BD.");
            return true;
            
        } catch (SQLException e) {
            System.err.println("→ Error al guardar pago: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
    
    
    // =============================================================
    // METODO 2: OBTENER TODOS LOS PAGOS
    // =============================================================
    
    public List<Pago> obtenerTodos() {
        List<Pago> pagos = new ArrayList<>();
        String sql = "SELECT * FROM pagos ORDER BY fecha_registro DESC";
        
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                Pago pago = new Pago(
                    rs.getInt("id_pago"),
                    rs.getInt("id_orden"),
                    rs.getDouble("monto_pagado"),
                    rs.getString("medio_pago"),
                    rs.getString("nro_boleta_factura"),
                    rs.getDate("fecha_pago"),
                    rs.getString("estado_confirmacion")
                );
                pagos.add(pago);
            }
            rs.close();
            st.close();
            
        } catch (SQLException e) {
            System.err.println("→ Error al obtener pagos: " + e.getMessage());
            e.printStackTrace();
        }
        
        return pagos;
    }
}