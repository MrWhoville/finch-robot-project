package com.whattheflip;

import com.birdbrain.Finch;

public class example {
    public static void main(String[] args){
        Finch bird = new Finch();


bird.setMove("F", 20, 100);
bird.print("I <3 you");
        bird.stop();
        bird.disconnect();
    }
}