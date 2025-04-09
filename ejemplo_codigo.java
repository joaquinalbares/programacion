public class GestorTareas {
    
    private String[] tareas;
    private boolean[] completadas;
    private int numTareas;
    private final int CAPACIDAD_MAXIMA;

    public GestorTareas(int capacidadMaxima) {
        this.CAPACIDAD_MAXIMA = capacidadMaxima;
        this.tareas = new String[capacidadMaxima];
        this.completadas = new boolean[capacidadMaxima];
        this.numTareas = 0;
    }

    public boolean agregarTarea(String tarea) {
        if (numTareas < CAPACIDAD_MAXIMA) {
            tareas[numTareas] = tarea;
            completadas[numTareas] = false;
            numTareas++;
            return true;
        }
        return false;
    }

    public boolean completarTarea(int indice) {
        if (indice >= 0 && indice < numTareas) {
            completadas[indice] = true;
            return true;
        }
        return false;
    }

    public int getNumTareas() {
        return numTareas;
    }

    public String mostrarTareas() {
        StringBuilder resultado = new StringBuilder("Lista de Tareas:\n");
        for (int i = 0; i < numTareas; i++) {
            String estado = completadas[i] ? "[Completada]" : "[Pendiente]";
            resultado.append(i).append(". ").append(tareas[i]).append(" - ").append(estado).append("\n");
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas(5);
        gestor.agregarTarea("Estudiar Java");
        gestor.agregarTarea("Hacer documentación");
        gestor.agregarTarea("Revisar código");
        System.out.println(gestor.mostrarTareas());
        gestor.completarTarea(0);
        System.out.println("\nTras completar primera tarea:");
        System.out.println(gestor.mostrarTareas());
    }
}
