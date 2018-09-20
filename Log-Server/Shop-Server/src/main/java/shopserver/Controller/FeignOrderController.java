package shopserver.Controller;

import com.alibaba.fastjson.JSONObject;
import com.lkx.common.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shopserver.Feign.OrderFeign;

/**
 * Created by Administrator on 2018/9/20.
 */
@RestController
public class FeignOrderController {
    @Autowired
    private OrderFeign orderFeign;

    @RequestMapping("/feignorder")
    public JSONObject feignOrder( int id,double price){
        BaseResult baseResult=orderFeign.order(id,price,1);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("order",baseResult.getData());
        return jsonObject;
    }
}
