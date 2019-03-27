package movies;

import java.util.Arrays;

public class Movie {

    private String name;
    private String category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        category = category;
    }

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public static Movie[] addPerson (Movie [] arrayOfPersons, Movie addMe){
        Movie [] arrayOfPersons2 = Arrays.copyOf(arrayOfPersons, arrayOfPersons.length + 1);
        arrayOfPersons2[arrayOfPersons2.length - 1] = addMe;
        return arrayOfPersons2;
    }
}
