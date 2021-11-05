package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller implements Initializable{
	
LoginModel loginModel = new LoginModel();
	
	@FXML
	private Label dbStatus;
	@FXML
	private TextField username;
	@FXML
	private PasswordField password;
	@FXML
	private Button loginBtn;
	@FXML
	private Label loginStatus;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		if(this.loginModel.isDatabaseConnected()) {
			this.dbStatus.setText("Connected");
		}else {
			this.dbStatus.setText("Not Connected");
		}
		
	}
	
	@FXML
	public void Login(ActionEvent event) {
		
		try {
			if(this.loginModel.isLogin(this.username.getText(), this.password.getText())) {
				this.loginStatus.setText("You have successfully logged in");
			}else {
				this.loginStatus.setText("Wrong Credentials");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
