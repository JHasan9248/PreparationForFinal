package Fall_193.Q1;

import java.util.ArrayList;
import java.util.HashSet;

public class finalExam {
    public static void main(String[] args) {
        Player p1=new Player(7, 9.2);
        Player p2=new Player(9, 8.5);
        Player p3=new Player(10, 9.0);
//        ArrayList<Player> list=new ArrayList<>();
        HashSet<Player> list=new HashSet<>();
      list.add(p1);
      list.add(p3);
      list.add(new Player(5,6.7));
      list.add(p3);
      list.add(p2);
      for(Player ply:list)
      {
          System.out.println(ply.jerseyNo+" "+ply.rating);
      }
    }
}
