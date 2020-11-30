package Project3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JPanel {
    JButton[] buttons= new JButton[9];
    private boolean x = true;

    public Game() {
        this.setLayout(new GridLayout(3,3));
        for (JButton b : buttons) {
            b = new JButton();
            b.addActionListener(new ButtonListener());
            b.setText("");
            this.add(b);
        }
    }
    private class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton buttonClicked = (JButton) e.getSource();
            if (buttonClicked.getText().equals("")) {
                if (x) {
                    buttonClicked.setText("x");
                } else {
                    buttonClicked.setText("O");
                }
                win();
                x = !x;
            }
        }
    }
    private void win (){
           check3(6,7,8);
           check3(2,5,8);
           check3(3,4,5);
           check3(1,4,7);
           check3(2,4,6);
           check3(0,1,2);
           check3(0,3,6);
           check3(0,4,8);
    }
    private boolean check3 (int pos1, int pos2, int pos3){
        if(!buttons[pos1].getText().equals("") && buttons[pos1].getText().equals(buttons[pos2].getText()) && buttons[pos2].getText().equals(buttons[pos3].getText())){
            for (int i = 0; i < buttons.length; i++) {
                buttons[i].setText("Winner");
            }
        }
        return false;
    }
}
