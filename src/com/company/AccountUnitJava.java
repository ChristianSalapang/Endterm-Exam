package com.company;
import org.junit.jupiter.api.Test;
import javax.swing.JOptionPane;

public class AccountUnitJava {

    @Test
    public void testCheck () {
            Checking CAcc = new Checking(1920593);
            JOptionPane.showMessageDialog(null, CAcc.getAccInfo());
        }

    @Test
    public void testSave () {
        Savings SAcc = new Savings(2053859, 3.5);
        JOptionPane.showMessageDialog(null, SAcc.getAccInfo());
    }
    }
