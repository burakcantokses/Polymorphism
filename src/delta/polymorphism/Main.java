package delta.polymorphism;

import delta.polymorphism.generator.Generator;
import delta.polymorphism.generator.GeneratorManager;

public class Main {

    public static void main(String[] args) {
        GeneratorManager generatorManager = new GeneratorManager() ;
        for (Generator generator : generatorManager.generators) {
            System.out.println(generator.lessonId);
        }
    }
}
