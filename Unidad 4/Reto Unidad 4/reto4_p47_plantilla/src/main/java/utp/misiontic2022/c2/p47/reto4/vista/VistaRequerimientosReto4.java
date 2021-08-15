package utp.misiontic2022.c2.p47.reto4.vista;

import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;

public class VistaRequerimientosReto4 {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        try {
            System.out.println("Conocer el id de las compras que si estén pagadas");
            ArrayList<Requerimiento_1> resultado = controlador.consultarRequerimiento1();
            System.out.println("ID_Compra");
            for (Requerimiento_1 compras : resultado) {
                System.out.println(compras.getID_Compra());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2(){
        try {
            System.out.println("Conocer el id de todas las compras cuyo precio por unidad de su material de construcción sea inferior a 1100");
            ArrayList<Requerimiento_2> resultado = controlador.consultarRequerimiento2();
            System.out.println("ID_Compra");
            for (Requerimiento_2 compras2 : resultado) {
                System.out.println(compras2.getID_Compra());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        try {
            System.out.println("Obtener el id de la compra y el año de las compras pagadas parcialmente y en el mes '02'");
            ArrayList<Requerimiento_3> resultado = controlador.consultarRequerimiento3();
            System.out.println("ID_Proyecto STRFTIME('%Y',Fecha )");
            for (Requerimiento_3 compras3 : resultado) {
                System.out.print(compras3.getID_Proyecto()+" ");
                System.out.println(compras3.getFecha());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
}
