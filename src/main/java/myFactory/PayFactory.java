package myFactory;

/**
 * 文件名称： PayFactory<br>
 * 初始作者： luyq <br>
 * 创建日期： 2020/2/24 17:20<br>
 * 功能说明：  <br>
 * <br>
 * ================================================<br>
 * 修改记录：<br>
 * 修改作者 日期 修改内容<br>
 * <br>
 * ================================================<br>
 *
 */
public  class PayFactory {

    public Ipay PayFactory(Class<? extends Ipay> clazz)  {

        if(null != clazz){
            try {
                return clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
