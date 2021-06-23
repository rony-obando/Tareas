package Cgeom;

public class Tetraedro extends CuerposGeometricos {
private double a;
public Tetraedro(double a) {
	this.a=a;
}
@Override
public void At() {
	double c=Math.sqrt(3);
	double A=Math.pow(a, 2)*c;
	A=Math.round(A);
	System.out.println("El area total es: "+A);
}
@Override
public void V() {
	double r=Math.sqrt(2);
	int s=12;
	float p=(float) r/s;
	double V=p*Math.pow(a, 3);
	V=Math.round(V);
	System.out.println("El Volumen es: "+V);
}
public void H() {
	double b=Math.sqrt(6);
	int j=3;
	float l=(float) b/j;
	double H=a*l;
	H=Math.round(H);
	System.out.println("H = "+H);
}
}
