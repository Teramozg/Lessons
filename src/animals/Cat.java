package animals;

import java.util.Objects;

public class  Cat extends Animal {
    private String name;
    private String gender;
    private Owner owner ;


    @Override
    public String toString() {
        return "Cat{" +
                "ID='"+getId()+ '\'' +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
    public Cat(){

    }
    public Cat(int id, String name, String gender, Owner owner) {
        super(id);
        this.name = name;
        this.gender = gender;
        this.owner = owner;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }


    @Override
    public boolean equals(Object o) { //tom.equals(bob);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name) && Objects.equals(gender, cat.gender) && Objects.equals(owner, cat.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, owner);
    }
}
