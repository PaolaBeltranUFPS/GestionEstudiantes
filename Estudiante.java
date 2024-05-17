public class Estudiante
{
    private String nombre;
    private String apellido;
    private int edad;
    private int codigo;

    public Estudiante(){ 
    }

    public Estudiante(String nombre, String apellido, int edad, int codigo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.codigo = codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    }
    public int getCodigo(){
        return codigo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public void mostrarInfoEstudiante(){
        System.out.println("Los datos del estudiante son: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Codigo: " + codigo);
    }
}
