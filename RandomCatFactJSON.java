import kong.unirest.Unirest;
import org.json.JSONObject;


public class RandomCatFactJSON {

    public static void main(String[] args) {

        String catFactURL = "https://catfact.ninja/fact";
        JSONObject json = Unirest.get(catFactURL).asJson().getBody().getObject();
        System.out.println(json.getString("fact"));
    }
}