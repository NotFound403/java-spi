package cn.felord.spi;

import java.util.ServiceLoader;

/**
 * @author felord.cn
 * @since 13:06
 **/
public class ApiDiscovery {

    public static void doDiscovery(){
        ServiceLoader<ApiService> load = ServiceLoader.load(ApiService.class);
        load.forEach(ApiService::execute);
    }
}
