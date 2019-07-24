package prototype.framework;

public interface Product extends Cloneable {
    public abstract void use(String name);
    public abstract Product createClone();
}
