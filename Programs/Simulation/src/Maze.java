
import java.util.NoSuchElementException;
/*  
 * This is ment to be the actual maze object that a "explorer" object wouild sort through 
 */

public class Maze extends Node
{
    int size = 0;
    Node start;
    Node finish;

    public Maze(){
        start = new Node();
        finish = null;
    }
    public Maze(int sizeToMake, Node start){
        this.start = start;
        Node lastNode = start;
        for(int i = 0; i < sizeToMake; i++){
            Node temp = new Node();
            addNode(temp, lastNode,randDir());
            lastNode = temp;
        }
        finish = lastNode;

    }
    public Maze(int sizeToMake){
        this(sizeToMake, new Node());
    }
    public String randDir(){
        int roll = (int)(Math.random() * 4);
        switch (roll) {
            case 0:
                return "lef";
            case 1:
                return "rig";
            case 2:
                return "top";
            case 3:
                return "lef";
        }
        return null;
    }
    public boolean addNode(Node ele, Node from, String dir){
        switch (dir) {
            case "lef":
            case "left":
                from.lef = ele;
                break;
            case "rig":
            case "right":
                from.rig = ele;
                break;
            case "bot":
            case "bottom":
                from.bot = ele;
                break;
            case "top":
                from.top = ele;
                break;
            default:
                throw new NoSuchElementException();
        }
        size++;
        return true;
    }

}