package Assignment6;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.nio.channels.NonWritableChannelException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class News implements INews {
    public int ID;  ;
    public String title;
    public String PublishDate;
    public String Author;
    public String Content;
    public float AverageRate;




    public void Calculate(){


    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public News(){

    }
    public News(int ID,String title,String publishDate,String author,String content,float averageRate) {

        this.ID = ID;
        this.title = title;
        this.PublishDate = publishDate;
        this.Author = author;
        this.Content = content;
        this.AverageRate = averageRate;
    }

    @Override
   public void Display(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID:");
        ID = scanner.nextInt();
        System.out.println("Nhập Title: ");
        title = scanner.next();
        System.out.println("Nhập Ngày Xuất Bản: ");
        PublishDate = scanner.next();
        System.out.println("Nhập Thẩm Quyền: ");
        Author = scanner.next();
        System.out.println("Nhập Nội Dung: ");
        Content = scanner.next();
        System.out.println("Nhập Tỉ Lệ: ");
        AverageRate = scanner.nextInt();

        System.out.println("ID : "+ID+" Title : "+title+
                " Ngày xuẩ bản : "+PublishDate+" Thẩm Quyền : "+Author+" Nội Dung : "+Content+" Tỉ Lệ : "+AverageRate);

    }
}
