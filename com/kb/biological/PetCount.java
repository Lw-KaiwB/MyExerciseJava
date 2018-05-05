package com.kb.biological;

import java.util.HashMap;

public class PetCount {
    static class PetCounter extends HashMap<String,Integer>{
        private void count(String type){
            Integer quantity = get(type);
            if (quantity == null){
                put(type,1);
            }else {
                put(type,quantity+1);
            }
        }
    }
    public static void counterPets(PetCreator creator){
        PetCounter count = new PetCounter();
        for (Pet pet: creator.createArray(20)){
            System.out.println(pet.getClass().getSimpleName()+"");
            if(pet instanceof Pet)
                count.count("Pet");
            if(pet instanceof Dog)
                count.count("Dog");
            if(pet instanceof Mutt)
                count.count("Mutt");
            if(pet instanceof Pug)
                count.count("Pug");
            if(pet instanceof Cat)
                count.count("Cat");
            if(pet instanceof Manx)
                count.count("EgyptianMau");
            if(pet instanceof Manx)
                count.count("Manx");
            if(pet instanceof Manx)
                count.count("Cymric");
            if(pet instanceof Rodent)
                count.count("Rodent");
            if(pet instanceof Rat)
                count.count("Rat");
            if(pet instanceof Mouse)
                count.count("Mouse");
            if(pet instanceof Hamster)
                count.count("Hamster");
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        counterPets(new ForNameCreator());
    }
}
