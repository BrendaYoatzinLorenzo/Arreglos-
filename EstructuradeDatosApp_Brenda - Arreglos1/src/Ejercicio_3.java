
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lrnz
 */
public class Ejercicio_3 {
    public static void main(String[] args) {

Scanner sn=new Scanner(System.in);

//Pido una longitud
System.out.println("Inserte una longitud");
int longitud=sn.nextInt();

//Creo el arreglo con esa longitud
int numeros[]=new int[longitud];

int num;

//Recorro el array
for(int i=0;i<numeros.length;i++){

System.out.println("Inserte un numero en la posicion "+i);

do{
//pido el numero en una posicion especifica
num=sn.nextInt();

if(!(num>=0 && num<=10)){
System.out.println("Error. Solo numeros del 0 al 10. "
+ "Inserte un nÃºmero en la posicion "+i);
}

}while(!(num>=0 && num<=10));

//asigno, ya que se que el numero es correcto
numeros[i]=num;

}

//Esta parte es opcional para que se vea lo que hemos insertado
System.out.println("Estos son los nÃºmeros elegidos por el usuario");
for(int i=0;i<numeros.length;i++){
System.out.println(numeros[i]);
}

}

}
