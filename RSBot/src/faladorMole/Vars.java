package faladorMole;

import org.powerbot.core.script.job.Task;
import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.methods.tab.Inventory;
import org.powerbot.game.api.wrappers.Tile;

public class Vars {
	// Paths
	public Tile[] nodeToBank =  new Tile[] {
			new Tile(2968,3396,0)
			,new Tile(2967,3389,0)
			,new Tile(2961,3384,0)
			,new Tile(2955,3380,0)
			,new Tile(2950,3375,0)
			,new Tile(2946,3369,0)
			};
	public Tile[] bankToPark = new Tile[] {
			new Tile(2948,3375,0)
			,new Tile(2953,3381,0)
			,new Tile(2961,3381,0)
			,new Tile(2968,3384,0)
			,new Tile(2975,3387,0)
			,new Tile(2982,3388,0)
			,new Tile(2987,3383,0)
			};
	public Tile[] startToMole = new Tile[] {
			new Tile(1753,5229,0)
			,new Tile(1754,5222,0)
			,new Tile(1758,5216,0)
			,new Tile(1758,5208,0)
			,new Tile(1757,5201,0)
			,new Tile(1757,5187,0)
			};
	
	public Tile[] innerRing = new Tile[] {
			new Tile(1755,5180,0)
			,new Tile(1750,5175,0)
			,new Tile(1743,5176,0)
			,new Tile(1742,5183,0)
			,new Tile(1743,5191,0)
			,new Tile(1750,5194,0)
			,new Tile(1757,5196,0)
			,new Tile(1765,5196,0)
			,new Tile(1771,5200,0)
			,new Tile(1777,5204,0)
			,new Tile(1784,5202,0)
			,new Tile(1784,5194,0)
			,new Tile(1782,5187,0)
			,new Tile(1780,5180,0)
			,new Tile(1775,5175,0)
			,new Tile(1767,5175,0)
			,new Tile(1762,5180,0)
			,new Tile(1758,5186,0)
			};

	
	// Variables
	public int moleHole = 12202;
	public int lampOn = 4531;
	public int lampOff = 4529;
	
	
	//Widget

	
	//NPC
	public int giantMole = 3340;

	//Booleans
	public boolean lampIsOn() {
		if(Inventory.contains(lampOn)) {
			return true;
		}
		return false;
	}
}
class Widget {
	
	public static void prayerOn() {
		if(Widgets.get(749,2) != null) {
			Widgets.get(749,2).validate();
			Widgets.get(749,2).click(true);
			Task.sleep(80);
		}
	}
	
	
}