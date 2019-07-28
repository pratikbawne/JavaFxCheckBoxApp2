package javafxapptableviewcheckboxes;

import javafx.scene.control.CheckBox;

/**
 *
 * @author user
 */
public class Employee {
    
    private int id;
    private String name;
    private CheckBox checkbox;

    public Employee(int id, String name, CheckBox checkbox) {
        this.id = id;
        this.name = name;
        this.checkbox = checkbox;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CheckBox getCheckbox() {
        return checkbox;
    }

    public void setCheckbox(CheckBox checkbox) {
        this.checkbox = checkbox;
    }
    
}
