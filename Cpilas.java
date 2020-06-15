package Enunciado01;
import java.util.Scanner;
public class Cpilas {
    static Scanner teclado=new Scanner(System.in);
    int tope,max;
    Alumno[]pila;//inicializando arreglo pila de tipo alumno
    Alumno alu=new Alumno();// creando un objeto
    
    public Cpilas(int max){
        this.tope=0;
        this.max=max;
        this.pila=new Alumno[this.max+1];
    }
    public Cpilas(){
        this.tope=0;
        this.max=100;
        this.pila=new Alumno[this.max+1];
    }
    public int getTope(){
        return tope; //devuelve el valor de tope
    }
    public boolean IsPilaLlena(){
        if(this.max==this.tope){
            return true;
        }else{
            return false;
        }
    }
    
     public boolean IsPilaVacia(){
        if(this.tope==0){
            return true;
        }else{
            return false;
        }
        
    }
     public void InsertarPila(){
         if(this.IsPilaLlena()){
             System.out.println("La Pila esta Llena");
         }else{
             
             /*int codigo;
             System.out.print("Ingrese el Código: ");
             codigo= teclado.nextInt();
             this.pila[this.tope]=codigo;
             this.tope++;*/
            // System.out.println("El Código "+new Alumno()+" Se inserto la pila\n");
            System.out.println("Ingrese el Código del alumno : ");
            String codigo = teclado.next();
            alu.setCodigo(codigo);
            System.out.println("Ingrese el Nombre del alumno : ");
            String nom = teclado.next();
            alu.setNombre(nom);
            System.out.println("Ingrese la Nota 1 de "+ nom +" : ");
            int n1 = teclado.nextInt();
            alu.setNota1(n1);
            System.out.println("Ingrese la Nota 2 de "+ nom +" : ");
            int n2 = teclado.nextInt();
            alu.setNota2(n2);
            System.out.println("Se inserto a la pila en la posicion\n" + (tope+1));
            System.out.println(alu.Cadena());
            this.tope++;

            
         }
        
     }
      public void EliminarPila(){
         if(this.IsPilaVacia()){
             System.out.println("La Pila está vacia");
                 
              }else{
                //int item=this.pila[this.tope-1];
                this.tope--;
               // System.out.print("El Item "+item+"Se elimino de la Pila");
             
         }
     }
     
    
     public void MostrarPila(){
        
          if (this.IsPilaVacia()) {
            System.out.println("La pila esta vacía");
        } /*else if (this.tope != this.max) {
            for (int i = 0; i < this.tope; i++) {
                System.out.println(pila[i].Cadena());

            }*/
         else {
             System.out.println("\tElementos de la pila");
             System.out.println("\t======================");
             for(int i=0;i<this.tope;i++){
                 System.out.println(pila[i].Cadena());
            }  
         }
         
     }     
}
