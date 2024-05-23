package PRESETNACION;
//esto agrego
public class taller {
    String nombre;
    int edad;
public taller (String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad;
}
public void Presentacion(){
    System.out.println("Soy  "+nombre+" estudiante de la esfot y tengo "+edad);
}
}

class Padre extends Familia{
    String nombrePapa;
    public Padre (String apellido, String origen, String nombrePapa){
        super(apellido,origen);
        this.nombrePapa= nombrePapa;
    }
    public void apellidopapa(){
        System.out.println("El señor" +nombrePapa+" tiene el apellido "+apellido);

    }
}

class Hija extends Padre{
    String nombrehija;
    int edad;

    public Hija(String apellido, String origen, String nombrePapa, String nombrehija, int edad){
        super(apellido,origen, nombrePapa);
        this.nombrehija = nombrehija;
        this.edad = edad;
    }

    public void infoHija(){
        System.out.println("la hija "+nombrehija + "hija del señor "+ nombrePapa+" tiene el apellido "+ apellido);
    }
}
