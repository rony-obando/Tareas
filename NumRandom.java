package tarea;
import java.util.Random;
import static java.lang.Math.*;
import java.util.Scanner;
public class NumRandom {
	static Scanner lector=new Scanner(System.in);
	public void mostrar(int ar[]) {
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
			if((i%200)==0&&i!=0) {
				System.out.println("");
			}
		}
	}
	public void Desendente(int A[]) {
		for(int i=0;i<A.length;i++) {
			int valor=A[i];
			int posicion=i;
			while((posicion>0)&&(A[posicion-1]<valor)) {
				A[posicion]=A[posicion-1];
				posicion=posicion-1;
			}
			A[posicion]=valor;
		}
	}
	public void ordenar(int A[]) {
		for(int i=0;i<A.length;i++) {
			int valor=A[i];
			int posicion=i;
			while((posicion>0)&&(A[posicion-1]>valor)) {
				A[posicion]=A[posicion-1];
				posicion=posicion-1;
			}
			A[posicion]=valor;
		}
	}
	public int busqueda(int A[],int n, int buscado) {
		int indice=0;
		while(indice<n) {
			if(A[indice]==buscado) {
				return indice;
			}
			indice=indice+1;
		}
		return -1;
	}
	/*public int busqueda(int A[],int buscado,int indiceiz,int indiceder) {
		if(indiceiz>indiceder) {
			return -1;
		}else {
			int indmedio=round((indiceiz+indiceder)/2);
			if(A[indmedio]==buscado) {
				return indmedio;
			}else if(A[indmedio]>buscado) {
				return busqueda(A,buscado,indiceiz,indmedio-1);
			}else if(A[indmedio]<buscado) {
				return busqueda(A,buscado,indmedio+1,indiceder);
			}
		}
		return -1;
		
	}
*/
	public static void main(String[] args) {
		
		int[] ar=new int[5000];
		Random n=new Random();
		for(int i=0;i<ar.length;i++) {
			int num=n.nextInt(101);
			ar[i]=num;
		}
		NumRandom obj=new NumRandom();
		System.out.println("Arreglo original: ");
		obj.mostrar(ar);
		obj.ordenar(ar);
		System.out.println("");
		System.out.println("");
		System.out.println("Arreglo ordenado de forma ascendente: ");
		obj.mostrar(ar);
		System.out.println("");
		System.out.println("");
		System.out.println("Arreglo ordenado de forma descendente: ");
		obj.Desendente(ar);
		obj.mostrar(ar);
		System.out.println("");
		System.out.println("");
		int a=0;
		while(a<=1) {
		System.out.println("Ingrese el numero que desea buscar");
		int b=lector.nextInt();
		int hallado=obj.busqueda(ar, ar.length, b);
		if(hallado!=-1) {
			System.out.println("El numero "+b+" fue encontrado en la posicion "+hallado);
		}else {
			System.out.println("El numero "+b+" no fue encontrado ;("+hallado);
		}
		a=lector.nextInt();
		}

	}

}
