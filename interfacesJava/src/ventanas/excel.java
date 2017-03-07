/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.io.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; //New imports to read XLSX format
import org.apache.poi.xssf.usermodel.XSSFSheet; //New imports to read XLSX format
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.usermodel.HSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator; //New imports to formula evaluator in XLSX
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class excel {

    public static void main(String[] args) throws Exception {
        JFileChooser selector = new JFileChooser();
        String directorio = "";
        String extension = "";
        boolean seleccion = false;

        int resultado = selector.showOpenDialog(null);

        switch (resultado) {
            case JFileChooser.APPROVE_OPTION:
                directorio = selector.getSelectedFile().getPath();

                int i = directorio.lastIndexOf('.');
                if (i >= 0) {
                    extension = directorio.substring(i + 1);
                }

                seleccion = true;

                JOptionPane.showMessageDialog(null, "Seleccionaste " + directorio);
                break;
            case JFileChooser.CANCEL_OPTION:
                seleccion = false;
                JOptionPane.showMessageDialog(null, "No seleccionaste nada.");
                break;
            case JFileChooser.ERROR_OPTION:
                seleccion = false;
                JOptionPane.showMessageDialog(null, "Ocurrio un Error.");
                break;
            default:
                break;
        }

        if (seleccion) {
            
            /*
            
            String fecha = "";
            String elemento = "";
            String potencia = "";
            String marca = "";
            String modelo = "";
            String serie = "";
            String nit = "";
            String empRemite = "";
            String ciudad = "";
            String garantia = "";
            String direccion = "";
            String preRemite = "";
            String nombreContacto = "";
            String telefonoContacto = "";
            String correoContacto = "";
            String motivo = "";
            String tarjetaDeRed = "";
            String parrilla = "";
            String basesPals = "";
            String estadoCarcasa = "";
            String conectorOrig = "";
            String observaciones = "";
            
            */

            Double valor1 = -1.0;
            Double valor2 = -1.0;
            Double valor3 = -1.0;
            Double valor4 = -1.0;

            do {
                try {
                    valor1 = Double.parseDouble(JOptionPane.showInputDialog("Valor 1 para Suma: "));
                } catch (NumberFormatException e) {
                    valor1 = -1.0;
                    JOptionPane.showMessageDialog(null, "Solo numeros");
                }
            } while (valor1 < 0);

            do {
                try {
                    valor2 = Double.parseDouble(JOptionPane.showInputDialog("Valor 2 para Suma: "));
                } catch (NumberFormatException e) {
                    valor2 = -1.0;
                    JOptionPane.showMessageDialog(null, "Solo numeros");
                }
            } while (valor2 < 0);

            do {
                try {
                    valor3 = Double.parseDouble(JOptionPane.showInputDialog("Valor 1 para Resta: "));
                } catch (NumberFormatException e) {
                    valor3 = -1.0;
                    JOptionPane.showMessageDialog(null, "Solo numeros");
                }
            } while (valor3 < 0);

            do {
                try {
                    valor4 = Double.parseDouble(JOptionPane.showInputDialog("Valor 2 para Resta: "));
                } catch (NumberFormatException e) {
                    valor4 = -1.0;
                    JOptionPane.showMessageDialog(null, "Solo numeros");
                }
            } while (valor4 < 0);

            if (extension.equals("xls")) {
                //Leer el archivo de Excel XLS
                FileInputStream entrada = new FileInputStream(new File(directorio));
                //Acceso al libro de trabajo
                HSSFWorkbook xls = new HSSFWorkbook(entrada);
                //Acceso a la hoja de trabajo
                HSSFSheet hoja = xls.getSheetAt(0);
                //Declaracion de fila y celda
                Row fila = null;
                Cell celda = null;

                try {
                    //Asignando a valores a celdas con valores
                    fila = hoja.getRow(0);

                    celda = fila.getCell(0);
                    celda.setCellValue(valor1);
                    celda = fila.getCell(1);
                    celda.setCellValue(valor3);

                    fila = hoja.getRow(1);

                    celda = fila.getCell(0);
                    celda.setCellValue(valor2);
                    celda = fila.getCell(1);
                    celda.setCellValue(valor4);
                } catch (NullPointerException NPE) {
                    //En caso de que las celdas esten vacias hay que crearlas
                    fila = hoja.createRow(0);

                    celda = fila.createCell(0);
                    celda.setCellValue(valor1);
                    celda = fila.createCell(1);
                    celda.setCellValue(valor3);

                    fila = hoja.createRow(1);

                    celda = fila.createCell(0);
                    celda.setCellValue(valor2);
                    celda = fila.createCell(1);
                    celda.setCellValue(valor4);
                }

                //Evaluando formulas de todo el libro de excel
                HSSFFormulaEvaluator.evaluateAllFormulaCells(xls);

                //Cerrando archivo
                entrada.close();

                //Abriendo archivo para escritura
                FileOutputStream salida = new FileOutputStream(new File(directorio));
                //write changes
                xls.write(salida);
                //close the stream
                salida.close();
            } else if (extension.equals("xlsx")) {
                //Leer el archivo de Excel XLSX
                FileInputStream entrada = new FileInputStream(new File(directorio));
                //Acceso al libro de trabajo
                XSSFWorkbook xlsx = new XSSFWorkbook(entrada);
                //Acceso a la hoja de trabajo
                XSSFSheet hoja = xlsx.getSheetAt(0);
                //Declaracion de fila y celda
                Row fila = null;
                Cell celda = null;

                try {
                    //Asignando a valores a celdas con valores
                    fila = hoja.getRow(0);

                    celda = fila.getCell(0);
                    celda.setCellValue(valor1);
                    celda = fila.getCell(1);
                    celda.setCellValue(valor3);

                    fila = hoja.getRow(1);

                    celda = fila.getCell(0);
                    celda.setCellValue(valor2);
                    celda = fila.getCell(1);
                    celda.setCellValue(valor4);
                } catch (NullPointerException NPE) {
                    //En caso de que las celdas esten vacias hay que crearlas
                    fila = hoja.createRow(0);

                    celda = fila.createCell(0);
                    celda.setCellValue(valor1);
                    celda = fila.createCell(1);
                    celda.setCellValue(valor3);

                    fila = hoja.createRow(1);

                    celda = fila.createCell(0);
                    celda.setCellValue(valor2);
                    celda = fila.createCell(1);
                    celda.setCellValue(valor4);
                }

                //Evaluando formulas de todo el libro de excel
                XSSFFormulaEvaluator.evaluateAllFormulaCells(xlsx);

                //Cerrando la entrada archivo
                entrada.close();

                //Abriendo archivo para escritura
                FileOutputStream salida = new FileOutputStream(new File(directorio));
                //write changes
                xlsx.write(salida);
                //close the stream
                salida.close();
            }
        }
    }
}
