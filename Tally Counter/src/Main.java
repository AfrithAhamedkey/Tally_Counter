import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    Main(){
        Frame frame = new Frame("Tally Counter");
        Button reset = new Button("Reset");
        Button increment = new Button("Count");
        TextField txt = new TextField("3");
        txt.setBounds(150,100,50,50);
        reset.setBounds(100,250,50,50);
        increment.setBounds(200,250,50,50);


        increment.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int num = Integer.parseInt(txt.getText());
                txt.setText(String.valueOf(++num));
            }
        });

        reset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txt.setText("0");
            }
        });


        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Dispose the frame when the close button is clicked
                frame.dispose();

            }
        });

        frame.add(reset);
        frame.add(increment);
        frame.add(txt);

    }



    public static void main(String[] args) {
        new Main();
    }
}