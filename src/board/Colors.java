package board;

import java.awt.*;

public enum Colors {
    PEACH(new Color(255, 99, 71)),
    GRAY(new Color(170, 170, 170)),
    GRAPHITE(new Color(68, 68, 68)),
    GREEN(new Color(34, 177, 76)),
    YELLOW(new Color(255, 242, 0)),
    WHITE(new Color(255, 255, 255));

    public Color color;

    Colors(Color c) {
        this.color = c;
    }
}
