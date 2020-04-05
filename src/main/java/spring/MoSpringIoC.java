package spring;

import java.util.Map;

public class MoSpringIoC {
    private Map<String,Object> mapLst;

    public void Init(){
        //1、读取配置文件
        doconfig();
        //2、将配置文件信息同意封装转换BeanDefinition
        //3、使用BeanDefinitionReader读取
        //4、扫描包
        doScan();
        //5、转换为BeanWrapper
        //6、DI注入
        doAutoWired();
    }

    private void doAutoWired() {
    }

    private void doScan() {
    }

    private void doconfig() {
    }

}
