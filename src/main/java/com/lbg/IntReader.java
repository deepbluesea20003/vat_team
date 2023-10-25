package com.lbg;

import java.io.InputStream;
import java.util.Scanner;

public class IntReader extends MsgReader
{
    public IntReader(ICustomPrompt prompt )
    {
        super( prompt );
    }
    
    @Override
    public  String readFromKeyboard( InputStream is, String message )
    {
        Scanner theScanner = new Scanner( is );

        itsPrompt.prompt(message);

        //TODO: try and catch statement to ensue this is an integer
        String item = String.valueOf(theScanner.nextInt());

        return item;
    }
}
