package Trabajo;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TareaCurso {
	static Scanner lector=new Scanner(System.in);
	public static void main(String[] args) {
		Escritura obj= new Escritura();
		boolean b,a;int resp=0;int CC=0;int CV=0;int impc=0;int impv=0;int seg=0;int hallado=0;
		int fact=0;double Tfact=0;double TfactI=0;double impuestosC=0;double impuestosV=0;
		int  busq=0;double nb=0;int ord=0;
		System.out.println("Sistema automatico de inventario compras y ventas");
		do {
			System.out.println();
		System.out.println("Seleccione una opcion:");
		System.out.println("1. Administrar compras");
		System.out.println("2. Administrar ventas");
		System.out.println("3. Ambas");
		do{
		try {
			resp=lector.nextInt();
			a=false;
		if(resp>3||resp<=0){
			while(resp>3||resp<=0) {
			System.out.println("Respuesta incorrecta(R>3||R<0)");
			System.out.println("Ingrese nuevamente");
			do{
				try {
					b=false;
				resp=lector.nextInt();
			}catch(InputMismatchException ex) {
				lector.next();
				System.out.println("Ingrese una respuesta adecuada");
				b=true;
			}
		}while(b);
			}
		}
		}catch(InputMismatchException ex) {
			lector.next();
			System.out.println("Ingrese una respuesta adecuada");
			a=true;
		}
		}while(a);
		int num=0;
		if(resp==3) {
			num=resp;
			resp=1;
		}
		String unionIC[] = null;
		String unionC[] = null;
		String nomP[] = null;
		double precP[] = null;
		double total[] = null;
		String unionIV[] = null;
		String unionV[] = null;
		String nomPv[] = null;
		double precPv[] = null;
		double totalv[] = null;
	switch(resp) {
		case 1:
			System.out.println();
			System.out.println("Ingrese la cantidad de compras que ha realizado");
			do {
			try {
				a=false;
			CC=lector.nextInt();
			if(CC<=0){
				while(CC<=0) {
				System.out.println("Respuesta incorrecta(R<=0)");
				System.out.println("Ingrese nuevamente");
				do{
					try {
						b=false;
					CC=lector.nextInt();
				}catch(InputMismatchException ex) {
					lector.next();
					System.out.println("Ingrese una respuesta adecuada");
					b=true;
				}
			}while(b);
				}
			}
			}catch(InputMismatchException ex) {
				lector.next();
				System.out.println("Ingrese una respuesta adecuada");
				a=true;
			}
			}while(a);
			 unionIC=new String[CC];
			 unionC=new String[CC];
			 nomP=new String[CC];
			 precP=new double[CC];
			 total=new double[CC];
			 System.out.println();
			System.out.println("Se les aplicó impuestos a los productos comprados?");
			System.out.println("1. Si");
			System.out.println("2. No");
			do {
				try {
					a=false;
				impc=lector.nextInt();
				if(impc<=0||impc>2){
					while(impc>2||impc<=0) {
					System.out.println("Respuesta incorrecta(R>2||R<=0)");
					System.out.println("Ingrese nuevamente");
					do{
						try {
							b=false;
						impc=lector.nextInt();
					}catch(InputMismatchException ex) {
						lector.next();
						System.out.println("Ingrese una respuesta adecuada");
						b=true;
					}
				}while(b);
				}
				}
				}catch(InputMismatchException ex) {
					lector.next();
					System.out.println("Ingrese una respuesta adecuada");
					a=true;
				}
				}while(a);
			for(int i=0;i<CC;i++) {
				System.out.println("Ingrese el nombre del producto comprado No."+(i+1));
				nomP[i]=lector.next();
				System.out.println("Ingrese el precio del producto en cordobas");
				do {
					try {
						a=false;
					precP[i]=lector.nextDouble();
					if(precP[i]<=0){
						while(precP[i]<=0) {
						System.out.println("Respuesta incorrecta(R<=0)");
						System.out.println("Ingrese nuevamente");
						do{
							try {
								b=false;
							precP[i]=lector.nextDouble();
						}catch(InputMismatchException ex) {
							lector.next();
							System.out.println("Ingrese una respuesta adecuada");
							b=true;
						}
					}while(b);
					}
					}
					}catch(InputMismatchException ex) {
						lector.next();
						System.out.println("Ingrese una respuesta adecuada");
						a=true;
					}
					}while(a);
				if(impc==1) {
					impuestosC=impuestosC+((precP[i]*0.15)-(precP[i]*0.02));
					total[i]=((precP[i]*0.15)-(precP[i]*0.02))+precP[i];
				}
			}
			if(num==0) {
				System.out.println();
			System.out.println("Desea crear un archivo con estos datos?");
			System.out.println("1. Si");
			System.out.println("2. No");
			int arch=0;
			do {
				try {
					a=false;
					 arch=lector.nextInt();
				if(arch<=0||arch>2){
					while(arch>2||arch<=0) {
					System.out.println("Respuesta incorrecta(R<=0)");
					System.out.println("Ingrese nuevamente");
					do{
						try {
							b=false;
							arch=lector.nextInt();
					}catch(InputMismatchException ex) {
						lector.next();
						System.out.println("Ingrese una respuesta adecuada");
						b=true;
					}
				}while(b);
				}
				}
				}catch(InputMismatchException ex) {
					lector.next();
					System.out.println("Ingrese una respuesta adecuada");
					a=true;
				}
				}while(a);
			if(arch==1) {
				Escritura CA1=new Escritura();
				if(impc==1) {
					for(int i=0;i<unionIC.length;i++) {
						unionIC[i]=" "+nomP[i]+" = C$"+total[i];
						
					}
					CA1.escribirC(unionIC);
				}else {
					for(int i=0;i<unionIC.length;i++) {
						unionC[i]=" "+nomP[i]+" = C$"+precP[i];
						
					}
				CA1.escribirC(unionC);
				}
				System.out.println("Se ha creado el archivo: inventario de compras");
				System.out.println("Lo encontrará en la carpeta de este proyecto");
			}
			}
		
		if(num==0) {
			System.out.println();
			System.out.println("Desea hacer una busqueda entre los productos?");
			System.out.println("1. Si");
			System.out.println("2. No");
			do {
				try {
					a=false;
				busq=lector.nextInt();
				if(busq<=0||busq>2){
					while(busq>2||busq<=0) {
					System.out.println("Respuesta incorrecta(R<=0||R>2)");
					System.out.println("Ingrese nuevamente");
					do{
						try {
							b=false;
						busq=lector.nextInt();
					}catch(InputMismatchException ex) {
						lector.next();
						System.out.println("Ingrese una respuesta adecuada");
						b=true;
					}
				}while(b);
					}
				}
				}catch(InputMismatchException ex) {
					lector.next();
					System.out.println("Ingrese una respuesta adecuada");
					a=true;
				}
				}while(a);
			 nb=0;
			if(busq==1) {
				System.out.println("Ingrese el precio del producto que desea buscar");
				do {
					try {
						a=false;
					nb=lector.nextInt();
					if(nb<=0){
						while(nb<=0) {
						System.out.println("Respuesta incorrecta(R<=0||R>2)");
						System.out.println("Ingrese nuevamente");
						do{
							try {
								b=false;
							nb=lector.nextInt();
						}catch(InputMismatchException ex) {
							lector.next();
							System.out.println("Ingrese una respuesta adecuada");
							b=true;
						}
					}while(b);
						}
					}
					}catch(InputMismatchException ex) {
						lector.next();
						System.out.println("Ingrese una respuesta adecuada");
						a=true;
					}
					}while(a);

				 hallado= obj.busqueda(precP,precP.length, nb);
				if(hallado!=-1) {
					System.out.println("El precio de C$"+nb+" lo tiene el producto: "+nomP[hallado]);
				}else {
					System.out.println("El precio de C$"+nb+" no lo tiene ningún producto");
				}	
			}
			System.out.println();
			System.out.println("Desea ordenar las cuentas?");
			System.out.println("1. Si");
			System.out.println("2. No");
			 ord=0;
			do {
				try {
					a=false;
				ord=lector.nextInt();
				if(ord<=0||ord>2){
					while(ord>2||ord<=0) {
					System.out.println("Respuesta incorrecta(R<=0||R>2)");
					System.out.println("Ingrese nuevamente");
					do{
						try {
							b=false;
						ord=lector.nextInt();
					}catch(InputMismatchException ex) {
						lector.next();
						System.out.println("Ingrese una respuesta adecuada");
						b=true;
					}
				}while(b);
					}
				}
				}catch(InputMismatchException ex) {
					lector.next();
					System.out.println("Ingrese una respuesta adecuada");
					a=true;
				}
				}while(a);
			
			if(ord==1) {
				System.out.println("Cuentas de compras ordenadas:");
				obj.ordenar(precP, nomP);
				obj.mostrar(precP, nomP);
			}
			System.out.println();
			System.out.println("Desea imprimir una factura?");
			System.out.println("1. Si");
			System.out.println("2. No");
			do {
				try {
					a=false;
				fact=lector.nextInt();
				if(fact<=0||fact>2){
					while(fact>2||fact<=0) {
					System.out.println("Respuesta incorrecta(R>2||R<=0)");
					System.out.println("Ingrese nuevamente");
					do{
						try {
							b=false;
						fact=lector.nextInt();
					}catch(InputMismatchException ex) {
						lector.next();
						System.out.println("Ingrese una respuesta adecuada");
						b=true;
					}
				}while(b);
				}
				}
				}catch(InputMismatchException ex) {
					lector.next();
					System.out.println("Ingrese una respuesta adecuada");
					a=true;
				}
				}while(a);
			if(fact==1) {
				if(impc==1) {
				for(int i=0;i<CC;i++) {
					TfactI=TfactI+total[i];
					Tfact=Tfact+precP[i];
				}
				for(int i=0;i<CC;i++) {
					System.out.println(nomP[i]+" = C$"+precP[i]);
				}
				System.out.println("Sub-Total = C$"+Tfact);
				System.out.println("Impuestos = C$"+impuestosC);
				System.out.println("Total = C$"+TfactI);
				}else {
					for(int i=0;i<CC;i++) {
						Tfact=Tfact+precP[i];
					}
					for(int i=0;i<CC;i++) {
						System.out.println(nomP[i]+" = C$"+precP[i]);
					}
					System.out.println("Total = C$"+Tfact);
				}
			}
		break;
		}
		case 2:
			System.out.println();
			System.out.println("Ingrese la cantidad de productos que ha vendido");
			do {
			try {
				a=false;
			CV=lector.nextInt();
			if(CV<=0){
				while(CV<=0) {
				System.out.println("Respuesta incorrecta(R<=0)");
				System.out.println("Ingrese nuevamente");
				do{
					try {
						b=false;
					CV=lector.nextInt();
				}catch(InputMismatchException ex) {
					lector.next();
					System.out.println("Ingrese una respuesta adecuada");
					b=true;
				}
			}while(b);
			}
			}
			}catch(InputMismatchException ex) {
				lector.next();
				System.out.println("Ingrese una respuesta adecuada");
				a=true;
			}
			}while(a);
			 unionIV=new String[CV];
			 unionV=new String[CV];
			 nomPv=new String[CV];
			 precPv=new double[CV];
			 totalv=new double[CV];
			 System.out.println();
			System.out.println("Se les aplicó impuestos a los productos vendidos?");
			System.out.println("1. Si");
			System.out.println("2. No");
			do {
				try {
					a=false;
				impv=lector.nextInt();
				if(impv<=0||impv>2){
					while(impv>2||impv<=0) {
					System.out.println("Respuesta incorrecta(R>2||R<=0)");
					System.out.println("Ingrese nuevamente");
					do{
						try {
							b=false;
						impv=lector.nextInt();
					}catch(InputMismatchException ex) {
						lector.next();
						System.out.println("Ingrese una respuesta adecuada");
						b=true;
					}
				}while(b);
				}
				}
				}catch(InputMismatchException ex) {
					lector.next();
					System.out.println("Ingrese una respuesta adecuada");
					a=true;
				}
				}while(a);
			for(int i=0;i<CV;i++) {
				System.out.println("Ingrese el nombre del producto vendido No."+(i+1));
				nomPv[i]=lector.next();
				System.out.println("Ingrese el precio del producto en cordobas");
				do {
					try {
						a=false;
					precPv[i]=lector.nextDouble();
					if(precPv[i]<=0){
						while(precPv[i]<=0) {
						System.out.println("Respuesta incorrecta(R<=0)");
						System.out.println("Ingrese nuevamente");
						do{
							try {
								b=false;
							precPv[i]=lector.nextDouble();
						}catch(InputMismatchException ex) {
							lector.next();
							System.out.println("Ingrese una respuesta adecuada");
							b=true;
						}
					}while(b);
					}
					}
					}catch(InputMismatchException ex) {
						lector.next();
						System.out.println("Ingrese una respuesta adecuada");
						a=true;
					}
					}while(a);
				if(impv==1) {
					impuestosV=(impuestosV)+(precPv[i]*0.15)-(precPv[i]*0.02);
					totalv[i]=((precPv[i]*0.15)-(precPv[i]*0.02))+precPv[i];
				}
			}
			if(num==0) {
				System.out.println();
			System.out.println("Desea crear un archivo con estos datos?");
			System.out.println("1. Si");
			System.out.println("2. No");
			int arch=0;
			do {
				try {
					a=false;
					 arch=lector.nextInt();
				if(arch<=0||arch>2){
					while(arch>2||arch<=0) {
					System.out.println("Respuesta incorrecta(R<=0)");
					System.out.println("Ingrese nuevamente");
					do{
						try {
							b=false;
							arch=lector.nextInt();
					}catch(InputMismatchException ex) {
						lector.next();
						System.out.println("Ingrese una respuesta adecuada");
						b=true;
					}
				}while(b);
					}
				}
				}catch(InputMismatchException ex) {
					lector.next();
					System.out.println("Ingrese una respuesta adecuada");
					a=true;
				}
				}while(a);
			if(arch==1) {
				Escritura CA=new Escritura();
				if(impv==1) {
					for(int i=0;i<unionIV.length;i++) {
						unionIV[i]=" "+nomPv[i]+" = C$"+totalv[i];
						
					}
					CA.escribir(unionIV);
				}else {
					for(int i=0;i<unionV.length;i++) {
						unionV[i]=" "+nomPv[i]+" = C$"+precPv[i];
						
					}
				CA.escribir(unionV);
				}
				System.out.println("Se ha creado un archivo llamado: inventario de ventas");
				System.out.println("Lo encontrará en la carpeta de este proyecto");
			}
			}
			if(num==0) {
				System.out.println();
			System.out.println("Desea hacer una busqueda entre los productos?");
			System.out.println("1. Si");
			System.out.println("2. No");
			do {
				try {
					a=false;
				busq=lector.nextInt();
				if(busq<=0||busq>2){
					while(busq>2||busq<=0) {
					System.out.println("Respuesta incorrecta(R<=0||R>2)");
					System.out.println("Ingrese nuevamente");
					do{
						try {
							b=false;
						busq=lector.nextInt();
					}catch(InputMismatchException ex) {
						lector.next();
						System.out.println("Ingrese una respuesta adecuada");
						b=true;
					}
				}while(b);
					}
				}
				}catch(InputMismatchException ex) {
					lector.next();
					System.out.println("Ingrese una respuesta adecuada");
					a=true;
				}
				}while(a);
			 nb=0;
			if(busq==1) {
				System.out.println("Ingrese el precio del producto que desea buscar");
				do {
					try {
						a=false;
					nb=lector.nextInt();
					if(nb<=0){
						while(nb<=0) {
						System.out.println("Respuesta incorrecta(R<=0||R>2)");
						System.out.println("Ingrese nuevamente");
						do{
							try {
								b=false;
							nb=lector.nextInt();
						}catch(InputMismatchException ex) {
							lector.next();
							System.out.println("Ingrese una respuesta adecuada");
							b=true;
						}
					}while(b);
						}
					}
					}catch(InputMismatchException ex) {
						lector.next();
						System.out.println("Ingrese una respuesta adecuada");
						a=true;
					}
					}while(a);

				 hallado= obj.busqueda(precPv,precPv.length, nb);
				if(hallado!=-1) {
					System.out.println("El precio de C$"+nb+" lo tiene el producto: "+nomPv[hallado]);
				}else {
					System.out.println("El precio de C$"+nb+" no lo tiene ningún producto");
				}	
			}
			System.out.println();
			System.out.println("Desea ordenar las cuentas?");
			System.out.println("1. Si");
			System.out.println("2. No");
			 ord=0;
			do {
				try {
					a=false;
				ord=lector.nextInt();
				if(ord<=0||ord>2){
					while(ord>2||ord<=0) {
					System.out.println("Respuesta incorrecta(R<=0||R>2)");
					System.out.println("Ingrese nuevamente");
					do{
						try {
							b=false;
						ord=lector.nextInt();
					}catch(InputMismatchException ex) {
						lector.next();
						System.out.println("Ingrese una respuesta adecuada");
						b=true;
					}
				}while(b);
					}
				}
				}catch(InputMismatchException ex) {
					lector.next();
					System.out.println("Ingrese una respuesta adecuada");
					a=true;
				}
				}while(a);
			if(ord==1) {
				System.out.println("Cuentas de ventas ordenadas:");
				obj.ordenar(precPv, nomPv);
				obj.mostrar(precPv, nomPv);
			}
			}
			if(num==0) {
				System.out.println();
				System.out.println("Desea imprimir una factura?");
				System.out.println("1. Si");
				System.out.println("2. No");
				do {
					try {
						a=false;
					fact=lector.nextInt();
					if(fact<=0||fact>2){
						while(fact>2||fact<=0) {
						System.out.println("Respuesta incorrecta(R>2||R<=0)");
						System.out.println("Ingrese nuevamente");
						do{
							try {
								b=false;
							fact=lector.nextInt();
						}catch(InputMismatchException ex) {
							lector.next();
							System.out.println("Ingrese una respuesta adecuada");
							b=true;
						}
					}while(b);
					}
					}
					}catch(InputMismatchException ex) {
						lector.next();
						System.out.println("Ingrese una respuesta adecuada");
						a=true;
					}
					}while(a);
				if(fact==1) {
					if(impv==1) {
					for(int i=0;i<CV;i++) {
						TfactI=TfactI+totalv[i];
						Tfact=Tfact+precPv[i];
					}
					for(int i=0;i<CV;i++) {
						System.out.println(nomPv[i]+" = C$"+precPv[i]);
					}
					System.out.println("Sub-Total = C$"+Tfact);
					System.out.println("Impuestos = C$"+impuestosV);
					System.out.println("Total = C$"+TfactI);
					}else {
						for(int i=0;i<CV;i++) {
							Tfact=Tfact+precPv[i];
						}
						for(int i=0;i<CC;i++) {
							System.out.println(nomPv[i]+" = C$"+precPv[i]);
						}
						System.out.println("Total = C$"+Tfact);
					}
				}
		break;
			}
			System.out.println();
			System.out.println("Desea crear un archivo con estos datos?");
			System.out.println("1. Si");
			System.out.println("2. No");
			int arch=0;
			do {
				try {
					a=false;
					 arch=lector.nextInt();
				if(arch<=0||arch>2){
					while(arch>2||arch<=0) {
					System.out.println("Respuesta incorrecta(R<=0)");
					System.out.println("Ingrese nuevamente");
					do{
						try {
							b=false;
							arch=lector.nextInt();
					}catch(InputMismatchException ex) {
						lector.next();
						System.out.println("Ingrese una respuesta adecuada");
						b=true;
					}
				}while(b);
				}
				}
				}catch(InputMismatchException ex) {
					lector.next();
					System.out.println("Ingrese una respuesta adecuada");
					a=true;
				}
				}while(a);
			if(arch==1) {
				Escritura CA1=new Escritura();
				if(impc==1&&impv==1) {
					for(int i=0;i<unionIV.length;i++) {
						unionIV[i]=" (venta)"+nomPv[i]+" = C$"+totalv[i];	
					}
					for(int i=0;i<unionIC.length;i++) {
						unionIC[i]=" (Compra)"+nomP[i]+" = C$"+total[i];
					}
					CA1.escribirT(unionIC,unionIV);
				}else {
					if(impc==2&&impv==2) {
					for(int i=0;i<unionV.length;i++) {
						unionV[i]=" (venta)"+nomPv[i]+" = C$"+precPv[i];
						
					}
					for(int i=0;i<unionC.length;i++) {
						unionC[i]=" (Compra)"+nomP[i]+" = C$"+precP[i];
						
					}
				CA1.escribirT(unionC,unionV);
				}else {
					if(impc==1&&impv==2) {
						for(int i=0;i<unionV.length;i++) {
							unionV[i]=" (venta)"+nomPv[i]+" = C$"+precPv[i];
							
						}
						for(int i=0;i<unionC.length;i++) {
							unionC[i]=" (Compra)"+nomP[i]+" = C$"+total[i];
							
						}
						CA1.escribirT(unionC,unionV);
					}else {
						if(impc==2&&impv==1) {
						for(int i=0;i<unionV.length;i++) {
							unionV[i]=" (venta)"+nomPv[i]+" = C$"+totalv[i];
							
						}
						for(int i=0;i<unionC.length;i++) {
							unionC[i]=" (Compra)"+nomP[i]+" = C$"+precP[i];
							
						}
						CA1.escribirT(unionC,unionV);
					}
					}
				}
				}
				System.out.println("Se ha creado un archivo llamado: inventario de compras y ventas");
				System.out.println("Lo encontrará en la carpeta de este proyecto");
			}
			System.out.println();
			System.out.println("Desea hacer una busqueda entre los productos?");
			System.out.println("1. Si");
			System.out.println("2. No");
			do {
				try {
					a=false;
				busq=lector.nextInt();
				if(busq<=0||busq>2){
					while(busq>2||busq<=0) {
					System.out.println("Respuesta incorrecta(R<=0||R>2)");
					System.out.println("Ingrese nuevamente");
					do{
						try {
							b=false;
						busq=lector.nextInt();
					}catch(InputMismatchException ex) {
						lector.next();
						System.out.println("Ingrese una respuesta adecuada");
						b=true;
					}
				}while(b);
					}
				}
				}catch(InputMismatchException ex) {
					lector.next();
					System.out.println("Ingrese una respuesta adecuada");
					a=true;
				}
				}while(a);
			 nb=0;
			
			if(busq==1) {
				System.out.println("Eliga una opcion:");
				System.out.println("1. Buscar en compras");
				System.out.println("2. Buscar en ventas");
				int opc=0;
				do {
					try {
						a=false;
					opc=lector.nextInt();
					if(opc<=0||opc>2){
						while(opc>2||opc<=0) {
						System.out.println("Respuesta incorrecta(R<=0||R>2)");
						System.out.println("Ingrese nuevamente");
						do{
							try {
								b=false;
							opc=lector.nextInt();
						}catch(InputMismatchException ex) {
							lector.next();
							System.out.println("Ingrese una respuesta adecuada");
							b=true;
						}
					}while(b);
						}
					}
					}catch(InputMismatchException ex) {
						lector.next();
						System.out.println("Ingrese una respuesta adecuada");
						a=true;
					}
					}while(a);
				if(opc==1) {
				System.out.println("Ingrese el precio del producto que desea buscar");
				do {
					try {
						a=false;
					nb=lector.nextInt();
					if(nb<=0){
						while(nb<=0) {
						System.out.println("Respuesta incorrecta(R<=0||R>2)");
						System.out.println("Ingrese nuevamente");
						do{
							try {
								b=false;
							nb=lector.nextInt();
						}catch(InputMismatchException ex) {
							lector.next();
							System.out.println("Ingrese una respuesta adecuada");
							b=true;
						}
					}while(b);
						}
					}
					}catch(InputMismatchException ex) {
						lector.next();
						System.out.println("Ingrese una respuesta adecuada");
						a=true;
					}
					}while(a);

				 hallado= obj.busqueda(precP,precP.length, nb);
				if(hallado!=-1) {
					System.out.println("El precio de C$"+nb+" lo tiene el producto: "+nomP[hallado]);
				}else {
					System.out.println("El precio de C$"+nb+" no lo tiene ningún producto");
				}
				
				
				}else{
					System.out.println("Ingrese el precio del producto que desea buscar");
					do {
						try {
							a=false;
						nb=lector.nextDouble();
						if(nb<=0){
							while(nb<=0) {
							System.out.println("Respuesta incorrecta(R<=0||R>2)");
							System.out.println("Ingrese nuevamente");
							do{
								try {
									b=false;
								nb=lector.nextDouble();
							}catch(InputMismatchException ex) {
								lector.next();
								System.out.println("Ingrese una respuesta adecuada");
								b=true;
							}
						}while(b);
							}
						}
						}catch(InputMismatchException ex) {
							lector.next();
							System.out.println("Ingrese una respuesta adecuada");
							a=true;
						}
						}while(a);

					 hallado= obj.busqueda(precPv,precPv.length, nb);
					if(hallado!=-1) {
						System.out.println("El precio de C$"+nb+" lo tiene el producto: "+nomPv[hallado]);
					}else {
						System.out.println("El precio de C$"+nb+" no lo tiene ningún producto");
					}
				}
			}
			System.out.println();
			System.out.println("Desea ordenar las cuentas?");
			System.out.println("1. Si");
			System.out.println("2. No");
			ord=0;
			do {
				try {
					a=false;
				ord=lector.nextInt();
				if(ord<=0||ord>2){
					while(ord>2||ord<=0) {
					System.out.println("Respuesta incorrecta(R<=0||R>2)");
					System.out.println("Ingrese nuevamente");
					do{
						try {
							b=false;
						ord=lector.nextInt();
					}catch(InputMismatchException ex) {
						lector.next();
						System.out.println("Ingrese una respuesta adecuada");
						b=true;
					}
				}while(b);
					}
				}
				}catch(InputMismatchException ex) {
					lector.next();
					System.out.println("Ingrese una respuesta adecuada");
					a=true;
				}
				}while(a);
			if(ord==1) {
			System.out.println("Eliga una opcion:");
			System.out.println("1. Ordenar en compras");
			System.out.println("2. Ordenar en ventas");
			System.out.println("3. Ambas");
			int OPord=0;
			do {
				try {
					a=false;
				OPord=lector.nextInt();
				if(OPord<=0||OPord>3){
					while(OPord>3||OPord<=0) {
					System.out.println("Respuesta incorrecta(R<=0||R>3)");
					System.out.println("Ingrese nuevamente");
					do{
						try {
							b=false;
						OPord=lector.nextInt();
					}catch(InputMismatchException ex) {
						lector.next();
						System.out.println("Ingrese una respuesta adecuada");
						b=true;
					}
				}while(b);
					}
				}
				}catch(InputMismatchException ex) {
					lector.next();
					System.out.println("Ingrese una respuesta adecuada");
					a=true;
				}
				}while(a);
			int n=0;
			if(OPord==3) {
				n=OPord;
				OPord=1;
			}
			switch(OPord) {
			case 1:
				System.out.println("Cuentas de compras ordenadas:");
				obj.ordenar(precP, nomP);
				obj.mostrar(precP, nomP);
				if(n!=3) {
				break;
				}
			case 2:
				System.out.println("Cuentas de ventas ordenadas:");
				obj.ordenar(precPv, nomPv);
				obj.mostrar(precPv, nomPv);
				break;
			}
			System.out.println();
			System.out.println("Desea imprimir una factura con los datos?");
			System.out.println("1. Si");
			System.out.println("2. No");
			do {
				try {
					a=false;
				fact=lector.nextInt();
				if(fact<=0||fact>2){
					while(fact>2||fact<=0) {
					System.out.println("Respuesta incorrecta(R>2||R<=0)");
					System.out.println("Ingrese nuevamente");
					do{
						try {
							b=false;
						fact=lector.nextInt();
					}catch(InputMismatchException ex) {
						lector.next();
						System.out.println("Ingrese una respuesta adecuada");
						b=true;
					}
				}while(b);
				}
				}
				}catch(InputMismatchException ex) {
					lector.next();
					System.out.println("Ingrese una respuesta adecuada");
					a=true;
				}
				}while(a);
			if(fact==1) {
				System.out.println();
				System.out.println("COMPRAS!!");
				if(impc==1) {	
				for(int i=0;i<CC;i++) {
					TfactI=TfactI+total[i];
					Tfact=Tfact+precP[i];
				}
				for(int i=0;i<CC;i++) {
					System.out.println(nomP[i]+" = C$"+precP[i]);
				}
				System.out.println("Sub-Total = C$"+Tfact);
				System.out.println("Impuestos = C$"+impuestosC);
				System.out.println("Total = C$"+TfactI);
				}else {
					for(int i=0;i<CC;i++) {
						Tfact=Tfact+precP[i];
					}
					for(int i=0;i<CC;i++) {
						System.out.println(nomP[i]+" = C$"+precP[i]);
					}
					System.out.println("Total = C$"+Tfact);
				}
				System.out.println();
				System.out.println("VENTAS!!");
				if(impv==1) {
				for(int i=0;i<CV;i++) {
					TfactI=TfactI+totalv[i];
					Tfact=Tfact+precPv[i];
				}
				for(int i=0;i<CV;i++) {
					System.out.println(nomPv[i]+" = C$"+precPv[i]);
				}
				System.out.println("Sub-Total = C$"+Tfact);
				System.out.println("Impuestos = C$"+impuestosV);
				System.out.println("Total = C$"+TfactI);
				}else {
					for(int i=0;i<CV;i++) {
						Tfact=Tfact+precPv[i];
					}
					for(int i=0;i<CC;i++) {
						System.out.println(nomPv[i]+" = C$"+precPv[i]);
					}
					System.out.println("Total = C$"+Tfact);
				}
			}
			}
			break;
		}
	System.out.println();
		System.out.println("Desea reiniciar el programa?");
		System.out.println("1. Si");
		System.out.println("2. No");
		do {
			try {
				a=false;
			seg=lector.nextInt();
			if(seg<=0||seg>2){
				while(seg>2||seg<=0) {
				System.out.println("Respuesta incorrecta(R<=0||R>2)");
				System.out.println("Ingrese nuevamente");
				do{
					try {
						b=false;
					seg=lector.nextInt();
				}catch(InputMismatchException ex) {
					lector.next();
					System.out.println("Ingrese una respuesta adecuada");
					b=true;
				}
			}while(b);
				}
			}
			}catch(InputMismatchException ex) {
				lector.next();
				System.out.println("Ingrese una respuesta adecuada");
				a=true;
			}
			}while(a);
		}while(seg<2);
		System.out.println("Que tenga un bonito dia ;)");
		
		
}


}
