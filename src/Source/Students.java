package Source;

import Annotation.annotation;

public class Students {
    private String id, name;
    private int age;

    public Students(String id, String name, int age){
        this.age = age;
        this.id = id;
        this.name = name;
    }
    public Students() {
    }

    public String getId() {
        return id;
    }
    @SuppressWarnings("none")
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
