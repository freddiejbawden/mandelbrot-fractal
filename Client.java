public class Client {
  public static void main(String args[]) {
    //makeFractal(double tlX, double tlY, double brX, int imageSize)
    double zoomLevel = 3;
    int iternumber = 100;
    for (int i = 0; i < 10; i++) {
      String fileName = "Test"+i+".ppm";
      Fractal.makeImage(-1.45,0,1000,zoomLevel,fileName,iternumber);
      zoomLevel = zoomLevel/10;
      iternumber += 100;
    }
  }
}
