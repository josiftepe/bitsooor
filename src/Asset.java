public class Asset {
    public String id, name;
    public Asset(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id);
        sb.append(name);
        return sb.toString();
    }
}
