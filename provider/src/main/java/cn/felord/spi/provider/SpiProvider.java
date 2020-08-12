package cn.felord.spi.provider;

import cn.felord.spi.ApiService;


/**
 * @author felord.cn
 * @since 10:24
 **/
public class SpiProvider implements ApiService {
    @Override
    public void execute() {
        System.out.println(" hello provider ");
    }
}
