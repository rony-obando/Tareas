package Cgeom;
import java.util.Scanner;
public class App {
static Scanner lector=new Scanner(System.in);
	public static void main(String[] args) {
		double n,h,l,H,R,r1,g,Ap,L,a,b,c,r;
		int cnt=0;
		while(cnt<2){
		System.out.println("Seleccione la figura geometrica de su preferencia:");
		System.out.println("1=>Prisma");
		System.out.println("2=>Cilindro");
		System.out.println("3=>Piramide");
		System.out.println("4=>Cono");
		System.out.println("5=>Esfera");
		System.out.println("6=>Tronco de cono");
		System.out.println("7=>Tronco de piramide");
		System.out.println("8=>Esfera (cuña y huso)");
		System.out.println("9=>Tetraedro");
		System.out.println("10=>Hexaedro");
		System.out.println("11=>Octaedro");
		System.out.println("12=>Dodecaedro");
		System.out.println("13=>Icosaedro");
		System.out.println("14=>Ortoedro");
		System.out.println("Seleccione un numero");
		int resp=lector.nextInt();
		switch(resp) {
		case 1:
			System.out.println("Ingrese la altura del prisma");
			h=lector.nextDouble();
			System.out.println("Ingrese el numero de lados");
			n=lector.nextDouble();
			System.out.println("Ingrese la medida de los lados");
			l=lector.nextDouble();
			Prisma obj1=new Prisma(n,l,h);
			obj1.Al();
			System.out.println();
			obj1.At();
			System.out.println();
			obj1.V();
			System.out.println();
			break;
		case 2:
			System.out.println("Ingrese el radio de las bases");
			r=lector.nextDouble();
			System.out.println("Ingrese la altura del cilindro");
			h=lector.nextDouble();
			Cilindro obj=new Cilindro(r,h);
			obj.Al();
			System.out.println();
			obj.At();
			System.out.println();
			obj.V();
			System.out.println();
			break;
		case 3:
			System.out.println("Ingrese la altura de la piramide");
			h = lector.nextDouble();
			System.out.println("");
			System.out.println("Ingrese el numero de lados de la base");
			n = lector.nextDouble();
			System.out.println("");
			System.out.println("Ingrese la medida de los lados");
			l = lector.nextDouble();
			Piramide pir=new Piramide(n,l,h);
			pir.Al();
			pir.At();
			pir.V();
			break;
		case 4:
			System.out.println("Ingrese el radio de la base");
			r = lector.nextDouble();
			System.out.println("");
			System.out.println("Ingrese la altura del cono");
			h = lector.nextDouble();
			System.out.println("");
			Cono cono=new Cono(h,r);
			cono.Al();
			cono.At();
			cono.V();
			break;
		case 5:
			System.out.println("Ingrese el radio mayor");
			R = lector.nextDouble();
			System.out.println("");
			System.out.println("Ingrese la altura de la zona esferica");
			h = lector.nextDouble();
			System.out.println("");
			System.out.println("Ingrese la altura de el casquete esferico");
			H = lector.nextDouble();
			System.out.println("");
			System.out.println("Ingrese el radio menor");
			r = lector.nextDouble();
			System.out.println("");
			System.out.println("Ingrese el radio de la base de la zona esferica");
			r1 = lector.nextDouble();
			Esfera esf=new Esfera(h,r,R,H,r1);
			esf.Al();
			esf.V();
			esf.Vz();
			esf.Az();
			esf.Vcas();
			esf.Acas();
			break;
		case 6:
			System.out.println("Ingrese el radio mayor");
			R = lector.nextDouble();
			System.out.println("");
			System.out.println("Ingrese el radio menor");
			r = lector.nextDouble();
			System.out.println("");
			System.out.println("");
			System.out.println("Ingrese la generatirz");
			g = lector.nextDouble();
			System.out.println("");
			System.out.println("Ingrese la altura");
			h = lector.nextDouble();
			TdeCono tc=new TdeCono(h,r,R,g);
			tc.Al();
			tc.At();
			tc.V();
			break;
		case 7:
			System.out.println("Ingrese el apotema de la piramide");
			Ap = lector.nextDouble();
			System.out.println("");
			System.out.println("Ingrese el numero de lados de la figura");
			n = lector.nextDouble();
			System.out.println("");
			System.out.println("Ingrese la medida de los lados superiores");
			l = lector.nextDouble();
			System.out.println("");
			System.out.println("Ingrese la medida de los lados de la base");
			L = lector.nextDouble();
			TdePiramide tp=new TdePiramide(n,l,Ap,L);
			tp.Al();
			tp.At();
			tp.V();
			break;
		case 8:
			System.out.println("Ingrese el radio de la esfera");
			r = lector.nextDouble();
			System.out.println("");
			System.out.println("Ingrese el numero del grado");
			n= lector.nextDouble();
			Esfera2 esf2=new Esfera2(r,n);
			esf2.At();
			esf2.V();
			break;
		case 9:
			System.out.println("Ingrese la medida de las aristas");
			a = lector.nextDouble();
			Tetraedro tt=new Tetraedro(a);
			tt.At();
			tt.V();
			tt.H();
			break;
		case 10:
			System.out.println("Ingrese la medida de las aristas");
			a = lector.nextDouble();
			Hexaedro hx=new Hexaedro(a);
			hx.At();
			hx.V();
			hx.D();
			break;
		case 11:
			System.out.println("Ingrese la medida de las aristas");
			a = lector.nextDouble();
			Octaedro oct=new Octaedro(a);
			oct.At();
			oct.V();
			break;
		case 12:
			System.out.println("Ingrese la medida de las aristas");
			a = lector.nextDouble();
			Dodecaedro dode=new Dodecaedro(a);
			dode.At();
			dode.V();
			dode.Ap();
			break;
		case 13:
			System.out.println("Ingrese la medida de las aristas");
			a = lector.nextDouble();
			Icosaedro icos=new Icosaedro(a);
			icos.At();
			icos.V();
			break;
		case 14:
			System.out.println("Ingrese la medida de lo largo");
			a = lector.nextDouble();
			System.out.println("");
			System.out.println("Ingrese la medida de lo ancho");
			b = lector.nextDouble();
			System.out.println("");
			System.out.println("Ingrese la medida de la altura");
			c = lector.nextDouble();
			Ortoedro ort=new Ortoedro(a,b,c);
			ort.At();
			ort.V();
			ort.Do();
			break;
		}
		System.out.println("");
		 System.out.println("Desea seguir en el programa?");
		 System.out.println("1=>Si");
		 System.out.println("2=>No");
		 cnt=lector.nextInt();
		}
System.out.println("Adios!!");
}
}