package confused_package.orz;
//import javax.sql.rowset.spi.SyncResolver;
import java.util.Random;

public class What
{
    public static void main(String[] args)
    {
        LinkList l=new LinkList();
        System.out.println("实例化的1000个对象：");
        l.print();
        System.out.println("------实例化完毕------");
        l.sxid();
        l.sxvip();
        l.qiuhe();
        l.sxnick();
    }
}
class Player{
    int id;
    String nick;
    int level;
    int vip;
    int score;
    int gold;
    public Player(int id1,String nickname1){
        Random ra=new Random();
        id = id1;
        nick = nickname1;
        level = ra.nextInt(49)+1;
        vip = ra.nextInt(21);
        score = ra.nextInt(900)+100;
        gold = ra.nextInt(3000);
    }

    public void print()
    {
        System.out.println("id:"+id);
        System.out.println("nick:"+nick);
        System.out.println("level:"+level);
        System.out.println("vip:"+vip);
        System.out.println("score:"+score);  
        System.out.println("gold:"+gold+"\n");
    }
}

class Node
{
    Player who;
    Node next;

    public Node(int id,String nickname)
    {
        who=new Player(id,nickname);
        next=null;
    }
}

class LinkList{
    public Node head;
    public Node current;
    public LinkList(){
        head = null;
        current=null;
        Random ra=new Random();
        for(int i=0;i<1000;i++)
        {
            String s=String.valueOf(i+1);
            if(ra.nextInt(2)==0)
                s=s+".";
            add(i,s);
        }
    }
    public void add(int id,String nickname){
        if (head == null) {
            head = new Node(id,nickname);
            current = head;
        } else {
            current.next = new Node(id,nickname);
            current = current.next;
        }
    }

    public void sxid(){
        Node i=null;
        System.out.println("id尾数为5的所有对象:\n");
        for(i=head;i!=null;i=i.next)
            if(i.who.id%10==5)
                i.who.print();
        System.out.println("------id筛选完毕------");
    }

    public void sxvip()
    {
        int j=0;
        Node p;
        System.out.println("\nvip最高的5个对象:");
        for(int i=20;i>=0&&j<5;i--)
        {
            for(p=head;j<5&&p!=null;p=p.next)
                if(p.who.vip==i)
                {
                    p.who.print();
                    j++;
                }
        }
        System.out.println("------vip筛选完毕------");
    }

    public void qiuhe(){
        Node p;
        int sum=0;
        for(p=head;p!=null;p=p.next)
            if(p.who.gold==p.who.score)
                sum=sum+p.who.gold;
        System.out.println("\ngoldsum="+sum+"\n");
        System.out.println("------求和完毕------");
    }

    public void sxnick(){
        Node p;
        System.out.println("all point:\n");
        for(p=head;p!=null;p=p.next)
            if(p.who.nick.indexOf('.')>=0)
                p.who.print();
        System.out.println("------nick筛选完毕------");
    }

    public void print()
    {
        Node i=null;
        for (i=head;i!=null;i=i.next)
            i.who.print();
    }
}

