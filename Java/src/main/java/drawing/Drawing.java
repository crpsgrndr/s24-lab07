package drawing;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

import drawing.shapes.Line;
import drawing.shapes.Shape;
import drawing.writing.JPEGWriter;
import drawing.writing.PNGWriter;

/**
 * Refactor Task 3: (Mis-)Shaped
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Drawing {

    private List<Shape> shapes;

    public Drawing(List<Shape> shapes) {
        this.shapes = shapes;
    }

    /**
     * Draw shapes to a file with given file format.
     *
     * @param format   file format
     * @param filename file name
     */
    public void draw(String format, String filename) {
        // TODO: Do you notice any issues here?
        if (format.equals("jpeg")) {
            try (Writer writer = new JPEGWriter(filename + ".jpeg")) {
                for (Shape shape : this.shapes) {
                    // TODO: What is the issue of the behavior here?
                    Line[] lines = shape.toLines();
                    shape.draw(writer, lines);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (format.equals("png")) {
            try (Writer writer = new PNGWriter(filename + ".png")) {
                for (Shape shape : this.shapes) {
                    Line[] lines = shape.toLines();
                    shape.draw(writer, lines);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

