package JavaPratice;

class BoxStart {

    public static void main(String[] args) {

        Box[] boxes = new Box[5];

        boxes[0] = new Box(101, "Coffee");
        boxes[1] = new Box(202, "Computer");
        boxes[2] = new Box(303, "Apple");
        boxes[3] = new Box(404, "Dress");
        boxes[4] = new Box(505, "Fairy-tale book");

        for(Box e: boxes) {
            if(e.getBoxNum() == 505){
                System.out.println(e);
            }
        }
    }
}