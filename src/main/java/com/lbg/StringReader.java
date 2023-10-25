package com.lbg;

import java.io.InputStream;
import java.util.Scanner;

public class StringReader extends MsgReader
{
    public StringReader(ICustomPrompt prompt )
    {
        super( prompt );
    }

    @Override
    public  String readFromKeyboard( InputStream is, String message )
    {
        Scanner theScanner = new Scanner( is );

        itsPrompt.prompt(message);

        return theScanner.nextLine();
    }
}
