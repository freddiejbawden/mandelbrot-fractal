import java.util.HashMap;
import java.io.*;
import java.lang.*;
public class Fractal {
  public static HashMap<Integer, RGBColour> makeFractal(double x, double y, int imageSize, double unitSize, int  iternumber) {

    HashMap<Integer, RGBColour> pixels = new HashMap<Integer, RGBColour>();
    //we need to know the topleft coordinate and the increment

    double y0 = y-(unitSize/2);
    double increment = unitSize/((double) imageSize);
    int count = 0;
    for (int i = 0; i < imageSize; i++) {
      y0 += increment;
      double x0 = x-(unitSize/2);
      for (int j = 0; j < imageSize; j++) {
        x0 += increment;
        int n = inSet(x0,y0,iternumber);

        pixels.put(count, RGBColour.getColour(n));
        count++;
      }
    }
    return pixels;
  }

  public static int inSet(double x0, double y0, int iternumber) {
    int n = 0;
    double mag = x0*x0 + y0*y0;
    double x = 0.0f;
    double y = 0.0f;
    while (mag < 4 && n < iternumber) {
      double tx = x*x - y*y + x0;
      y = 2*x*y + y0;
      x = tx;
      mag = x*x + y*y;
      n++;
    }
    return n;
  }
  public static void makeImage(double x, double y, int imageSize, double unitSize, String fileName, int iternumber) {
    HashMap<Integer, RGBColour> pixels = makeFractal(x,y, imageSize, unitSize, iternumber);
    try {
      PrintWriter p = new PrintWriter(fileName, "UTF-8");
      p.println("P3");
      p.println(imageSize + " " + imageSize);
      p.println("255");
      int count = 0;
      for (int i = 0; i < imageSize; i++) {
        for (int j = 0; j < imageSize; j++) {
          RGBColour pix = pixels.get(count);
          p.println(pix);
          count++;
        }
      }
      p.close();
      System.out.println(fileName + " created successfully!");

    } catch (IOException e) {
      System.out.println("IOException!");
    }

  }






}
