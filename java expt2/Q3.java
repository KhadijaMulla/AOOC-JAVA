class Q3 {
    static int count;

    static {
        count = 10;
        System.out.println("static block is executed");
    }
    static void showcount(){
        System.out.println("fixed value is "+ count);
    }


    public static void main(String[] args) {
        //staticdemo s=new staticdemo();
        showcount();
        
    }
}
