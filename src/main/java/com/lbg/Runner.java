/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lbg;

import java.util.ArrayList;

/**
 *
 * @author selvy
 */
public class Runner
{
    private final ArrayList<IElementReader> itsReaders;
    
    public  Runner( ArrayList<IElementReader> readers )
    {
        itsReaders = readers;
    }
    
    public  ArrayList<LineEntry>    run()
    {
        String lineRead = "";
        boolean exitApp = false;
        int lineNo = 0;
        ArrayList lines = new ArrayList(10);
        

        while( !exitApp && lineRead != null )
        {
            for(IElementReader reader : itsReaders) {
                lineRead = reader.readFromKeyboard(System.in);
                if (lineRead.equalsIgnoreCase("QUIT"))
                {
                    exitApp = true;
                    break;
                }
                LineEntry le = new LineEntry(++lineNo, lineRead);
                lines.add(le);                    
            }
        }
        
        return lines;
    }
}
