package chainOfResponsibility;

public class LimitSupport extends Support{
    private int limited;

    public LimitSupport(String name, int limited) {
        super(name);
        this.limited = limited;
    }

    @Override
    public boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < limited)
            return true;
        return false;
    }
}
