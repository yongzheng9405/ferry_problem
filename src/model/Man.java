package model;

public class Man implements Cargo{
    private Shore s;

    public void initState() {
        s = new Shore("left");
    }

    public void changeState() {

    }
}
