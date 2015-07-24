class Units {

	public String[] unitComposition (int players){
		String[] playerComposition;
		playerComposition = new String[players+1];
		
		//tanks
		int tanks;
		if (players <= 5) 
				{tanks = 1;
				}
		else 
		{
			tanks = 2;
		}
		
		for (int i=0; i < tanks; i++)
		{
			playerComposition[i]="Tank";
		}
		//healers
		int healers = players / 5;
		for (int i=0+tanks; i < tanks+healers; i++)
		{
			playerComposition[i]="Healer";
		}
		
		
		//dps
		
		for (int i=healers+tanks; i < players; i++)
		{
			playerComposition[i]="DPS";
		}
		
		return playerComposition;
			
		
	}

}