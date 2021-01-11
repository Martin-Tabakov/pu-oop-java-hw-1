package pawns;

import board.Nation;

import java.awt.*;

public class Guard extends Pawn {

    public Guard(int xPos, int yPos, Nation nation) {
        super(xPos, yPos, nation);
    }

    @Override
    public void render(Graphics g) {
        int sizeDiff = 5;
        g.setColor(borderColor);
        g.fillOval(coordX + inTileOffset, coordY + inTileOffset, pawnSize, pawnSize);
        g.setColor(fillColor);
        g.fillOval(
                coordX + inTileOffset + sizeDiff,
                coordY + inTileOffset + sizeDiff,
                pawnSize - sizeDiff * 2,
                pawnSize - sizeDiff * 2);
    }
}
