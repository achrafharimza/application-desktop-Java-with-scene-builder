package models;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Navigations extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
	 public void changeScene(String fxml)  {
			
		 Stage primaryStage =new Stage();
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/application/" +fxml+".fxml"));
			
				Scene scene = new Scene(root,821,559);
				scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
				
				primaryStage.setScene(scene);
				primaryStage.setTitle(fxml);
				primaryStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}
	        
	    }

}
