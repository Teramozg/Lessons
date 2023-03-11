package animals;

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


}
