package Spring_221.Q5;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Player> list=new ArrayList<>();
       list.add(new Player(55,"Jehan","Bangladesh"));
       list.add(new Player(14,"Hasan","Australia"));
       list.sort(new Comparator<Player>() {
           @Override
           public int compare(Player o1, Player o2) {
               if(o1.jersey<o2.jersey)
               {
                   return -1;
               }
               else {
                   return 1;
               }
           }
       });
       for(Player ply:list)
       {
           System.out.println(ply.name+" "+ply.type+" "+ply.jersey);
       }

    }
}
