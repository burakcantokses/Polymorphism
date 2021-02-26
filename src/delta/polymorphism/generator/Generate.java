package delta.polymorphism.generator;

import delta.polymorphism.lesson.Lesson;
import delta.polymorphism.lesson.LessonManager;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Generate {
    public Random random = new Random();
    public LessonManager lessonManager = new LessonManager();
    public Scanner input = new Scanner(System.in);
    public int maxLessonOnDay, maxLesson;
    /*
    LESSON DATA
     */
    public String[] minLessonHoursOnDay = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""
            , "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    public String[] maxLessonHoursOnDay = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""
            , "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    public String[] lessonNames = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""
            , "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
    public String[] lessonTopHoursOnWeek = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""
            , "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};

//    public void defaultSettings() {
//        System.out.println("Sistem Tarafından Otomatik Olarak Oluşturulan Dersler Ve Ders Saatleri;");
//        for (Lesson lesson : lessonManager.lessons) {
//            System.out.println("Ders Adı: " + lesson.grade10[lesson.lessonId] + "\n" +
//                    "Dersin Numarası: " + lesson.lessonId + "\n" +
//                    "Dersin Günde Maksimum Kaç Kere Olduğu: " + lesson.lessonHour + "\n" +
//                    "Dersin Haftata Maksiumum Kaç Kere Olduğu: " + lesson.lessonHourOnWeek);
//            System.out.println("\n");
//        }
//    }

//    public void generateDay() {
//        System.out.println("Lütfen Günde Maksimum Kaç Saat Ders Olduğunu Yazın.");
//        int maxLesson = Integer.parseInt(input.nextLine());
//        int randomNumber = -1;
//        int randomDay = random.nextInt(days.length);
//        int counter = 0;
//        int lessonCounter = 0;
//        int counter2Lesson = 0; // 2 hour lessons
//        String lessonString = "";
//        String[] lessonList = {"", "", "", "", "", "", "", "", "", "", "", "", "", "",};
//        boolean flag = false; // select random lesson
//        boolean flag2 = false;
//        boolean flag3 = false;
//        for (int i = 0; i <= maxLesson; i++) {
//            randomNumber = random.nextInt(lessonManager.lessons.size());
//            Lesson lesson = lessonManager.lessons.get(randomNumber);
//
//            for (int j = 0; j <= i; j++) {
//                if (lessonList[j].equals(lesson.grade10[lesson.lessonId])) {
//                    flag2 = true;
//                } else {
//                    flag2 = false;
//                }
//            }
//
//            if (!flag2) {
//                if (lesson.lessonHour == 2 && lesson.lessonHourOnWeek == 2) {
//                    if (maxLesson - lessonCounter >= lesson.getLessonHour()) {
//                        flag = true;
//                        if (lesson.lessonHourOnWeek > 1) {
//                            for (int j = 0; j < lesson.lessonHour; j++) {
//                                lessonCounter = lessonCounter + 1;
//                                System.out.println(lessonCounter + ". Ders: " + lesson.grade10[lesson.lessonId] + " 1. kısımdan oluştu.");
//                            }
//                            counter2Lesson = counter2Lesson + 1;
//                            lessonList[i] = lesson.grade10[lesson.lessonId];
//                            lesson.setLessonHourOnWeek(lesson.getLessonHourOnWeek() - lesson.getLessonHour());
//                            counter = counter + lesson.lessonHour;
//                        } else {
//                            i = i - 1;
//                        }
//                    } else {
//                        i = i - 1;
//                    }
//                } else if (lesson.lessonHour == 5) {
//                    flag3 = true;
//                    if (!flag && !flag3 && counter2Lesson != 0) {
//                        if (lessonCounter == 0 || counter == 0) {
//                            if (lesson.lessonHourOnWeek == 5) {
//                                flag = true;
//                                if ((maxLesson - lessonCounter) >= 5) {
//                                    for (int j = 0; j < lesson.lessonHour; j++) {
//                                        lessonCounter = lessonCounter + 1;
//                                        System.out.println(lessonCounter + ". Ders: " + lesson.grade10[lesson.lessonId] + " 3. kısımdan oluştu.");
//                                    }
//                                    lessonList[i] = lesson.grade10[lesson.lessonId];
//                                } else {
//                                    i = i - 1;
//                                }
//                                lesson.setLessonHourOnWeek(lesson.getLessonHourOnWeek() - lesson.getLessonHour());
//                                counter = counter + lesson.lessonHour;
//                            } else {
//                                lesson.setLessonHourOnWeek(lesson.getLessonHourOnWeek() + lesson.getLessonHour());
//                                i = i - 1;
//                            }
//                        } else {
//                            i = i - 1;
//                        }
//                    } else {
//                        i = i - 1;
//                    }
//                } else if (lesson.lessonHour == 2 && lesson.lessonHourOnWeek == 5) {
//                    if (lesson.lessonHourOnWeek > 1) {
//                        if (!(flag && (lesson.lessonId == 1 || lesson.lessonId == 2))) {
//                            flag = true;
//                            for (int j = 0; j < lesson.lessonHour; j++) {
//                                lessonCounter = lessonCounter + 1;
//                                System.out.println(lessonCounter + ". Ders: " + lesson.grade10[lesson.lessonId] + " 2. kısımdan oluştu.");
//                            }
//                            counter2Lesson = counter2Lesson + 1;
//                            lessonList[i] = lesson.grade10[lesson.lessonId];
//                        } else {
//                            lesson.setLessonHour(3);
//                            for (int j = 0; j < lesson.lessonHour + 1; j++) {
//                                lessonCounter = lessonCounter + 1;
//                                System.out.println(lessonCounter + ". Ders: " + lesson.grade10[lesson.lessonId] + " 2. kısımdan oluştu.");
//                            }
//                            counter2Lesson = counter2Lesson + 1;
//                            lessonList[i] = lesson.grade10[lesson.lessonId];
//                        }
//                        lesson.setLessonHourOnWeek(lesson.getLessonHourOnWeek() - lesson.getLessonHour());
//                        counter = counter + lesson.lessonHour;
//                    } else {
//                        i = i - 1;
//                    }
//                } else {
//                    System.out.println("Algoritma Açığı Lütfen Yapımcıya Bildir.");
//                }
//            }
//            if (counter > maxLesson) {
//                System.out.println("HATALI OLUŞTURMA TEKRAR DENENİYOR!");
//                for (int j = 0; j < 100; j++) {
//                    System.out.println("");
//                }
//                i = 1;
//                counter = 0;
//                lessonCounter = 0;
//            }
//            if (lessonCounter > maxLesson) {
//                System.out.println("HATALI OLUŞTURMA TEKRAR DENENİYOR!");
//                for (int j = 0; j < 100; j++) {
//                    System.out.println("");
//                }
//                i = 1;
//                counter = 0;
//                lessonCounter = 0;
//            }
//            if (counter >= maxLesson) {
//                break;
//            }
//        }
//    }
//
//    public void generateProgram() {
//        int debug = 0;
//        //for (Lesson lesson : new LessonManager().lessons) {
//        //    System.out.println(lesson.lessonName+ " [" + lesson.lessonHourOnWeek + "]");
//        //    lessonHours[debug] = ""+lesson.lessonHour;
//        //    lessonNames[debug] = lesson.lessonName;
//        //    lessonTopHours[debug] = ""+lesson.lessonHourOnWeek;
//        //    debug = debug +1;
//        //}
//        System.out.println("Günde Maksimum Kaç Ders Olsun?");
//        maxLessonOnDay = Integer.parseInt(input.nextLine());
//        int totalLesson = maxLessonOnDay;
//        String[] lessonList = {"", "", "", "", "", "", "", "", "", "", "", ""};
//        boolean flag = false;
//        boolean flag2 = false;
//        boolean flag3 = false;
//        for (int i = 0; i < days.length; i++) {
//            System.out.println(days[i] + " ;");
//            dayCounter[i] = dayCounter[i] + 1;
//            for (int j = 0; j <= maxLessonOnDay; j++) {
//                Lesson lesson = lessonManager.lessons.get(random.nextInt(lessonManager.lessons.size()));
//
//                //   if (maxLessonOnDay - lessonCounter[i] > 2) {
//                //           while (lesson.lessonHourOnWeek < 2 || lesson.lessonHourOnWeek<lesson.lessonHour) {
//                //               lesson = lessonManager.lessons.get(random.nextInt(lessonManager.lessons.size()));
//                //           }
//                for (int l = 0; l <= j; l++) {
//                    if (lessonList[l].equals(lesson.lessonName)) {
//                        flag3 = true;
//                    } else {
//                        flag3 = false;
//                    }
//                }
//                if (lesson.lessonId == 1 || lesson.lessonId == 2 && !flag3) {
//                    if (lesson.getLessonHourOnWeek() >= 2) {
//                        if (lesson.getLessonHourOnWeek() == 5) {
//                            lesson.setLessonHourOnWeek(lesson.getLessonHourOnWeek() - 3);
//                            for (int k = 0; k < lesson.getLessonHour(); k++) {
//                                lessonCounter[i] = lessonCounter[i] + 1;
//                                System.out.println(lessonCounter[i] + ". Ders: " + lesson.lessonName + " [" + lesson.lessonHourOnWeek + "]");
//                            }
//                            lessonList[j] = lesson.lessonName;
//                        } else if (lesson.getLessonHourOnWeek() == 2) {
//                            lesson.setLessonHourOnWeek(lesson.getLessonHourOnWeek() - 2);
//                            for (int k = 0; k < lesson.getLessonHour() - 1; k++) {
//                                lessonCounter[i] = lessonCounter[i] + 1;
//                                System.out.println(lessonCounter[i] + ". Ders: " + lesson.lessonName + " [" + lesson.lessonHourOnWeek + "]");
//                            }
//                            lessonList[j] = lesson.lessonName;
//                        } else {
//                            j = j - 1;
//                        }
//                    }
//                } else if (lesson.lessonId == 11 || lesson.lessonId == 5) {
//                    if (maxLessonOnDay - lessonCounter[i] >= 5) {
//                        if (lesson.getLessonHourOnWeek() == 5 && (lessonCounter[i] == 3 || lessonCounter[i] == 0) && !flag2) {
//                            lesson.setLessonHourOnWeek(lesson.getLessonHourOnWeek() - 5);
//                            for (int k = 0; k < lesson.getLessonHour(); k++) {
//                                lessonCounter[i] = lessonCounter[i] + 1;
//                                System.out.println(lessonCounter[i] + ". Ders: " + lesson.lessonName + " [" + lesson.lessonHourOnWeek + "]");
//                            }
//                            lessonList[j] = lesson.lessonName;
//                            flag = true;
//                        } else {
//                            j = j - 1;
//                        }
//                    } else {
//                        j = j - 1;
//                    }
//                } else /*(lesson.getLessonHourOnWeek() == 2 && lesson.getLessonHour() == 2)*/ {
//                    if (maxLessonOnDay - lessonCounter[i] >= 2 && !flag) {
//                        if (lesson.lessonHourOnWeek >= lesson.lessonHour) {
//                            lesson.setLessonHourOnWeek(lesson.getLessonHourOnWeek() - 2);
//                            for (int k = 0; k < lesson.getLessonHour(); k++) {
//                                lessonCounter[i] = lessonCounter[i] + 1;
//                                System.out.println(lessonCounter[i] + ". Ders: " + lesson.lessonName + " [" + lesson.lessonHourOnWeek + "]");
//                            }
//                            lessonList[j] = lesson.lessonName;
//                            flag2 = true;
//                        } else {
//                            j = j - 1;
//                        }
//                    } else {
//                        j = j - 1;
//                    }
//                }
//            }
//        }
//        for (int j = 0; j < lessonList.length; j++) {
//            lessonList[j] = "";
//        }
//        flag = false;
//        flag2 = false;
//    }

    public void generateLesson() {
        // flag == lesson register checksum
        // flag2 == lesson min hour on day checksum
        // flag3 == lesson min hour on day checksum
        // flag4 == lesson hour on week checksum
        boolean flag=false, flag2 = false;
        String access = "", access2 = "";

        System.out.println("============== Ders Kayıt Sistemi ==============");
        System.out.print("Toplam Kaç Tane Ders Var?: ");
        maxLesson = Integer.parseInt(input.nextLine());
        while(maxLesson > 40 || maxLesson<1) {
            if (maxLesson>40) {
                System.out.print("En Fazla 40 Ders Girişi Yapılır!");
            }else {
                System.out.println("En  Az 1 Ders Girişi Yapılır!");
            }
            System.out.print("Toplam Kaç Tane Ders Var?: ");
            maxLesson = Integer.parseInt(input.nextLine());
        }
        while(!flag) {
            access = "";
            for (int i = 0; i < maxLesson; i++) {
                System.out.print(i + 1 + ". Dersin Adını Girin: ");
                lessonNames[i] = input.nextLine();
            }

            for (int i = 0; i < lessonNames.length; i++) {
                if (!lessonNames[i].equalsIgnoreCase("")) {
                    System.out.println("\t"+(i + 1) + ". Ders: " + lessonNames[i]);
                }
            }

            while(!(access.equalsIgnoreCase("Y") || access.equalsIgnoreCase("N"))) {
                System.out.println("Bilgiler Doğru Mu? [Y/N]");
                access = input.nextLine();
                if (access.equalsIgnoreCase("Y")) {
                    System.out.println("Sonraki Adıma Geçiyorsun.");
                    flag = true;
                }else if (access.equalsIgnoreCase("N")) {
                    System.out.println("Önceki Adımlara Yönlendiriliyorsun.");
                    flag = false;
                }else {
                    System.out.println("Lütfen Doğru Tuşlama Yapın!");
                }
            }
        }
        System.out.println("\n\n============== Ders Saatleri Kayıt Sistemi ==============");
        while(!flag2) {
            access2 = "";
            for (int i = 0; i < maxLesson; i++) {
                System.out.print(lessonNames[i] + " Dersi Günde En Az Kaç Saat Olabilir: ");
                minLessonHoursOnDay[i] = input.nextLine();
            }
            for (int i = 0; i < maxLesson; i++) {
                System.out.print(lessonNames[i] + " Dersi Günde En Fazla Kaç Saat Olabilir: ");
                maxLessonHoursOnDay[i] = input.nextLine();
            }
            for (int i = 0; i < maxLesson; i++) {
                System.out.print(lessonNames[i] + " Dersi Haftada Kaç Saat Olabilir: ");
                lessonTopHoursOnWeek[i] = input.nextLine();
            }
            System.out.println("Örnek: 1. Ders: Matematik [Günde En Az Kaç Kere] [Günde En Fazla Kaç Kere");
            for (int i = 0; i < maxLesson; i++) {
                System.out.println("\t" + (i+1) + ". Ders: " + lessonNames[i] + "; \n" +
                        "Günde En Az " + minLessonHoursOnDay[i] + " Kere\n" +
                        "Günde En Fazla " + maxLessonHoursOnDay[i] + " Kere\n" +
                        "Haftada " + lessonTopHoursOnWeek[i] + " Kere Olacaktır.");
                System.out.println("");
            }
            while(!(access2.equalsIgnoreCase("Y") || access2.equalsIgnoreCase("N"))) {
                System.out.println("Bilgiler Doğru Mu? [Y/N]");
                access2 = input.nextLine();
                if (access2.equalsIgnoreCase("Y")) {
                    System.out.println("Sonraki Adıma Geçiyorsun.");
                    flag2 = true;
                }else if (access2.equalsIgnoreCase("N")) {
                    System.out.println("Önceki Adımlara Yönlendiriliyorsun.");
                    flag2 = false;
                }else {
                    System.out.println("Lütfen Doğru Tuşlama Yapın!");
                }
            }
        }
    }
}


