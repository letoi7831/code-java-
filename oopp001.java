class Dog{
    String name;
    String breed;
    int age;
    public void setName(String name){
        this.name = name;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void PrintDogDetail(){
        System.out.println("Name:" + name +"--Breed:" + breed + "--Age:" + age);
    }
}
public class oopp001 {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        // Gán giá trị cụ thể
        myDog.setName("Micky");
        myDog.setBreed("Husky");
        myDog.setAge(12);

        // In thông tin chú chó ra màn hình
        myDog.PrintDogDetail();
    }
}