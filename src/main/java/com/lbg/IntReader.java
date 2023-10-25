package com.lbg;

import java.util.Scanner;

public class IntReader extends MsgReader
{
    public IntReader(ICustomPrompt prompt )
    {
        super( prompt );
    }
    
    @Override
    public  String readFromKeyboard(Scanner sc, String message )
    {
        itsPrompt.prompt(message);

        //TODO: try and catch statement to ensue this is an integer
        String item = String.valueOf(sc.nextInt());

        return item;
    }
}
