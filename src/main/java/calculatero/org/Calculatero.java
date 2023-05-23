package calculatero.org;

public class Calculatero {
	private float x;
	private float y;
	
	public Calculatero(float x,float y) {
		setX(x);
		setY(y);
	}
	
	//getter and setter
	
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	//my methods for sum etc
	
	public float add(float x, float y) {
		return x + y;
	}
	
	public float sub(float x, float y) {
		return x - y;
	}
	
	public float mult(float x, float y) {
		return x * y;
	}
	
	public float div(float x, float y) {
		return x / y;
	}
	
}
