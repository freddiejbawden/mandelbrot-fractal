public class Client {
  public static void main(String args[]) {
    //makeFractal(double tlX, double tlY, double brX, int imageSize)
    double zoomLevel =  3;
    int iternumber = 255;
    for (int i = 0; i < 5; i++) {
      String fileName = "Image"+i+".ppm";
      Fractal.makeImage(-0.45543, 	-0.2,1000,zoomLevel,fileName,iternumber);
      zoomLevel = zoomLevel/10;
      iternumber += 100;
      }
    }
}
