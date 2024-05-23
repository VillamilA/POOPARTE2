package PRESETNACION;

public class taller {
    String nombre;
    int edad;
public taller (String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad;
}
public void Presentacion(){
    System.out.println("Soy el estudiante "+nombre+" y tengo "+edad+" años");
}
}
