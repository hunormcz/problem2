import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

class readNames {

	public static String[] readFile (int players) throws FileNotFoundException
	{
		String[] names;
		String[] namesRandom;
		names = new String[31];
		namesRandom = new String[players];
		
		// Read all names from file
		String filePath = new File("").getAbsolutePath();
		Scanner inFile1 = new Scanner(new File(filePath+"/src/names.txt"));
		int i=0;
		
		   while (inFile1.hasNext()) {

			      names[i] = inFile1.next();
			      i++;   
			    }
			    inFile1.close();
			    
			    
		//for (i=0; i<30; i++){
		//System.out.println(i+": "+names[i]);
		//}
		
		
		
		//Randomize names to array
		Random rnd = new Random();
		int r = rnd.nextInt(29);
		boolean notduplicate = false;
		namesRandom[0]=names[r];
		
		for (i=1; i<players;){
			r = rnd.nextInt(29);
			notduplicate = false;
			
			for (int j=0; j<i; j++){
				notduplicate=false;
				if (!namesRandom[j].equals(names[r])) {
					notduplicate=true;
					}
			}
		if (notduplicate) {
		namesRandom[i]=names[r];
		i++;
		}
		
		}	
	
		
		return(namesRandom);	    
	}

	
}
	
