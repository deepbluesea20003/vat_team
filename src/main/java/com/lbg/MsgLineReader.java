/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lbg;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author selvy
 */
public class MsgLineReader extends MsgReader
{
    public  MsgLineReader( ICustomPrompt prompt )
    {
        super( prompt );
    }
    
    @Override
    public  String readFromKeyboard( InputStream is )
    {
        Scanner theScanner = new Scanner( is );
        
        itsPrompt.prompt("Enter a message (enter to complete):");

        String str = theScanner.nextLine();

        return str;
    }
    
}
