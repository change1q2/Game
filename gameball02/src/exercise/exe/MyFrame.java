import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 作者:seak
 * 内容:练习调出JAVA框
 * 时间:2018/05/24 18:27
 * 步骤:
 * 1.继承Frame
 * 2.使用launchFrame方法设置JAVA框的属性,标题,是否可见,长宽,出现位置
 * 3.加入强制关闭addWindowlis
 * 4.程序输出的主入口,开辟一个空间使用lanuchFrame
 *
 *
 */
public class MyFrame extends Frame{

    public void launchFrame(){
        this.setTitle("海的练习_1");
        this.setVisible(true);
        this.setSize(500,500);
        this.setLocation(300,300);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //super.windowClosing(e);
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        MyFrame f = new MyFrame();//注意这里开辟空间是开辟的类,不是方法
        f.launchFrame();
    }
}
