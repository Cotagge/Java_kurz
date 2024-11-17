package course.part1;

public class Main {

    public static void main(String[] args) {
        Lecture lecture = new Lecture(" java base" , 17);

        Chapter chapter = new Chapter("Intro, ", lecture);
        chapter.printInfo();
    }
}
