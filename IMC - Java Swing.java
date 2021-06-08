/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculo_Imc;

import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius
 */
public class Calculo_Imc {
        
    public static void main(String[] args) {
        
        double peso, altura, imc;
        
        peso = Double.parseDouble(JOptionPane.showInputDialog("Peso (KG)"));

        altura = Double.parseDouble(JOptionPane.showInputDialog("Altura (CM)"));
          
        imc = (peso / (math.exp(altura, 2)));
        
       
        if (imc < 17){
            JOptionPane.showMessageDialog(null,"IMC:" + imc );
            JOptionPane.showMessageDialog(null,"Muito abaixo do peso");
	} 

	else if (imc >= 17 && imc <= 18.49){
            JOptionPane.showMessageDialog(null,"IMC:" + imc );
            JOptionPane.showMessageDialog(null,"Abaixo do peso");
        }
 
	else if (imc >= 18.50 && imc <= 24.99){
            JOptionPane.showMessageDialog(null,"IMC:" + imc );
            JOptionPane.showMessageDialog(null,"Peso normal");   
        } 

	else if (imc >= 25 && imc <= 29.99){
            JOptionPane.showMessageDialog(null,"IMC:" + imc );
            JOptionPane.showMessageDialog(null,"Acima do peso");  
        }

	else if (imc >= 30 && imc <= 34.99){
            JOptionPane.showMessageDialog(null,"IMC:" + imc );
            JOptionPane.showMessageDialog(null,"Obesidade I");
	} 

	else if (imc >= 35 && imc <= 39.99){
            JOptionPane.showMessageDialog(null,"IMC:" + imc );
            JOptionPane.showMessageDialog(null,"Obesidade II");
	} 

	else if (imc >= 40){
            JOptionPane.showMessageDialog(null,"IMC:" + imc );
            JOptionPane.showMessageDialog(null,"Obesidade III");
        }                                                  
    }
}