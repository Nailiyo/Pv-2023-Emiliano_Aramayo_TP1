package ar.edu.unju.edm.Ejercicio5;
public class Empleado {
    private String nombre;
    private String fecha;
    private int legajo;
    private String email;
    private int sueldo;
    private int horas_trabajadas;

    public Empleado(){
    }
    public Empleado(String nombre, int legajo, int horas_trabajadas){
        this.nombre = nombre;
        this.legajo = legajo;
        this.horas_trabajadas = horas_trabajadas;
    }

    public void MostrarDatos(){
        System.out.println("Empleado... \n Nombre: "+getNombre(nombre)+
         "\n Fecha: "+ getFecha(fecha) +
          "\n Legajo:" + getLegajo(legajo) +
           "\n Email: " + getEmail(email) +
         "\n Horas trabajadas: " + getHorasTrabajadas(horas_trabajadas) +
          "\n Sueldo: " + getSueldo(horas_trabajadas));
    }

    private int CalcularSueldo(int horas){

        if(horas<=160){
            return horas*4000;
        }
        else{
            return (160*4000)+((horas-160)*5500);
        }
    }

    public void SetNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(String nombre){
        return nombre;
    }
    public void setFecha(String fecha2){
        this.fecha = fecha2;
    }
    public String getFecha(String fecha){
        return fecha;
    }
    public void setLegajo(int legajo){
        this.legajo = legajo;
    }
    public int getLegajo(int legajo){
        return legajo;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(String email){
        return email;
    }
    public void setHorasTrabajadas(int horas_trabajadas){
        this.horas_trabajadas = horas_trabajadas;
    }
    public int getHorasTrabajadas(int horas_trabajadas){
        return horas_trabajadas;
    }
    public void setSueldo(int horas_trabajadas){
        this.sueldo= CalcularSueldo(horas_trabajadas);
    }
    public int getSueldo(int horas_trabajadas){
        setSueldo(horas_trabajadas);
        return sueldo;
    }
}

