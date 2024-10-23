import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Layer {

    private List<Shape> shapes = new LinkedList<>();

    /**
     * ht.
     * @param shape 1
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * ht.
     * @return
     */
    public String getInfo() {
        StringBuilder info = new StringBuilder("Layer of crazy shapes:\n");
        for (Shape shape : shapes) {
            info.append(shape.toString()).append("\n");
        }
        return info.toString();
    }

    /**
     * ht.
     */
    public void removeCircles() {
        shapes.removeIf(shape -> shape instanceof Circle);
    }

    /**
     * ht.
     */
    public void removeDuplicates() {
        Set<Shape> s = new LinkedHashSet<>();
        s.addAll(shapes);
        shapes.clear();
        shapes.addAll(s);
    }

    /**
     * ht.
     * @return
     */
    public List<Shape> getShapes() {
        return shapes;
    }

    /**
     * ht.
     * @param shapes 1
     */
    public void setShapes(List<Shape> shapes) {
        this.shapes = shapes;
    }
}
