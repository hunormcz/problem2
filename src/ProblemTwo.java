import java.io.*;


class ProblemTwo {

  public static void main (String args[]) throws IOException {
	
	  String input; 
	  BufferedReader stdin = new BufferedReader ( new InputStreamReader( System.in ) );
	  System.out.println("How many players per team?");
	  input = stdin.readLine();
	  int pnumbers =  Integer.valueOf(input);
	  Units a = new Units();
	  int[] teamcomp = a.unitComposition(pnumbers);
	  
	  System.out.println(teamcomp[0]);
	  System.out.println(teamcomp[1]);
	  System.out.println(teamcomp[2]);
  
  }
}