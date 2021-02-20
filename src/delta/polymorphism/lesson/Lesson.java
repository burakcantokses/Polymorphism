package delta.polymorphism.lesson;

public class Lesson {
    public int lessonHour; // on day
    public int lessonId;
    public int lessonHourOnWeek; // on week
    public byte[] grade = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    public String[] grade10 = {"Kimya", "Edebiyat", "Matematik", "Coğrafya", "BTR", "BTT", "Fizik",
            "Ofis Programları", "İngilizce", "Felsefe", "Tarih", "PRT", "Biyoloji", "Beden Eğitmi",
            "Din Kültürü"};

    public Lesson(int lessonHour, int lessonHourOnWeek, int lessonId) {
        this.lessonHour = lessonHour;
        this.lessonHourOnWeek = lessonHourOnWeek;
        this.lessonId = lessonId;
    }

    public int getLessonHour() {
        return lessonHour;
    }

    public void setLessonHour(int lessonHour) {
        this.lessonHour = lessonHour;
    }

    public int getLessonHourOnWeek() {
        return lessonHourOnWeek;
    }

    public byte[] getGrade() {
        return grade;
    }

    public int getLessonId() {
        return lessonId;
    }

    public String[] getGrade10() {
        return grade10;
    }

    public void setGrade(byte[] grade) {
        this.grade = grade;
    }

    public void setLessonHourOnWeek(int lessonHourOnWeek) {
        this.lessonHourOnWeek = lessonHourOnWeek;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    public void setGrade10(String[] grade10) {
        this.grade10 = grade10;
    }
}
