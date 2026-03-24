package Principal;

public class ProcesarDatos {
    
    private String matricula;
    private String nombres;
    private String apellidos;
    private String cuatrimestre;

    public void capturarDatos(String mat, String nom, String ape, String cuat) {
        this.matricula = mat;
        this.nombres = nom;
        this.apellidos = ape;
        this.cuatrimestre = cuat;
    }

    public String presentarDatos() {
        if (matricula == null || matricula.isEmpty()) {
            return "No se han ingresado datos todavía.";
        }
        
        return "Datos del participante:\n\n" +
               "Matrícula: " + matricula + "\n" +
               "Nombres: " + nombres + "\n" +
               "Apellidos: " + apellidos + "\n" +
               "Cuatrimestre: " + cuatrimestre;
    }
}