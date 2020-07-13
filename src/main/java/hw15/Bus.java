package hw15;

import java.util.List;

public class Bus {
    private String color;
    private Model models;
    private List<Color> colors;

    public Bus(String color, Model models, List<Color> colors) {
        this.color = color;
        this.models = models;
        this.colors = colors;
    }
}
