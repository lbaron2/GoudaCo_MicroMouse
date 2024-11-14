
/* 

    This class is the back bone of the maze simulation

    Imagine one cell in a maze, at most you can go in each of the cardnial directions, and at least not go anywhere.
    That is what this class is ment to mimmic, with it being able to point to other nodes. Once you learn about the 'Linked List' concept it will make more sense where I am going with this
    Some formating things, Null means that you cannot go in that direction, otherwise it will tell you what Node you can go to

    All of the arguments for this class are readable with in the class higharcy, so I did not need to write get methods
 
 */
public class Node{
    protected Node top;
    protected Node lef;
    protected Node rig;
    protected Node bot;

    public Node(){
        //Assigns a random orentation of walls and blanks
        boolean[] list = new boolean[4];
        for (int i = 0; i < 4; i++) {
            if((int)(Math.random()*2) % 2 == 0)
                list[i] = false;
            if(!list[0]&& !list[1]&& !list[2])
            // Makes at least one option blank
                list[4] = true;           
        }
       
    }
    public Node(Node top,Node lef,Node rig,Node bot){
        //Specific implementation 
       this.top = top;
       this.lef = lef;
       this.rig = rig;
       this.bot = bot;
    }
    @Override
    public String toString(){
        //Makes a shape of the node so it can be printed out later
        String shape = "";
        if(lef != null){
            shape += "|";
        }
        else if(bot != null && top != null){
            shape += "=";
        }
        else if(bot != null){
            shape += "_";
        }
        else if(top != null){
            shape += "-";
        }
        else if(rig != null){
            shape += "|";
        }
        return shape;
    }
}