class lab1{
    double width;
    double height;
    double depth;
    
    double volume(){
        return width * height * depth; 
    }
}
class BoxDemo4 {
    public static void main (String a[]){
        lab1 mybox1= new lab1();
        lab1 mybox2=new lab1();
        double vol;
        mybox1.width =10;
        mybox1.height=20;
        mybox1.depth =15;

    }

}