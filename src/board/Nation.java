package board;

import java.awt.*;

public enum Nation {
    GREEN(Colors.GREEN.color, Colors.YELLOW.color),
    YELLOW(Colors.YELLOW.color, Colors.GREEN.color);

    public Color borderColor;
    public Color fillColor;

    Nation(Color borderColor, Color fillColor) {
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }
}
