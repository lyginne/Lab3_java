public class Mark{
	private float X;
	private float Y;
	public Mark(float X, float Y){

		this.X=X;
		this.Y=Y;
	}
	public float getX(){
		return X;
	}
	public float getY(){
		return Y;
	}
	
	public String toString() {
		return "X: " + X + ", Y: " + Y;
	}
}
