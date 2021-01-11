package board;

import java.awt.*;

public enum Nation {
    YELLOW(Colors.GREEN.color, Colors.YELLOW.color),
    GREEN(Colors.YELLOW.color, Colors.GREEN.color);

    public Color borderColor;
    public Color fillColor;

    Nation(Color borderColor, Color fillColor) {
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }
}
