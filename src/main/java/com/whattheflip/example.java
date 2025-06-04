package com.whattheflip;

import com.birdbrain.Finch;

public class example {
    public static void main(String[] args){
        Finch bird = new Finch();


bird.setMove("F", 20, 100);
bird.setTurn("R",90, 100);
String message1 = "I <3 u";
String message2 = "I hoped you liked my dance nerd";
bird.print(message1);
String[] letters = message1.split("");
for (String letter : letters) {
     int[] pattern = PatternCreator.getPatternForSymbol(letter);
    bird.setDisplay(pattern);
   bird.pause(0.5);
 }
for (int i = 0; i < 5; i++){
  bird.setTurn("L",270, 200);
  bird.setMove("F", 30, 200);
    bird.setTurn("R", 120, 200);
    
}
bird.print(message2);
for (int i = 0; i < 5; i++){
bird.playNote(30,0.8);
bird.pause(0.6);
bird.playNote(33,0.3);
bird.pause(0.4);
bird.playNote(20,0.7);
bird.pause(0.4);
bird.playNote(65, 0.3);
bird.pause(0.3);
bird.playNote(55, 0.3);
bird.pause(0.25);
bird.playNote(50,0.5);
bird.pause(0.6);
bird.playNote(40, 0.6);
bird.pause(0.5);
}
        bird.stop();
    bird.disconnect();
    }
}