/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.section04unittests;

/**
 *
 * @author Lizz
 */
public class Makes10 {
        // Given two ints, a and b, return true if one if them is 10 
    // or if their sum is 10. 
    //
    // makes10(9, 10) -> true
    // makes10(9, 9) -> false
    // makes10(1, 9) -> true
    public boolean makes10(int a, int b) {
        int sum = a + b;
        if (a == 10 || b == 10 || sum == 10){
            return true;
        } else {
            return false;
        }
    }

}
