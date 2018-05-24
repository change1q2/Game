import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 作者:seak
 * 内容:开发躲避大战-02
 *第二导入图片背景和飞机
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
        this.setTitle("超级躲闪");
        this.setVisible(true);
        this.setSize(638,638);
        this.setLocation(300,300);

        //调用一个结束图形界面的方法，因为正常点击右上角的X事伪结束，实际代码程序还在运行
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    //程序的入口
    public static void main(String[] args){
        MyPlaneMainFranme f = new MyPlaneMainFranme();
        f.launchFrame();
    }
}
