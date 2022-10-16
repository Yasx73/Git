import javax.swing.*;
//Yessenia Mora Esquivel
public class Sum_01 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"SUM OF TWO INTEGER NUMBERS");
        // get user input from JOptionPane's input dialogs
        // convert String inputs to int values to use in a calculation
        int firstNumber= Integer.parseInt(JOptionPane.showInputDialog("Enter the first number:"));
        int secondNumber=Integer.parseInt(JOptionPane.showInputDialog("Enter the second number:"));
        int summ=firstNumber+secondNumber;
        // display the results in a JOptionPane message dialog
        JOptionPane.showMessageDialog(null,"The sum is: "+summ);
    }
}// end class Sum
