/**
 * 
 */
package com.aldb.gateway.protocol;

import java.io.Serializable;

/**
 * @author Administrator
 *
 */
public class OpenApiHttpSessionBean implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private OpenApiHttpRequestBean request;

    /**
     * @param reqBean
     */
    public OpenApiHttpSessionBean(OpenApiHttpRequestBean reqBean) {
        this.request = reqBean;
    }

    public OpenApiHttpRequestBean getRequest() {
        return request;
    }

    public void setRequest(OpenApiHttpRequestBean request) {
        this.request = request;
    }

    @Override
    public String toString() {
        return "OpenApiHttpSessionBean [request=" + request + "]";
    }

    
    
}
