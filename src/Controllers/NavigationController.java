package Controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class NavigationController {
	
	
	public void GoToListPage() {
		
    	System.out.print("toooolist1");
    	Stage primaryStage =new Stage();
    	   try {
 			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("application.ListClients.fxml"));
 			Scene scene = new Scene(root,786,468);
 			scene.getStylesheets().add(getClass().getResource("application.application.css").toExternalForm());
 			primaryStage.setScene(scene);
 			primaryStage.show();
 		} catch(Exception e) {
 			e.printStackTrace();
 		}
    }
	
	

}
