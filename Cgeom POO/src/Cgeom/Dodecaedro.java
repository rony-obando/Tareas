package Cgeom;

public class Dodecaedro extends CuerposGeometricos{
	private double a;
	public Dodecaedro(double a) {
		this.a=a;
	}
	@Override
	public void At() {
		double d=Math.sqrt(25+10*Math.sqrt(5));
		double A=3*Math.pow(a,2)*d;
		A=Math.round(A);
		System.out.println("El area total es: "+A);
	}
	@Override
	public void V() {
		int q=1;
		int k=4;
		float l=(float) q/k;
		double V=l*(15+7*Math.sqrt(5))*Math.pow(a, 3);
		V=Math.round(V);
		System.out.println("El Volumen es: "+V);
	}
	public void Ap() {
		double y=Math.tanh(36);
		double ap=a/(2*y);
		int u=5;
		int g=2;
		float i=(float) u/g;
		double Ap=i*a*ap;
		Ap=Math.round(Ap);
		System.out.println("El area del pentagono es: "+Ap);	
	}
}
