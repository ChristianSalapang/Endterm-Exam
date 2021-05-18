package com.company;
import org.junit.jupiter.api.Test;
import javax.swing.JOptionPane;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    public void testArray () {
        Account[] accArray = new Account[10];

        accArray[0] = new Checking(1920593);
        accArray[1] = new Checking(1920594);
        accArray[2] = new Checking(1920595);
        accArray[3] = new Checking(1920596);
        accArray[4] = new Checking(1920597);
        accArray[5] = new Savings(2053851, 3.5);
        accArray[6] = new Savings(2053852, 3.5);
        accArray[7] = new Savings(2053853, 2.5);
        accArray[8] = new Savings(2053854, 2.5);
        accArray[9] = new Savings(2053855, 2.5);

        for(int i = 0; i < accArray.length; ++i)
            System.out.println(accArray[i].getAccInfo() + "\n");

        System.out.println("Number of accounts: " + accArray.length);
        assertEquals(10,accArray.length);
    }
}
