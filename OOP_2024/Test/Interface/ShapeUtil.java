import java.util.List;

public class ShapeUtil {

    /**
     * ht.
     * @param shapes 1
     * @return
     */
    public String printInfo(List<GeometricObject> shapes) {
        StringBuilder s = new StringBuilder();
        s.append("Circle:\n");
        for (GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
                s.append(shape.getInfo()).append("\n");
            }
        }
        s.append("Triangle:\n");
        for (GeometricObject shape : shapes) {
            if (shape instanceof Triangle) {
                s.append(shape.getInfo()).append("\n");
            }
        }
        return s.toString().trim();
    }
}
