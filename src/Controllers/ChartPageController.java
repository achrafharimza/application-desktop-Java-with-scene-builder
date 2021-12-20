package Controllers;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import DAO.DBoperation;
import DAO.DataBConnect;

import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import models.Navigations;

public class ChartPageController implements Initializable {
	

    @FXML
    private Button ChartButt;
    @FXML
    private Button ListeClients;

    @FXML
    private Button QuitterButton;
	
	
	
	
	
	

	  @FXML
	    private AreaChart<?, ?> ChartD;

	@SuppressWarnings("deprecation")
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	
		

//////////////////////PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP
			
		XYChart.Series series = new XYChart.Series();
		series.setName("le nombre d’inscription par date");
		int NbrInscInt = 0;
			for (int i=1 ;i<13;i++) {
				int imonth=i;
				DBoperation DBoperation =new DBoperation();
				ResultSet result =DBoperation.CountmMnth(imonth);
				
				try {
					while(result.next()){
						System.out.print(result.getString("CountMonth")+"\n");
						String NbrInsc =result.getString("CountMonth")  ;
					  NbrInscInt =Integer.parseInt(NbrInsc);
						
					    }
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			
					
					
				series.getData().add(new XYChart.Data(imonth,NbrInscInt));
					
					
			
				
				
				
				
				
				
			}
			ChartD.getData().add(series);
			
			
	/////////////PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP		
			
			

		
		
		
		
	}
	 @FXML
	    void GoToList(ActionEvent event) {
		 
		 
		  Navigations navigations = new Navigations();
          navigations.changeScene("ListClients"); 
	    	
//	    	System.out.print("toooolist");
////	    	NavigationController navigation = new NavigationController() {};
////			navigation.GoToListPage();;
//
//	    	
//	    	System.out.print("toooolist");
//	    	Stage primaryStage =new Stage();
//	    	   try {
//     			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("ListClients.fxml"));
//     			Scene scene = new Scene(root,821,559);
//     			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//     			primaryStage.setScene(scene);
//     			primaryStage.show();
//     		} catch(Exception e) {
//     			e.printStackTrace();
//     		}
	    }
	    	   
	    	////////////////////////////////////////   
	    	   
	    @FXML
	    void GoToGraphe(ActionEvent event) {
	    	  Navigations navigations = new Navigations();
	            navigations.changeScene("ChartPage"); 
	    	
//	    	Stage primaryStage =new Stage();
//	    	   try {
//  			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("ChartPage.fxml"));
//  			Scene scene = new Scene(root,821,559);
//  			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//  			primaryStage.setScene(scene);
//  			primaryStage.show();
//  		} catch(Exception e) {
//  			e.printStackTrace();
//  		}
	    	
	    
	    }
	  	
	    	///////////

	    

	    @FXML
	    void Quitter(ActionEvent event) {
	    	Stage stage =(Stage) QuitterButton.getScene().getWindow();
	    	stage.close();

	    	System.exit(0);
	    }
}
