class Units {

	public int[] unitComposition (int players){
		int[] playerComposition;
		playerComposition = new int[3];
		
		//tanks
		
		if (players <= 5) 
				{playerComposition[0] = 1;
				}
		else 
		{
			playerComposition[0] = 2;
		}
		
		//healers
		playerComposition[1] = players / 5;
		
		//dps
		playerComposition[2] = players - (playerComposition[1]+playerComposition[0]);
		
		
		return playerComposition;
			
		
	}

}