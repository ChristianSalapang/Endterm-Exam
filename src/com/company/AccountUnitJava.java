package com.company;
import org.junit.jupiter.api.Test;
import javax.swing.JOptionPane;

public class AccountUnitJava {

    @Test
    public void test1 () {

            Checking CAcc = new Checking(1920593);
            Savings SAcc = new Savings(2053859, 3.5);

            JOptionPane.showMessageDialog(null, CAcc.getAccInfo());
            JOptionPane.showMessageDialog(null, SAcc.getAccInfo());
        }

    }
