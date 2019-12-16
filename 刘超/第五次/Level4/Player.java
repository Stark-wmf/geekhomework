package 刘超.Level4;

import java.util.ArrayList;


public class Player {
    public  void  getCard() {
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> bottomcards = new ArrayList<>();
        Card c = new Card();

        for (int i = 0; i <c.list.size() ; i++) {
            String poker = c.list.get(i);
            if (i>=51){
                bottomcards.add(poker);
            }
            else if (i%3==0){
                player1.add(poker);
            }else if (i%3==1){
                player2.add(poker);
            }else if (i%3==2){
                player3.add(poker);
            }
        }
        System.out.println("玩家一"+player1);
        System.out.println("玩家二"+player2);
        System.out.println("玩家三"+player3);
        System.out.println("底牌"+bottomcards);
        }
    }

