// Archivo: AIAlgorithm.java
public interface AIAlgorithm {
    void runAnalysis();
}

// Archivo: AgilAIAlgorithm.java
public class AgilAIAlgorithm implements AIAlgorithm {
    @Override
    public void runAnalysis() {
        System.out.println("Análisis con enfoque ágil");
        // Lógica específica para proyectos ágiles
    }
}

// Archivo: TradicionalAIAlgorithm.java
public class TradicionalAIAlgorithm implements AIAlgorithm {
    @Override
    public void runAnalysis() {
        System.out.println("Análisis con enfoque tradicional");
        // Lógica específica para proyectos tradicionales
    }
}

// Archivo: AIAlgorithmFactory.java
public abstract class AIAlgorithmFactory {
    public abstract AIAlgorithm createAlgorithm(String type);
}

// Archivo: ConcreteAIAlgorithmFactory.java
public class ConcreteAIAlgorithmFactory extends AIAlgorithmFactory {
    @Override
    public AIAlgorithm createAlgorithm(String type) {
        switch (type.toLowerCase()) {
            case "agil":
                return new AgilAIAlgorithm();
            case "tradicional":
                return new TradicionalAIAlgorithm();
            default:
                throw new IllegalArgumentException("Tipo de algoritmo no soportado: " + type);
        }
    }
}

// Archivo: MainFactoryDemo.java
public class MainFactoryDemo {
    public static void main(String[] args) {
        AIAlgorithmFactory factory = new ConcreteAIAlgorithmFactory();
        
        AIAlgorithm agilAI = factory.createAlgorithm("agil");
        agilAI.runAnalysis();

        AIAlgorithm tradicionalAI = factory.createAlgorithm("tradicional");
        tradicionalAI.runAnalysis();
    }
}