import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ControllerGestion {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> apellido;

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnBuscar;

    @FXML
    private Button btnLimpiar;

    @FXML
    private Button btnSalir;

    @FXML
    private TableColumn<?, ?> codigo;

    @FXML
    private TableColumn<?, ?> edad;

    @FXML
    private TableColumn<?, ?> nombre;

    @FXML
    private TableView<?> tblEstudiantes;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtNombre;
    
    private Gestion gestion;
    private Estudiante estudiante;

    @FXML
    void agregarEstudiante(ActionEvent event) {
        String codigo = txtCodigo.getText();
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String edad = txtEdad.getText();
    }

    @FXML
    void buscarEstudiante(ActionEvent event) {
        //gestion.buscarEstudiante();
    }

    @FXML
    void limpiar(ActionEvent event) {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
    }

    @FXML
    void salir(ActionEvent event) {
        System.exit(0);
    }

    private void actualizarGUI(){
        txtCodigo.setText(String.valueOf(estudiante.getCodigo()));
        txtNombre.setText(String.valueOf(estudiante.getNombre()));
        txtApellido.setText(String.valueOf(estudiante.getApellido()));
        txtEdad.setText(String.valueOf(estudiante.getEdad()));
    }
    
    @FXML
    void initialize() {
        assert apellido != null : "fx:id=\"apellido\" was not injected: check your FXML file 'gestionEstudiantes.fxml'.";
        assert btnAgregar != null : "fx:id=\"btnAgregar\" was not injected: check your FXML file 'gestionEstudiantes.fxml'.";
        assert btnBuscar != null : "fx:id=\"btnBuscar\" was not injected: check your FXML file 'gestionEstudiantes.fxml'.";
        assert btnLimpiar != null : "fx:id=\"btnLimpiar\" was not injected: check your FXML file 'gestionEstudiantes.fxml'.";
        assert btnSalir != null : "fx:id=\"btnSalir\" was not injected: check your FXML file 'gestionEstudiantes.fxml'.";
        assert codigo != null : "fx:id=\"codigo\" was not injected: check your FXML file 'gestionEstudiantes.fxml'.";
        assert edad != null : "fx:id=\"edad\" was not injected: check your FXML file 'gestionEstudiantes.fxml'.";
        assert nombre != null : "fx:id=\"nombre\" was not injected: check your FXML file 'gestionEstudiantes.fxml'.";
        assert tblEstudiantes != null : "fx:id=\"tblEstudiantes\" was not injected: check your FXML file 'gestionEstudiantes.fxml'.";
        assert txtApellido != null : "fx:id=\"txtApellido\" was not injected: check your FXML file 'gestionEstudiantes.fxml'.";
        assert txtCodigo != null : "fx:id=\"txtCodigo\" was not injected: check your FXML file 'gestionEstudiantes.fxml'.";
        assert txtEdad != null : "fx:id=\"txtEdad\" was not injected: check your FXML file 'gestionEstudiantes.fxml'.";
        assert txtNombre != null : "fx:id=\"txtNombre\" was not injected: check your FXML file 'gestionEstudiantes.fxml'.";

        gestion = new Gestion();
        estudiante = new Estudiante();
        actualizarGUI();
    }

}

