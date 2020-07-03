package Hw10;

public class Accountant {
    private String name;
    private String position;
    private int experience;

    public Accountant(String name, String position, int exp) {
        this.name = name;
        this.position = position;
        this.experience = exp;
    }

    public Accountant() {
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setExp(int exp) {
        this.experience = exp;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getExp() {
        return experience;
    }

    public void printInfo() {
        System.out.println("Name  " + name + "\nPosition " + position + "\nExperience  " + experience);
    }
}


//                                      public void printInfo () {
//                                          System.out.println("Accountant name  " + getName("Heidi Kline"));
//                                          System.out.println("Position in company  " + getPosition("Accounting assistant"));
//                                          System.out.println("Experience = " + experience);
//                                      }


//              public void getName(){
//                   return name;
//
//
//                   public void getPosition(){
//                      return position;
//                  }
//              }
//              public int getAge(){
//                  return age;
//              }


//            public void printInfo(){
//                System.out.println("Name  "+name+"\nPosition  "+position+"\nExperience  "+ experience);


//                // Getter
//                public String getName() {
//                    return name;
//                }
//
//                // Setter
//                public void setName(String newName) {
//                    this.name = newName;
//                }
//            }
//            }
//        }
//
//    }
//}
