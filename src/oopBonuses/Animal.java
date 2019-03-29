package oopBonuses;

abstract class Animal {

    private String species;
    private boolean walksOnFour;

    public Animal(String species, boolean walksOnFour){
        this.species = species;
        this.walksOnFour = walksOnFour;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean getWalksOnFour() {
        return walksOnFour;
    }

    public void setWalksOnFour(boolean walksOnFour) {
        this.walksOnFour = walksOnFour;
    }

    public abstract void growl();

}
