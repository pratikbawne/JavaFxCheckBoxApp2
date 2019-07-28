package javafxapptableviewcheckboxes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author user
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TableColumn<Employee,String> name;
    
    @FXML
    private TableColumn<Employee,Integer> id;
    
    @FXML
    private TableColumn<Employee,CheckBox> select;
    
    @FXML
    private TableView<Employee> tableView; 
    
    ObservableList<Employee> list = FXCollections.observableArrayList();
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        for(int i=0;i<10;i++) {
          CheckBox ch = new CheckBox("" +i);
          list.add(new Employee(i,"Pratik", ch));
        }
        
        tableView.setItems(list);
        
        id.setCellValueFactory(new PropertyValueFactory<Employee,Integer>("id"));
        name.setCellValueFactory(new PropertyValueFactory<Employee,String>("name"));
        select.setCellValueFactory(new PropertyValueFactory<Employee,CheckBox>("checkbox"));
       
    }    

    @FXML
    private void deleteSelectedRow(ActionEvent event) {
        
        for(Employee tb :tableView.getItems())
        {
            if(tb.getCheckbox().isSelected()){
                Platform.runLater(() -> {
                    tableView.getItems().remove(tb);
            });
        }  
    }
  } 
}
