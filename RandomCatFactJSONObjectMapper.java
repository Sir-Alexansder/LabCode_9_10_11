import kong.unirest.ObjectMapper;
import kong.unirest.Unirest;

public class RandomCatFactJSONObjectMapper {
    public static void main(String[] args) {

        Unirest.config().setObjectMapper(new ObjectMapper() {
            private Gson gson = new Gson();
            @Override
            public <T> T readValue(String s, Class<T> aClass) {
                return gson.fromJson(s, aClass);
            }

            @Override
            public String writeValue(Object o) {
                return gson.toJson(o);
            }
        });
        String catFactURL = "https://catfact.ninja/fact";
        CatFact catFact = Unirest.get(catFactURL).asObject(CatFact.class).getBody();
        System.out.println(catFact.getFact());
    }
}

class CatFact {
    private String fact;
    private int length;

    public CatFact(String fact, int length) {
        this.fact = fact;
        this.length = length;
    }
    public String getFact() {
        return fact;
    }
    public void setFact(String fact) {
        this.fact = fact;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
}