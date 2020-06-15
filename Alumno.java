package Enunciado01;

public class Alumno {
    
    private String codigo,nombre;
    private int nota1,nota2;
    
    public Alumno(){
        
    }
     public Alumno(String cod,String nom ,int n1,int n2,double prom){
        this.codigo=cod;
        this.nombre=nom;
        this.nota1=n1;
        this.nota2=n2;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {// lleva la nota de la ram hacia la pantalla
        return nota2;
    }

    public void setNota2(int nota2) {//captura valor y lo envia a la memoria ram
        this.nota2 = nota2;
    }
    
    public double hallarPromedio(){
        double prom;
        prom=(nota1+nota2)/2.0;//2.0 porque el promedio es decimal
        return prom;
    }
    
    public void mostrarPromedio(){
        System.out.println("Promedio: "+hallarPromedio());
    }
    
    public String Cadena(){
        return "Código: "+codigo+" Nombre: "+nombre+" Nota 1: "+nota1+" Nota 2: "+nota2+" Promedio: "+ hallarPromedio();
    }
    
}
