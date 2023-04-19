public class Family implements Human {

    String name;
    int age;

    private Gender gender;

    public Family(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int value) {
        this.age = value;
    }

    @Override
    public Gender getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = Gender.valueOf(gender);
    }
}
