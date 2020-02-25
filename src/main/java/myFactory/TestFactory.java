package myFactory;

/**
 * 文件名称： TestFactory<br>
 * 初始作者： luyq <br>
 * 创建日期： 2020/2/24 17:50<br>
 * 功能说明：  <br>
 * <br>
 * ================================================<br>
 * 修改记录：<br>
 * 修改作者 日期 修改内容<br>
 * <br>
 * ================================================<br>
 *
 */
public class TestFactory {

    public static void main(String[] args) {
        PayFactory factory = new PayFactory();
        Ipay ipay = factory.PayFactory(Alipay.class);
        ipay.pay();

    }
}
