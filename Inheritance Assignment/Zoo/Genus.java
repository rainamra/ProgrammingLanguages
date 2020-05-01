public class Genus
{
    private String genusName;

    public Genus(String g) {
        this.genusName = g;
    }

    public String getGenusName() {
        return genusName;
    }

    @Override
    public String toString() {
        return "Genus: " + getGenusName();
    }
}
