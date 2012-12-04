package widgetExplorer;

/*
 * @author - Jeremy Trifilo (Digistr).
*/



import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import org.powerbot.core.event.listeners.PaintListener;
import org.powerbot.core.script.ActiveScript;
import org.powerbot.game.api.Manifest;

@Manifest ( authors = { "Digistr" }, 
	    name = "Widget Explorer",
	    version = 3.1 )

public class BotScript extends ActiveScript implements PaintListener, MouseMotionListener
{	
	private ScriptTask task;

	@Override
	public void onStart()
	{
		new TaskRunner(this);
		task = new WidgetExplorer();
	}

	@Override
	public int loop()
	{
		if (task != null)
			task.execute();
		return 128;
	}

	@Override
	public void mouseMoved(MouseEvent me)
	{
		if (task != null)
			task.move(me.getPoint());
	}

	@Override
	public void mouseDragged(MouseEvent me)
	{
		if (task != null)
			task.move(me.getPoint());
	}

        @Override
        public void onRepaint(Graphics g) 
	{
		if (task != null)
			task.draw(g);
        }

}