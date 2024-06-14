package zhongzhi_pingshen.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//返回的数据类型复杂，封装到类里返回
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageBean {
    private long total;//总记录数
    private List<Opus> rows;//数据列表
}
