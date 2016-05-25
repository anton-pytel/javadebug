package sk.anthony.debug;

import sk.anthony.restmpc.*;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	MpcController xmc = new MpcController();
    	xmc.mpcid = "5745b6297f00e70830bb5e19_a";
    	xmc = xmc.loadFile(xmc);
    	Gson gson = new Gson();  
		// convert java object to JSON format,
		String json = gson.toJson(xmc);
        System.out.println( json );
    }
}
