package delta.polymorphism;

import delta.polymorphism.generator.Generate;
import delta.polymorphism.lesson.LessonManager;

public class Main {

    public static void main(String[] args) {
        LessonManager lessonManager = new LessonManager();
        Generate generate = new Generate();
        generate.generateLesson();
    }
}
