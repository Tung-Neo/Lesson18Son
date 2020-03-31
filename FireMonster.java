package Lesson18.Lesson18Son;

import Lesson18.Monster;

public class FireMonster extends Monster {
    public FireMonster(String name){
        super(name);
    }
    @Override
    public String attack(){
        return "Attack with fire!";
    }
}
