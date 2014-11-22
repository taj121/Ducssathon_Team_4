import java.util.ArrayList;


public class PointsTrack {
	private static final int NEW_RECIPE = 0;
	private ArrayList<Recipe> cookedBefore;
	private int points;
	
	PointsTrack(){
		this.points =0;
		this.cookedBefore = new ArrayList<Recipe>();
	}
	
	public int getUpdatedPointsForCooking(String currentRecipe){
		boolean inCookedBefore =false;
		for(int i=0; i<this.cookedBefore.size() && !inCookedBefore; i++){
			if(currentRecipe.equals(this.cookedBefore.get(i).getURL())){
				points += calculatePoints(this.cookedBefore.get(i).getNumberTimesCooked());
				this.cookedBefore.get(i).incrementCooked();
				inCookedBefore = true;
			}
		}
		if(!inCookedBefore){
			Recipe toAdd = new Recipe(currentRecipe);
			this.cookedBefore.add(toAdd);
			this.points += calculatePoints(NEW_RECIPE);
		}
		return this.points;
	}
	
	private int calculatePoints(int timesCooked){
		int pointsGained = 0;
		switch (timesCooked){
		case 1:
			pointsGained = 10;
			break;
		case 2:
			pointsGained = 8;
			break;
		case 3:
			pointsGained = 6;
			break;
		case 4:
			pointsGained = 4;
			break;
		case 5:
			pointsGained = 2;
			break;
		default:
			pointsGained = 1;
		}
		return pointsGained;
	}
	
	public int getPoints(){
		return this.points;
	}
}
