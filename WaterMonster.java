package Lesson18.Lesson18Son;

import Lesson18.Monster;

public class WaterMonster extends Monster {
    public WaterMonster(String name){
        super(name);
    }
    @Override
    public String attack(){
        return "Attack with water!";
    }
}
