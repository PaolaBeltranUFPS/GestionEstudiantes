import java.util.ArrayList;

public class Gestion
{
    ArrayList <Estudiante> estudiantes = new ArrayList();
    private Estudiante estudiante;

    public Gestion(){
    }

    public ArrayList<Estudiante> getEstudiante(){
        return estudiantes;
    }

    public void setEstudiante(ArrayList<Estudiante> estudiantes){
        this.estudiantes = estudiantes;
    }

    public void addEstudiante(Estudiante estudiante){
        this.estudiantes.add(estudiante);
    }

    public void imprimirListEstudiantes(){
        for(Estudiante estudiante: this.estudiantes){
            estudiante.mostrarInfoEstudiante();
        }
    }

    public void buscarEstudiante(int codigoEstudiante){
        if(codigoEstudiante < 0){
            System.out.println("Ingrese un codigo valido.");
        }for(Estudiante estudiante: this.estudiantes){  
            if(estudiante.getCodigo() == codigoEstudiante){
                estudiante.mostrarInfoEstudiante();
            }else {
                System.out.println("Estudiante no encontrado");
            }
        }
    }
}