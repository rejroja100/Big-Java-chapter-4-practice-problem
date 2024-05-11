import java.io.DataOutput;

public class SizePaper {

    //constants
    static final double INCH_TO_MM = 25.4;
    static final double WIDTH_INCHES = 8.5;
    static final double HEIGHT_INCHES = 11;

    public static void main(String[] args) {

        // convert inch to MM.
        double Width_MM = INCH_TO_MM * WIDTH_INCHES;
        double Height_MM = INCH_TO_MM * HEIGHT_INCHES;

        // calculate perimeter in mm
        double  Perimeter_MM = 2 * (Width_MM + HEIGHT_INCHES);

        //calculate the name of the diagonal.
        double Diagonal_MM = Math.sqrt(Math.pow(Height_MM, 2) + Math.pow(Width_MM, 2));
        System.out.println("width" + Width_MM + " mm");
        System.out.println("height" + Height_MM + " mm");
        System.out.println("perimeter" + Perimeter_MM + " mm");
        System.out.println("diagonal" + Diagonal_MM + " mm");
    }
}
