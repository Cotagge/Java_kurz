package course.part1;

public class Chapter {

    private String title;
    private Lecture lecture;

    public Chapter(String title, Lecture lecture) {
        this.title = title;
        this.lecture = lecture;
    }

    public void printInfo() {
        System.out.println("chapter: " + title);
        lecture.printInfo();
}
}
