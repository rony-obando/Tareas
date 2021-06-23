package Cgeom;

public class TdeCono extends CuerposGeometricos{
	private double h;
	private double r;
	private double R;
	private double g;
	private double Al;
		public TdeCono(double h, double r,double R,double g) {
			this.g=g;
			this.R=R;
			this.h=h;
			this.r=r;
			
		}
		@Override
		public void Al() {
			double Al=Math.PI*g*(R+r);
			Al=Math.round(Al);
			this.Al=Al;
			System.out.println("El area lateral es: "+Al);
		}
		@Override
		public void At() {
			double Ab=Math.PI*Math.pow(R, 2);
			double Ab2=Math.PI*Math.pow(r, 2);
			double At=Al+Ab+Ab2;
			At=Math.round(At);
			System.out.println("El area total es: "+At);
		}
		@Override
		public void V() {
			int a=1;
			int s=3;
			float p=(float) a/s;
			double V=p*Math.PI*h*(Math.pow(R, 2)+Math.pow(r, 2)+R*r);
			V=Math.round(V);
			System.out.println("El Volumen es: "+V);
		}
}
