/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Windows;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author jesus y lai
 */
class StudentInfo {
    private int id;
    private String nombre,apellido,correo,cedula,telefono;
    private String fechaNacimiento;
    private ImageIcon newIcon;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    
    // Constructor
    public StudentInfo(int id, ImageIcon newIcon,String nombre, String apellido, String cedula, Date fecha, String telefono, String correo) {
        this.id = id;
        this.newIcon = newIcon;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        fechaNacimiento = convertirFechaBien(dateFormat.format(fecha));
        this.telefono = telefono;
        this.correo = correo;
    }
    
    // gets
        //identificacion
        public void setId(int id) {
            this.id = id;
        }
        //foto
        public ImageIcon getNewIcon() {
            return newIcon;
        }
        //Nombre y apellido
        public String getNombreApellido() {
            return (nombre +" "+ apellido);
        }
       //cedula
        public String getCedula() {

            return cedula;
        }
        //numero telefonico
        public String getTelefono() {
            return telefono;
        }
        //correo
       public String getCorreo() {
            return correo;
        }
        //fecha de nacimiento
        private String convertirFecha(Date fecha) {
            SimpleDateFormat outputFormat = new SimpleDateFormat("dd 'de' MM 'de' yyyy");
            return outputFormat.format(fecha);
        }
        public String getfecha(){
            return fechaNacimiento;
        }
        
        private String convertirFechaBien(String fecha) {
        try {
            // Formato de entrada
            DateTimeFormatter formatoEntrada = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            // Parsear la cadena de fecha a LocalDate
            LocalDate fechaLocal = LocalDate.parse(fecha, formatoEntrada);
            
            // Formato de salida
            DateTimeFormatter formatoSalida = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");
            // Formatear la fecha en el formato deseado
            String fechaFormateada = fechaLocal.format(formatoSalida);
            
            return fechaFormateada;
        } catch (Exception e) {
            // Si hay un error al parsear la fecha, devuelve la cadena original
            return fecha;
        }
    }
}
