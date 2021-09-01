package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_3Dao {

    Connection conexion;

    public Requerimiento_3Dao() {
        try {
            conexion = JDBCUtilities.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public ArrayList<Requerimiento_3> anoParcialmente() throws SQLException {
        ArrayList <Requerimiento_3> lista = new ArrayList<Requerimiento_3>();
        String sql = "SELECT ID_Proyecto, STRFTIME('%Y',Fecha ) FROM Compra c WHERE Pagado = 'Parcialmente' and STRFTIME('%m', Fecha) in ('02');";
        Statement stmt = conexion.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);
        while(resultado.next()) {
            Requerimiento_3 fecha = new Requerimiento_3();
            fecha.setID_Proyecto(resultado.getInt(1));
            fecha.setFecha(resultado.getString(2));
            lista.add(fecha);
        }
        return lista;
    }
}