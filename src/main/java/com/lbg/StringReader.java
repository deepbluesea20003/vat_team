package com.lbg;

import java.util.Scanner;

public class StringReader extends MsgReader
{
    public StringReader(ICustomPrompt prompt )
    {
        super( prompt );
    }

    @Override
    public  String readFromKeyboard(Scanner sc, String message )
    {
        itsPrompt.prompt(message);

        return sc.nextLine();
    }
}
