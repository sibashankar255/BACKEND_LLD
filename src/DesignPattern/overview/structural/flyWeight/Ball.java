package DesignPattern.overview.structural.flyWeight;

public class Ball {
    private String color;
    private String imageURL;
    private int cordX;
    private int cordY;
    private int radius;

    public Ball(String color, String imageURL){
        this.color=color;
        this.imageURL=imageURL;
    }

    public void setCordX(int cordX) {
        this.cordX = cordX;
    }

    public void setCordY(int cordY) {
        this.cordY = cordY;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw(){
        //logic to draw in the canvas
    }
}
