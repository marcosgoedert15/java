package com.marcos.aprenderjava;

import java.util.Random;

public class curio implements bird {

    private boolean isFlying = false;
    private int shitAmount = 10;
    private String nameBird = "ZecaIngles";

    public void fly() {
        isFlying = true;
    }

    public void shit() {
        if (shitAmount < 0) {
            Logger.message("not enough shit");
            return;
        }
        shitAmount--;
    }

    public String getName() {
        return nameBird;
    }

    public void land() {
        isFlying = false;
    }

    public void eat(Integer amount) {
        if(amount < 1) {
            Logger.message("there nothing to eat");
            return;
        }
        if (shitAmount == 10) {
            Logger.message(nameBird + " is full");
            return;
        }
        if (shitAmount + amount > 10) {
            Logger.message("is to much food");
            return;
        }
        shitAmount += amount;
    }

    public boolean getFlyingStatus() {
        return isFlying;
    }
    public Integer getShitAmount() {
        return shitAmount;
    }

    @Override
    public int layEggs() {
        Random eggsRandom = new Random();
        return eggsRandom.nextInt(6);
    }

}
