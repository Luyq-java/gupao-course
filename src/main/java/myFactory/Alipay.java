package myFactory;

/**
 * 文件名称： Alipay<br>
 * 初始作者： luyq <br>
 * 创建日期： 2020/2/24 17:21<br>
 * 功能说明：  <br>
 * <br>
 * ================================================<br>
 * 修改记录：<br>
 * 修改作者 日期 修改内容<br>
 * <br>
 * ================================================<br>
 *
 */
public class Alipay implements Ipay {

    @Override
    public void pay() {
        System.out.println("使用阿里支付5元");

    }
}
