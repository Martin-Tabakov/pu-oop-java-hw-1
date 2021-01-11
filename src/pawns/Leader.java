package pawns;

import board.Nation;
import java.awt.*;

public class Leader extends Pawn {

    public Leader(int xPos, int yPos, Nation nation) {
        super(xPos, yPos, nation);
    }

    public void render(Graphics g) {
        g.setColor(fillColor);
        g.fillRect(coordX + inTileOffset, coordY + inTileOffset, pawnSize, pawnSize);
    }

}
