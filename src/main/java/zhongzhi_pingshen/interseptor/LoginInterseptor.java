package zhongzhi_pingshen.interseptor;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.util.StringUtil;
import zhongzhi_pingshen.pojo.Result;
import zhongzhi_pingshen.utils.JwtUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class LoginInterseptor implements HandlerInterceptor {
    @Override       //目标方法执行前运行，返回true放行，false不放行
    public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object handler) throws Exception {

//           检查令牌
            String jwt = req.getHeader("token");
//            该方法可以安全地检查字符串是否为 null 或空字符串 ("")。
            if (StringUtil.isEmpty(jwt)){
                Result error=Result.error("NOT_LOGIN");
//                将对象转为json
                String jsonString = JSONObject.toJSONString(error);
//                响应给浏览器
                resp.getWriter().write(jsonString);
                return false;
            }else {
//                如果令牌不为空就尝试解析令牌，报错就阻止登录，不报错就登陆
                try {
                    JwtUtils.parseJWT(jwt);
                } catch (Exception e) {     //解析令牌失败
                    Result error=Result.error("NOT_LOGIN");
//                将对象转为json
                    String jsonString = JSONObject.toJSONString(error);
//                响应给浏览器
                    resp.getWriter().write(jsonString);
                    return false;
                }
//                解析成功，放行
                return true;

            }

    }

    @Override       //目标方法执行后运行
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override       //视图渲染完成之后运行
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
