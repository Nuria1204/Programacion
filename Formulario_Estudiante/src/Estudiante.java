public class Estudiante {


    private String name;
    private String age;
    private String course;

    public Estudiante(String name, String age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Nombre: " + name +
                "\nEdad: " + age +
                "\nCurso: " + course;
        }
    }

