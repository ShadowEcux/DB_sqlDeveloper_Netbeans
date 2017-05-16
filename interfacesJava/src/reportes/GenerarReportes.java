/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportes;

import conMySql.conector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author CPU_SYS
 */
public class GenerarReportes {

    public void reporteSalida(String numero) {

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/basecpu", "root", "8020123496");

            JasperReport reporte = (JasperReport) JRLoader.loadObject("salida.jasper");
            Map parametro = new HashMap();

            parametro.put("numero", numero);

            JasperPrint j;
            
            j = JasperFillManager.fillReport(reporte, parametro, cn);
            System.out.println("conectado correctamente");

            JasperViewer jv = new JasperViewer(j, false);
            jv.setTitle("REPORTE SALIDA");
            jv.setVisible(true);
            //jv.show();

        } catch (JRException e) {
            System.out.println("Error: \n" + e);
        } catch (SQLException ex) {
            Logger.getLogger(GenerarReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}