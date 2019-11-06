import java.util.*; //para poder pedir valores
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException; // No olvides importar la excepción
import mapa.coordenadas; //Aqui importo una clase
class Main {
public static void main(String[] args) {
// System.out.println("Hello world!");
ArrayList<coordenadas> lista = new ArrayList<coordenadas>();
    Scanner escaner = new Scanner(System.in);

boolean pedido = true;
while(pedido){
coordenadas valor = new coordenadas();
System.out.println("ingrese una coordenada ");
System.out.print("latitud: ");
valor.lat = escaner.nextLine();
System.out.print("longitud: ");
valor.lonj = escaner.nextLine();
lista.add(valor);
System.out.println("¿Incluye una coordenada? 6(Para chio) 7(sigue  chio) ");
int seguir = escaner.nextInt();
escaner.nextLine();
if(seguir == 6){
pedido = false;
escaner.close();
}
}

String urlprincipal = "https://www.keene.edu/campus/maps/tool/?coordinates=";
String urlsecudario = "%2C%20";
String nuevaCoordenada = "%0A";
for(int unir = 0; lista.size() > unir; unir++){
if(unir==0){
urlprincipal = urlprincipal + lista.get(unir).lat + urlsecudario + lista.get(unir).lonj;
}
if(unir>0){
urlprincipal = urlprincipal + nuevaCoordenada + lista.get(unir).lat + urlsecudario + lista.get(unir).lonj;
}
}
System.out.println("\n!Ufff tenemos el link\n");
System.out.println(urlprincipal);
}
}
