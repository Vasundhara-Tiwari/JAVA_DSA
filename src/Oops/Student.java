package Oops;

public class Student {
    private String name = "ABC";
    private  int age = 17;

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
        try{
            if(age < 0){
                throw new Exception("Age can't be negative!!!");
            }
            this.age = age;
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("Finally!!!");
        }
    }
}
