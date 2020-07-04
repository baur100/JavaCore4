package hw10Constractors;

public class Pet {
   private String breed;
   private String color;
   private String nickname;
   private int age;


   public Pet () {}

   public Pet (String breed, String color, String nickname, int age){
       this.breed = breed;
       this.color = color;
       this.nickname = nickname;
       this.age = age;

   }
   public void setNickname (String nickname){
       this.nickname = nickname;
   }
   public String getNickname(){
       return nickname;
   }
   public void setBreed (String breed){
       this.breed = breed;
   }
   public String getBreed (){
       return breed;
   }
   public void setColor (String color){
       this.color = color;
   }
   public String getColor(){
       return color;
   }
      public void setAge (int age){
       this.age = age;
   }
    public int getAge() {
        return age;
    }
   public void printInfo(){
       System.out.println("Pet name = "+nickname);
       System.out.println("Pet breed = "+breed);
       System.out.println("Pet color = "+color);
       System.out.println("Pet age = "+age);

   }
//   public void setBreed

    @Override
    public String toString() {
        return "Pet{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                '}';
    }
}
