package br.com.efraimgentil.stub;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sun.tools.xjc.generator.bean.ImplStructureStrategy.Result;


public class Calculator extends JFrame {

	private static final long serialVersionUID = -5707783590357130468L;
	
	private String targetEndpoint = "http://localhost:8080/axis2/services/Calculator";
	private JTextField value1 = new JTextField("");
	private JTextField value2 = new JTextField("");
	private JLabel reusltado = new JLabel(""); 
	private JLabel operacao  = new JLabel("");
	private JButton btnSum   = new JButton("Sum");
	private JButton btnMinus   = new JButton("Minus");
	private JButton btnPlus   = new JButton("Plus");
	private JButton btnDivide   = new JButton("Divide");
	private JButton btnClean   = new JButton("Clean");
	
	public Calculator() {
		Container container = getContentPane();
		container.setLayout( new GridLayout(1, 3) );
		
		JPanel left = new JPanel( new GridLayout(4, 1) );
		left.add( new JLabel("Value 1:")  );
		left.add( new JLabel("Value 2:")  );
		left.add( new JLabel("Operation:")  );
		left.add( new JLabel("Result:")  );
		
		JPanel center = new JPanel( new GridLayout(4, 1) );
		center.add( value1 );
		center.add( value2 );
		center.add( operacao );
		center.add( reusltado );
		
		JPanel right = new JPanel( new GridLayout(5, 1) );
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum();
			}
		});
		right.add( btnSum );
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				minus();
			}
		});
		right.add( btnMinus );
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				plus();
			}
		});
		right.add( btnPlus );
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				divide();
			}
		});
		right.add( btnDivide );
		btnClean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clean();
			}
		});
		right.add(btnClean);
		
		container.add(left);
		container.add(center);
		container.add(right);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}
	
	private void sum(){
		try{
			double value1 = Double.parseDouble( this.value1.getText() );
			double value2 = Double.parseDouble( this.value2.getText() );
			
			CalculatorStub stub = new CalculatorStub(targetEndpoint);
			CalculatorStub.Sum operation = new CalculatorStub.Sum();
			operation.setI(value1);
			operation.setJ(value2);
			
			CalculatorStub.SumResponse response = stub.sum( operation );
			operacao.setText("Sum");
			reusltado.setText( "" + response.get_return() );
		}catch(Exception e){
			e.printStackTrace();
			clean();
			Toolkit.getDefaultToolkit().beep();
		}
	}
	
	private void minus(){
		try{
			double value1 = Double.parseDouble( this.value1.getText() );
			double value2 = Double.parseDouble( this.value2.getText() );
			
			CalculatorStub stub = new CalculatorStub(targetEndpoint);
			CalculatorStub.Minus operation = new CalculatorStub.Minus(); 
			operation.setI(value1);
			operation.setJ(value2);
			
			CalculatorStub.MinusResponse response = stub.minus( operation );
			operacao.setText("Minus");
			reusltado.setText( "" + response.get_return() );
		}catch(Exception e){
			e.printStackTrace();
			clean();
		}
	}
	
	private void plus(){
		try{
			double value1 = Double.parseDouble( this.value1.getText() );
			double value2 = Double.parseDouble( this.value2.getText() );
			
			CalculatorStub stub = new CalculatorStub(targetEndpoint);
			CalculatorStub.Plus operation = new CalculatorStub.Plus();
			operation.setI( value1 );
			operation.setJ( value2 );

			CalculatorStub.PlusResponse response = stub.plus( operation );
			operacao.setText("Plus");
			reusltado.setText( "" + response.get_return() );
		}catch(Exception e){
			e.printStackTrace();
			clean();
		}
	}
	
	private void divide(){
		try{
			double value1 = Double.parseDouble( this.value1.getText() );
			double value2 = Double.parseDouble( this.value2.getText() );
			
			CalculatorStub stub = new CalculatorStub(targetEndpoint);
			CalculatorStub.Divide operation = new CalculatorStub.Divide();
			operation.setI( value1 );
			operation.setJ( value2 );
			
			CalculatorStub.DivideResponse response = stub.divide( operation );
			operacao.setText("Divide");
			reusltado.setText( "" + response.get_return() );
		}catch(Exception e){
			e.printStackTrace();
			clean();
		}
	}
	
	private void clean(){
		value1.setText("");
		value2.setText("");
		operacao.setText("");
		reusltado.setText("");
		value1.requestFocus();
	}
	
	public static void main(String[] args) {
		new Calculator().setVisible(true);
	}
	
}
