package e2p1_emanuelflores;
import java.awt.Color;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class E2P1_EmanuelFlores {
    public static Scanner leer = new Scanner(System.in);
    public static Random random = new Random();
    public static void main(String[] args) {
        MaquinaEstados M = new MaquinaEstados();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
}
