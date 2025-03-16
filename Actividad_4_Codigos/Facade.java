// Archivo: TaskService.java
public class TaskService {
    public void createTask(String taskName) {
        System.out.println("Creando la tarea: " + taskName);
        // Lógica de creación de la tarea
    }
}

// Archivo: PredictionService.java
public class PredictionService {
    public void runPrediction() {
        System.out.println("Ejecutando predicción de retrasos...");
        // Lógica de predicción
    }
}

// Archivo: ReportService.java
public class ReportService {
    public void generateReport() {
        System.out.println("Generando reporte...");
        // Lógica de generación de reportes
    }
}

// Archivo: ProjectFacade.java
public class ProjectFacade {
    private TaskService taskService;
    private PredictionService predictionService;
    private ReportService reportService;

    public ProjectFacade() {
        this.taskService = new TaskService();
        this.predictionService = new PredictionService();
        this.reportService = new ReportService();
    }

    public void manageProject(String task) {
        taskService.createTask(task);
        predictionService.runPrediction();
        reportService.generateReport();
    }
}

// Archivo: MainFacadeDemo.java
public class MainFacadeDemo {
    public static void main(String[] args) {
        ProjectFacade projectFacade = new ProjectFacade();
        projectFacade.manageProject("Configurar entorno de desarrollo");
    }
}