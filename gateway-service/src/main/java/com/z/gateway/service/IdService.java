/**
 * 
 */
package com.z.gateway.service;

/**
 * @author Administrator
 *
 */
public interface IdService {

    /***
     * 生成请求的内部id,即traceid
     * @return
     */
    String genInnerRequestId();
}
