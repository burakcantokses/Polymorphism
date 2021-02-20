package delta.polymorphism.generator;

import delta.polymorphism.generator.lessons.Cografya;
import delta.polymorphism.generator.lessons.Edebiyat;
import delta.polymorphism.generator.lessons.Kimya;
import delta.polymorphism.generator.lessons.Matematik;

import java.util.ArrayList;

public class GeneratorManager {
    public ArrayList<Generator> generators = new ArrayList<>();

    public GeneratorManager() {
        generators.add(new Matematik());
        generators.add(new Cografya());
        generators.add(new Edebiyat());
        generators.add(new Kimya());
    }
}
