/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Peternakan;

import Peternakan.GUI.MainGUI;
import Peternakan.GUI.PakanGUI;
import Peternakan.GUI.PerawatanGUI;
import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class Main implements Runnable{
    public static void main(String[] args) {
        Main app_runner = new Main();
        Thread thread = new Thread (app_runner);
        thread.start();
    }
    
    @Override
    public void run() {
        JFrame frame = new MainGUI();
        frame.setVisible(true);
    }
}
