package delta.polymorphism.generator;

import delta.polymorphism.lesson.Lesson;
import delta.polymorphism.lesson.LessonManager;

import java.util.Random;
import java.util.Scanner;

public class Generate {
    public Random random = new Random();
    public LessonManager lessonManager = new LessonManager();
    public Scanner input = new Scanner(System.in);
    public String[] days = {"PAZARTESI", "SALI", "CARSAMBA", "PERSEMBE", "CUMA"};

    public void defaultSettings() {
        System.out.println("Sistem Tarafından Otomatik Olarak Oluşturulan Dersler Ve Ders Saatleri;");
        for(Lesson lesson : lessonManager.lessons) {
            System.out.println("Ders Adı: " + lesson.grade10[lesson.lessonId] + "\n" +
                    "Dersin Numarası: " + lesson.lessonId + "\n" +
                    "Dersin Günde Maksimum Kaç Kere Olduğu: " + lesson.lessonHour + "\n" +
                    "Dersin Haftata Maksiumum Kaç Kere Olduğu: " + lesson.lessonHourOnWeek);
            System.out.println("\n");
        }
    }

    public void generateDay() {
        System.out.println("Lütfen Günde Maksimum Kaç Saat Ders Olduğunu Yazın.");
        int maxLesson = Integer.parseInt(input.nextLine());
        int randomNumber = -1;
        int randomDay = random.nextInt(days.length);
        int counter = 0;
        int lessonCounter = 0;
        String lessonString = "";
        boolean flag = false; // select random lesson
        boolean flag2 = false;
        for (int i = 1; i < maxLesson; i++) {
            randomNumber = random.nextInt(lessonManager.lessons.size());
            Lesson lesson = lessonManager.lessons.get(randomNumber);
            if(lesson.lessonHour == 2) {
                for (int j = 0; j < lesson.lessonHour; j++) {
                    lessonCounter = lessonCounter+1;
                    System.out.println(lessonCounter + ". Ders: " + lesson.grade10[lesson.lessonId]);
                }
                counter = counter + lesson.lessonHour;

            }else if (lesson.lessonHour > 2 && lesson.lessonHour<=5 && lesson.lessonHourOnWeek == 5) {
                for (int j = 0; j <= lesson.lessonHour; j++) {
                    lessonCounter = lessonCounter+1;
                    System.out.println(lessonCounter + ". Ders: " + lesson.grade10[lesson.lessonId]);
                }
                counter = counter + lesson.lessonHour;
            }else if (lesson.lessonHour == 5) {
                for (int j = 0; j < lesson.lessonHour; j++) {
                    lessonCounter = lessonCounter+1;
                    System.out.println(lessonCounter + ". Ders: " + lesson.grade10[lesson.lessonId]);
                }
                counter = counter + lesson.lessonHour;
            }else {
                System.out.println("Algoritma Açığı Lütfen Yapımcıya Bildir.");
            }
            if (counter>=maxLesson) {
                break;
            }
        }
    }
}
