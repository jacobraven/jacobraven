package faladorMole;

import org.powerbot.core.script.job.state.Node;
import org.powerbot.game.api.methods.interactive.Players;

public class Attack extends Node {

	@Override
	public boolean activate() {
		return Players.getLocal().isIdle();
	}

	@Override
	public void execute() {
		Widget.prayerOn();
		
		
	}

}
