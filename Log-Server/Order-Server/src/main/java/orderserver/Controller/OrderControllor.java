package orderserver.Controller;


import com.alibaba.fastjson.JSONObject;
import com.lkx.common.BaseResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by Administrator on 2018/9/20.
 */
@RestController
@RequestMapping("/inner")
public class OrderControllor {

    @RequestMapping("/order/create")
    public BaseResult order(Integer id, Double price, Integer number) {
        Double sum =  price * number;

        JSONObject data = new JSONObject();

        JSONObject order = new JSONObject();
        order.put("id", id);
        order.put("sum", sum);
        order.put("oid", UUID.randomUUID().toString());

        data.put("order", order);

        return new BaseResult().setData(data);
    }
}
