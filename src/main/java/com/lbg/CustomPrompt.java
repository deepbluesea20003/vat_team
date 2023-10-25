/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lbg;

/**
 *
 * @author selvy
 */
public class CustomPrompt   implements ICustomPrompt
{
    @Override
    public void prompt( String msg )
    {
        System.out.print(msg);
    }    
}
