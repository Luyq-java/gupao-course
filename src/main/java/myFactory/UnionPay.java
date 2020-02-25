package myFactory;

/**
 * 文件名称： UnionPay<br>
 * 初始作者： luyq <br>
 * 创建日期： 2020/2/24 17:22<br>
 * 功能说明：  <br>
 * <br>
 * ================================================<br>
 * 修改记录：<br>
 * 修改作者 日期 修改内容<br>
 * <br>
 * ================================================<br>
 * Copyright 中仑网络科技有限公司 2020/2/24 .All rights reserved.<br>
 */
public class UnionPay implements Ipay{
    @Override
    public void pay() {
        System.out.println("使用银联支付5元");
    }
}
