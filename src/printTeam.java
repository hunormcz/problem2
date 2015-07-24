class printTeam {
	public void print (String[] team, String[] names, int players){
		System.out.println("Current Team Composition");
		for (int i=0; i< players; i++){
			System.out.println(i+1+". Player:");
			System.out.println("Name - "+ names[i]);
			System.out.println("Type - "+team[i]);
			
		}
	}
}