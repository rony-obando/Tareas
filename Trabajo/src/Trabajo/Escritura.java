package Trabajo;
import java.io.FileWriter;
import java.io.IOException;
public class Escritura {
	public void escribirT(String A[],String B[]) {
		try {
			FileWriter escritura=new FileWriter("C:Inventario de compras y ventas.txt");
			for(int i=0;i<A.length;i++) {
				for(int l=0;l<A[i].length();l++) {
				escritura.write(A[i].charAt(l));

				}
				for(int l=0;l<B[i].length();l++) {
					escritura.write(B[i].charAt(l));

					}
			}
			escritura.close();
		} catch (IOException ex) {
			System.out.println("No se ha encontrado");
			System.out.println("Se creo un archivo llamado: Inventario de compras y ventas.txt");
		}
		}
	public void escribir(String A[]) {
		
		try {
			FileWriter escritura=new FileWriter("inventario de ventas.txt");
			for(int i=0;i<A.length;i++) {
				for(int l=0;l<A[i].length();l++) {
				escritura.write(A[i].charAt(l));
				}
			}
			escritura.close();
		} catch (IOException ex) {
			System.out.println("No se ha encontrado");
			System.out.println("Se creo un archivo llamado: Inventario de ventas.txt");
		}
	}
	public void escribirC(String A[]) {
		
		try {
			FileWriter escritura=new FileWriter("inventario de compras.txt");
			for(int i=0;i<A.length;i++) {
				for(int l=0;l<A[i].length();l++) {
				escritura.write(A[i].charAt(l));
				}
			}
			escritura.close();
		} catch (IOException ex) {
			System.out.println("No se ha encontrado");
			System.out.println("Se creo un archivo llamado: Inventario de compras.txt");
		}
	}
	public int busqueda(double A[],double n, double buscado) {
		int indice=0;
		while(indice<n) {
			if(A[indice]==buscado) {
				return indice;
			}
			indice=indice+1;
		}
		return -1;
	}
	public void ordenar(double A[],String B[]) {
		for(int i=0;i<A.length;i++) {
			double valor=A[i];
			int posicion=i;
			while((posicion>0)&&(A[posicion-1]>valor)) {
				A[posicion]=A[posicion-1];
				B[posicion]=B[posicion-1];
				posicion=posicion-1;
			}
			A[posicion]=valor;
		}
	}
	public void mostrar(double ar[],String B[]) {
		for(int i=0;i<B.length;i++) {
			System.out.println(B[i]+" = C$"+ar[i]);
		}
	}
}
