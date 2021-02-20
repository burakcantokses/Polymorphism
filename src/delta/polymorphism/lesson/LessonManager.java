package delta.polymorphism.lesson;

import delta.polymorphism.lesson.lessons.*;

import java.util.ArrayList;
import java.util.List;

public class LessonManager {
    public List<Lesson> lessons = new ArrayList<>();

    public LessonManager() {
        lessons.add(new Matematik());
        lessons.add(new Cografya());
        lessons.add(new Edebiyat());
        lessons.add(new Kimya());
        lessons.add(new Beden());
        lessons.add(new Biyoloji());
        lessons.add(new BTR());
        lessons.add(new BTT());
        lessons.add(new Din());
        lessons.add(new Felsefe());
        lessons.add(new Fizik());
        lessons.add(new Ingilizce());
        lessons.add(new Ofis());
        lessons.add(new PRT());
        lessons.add(new Tarih());
    }
}
