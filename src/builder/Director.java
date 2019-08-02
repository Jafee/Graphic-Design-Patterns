package builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void constructor() {
        builder.makeTitle("Greeting");
        builder.makeString("From morning to afternoon.");
        builder.makeItem(new String[] {"Good morning!", "Good afternoon!"});
        builder.makeString("night");
        builder.makeItem(new String[] {"Good night!", "Good bye!"});
        builder.close();
    }
}
