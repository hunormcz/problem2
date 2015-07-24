import java.io.*;


class ProblemTwo {

  public static void main (String args[]) throws IOException {
	
	  // read number of players
	  String input; 
	  BufferedReader stdin = new BufferedReader ( new InputStreamReader( System.in ) );
	    
	  System.out.println("How many players per team?");
	  input = stdin.readLine();
	  int pnumbers =  Integer.valueOf(input);
	  
	  // build team composition
	  Units unit = new Units();
	  printTeam team = new printTeam();
	  String[] teamcomp = unit.unitComposition(pnumbers);
	
	  // add random names from files
	  readNames readn = new readNames();
	  String[] playernames =  readNames.readFile(pnumbers); 
	    
	  team.print(teamcomp, playernames, pnumbers);
	  
  }
}
