package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalController implements Initializable {
	
	@FXML Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
	@FXML Button btnCL,btnEQ,btnPL,btnMI,btnMU,btnDI;
	@FXML Label lblR,lblD;
	
	int n;
	int x;
	int y;
	int result;
	String op = "";
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		lblR.setText("");
		lblD.setText("");
	}
	
	//번호
	public void btn0Action(ActionEvent event)
	{
		makenum(0);
	}
	public void btn1Action(ActionEvent event)
	{
		makenum(1);
	}
	public void btn2Action(ActionEvent event)
	{
		makenum(2);
	}
	public void btn3Action(ActionEvent event)
	{
		makenum(3);
	}
	public void btn4Action(ActionEvent event)
	{
		makenum(4);
	}
	public void btn5Action(ActionEvent event)
	{
		makenum(5);
	}
	public void btn6Action(ActionEvent event)
	{
		makenum(6);
	}
	public void btn7Action(ActionEvent event)
	{
		makenum(7);
	}
	public void btn8Action(ActionEvent event)
	{
		makenum(8);
	}
	public void btn9Action(ActionEvent event)
	{
		makenum(9);
	}
	
	//연산자
	public void btnPLAction(ActionEvent event)
	{
		op = "+";
		makelog(op);
	}
	public void btnMIAction(ActionEvent event)
	{
		op = "-";
		makelog(op);
	}
	public void btnMUAction(ActionEvent event)
	{
		op = "*";
		makelog(op);
	}
	public void btnDIAction(ActionEvent event)
	{
		op = "/";
		makelog(op);
	}
	
	//취소,출력
	public void btnCLAction(ActionEvent event)
	{
		lblR.setText("");
		lblD.setText("");
	}
	public void btnEQAction(ActionEvent event)
	{
		y= Integer.parseInt(lblR.getText());				
		num = lblD.getText();
		
		lblD.setText(num + y + " = ");
		result = calculate(op, x, y);
		lblR.setText(Integer.toString(result));
		
		num = lblD.getText();
		lblD.setText(num+result);
	}
	
	//계산관련
	String num = "";
	public void makenum(int n)
	{
		num = lblR.getText();
		lblR.setText(num+Integer.toString(n));
	}
	
	public void makelog(String op)
	{
		x = Integer.parseInt(lblR.getText());
		lblR.setText("");
		lblD.setText(Integer.toString(x)+" "+ op + " ");
	}
	
	public int calculate(String operator, int x, int y)
	{
		int result = 0;
		switch (operator)
		{
		case "+":
			result = x+y;
			break;
		case "-":
			result = x-y;
			break;
		case "*":
			result = x*y;
			break;
		case "/":
			if(y == 0)
			{
				result = 0;
				break;
			}
			result = x/y;
			break;
		}
		return result;
	}
}