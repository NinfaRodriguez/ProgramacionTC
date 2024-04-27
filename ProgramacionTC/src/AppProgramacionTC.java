import java.util.InputMismatchException;
import java.util.Scanner;
//Grupo 1M7-S
//Nombre: Ninfa Isabel Rodríguez Briceño
//Numero de Carnet: 2024-1649U
public class App {

    public static void main(String[] args) throws Exception {
         //Defeinir Scanner
         Scanner op = new Scanner(System.in);
         //Usar Try para validar que solo se puedan ingresar numeros enteros
            try {
                //Se mandan a llamar los metodos
                Ejecutar(op);
            } catch (InputMismatchException M) {
                System.out.println("El valor ingresado debe ser un entero, intentelo denuevo");
            }
           
        }
    
public static void Ejecutar(Scanner op) throws MatchException{
//Obtener el primer valor
 System.out.println("Ingresa 3 numeros diferentes");
 System.out.println("Ingresa el primer numero: ");
 int Primernumero = op.nextInt();
     
//Obtener el segundo valor
 System.out.println("Ingrese el segundo numero");
 int Segundonumero = op.nextInt();
//Usar while para validar que no se puedan ingresar un numero igual al anterior
 while (Primernumero == Segundonumero) {
     System.out.println("Los numeros deben ser diferentes, vuelva a intentarlo");
     System.out.println("Ingrese el segundo numero");
     Segundonumero = op.nextInt();
 }
//Obtener el tercer valor
 System.out.println("Ingrese el tercer numero");
 int Tercernumero = op.nextInt();
//Usar While para validar que no se pueda ingresar un numero igual a los anteriores
 while (Segundonumero == Tercernumero || Primernumero == Tercernumero) {
     System.out.println("Los numeros deben ser diferentes, vuelva a intentarlo");
     System.out.println("Ingrese el Tercer numero");
     Tercernumero = op.nextInt();
 }
    
//Realizar las operaciones
 int PrimerMenor;
 int SegundoMenor;
 int NumeroMayor;
//Definir el numero mayor, menor y medio
 if(Primernumero < Segundonumero && Primernumero < Tercernumero){
     PrimerMenor = Primernumero;
 if (Segundonumero < Tercernumero){
     SegundoMenor = Segundonumero;
     NumeroMayor = Tercernumero;
 }
 else {SegundoMenor = Tercernumero;
     NumeroMayor = Segundonumero;}
    
    
 } else if (Segundonumero < Primernumero && Segundonumero < Tercernumero){
     PrimerMenor = Segundonumero;
 if (Primernumero < Tercernumero){
     SegundoMenor = Primernumero;
     NumeroMayor = Tercernumero;
 }
 else {SegundoMenor = Tercernumero;
     NumeroMayor = Primernumero;}
    
 } else {
     PrimerMenor = Tercernumero;
 if (Primernumero < Segundonumero){
     SegundoMenor = Primernumero;
     NumeroMayor = Segundonumero;
 }
 else {SegundoMenor = Segundonumero;
     NumeroMayor = Primernumero;}
 }
 
  //Mostrar en pantalla el numero mayor
  System.out.println("El numero mayor es: "+ NumeroMayor);
  //Obtener la diferencia entre los dos numeros mayores y mostrarlo en consola
  System.out.println("La diferencia entre los dos numeros mayores es: "+ (NumeroMayor - SegundoMenor));
  //Sumar los dos numeros menores y mostrarlo en consola
  System.out.println("La suma de los dos numero menores es: "+ (PrimerMenor + SegundoMenor));
    }


}
