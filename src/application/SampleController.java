package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import org.json.simple.JSONObject;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import org.json.simple.parser.JSONParser;



public class SampleController {
	JSONArray jrr =new JSONArray();
	
	 @FXML
	    private AnchorPane rootPane;
	 @FXML
	    private TextField passText;

	    @FXML
	    private TextField userText;

	    
	    
	    
	    @SuppressWarnings("unchecked")
		@FXML
	    private void registre(ActionEvent event) {
	    	
	    
	    	 JSONObject obj = new JSONObject();
	         JSONArray jrr = new JSONArray();
	         JSONParser jp = new JSONParser();
	         try{
	             FileReader file = new FileReader("fonctionnaires.json");
	             jrr=(JSONArray)jp.parse(file);
	         }catch(Exception ex){
	             JOptionPane.showMessageDialog(null,"Error occured");
	         }
	         
	         obj.put("firstname", userText.getText());
	         obj.put("password",passText.getText());
	         jrr.add(obj);
	         try{
	             FileWriter file = new FileWriter("fonctionnaires.json");
	             file.write(jrr.toJSONString());
	             file.close();
	         }catch(Exception ex){
	             JOptionPane.showMessageDialog(null,"Error occured");
	         }
	         JOptionPane.showMessageDialog(null,"Data Saved");;


	    }
	    
	    
	    
	    
	    @SuppressWarnings("unchecked")
		@FXML
	    private void login(ActionEvent event) {
	    	 JSONArray jrr = new JSONArray();
	         Object ob = null;
	         JSONParser Jp = new JSONParser();
	         //fetch file--
	         try{
	             FileReader file = new FileReader("fonctionnaires.json");
	             ob=Jp.parse(file);
	             jrr=(JSONArray) ob;
	             file.close();
	         }catch(Exception ex){
	             JOptionPane.showMessageDialog(null,"Error Occured While fetching");
	         }
	         
	         JSONObject obj = new JSONObject();
	         int size = jrr.size();
	         obj.put("firstname", userText.getText());
	         obj.put("password",passText.getText());
	        Stage primaryStage =new Stage();
	         for(int i=0;i<size;i++){
	             if(jrr.get(i).equals(obj)){
	                 JOptionPane.showMessageDialog(null,"Password matched");
	                 System.out.println(jrr);
	               
	               //move to next page
	                 try {
	                	
	         			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Page2.fxml"));
	         			Scene scene = new Scene(root,400,400);
	         			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	         			primaryStage.setScene(scene);
	         			primaryStage.show();
	         		} catch(Exception e) {
	         			e.printStackTrace();
	         		}

	             
	                 
	                 break;
	             }else if(i==size-1){
	                 JOptionPane.showMessageDialog(null,"Incorrect User/Password!");
	             }
	         }
	    	}




	    @FXML
	    private Button Allo;
	    
	    @FXML
	    void Allo(ActionEvent event) {

 		   JSONArray jrr = new JSONArray();
 	       JSONParser jp = new JSONParser();
 	      Object ob1 = null;
 	       
 	       try{
 	           FileReader file = new FileReader("clients.json");
 	           jrr=(JSONArray)jp.parse(file);
 	           System.out.println(jrr.getClass());
 	           System.out.println("cheked");
 	          System.out.println(jrr);
 	           
 	       }catch(Exception ex){
 	           JOptionPane.showMessageDialog(null,"Error occured");
 	       }
 		
 	      ArrayList<Object> listdata = new ArrayList<Object>();     
 	   
 	     if (jrr != null) {   
             
             //Iterating JSON array  
             for (int i=0;i<jrr.size();i++){   
                   
                 //Adding each element of JSON array into ArrayList  
                 listdata.add(jrr.get(i));  
             }   
         }  
 	      
 	      
 	    //Iterating ArrayList to print each element  
 	    
         System.out.println("Each element of ArrayList");  
        
             //Printing each element of ArrayList  
             System.out.println(listdata);  
          
 	      

         System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");  
         System.out.println(listdata.getClass());
         System.out.println(listdata.get(0));
 	      
         ArrayList<Object> listdata2 = new ArrayList<Object>();     
         
         System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv"); 
             
             //Adding each element of JSON array into ArrayList  
        
         Client[] arrayClient = listdata2.toArray(new Client[listdata2.size()]);
         System.out.println(arrayClient);
         System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");  
         System.out.println(listdata2.getClass());
         System.out.println(listdata2.getClass());
 	      
	    }




		private Object parseEmployeeObject(JSONObject emp) {
			// TODO Auto-generated method stub
			return null;
		}
	    	
	    	
	    	
	    	

	    
	    
	    
    
	
}
