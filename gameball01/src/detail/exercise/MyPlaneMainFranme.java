import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 作者:seak
 * 内容:开发躲避大战-01
 *第一阶段跳出java框
 * 时间:2018/05/24 15:44
 */
//调出游戏的主窗口

//创建一个MyPlaneMainFranme类继承(extends)Frame里面的所有方法属性
public class MyPlaneMainFranme extends Frame {

    /*
     * 初始化窗口
     * */

    //写一个launchFrame方法,用来设置JAVA框
    public void launchFrame(){
        this.setTitle("超级躲闪");//标题名字,用this.set调用Frame里面的属性方法，给框命名title
        this.setVisible(true);//JAVA框是否可见,一个图形界面默认都是不可见的，setVisible是把图形界面设置为可见
        this.setSize(638,638);//JAVA框长和宽
        this.setLocation(300,300);//JAVA框出现的位置

        //调用一个结束图形界面的方法，因为正常点击右上角的X事伪结束，实际代码程序还在运行
        this.addWindowListener(new WindowAdapter() {
            @Override//@Override是伪代码，它表示方法重写
            public void windowClosing(WindowEvent e) {//重写windowClosing方法
                System.exit(0);//0表示正常结束
            }
        });

    }
    public static void main(String[] args){//程序的入口
        MyPlaneMainFranme f = new MyPlaneMainFranme(); //一个普通类MyPlaneMainFranme无法直接使用，我们new一个就是新产生的对象f，使用它才可以调用MyPlaneMainFranme中的各种方法
        f.launchFrame();//用对象f来调用launchFrame方法
    }
}
