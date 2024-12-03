package v2;

public interface Identificable {

    Integer id = Storage.generateId();

    default Integer getId() {
        return id;
    }

}
