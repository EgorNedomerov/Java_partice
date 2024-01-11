package src.src.ru.itmo.java.basics.lesson3;

public class Study {
    private String course;
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    @Override
    public String toString() {
        return "Study{" +
                "course='" + course + '\'' +
                '}';
    }
    public Study (String course) {
        this.course = course;
    }
        public String printCourse () {
        return this.course;
        }
}
class Javaprogram {
    public static void  main (String [] args) {
    }
}