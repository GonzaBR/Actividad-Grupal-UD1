package Model;

public class SumaModelo {

	private int a;
	private int b;
	private int c;
	
	//Constructor
	public SumaModelo(int a,int b) {
		this.a=a;
		this.b=b;

	}
	
    //Metodo
	public int sumarN() {
		return a + b;

	}

	public void setC(int c){
		this.c = sumarN();
	
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}
