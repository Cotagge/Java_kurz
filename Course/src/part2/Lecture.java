package course.part1;

public class Lecture {

    private String title;
    private int duration;

    public Lecture(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public void printInfo() {
        System.out.println(" lecture: " + this.title + " ( " this.duration ")" );
    }
}
