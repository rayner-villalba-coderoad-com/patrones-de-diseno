package layers.entities;

/*
* Objeto transporte: Que tiene la responsabilidad de pasar información entre capas
* */
public class Property {
    private int id;
    private String name;
    private int type;
    private int maxGuests;

    public Property(int id, String name, int type, int maxGuests) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.maxGuests = maxGuests;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }

    public int getMaxGuests() {
        return maxGuests;
    }
}
