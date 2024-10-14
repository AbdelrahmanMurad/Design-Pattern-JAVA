/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example1.MediaPlayer;

import Example1.MediaPlayer.StateMediaPlayer;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author A_Murad
 */
public class DemoUI extends JFrame {

    StateMediaPlayer player;

    public DemoUI() {
        player = new StateMediaPlayer();

        this.getContentPane().setLayout(new FlowLayout());
        JButton prepareBtn = new JButton("Load Album");
        JButton playBtn = new JButton("Play");
        JButton stopBtn = new JButton("Stop");
        JButton pauseBtn = new JButton("Pause");

        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                player.playerDestroy();
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                // TODO Auto-generated method stub
            }

            @Override
            public void windowIconified(WindowEvent e) {
                // TODO Auto-generated method stub
            }

        });
        prepareBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                player.playerPrepare();
            }

        });
        playBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                player.playerStart();
            }

        });
        stopBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                player.playerStop();
            }

        });
        pauseBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                player.playerPause();
            }

        });

        this.getContentPane().add(prepareBtn);
        this.getContentPane().add(playBtn);
        this.getContentPane().add(stopBtn);
        this.getContentPane().add(pauseBtn);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(new Dimension(300, 200));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String args[]) {
        new DemoUI();
    }
}
