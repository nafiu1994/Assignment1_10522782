/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_10522782;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Lawal Nafiu
 */
public class Prog613 {
    public static void main(String[] args)
    {
        Frame613 f = new Frame613();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
class Frame613 extends JFrame{
    public Frame613()
    {
        setTitle("613 rock!");
        setSize(300, 200);
        setLocation(100, 200);
        
        Panel613 panel = new Panel613();
        Container cp = getContentPane();
        cp.add(panel);
    }   
}

class Panel613 extends JFrame{
    public void paintComponent(Graphics g)
    {
        super.paintComponents(g);
        g.drawString("Hi", 75, 100);
    }
    
}
