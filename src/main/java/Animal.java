public class Animal {
    private String name;
    private int age;
    private String species;
    private String animmalloud;

    public Animal(String name, int age, String species, String animmalloud) {
        this.name = name;
        setAge(age);
        this.species = species;
        this.animmalloud = animmalloud;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getAnimmalloud() {
        return animmalloud;
    }

    public void setAnimmalloud(String animmalloud) {
        this.animmalloud = animmalloud;
    }

    public String giveAnimalloud() {
        return getAnimmalloud();
    }

    public String getNameAndAge() {
        return "Name: " + name + ", Alter: " + age;
    }

    public String ageCategory() {
        if (age > 4) {
            return "old animal";
        }

        if (age > 2) {
            return "young animal";
        }
        return "baby animal";
    }

    public boolean isABabyAnimal() {
        if(age <= 2){
            return true;
        }
        return false;
    }




}
