public class ObjectTraining {

    private String name;
    private int age;
    private boolean wilder;

    public ObjectTraining(String name, int age, boolean wilder) {
      super();
      this.name = name;
      this.age = age;
      this.wilder = wilder;
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
      this.age = age;
    }

    public boolean isWilder() {
      return wilder;
    }

    public void setWilder(boolean wilder) {
      this.wilder = wilder;
    }

    public String whoAmI() {
      return "My name is " + getName() + " and I'm " + getAge();
    }

    // Do not remove this empty constructor !
    public ObjectTraining() {
    }
}
