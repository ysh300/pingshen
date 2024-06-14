package zhongzhi_pingshen.controller;

import zhongzhi_pingshen.pojo.Opus;
import zhongzhi_pingshen.pojo.PageBean;
import zhongzhi_pingshen.pojo.Result;
import zhongzhi_pingshen.service.OpusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping
public class OpusController {
    @Autowired
    private OpusService opusService;

//    参赛作品上传
    @PostMapping("/upload")
    public Result add(@RequestBody Opus opus){
//        上传基本信息
        opusService.upload(opus);
        return Result.success();
    }

//    分页查询
    @GetMapping("/select")
    //    RequestParam设置默认值
    public Result page(String opusName,
                   @RequestParam(defaultValue = "1") Integer page,
                   @RequestParam(defaultValue = "10") Integer pageSize){

    //        封装pageBean对象
        PageBean pageBean=opusService.page(opusName,page,pageSize);
        return Result.success(pageBean);
}

}
