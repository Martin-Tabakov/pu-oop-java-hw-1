package game;

import java.awt.*;

public class BoardTile {

    int xPos;
    int yPos;
    int coordX;
    int coordY;
    final int tileSize = 100;
    final int tileOffset = 50;

    Color borderColor;
    Color fillColor;

    public BoardTile(int xPos, int yPos,Color borderColor,Color fillColor){
        this.xPos= xPos;
        this.yPos = yPos;
        this.coordX = xPos*tileSize+xPos+tileOffset;
        this.coordY = yPos*tileSize+yPos+tileOffset;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    public void render(Graphics g){
        g.setColor(borderColor);
        g.drawRect(coordX-1,coordY-1,tileSize+1,tileSize+1);
        g.setColor(fillColor);
        g.fillRect(coordX,coordY,tileSize,tileSize);
    }
}
