package HW14;

import java.util.ArrayList;
import java.util.List;

public class App3 {
    public static void main(String[] args) {
        Film wife = new Film("The wife", 2016);
        Film love = new Film();
        love.setName("Love");
        love.setYear(2012);
        Film stoker = new Film("Stoker", 2013);
        Film joy = new Film();
        joy.setName("Joy");
        joy.setYear(2015);
        Film pollyanna = new Film("Pollyanna", 2003);

        List<Film> favouriteFilms = new ArrayList<Film>();
        favouriteFilms.add(wife);
        favouriteFilms.add(love);
        favouriteFilms.add(pollyanna);

        System.out.println(favouriteFilms.size());
        favouriteFilms.forEach(v-> System.out.println(v.getName()));

        System.out.println("***********");

        favouriteFilms.add(1, joy);
        System.out.println(favouriteFilms.size());
        for(Film v:favouriteFilms){
            System.out.println(v.getYear());
        }

        System.out.println("***********");

        favouriteFilms.set(2, stoker);
        System.out.println(favouriteFilms.size());
        favouriteFilms.forEach(v-> System.out.println(v.getYear()));

        System.out.println("***********");

        favouriteFilms.remove(0);
        System.out.println(favouriteFilms.size());
        for(Film v:favouriteFilms){
            System.out.println(v.getName());
        }

        System.out.println("***********");

        favouriteFilms.remove(joy);
        System.out.println(favouriteFilms.size());
        for(Film v:favouriteFilms){
            System.out.println(v.getName());
        }

        System.out.println("***********");

        System.out.println(favouriteFilms.contains(stoker));

    }
}
