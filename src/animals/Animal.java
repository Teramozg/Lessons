package animals;

import java.io.Serializable;

public abstract class Animal{
   private int id;


    public Animal(int id) {
        this.id = id;
    }

    protected Animal() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
