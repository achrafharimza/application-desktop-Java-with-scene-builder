package application;

import java.io.FileReader;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ListClientsController implements Initializable {

	 @FXML
	    private TableColumn<Client, String> Adresse;

	    @FXML
	    private TableColumn<Client, String> CNIPassport;

	    @FXML
	    private TableColumn<Client, String> DateDebut;

	    @FXML
	    private TableColumn<Client, String> Email;

	    @FXML
	    private TableColumn<Client, String> Nbadge;

	    @FXML
	    private TableColumn<Client, String> Nom;

	    @FXML
	    private TableColumn<Client, String> NomEntreprise;

	    @FXML
	    private TableColumn<Client, String> Phone;

	    @FXML
	    private TableColumn<Client, String> Prenom;

	    @FXML
	    private TableView<Client> TableofClient;

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
		}
//   public void list() {
//	   JSONArray jrr = new JSONArray();
//       JSONParser jp = new JSONParser();
//       System.out.println("cheked");
//       try{
//           FileReader file = new FileReader("clients.json");
//           jrr=(JSONArray)jp.parse(file);
//           System.out.println(jrr.getClass());
//           
//          
//           
//       }catch(Exception ex){
//           JOptionPane.showMessageDialog(null,"Error occured");
//       }
//	
//	
//}
	
		
		
		
		
}
