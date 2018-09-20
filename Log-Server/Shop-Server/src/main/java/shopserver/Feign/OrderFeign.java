package shopserver.Feign;

import com.lkx.common.BaseResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2018/9/20.
 */
@FeignClient("orderServer")
public interface OrderFeign {
    @RequestMapping("/inner/order/create")
    BaseResult order(@RequestParam("id") int id,
                     @RequestParam("price") double price,
                     @RequestParam("number") int number);
}
