package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_2Dao {

    Connection conexion;

    public Requerimiento_2Dao() {
        try {
            conexion = JDBCUtilities.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public ArrayList<Requerimiento_2> materialConstruccion() throws SQLException {
        ArrayList <Requerimiento_2> lista = new ArrayList<Requerimiento_2>();
        String sql = "SELECT ID_Compra FROM Compra WHERE ID_MaterialConstruccion in (SELECT ID_MaterialConstruccion FROM MaterialConstruccion WHERE Precio_Unidad < 1100)";
        Statement stmt = conexion.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);
        while(resultado.next()) {
            Requerimiento_2 material = new Requerimiento_2();
            material.setID_Compra(resultado.getInt(1));
            lista.add(material);
        }
        return lista;
    }
}