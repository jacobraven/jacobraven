package drDefender;


import org.powerbot.core.script.ActiveScript;
import org.powerbot.core.script.job.state.Node;
import org.powerbot.core.script.job.state.Tree;
import org.powerbot.game.api.Manifest;
import org.powerbot.game.api.util.Random;

@Manifest(authors = { "Draven" }, name = "Dragon Defender", description = "Gets you Dragon Defender" )
public class Main extends ActiveScript {

       @Override
       public void onStart() {

       }
       public void onStop() {
    	   
       }

       private final Tree scriptTree = new Tree(new Node[]{new Attack()});


       @Override
       public int loop() {
           final Node stateNode = scriptTree.state();
           if (stateNode != null) {
               scriptTree.set(stateNode);
               final Node setNode = scriptTree.get();
               if (setNode != null) {
                   getContainer().submit(setNode);
                   setNode.join();
               }
           }
           return Random.nextInt(100, 200);
       }
}