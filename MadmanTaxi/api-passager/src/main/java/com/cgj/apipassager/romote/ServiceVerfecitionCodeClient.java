package com.cgj.apipassager.romote;

import com.cgj.internalcommon.dto.ResponseResult;
import com.cgj.internalcommon.response.NumberCodeResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("service-verification")
/*注解详解：@FeignClient注解主要是：声明一个远程客户端服务接口，这个接口主要用来调用远程的服务。
* 避免了手动编写复杂的HTTP请求与处理代码*/
public interface ServiceVerfecitionCodeClient {
    @RequestMapping(method = RequestMethod.GET, value = "/numberCode{6}")
    ResponseResult<NumberCodeResponse> getNuberCode();
}
