import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Week8Task2 {

    public void nullPointerEx() {
        String str = null;
        str.length();  // This will cause a NullPointerException
    }

    /**
     * ht.
     * @return
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
        return "No error";
    }

    /**
     * ht.
     */
    public void arrayIndexOutOfBoundsEx() {
        int[] arr = new int[5];
        int num = arr[10];  // This will cause an ArrayIndexOutOfBoundsException
    }

    /**
     * ht.
     * @return
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
        return "No error";
    }

    /**
     * ht.
     */
    public void arithmeticEx() {
        int result = 10 / 0;  // This will cause an ArithmeticException (division by zero)
    }

    /**
     * ht.
     * @return
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
        return "No error";
    }

    /**
     * ht.
     */
    public void fileNotFoundEx() throws FileNotFoundException {
        File file = new File("nonexistentfile.txt");
        if (!file.exists()) {
            throw new FileNotFoundException("File not found!");
        }
    }

    /**
     * ht.
     * @return
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
        return "No error";
    }

    /**
     * ht.
     */
    public void ioEx() throws IOException {
        throw new IOException("IO Exception occurred");
    }

    /**
     * ht.
     * @return
     */
    public String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            return "Lỗi IO";
        }
        return "No error";
    }

    /**
     * main.
     * @param args thai
     */
    public static void main(String[] args) {
        Week8Task2 task = new Week8Task2();

        System.out.println(task.nullPointerExTest());
        System.out.println(task.arrayIndexOutOfBoundsExTest());
        System.out.println(task.arithmeticExTest());
        System.out.println(task.fileNotFoundExTest());
        System.out.println(task.ioExTest());
    }
}

