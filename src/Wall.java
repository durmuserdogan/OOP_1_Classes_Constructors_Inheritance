public class Wall {

    private double width;
    private double height;

    public Wall() {
        this(0,0);
    }

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
        if(width<0){
            this.width=0;
        }
        if(height<0){
            this.height=0;
        }

    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
        if(width<0){
            this.width=0;
        }


    }

    public void setHeight(double height) {
        this.height = height;
        if(height<0){
            this.height=0;
        }

    }

    public double getArea(){
        return height*width;
    }
}
