class Book{
    String title;
    int price;

    void setdata(String t , int p)
    {
        title=t;
        price=p;
    }
    void getdata()
    {
        System.out.println(title);
        System.out.println(price);
    }
}

public class rakib {
public static void main(String[] args)
{
    Book book=new Book();
    book.setdata("helloworld", 340);
    book.getdata();
}
    
}
