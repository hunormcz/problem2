import java.io.*;


class ProblemTwo {

  public static void main (String args[]) throws IOException {
	
	  String input; 
	  BufferedReader stdin = new BufferedReader ( new InputStreamReader( System.in ) );
	  System.out.println("How many players per team?");
	  input = stdin.readLine();
	  int pnumbers =  Integer.valueOf(input);
	  
	  Units unit = new Units();
	  String[] teamcomp = unit.unitComposition(pnumbers);
	  
	  printTeam team = new printTeam();
	  
	
	  readNames readn = new readNames();
	  String[] playernames =  readNames.readFile(pnumbers); 
	  
		
	  
	  team.print(teamcomp, playernames, pnumbers);
	  
  }
}
