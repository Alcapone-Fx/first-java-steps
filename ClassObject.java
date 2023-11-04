// A Java program to demonstrate working of a Class type object created by JVM
// to represent .class file in memory.
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassObject {
    public static void main(String[] args) {
        Student student = new Student();

        // Getting hold of Class object created by JVM.
        Class studentObjectRepresentation = student.getClass();

        // Printing type of object using studentObjectRepresentation.
        System.out.println("Name: " + studentObjectRepresentation.getName());

        // getting all methods in an array
        Method studentMethods[] = studentObjectRepresentation.getDeclaredMethods();
        for (Method method : studentMethods)
            System.out.println("Method: " + method.getName());

        // getting all fields in an array
        Field studentFields[] = studentObjectRepresentation.getDeclaredFields();
        for (Field field : studentFields)
            System.out.println("Field: " + field.getName());
    }
}

// A sample class whose information
// is fetched above using its Class object.
class Student {
    private String name;
    private int rollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}

