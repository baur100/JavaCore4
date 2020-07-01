package hw9;

public class App {
        public static void main (String[]args){
//        #1 RaceDriver
        String[] model = {"SUV", "Sedan", "Sport"};
        RaceDriver rahul = new RaceDriver("Rahul", "Tesla", model);

        RaceDriver david = new RaceDriver("David", "kia", model);
        System.out.println(david.getCar());

        RaceDriver sameera = new RaceDriver("Sameera", "honda", model);
        sameera.setName("Akula");


        rahul.printNow();
        david.printNow();
        sameera.printNow();

//        #2 KeyChain

        int[] size = {10, 8, 7};
        KeyChain door = new KeyChain("plastic", "Grey", size);


        KeyChain steel = new KeyChain("steel","Black", size);
        steel.setColor("Charcoal");
        steel.setType("special");
        System.out.println(steel.getType());

        steel.printNow();
        door.printNow();

//      #3 Carnivore

        String[] ani = {"Snake", "lizards", "land animals"};
        Carnivore anaconda = new Carnivore("Anaconda", ani, "Capybara");

        anaconda.setName("lisa");
        anaconda.setPrey("caiman");

        anaconda.printNow();


        String[] ani1 = {"Snake", "Lizards", "land animals"};
        Carnivore dragon = new Carnivore("dragon", ani1, "bull");


        dragon.printNow();


//        #4 Task
        String[] workers = {"David", "Sameera"};
        Task lead = new Task(workers, " Sam");

        Task qa = new Task(workers, " Dave");

        lead.printNow();
        qa.printNow();

    }
    }

