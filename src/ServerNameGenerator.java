public class ServerNameGenerator {

    static String randomName(String[] adjectives, String[] nouns) {

        double nameOne = Math.random() * ((adjectives.length));
        double nameTwo = Math.random() * ((nouns.length));

        return adjectives[(int) nameOne] + " " + nouns[(int) nameTwo];

    }

    static String[] adjectives = {
            "Hungry",
            "Lazy",
            "Cute",
            "Hairy",
            "Grumpy",
            "Mad",
            "Sad",
            "Small",
            "Humongous",
            "Ferocious"
    };
    static String[] nouns = {
            "Hippo",
            "Mango",
            "Atom",
            "Photon",
            "Panther",
            "Lion",
            "Banana",
            "Super-Market",
            "Onion",
            "MacBook"
    };

    public static void main(String[] args) {
        System.out.println(randomName(adjectives, nouns));
    }
}
