// Carlos John Escala
// August 28, 2024
// Lab 4, Sandwhich Sale
// This program asks a user if they want to buy a sandwich

import javax.swing.JOptionPane;
public class SandwichShop
{
    public static void main (String[] args)
    {
        JOptionPane.showMessageDialog (null, "Do you want a ham sandwich, we have a sale?");
        int answer = JOptionPane.showConfirmDialog(null, "Do you want a ham sandwich, we have a sale?",
        "sandwichshop",
        JOptionPane.YES_NO_OPTION);
        if (answer == JOptionPane.YES_OPTION)
        {
            System.out.println("Thanks for purchasing, you saved $100");
        }
        else
        {
            System.out.println("Thank you anyway!");
        }
        System.exit (0);
    }
}