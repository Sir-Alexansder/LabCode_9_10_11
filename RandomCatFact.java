import kong.unirest.Unirest;

public class RandomCatFact {

    public static void main(String[] args) {

        String catFactURL = "https://catfact.ninja/fact";
        String response = Unirest.get(catFactURL).asString().getBody();
        System.out.println(response);
    }
}