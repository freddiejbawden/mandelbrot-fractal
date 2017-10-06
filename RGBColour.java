
public class RGBColour {
	private int red;
	private int blue;
	private int green;

	public RGBColour(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	public RGBColour(int num) {
		this.red = num;
		this.green = num;
		this.blue = num;
	}

	public static RGBColour getColour(int n) {
		if (n <= 51) {
			//blue
			return new RGBColour(0,3*n,(255-3*n));
		} else if(n <= 153) {
			//green
			int newN = n - 51;
			return new RGBColour(255,((int) 1*5*newN),0);
		} else if (n <= 204) {
			//orange
			int newN = n - 153;
			return new RGBColour((255-3*newN),255,0);
		} else {
			int newN = n - 204;
			//red
			return new RGBColour(3*newN,0,0);
		}
	}

	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public int getBlue() {
		return blue;
	}

	public void setBlue(int blue) {
		this.blue = blue;
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int green) {
		this.green = green;
	}
	@Override
	public String toString() {
		String toReturn =  Integer.toString(red) + " " + Integer.toString(green);
		toReturn = toReturn + " " + Integer.toString(blue) + " ";
		return toReturn;
	}

}
