// Archivo: TaskPrioritizationStrategy.java
public interface TaskPrioritizationStrategy {
    void prioritizeTasks();
}

// Archivo: AgilPrioritizationStrategy.java
public class AgilPrioritizationStrategy implements TaskPrioritizationStrategy {
    @Override
    public void prioritizeTasks() {
        System.out.println("Priorizando según metodología ágil.");
        // Lógica específica para priorización ágil
    }
}

// Archivo: TradicionalPrioritizationStrategy.java
public class TradicionalPrioritizationStrategy implements TaskPrioritizationStrategy {
    @Override
    public void prioritizeTasks() {
        System.out.println("Priorizando según metodología tradicional.");
        // Lógica específica para priorización tradicional
    }
}

// Archivo: TaskManager.java
public class TaskManager {
    private TaskPrioritizationStrategy strategy;

    public void setStrategy(TaskPrioritizationStrategy strategy) {
        this.strategy = strategy;
    }

    public void prioritize() {
        if (strategy == null) {
            throw new IllegalStateException("No se ha definido una estrategia de priorización");
        }
        strategy.prioritizeTasks();
    }
}

// Archivo: MainStrategyDemo.java
public class MainStrategyDemo {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.setStrategy(new AgilPrioritizationStrategy());
        manager.prioritize(); // Priorización según metodología ágil

        manager.setStrategy(new TradicionalPrioritizationStrategy());
        manager.prioritize(); // Priorización según metodología tradicional
    }
}