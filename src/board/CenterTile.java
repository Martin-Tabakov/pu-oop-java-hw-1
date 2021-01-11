package board;

import java.awt.*;

public class CenterTile extends BoardTile {

    Color circleFill;
    Color circleBorder;

    public CenterTile(int xPos, int yPos, Color borderColor, Color fillColor, Color circleBorder, Color circleFill) {
        super(xPos, yPos, borderColor, fillColor);
        this.circleBorder = circleBorder;
        this.circleFill = circleFill;
    }

    @Override
    public void render(Graphics g) {
        super.render(g);
        int ovalSize = this.tileSize / 4;
        g.setColor(circleBorder);
        g.fillOval(this.coordX + ovalSize - 1, this.coordY + ovalSize - 1, ovalSize * 2 + 2, ovalSize * 2 + 2);
        g.setColor(circleFill);
        g.fillOval(this.coordX + ovalSize, this.coordY + ovalSize, ovalSize * 2, ovalSize * 2);
    }

}