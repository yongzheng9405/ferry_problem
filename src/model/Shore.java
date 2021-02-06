package model;

public class Shore {

    private String state;
    Shore(String initState) {
        // All Item
        this.state = initState;
    }
    public void Left() {
        System.out.println("On the left shore");
        this.state = "left";
    }
    public void Right() {
        System.out.println("On the right shore");
        this.state = "right";
    }

    public void other(Shore s) {
        this.state = s.state;
    }
}
