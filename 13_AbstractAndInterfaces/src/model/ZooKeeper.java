package model;

public class ZooKeeper {

    public void feedAnimals(Animal[] animals){
        for (Animal anim:animals
             ) {
            anim.getFed();
        }
    }


}
